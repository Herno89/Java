
package servicios;

import entidades.Autor;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class AutorServicio extends JPAController<Autor> {

    public AutorServicio() {
        super(Autor.class);
    }

    public void crear(Autor autor) {
        super.create(autor);
    }

    public void editar(Autor autor) {
        super.update(autor);
    }

    public void borrar(Autor autor) {
        super.delete(autor);
    }

    public void buscar(Autor autor) {
        super.find(autor);
    }



    //8) Búsqueda de un Autor por nombre. 
public Autor buscarPorNombre(String nombre) throws NoResultException {
    super.connect();
    Autor autor = null;
    try {
        autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                     .setParameter("nombre", nombre)
                     .getSingleResult();
    } catch (NoResultException e) {
        // Manejo de la excepción
        throw new NoResultException("Autor no encontrado con nombre: " + nombre);
    } finally {
        super.disconnect();
    }
    return autor;
}

public Autor agregarAutorSiNoExiste(String autorNombre) {
    super.connect();
    Autor autor = null;
    try {
        autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre")
                .setParameter("nombre", autorNombre)
                .getSingleResult();
        System.out.println("El autor ya se encuentra registrado");
        
    } catch (NoResultException e) {
        // Si no se encuentra ningún autor con el nombre dado, se crea un nuevo autor
        autor = new Autor();
        autor.setNombre(autorNombre);
        autor.setAlta(true);
        // Se guarda el nuevo autor en la base de datos
        create(autor);
        System.out.println("El autor ha sido incorporado a la lista");
        
    } finally {
        super.disconnect();
    }
    return autor;
}

public void cambiarEstadoAutorPorNombre(String nombre) {
    EntityManager em = null;
    try {
        em = emf.createEntityManager();
        Query query = em.createQuery("SELECT l FROM Autor l WHERE l.nombre = :nombre");
        query.setParameter("nombre", nombre);
        Autor autor = (Autor) query.getSingleResult();
        boolean estadoActual = autor.getAlta();
        System.out.println("El autor " + nombre + " tiene el estado " + (estadoActual ? "ALTA" : "BAJA"));
        System.out.println("¿Desea cambiar su estado? (s/n)");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            autor.setAlta(!estadoActual);
            editar(autor);
            System.out.println("Estado cambiado exitosamente");
        }
    } catch (NoResultException ex) {
        System.out.println("No se encontró ningún autor con el nombre " + nombre);
    } finally {
        if (em != null) {
            em.close();
        }
    }
}

public List<Autor> listarAutores(String query) {
        try {
            JPAController<Autor> jpaController = new JPAController<>(Autor.class);
            Query q = jpaController.em.createQuery("SELECT a FROM Autor a");
            List<Autor> autores = q.getResultList(); // Se corrigió el nombre de la variable
            jpaController.disconnect();
            if (autores.isEmpty()) {
                throw new Exception("No se encontró ningún autor.");
            }
            System.out.println("Listado total de autores: ");
            for (Autor autor : autores) {
                System.out.println(autor.toString());
            }
            return autores;
        } catch (Exception e) {
            System.err.println("Error en listar Autores: " + e.getMessage());
            return null;
        }
    }

        

}