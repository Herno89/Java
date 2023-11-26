package servicios;

import entidades.Editorial;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class EditorialServicio extends JPAController<Editorial> {

    public EditorialServicio() {
        super(Editorial.class);
    }

    public void crear(Editorial editorial) {
        super.create(editorial);
    }

    public void editar(Editorial editorial) {
        super.update(editorial);
    }

    public void borrar(Editorial editorial) {
        super.delete(editorial);
    }

    public void buscar(Editorial editorial) {
        super.find(editorial);
    }

public List<Editorial> listarEditoriales(String query) {
        try {
            JPAController<Editorial> jpaController = new JPAController<>(Editorial.class);
            Query q = jpaController.em.createQuery("SELECT e FROM Editorial e");
            List<Editorial> editoriales = q.getResultList(); // Se corrigió el nombre de la variable
            jpaController.disconnect();
            if (editoriales.isEmpty()) {
                throw new Exception("No se encontró ninguna editorial.");
            }
            System.out.println("Listado total de editoriales: ");
            for (Editorial editorial : editoriales) {
                System.out.println(editorial.toString());
            }
            return editoriales;
        } catch (Exception e) {
            System.err.println("Error en listar Editoriales: " + e.getMessage());
            return null;
        }
    }
       
    public Editorial agregarEditorialSiNoExiste(String editorialNombre) {
        super.connect();
        Editorial editorial = null;
        try {
            editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.nombre = :nombre")
                    .setParameter("nombre", editorialNombre)
                    .getSingleResult();
            System.out.println("La editorial ya se encuentra registrada");

        } catch (NoResultException e) {
            // Si no se encuentra ninguna editorial con el nombre dado, se crea una nueva editorial
            editorial = new Editorial();
            
            editorial.setNombre(editorialNombre);
            editorial.setAlta(true);
            // Se guarda la nueva editorial en la base de datos
            create(editorial);
            System.out.println("La editorial ha sido incorporada a la lista");

        } finally {
            super.disconnect();
        }
        return editorial;
    }
    
    public void cambiarEstadoEditorialPorNombre(String nombre) {
    EntityManager em = null;
    try {
        em = emf.createEntityManager();
        Query query = em.createQuery("SELECT l FROM Editorial l WHERE l.nombre = :nombre");
        query.setParameter("nombre", nombre);
        Editorial editorial = (Editorial) query.getSingleResult();
        boolean estadoActual = editorial.getAlta();
        System.out.println("La editorial " + nombre + " tiene el estado " + (estadoActual ? "ALTA" : "BAJA"));
        System.out.println("¿Desea cambiar su estado? (s/n)");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            editorial.setAlta(!estadoActual);
            editar(editorial);
            System.out.println("Estado cambiado exitosamente");
        }
    } catch (NoResultException ex) {
        System.out.println("No se encontró ninguna editorial con el nombre " + nombre);
    } finally {
        if (em != null) {
            em.close();
        }
    }
}
    
    public Editorial buscarPorNombre(String nombre) throws NoResultException {
    super.connect();
    Editorial editorial = null;
    try {
        editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.nombre LIKE :nombre")
                     .setParameter("nombre", nombre)
                     .getSingleResult();
    } catch (NoResultException e) {
        // Manejo de la excepción
        throw new NoResultException("Editorial no encontrada con nombre: " + nombre);
    } finally {
        super.disconnect();
    }
    return editorial;
}


}
