package org.edu.espe.ejecucion;
import org.edu.espe.modelo.*;
import java.time.LocalDate;
import javax.persistence.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Open a database connection
        // (create a new database if it doesn't exist yet):
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("$objectdb/db/p6.odb");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Auto toyota = new Auto("Toyota", "666-TTT", "Durisimo", "v1.2022", LocalDate.of(2025, 11, 11));
        em.persist(toyota);
        Auto Ferrari = new Auto("Ferrari", "666-FFFF", "Turismo", "v1.2022", LocalDate.of(2025, 11, 11));
        em.persist(Ferrari);
        Auto Honda = new Auto("Honda", "6666-JJJJ", "Matrix", "v1.2022", LocalDate.of(2023, 11, 11));
        em.persist(Honda);
        Auto Susuky = new Auto("Susuky", "6666-KKKK", "Durisimo", "v1.2022", LocalDate.of(2023, 11, 11));
        em.persist(Susuky);
        Auto KIA = new Auto("KIA", "23366622-OOOO", "Durisimo", "v1.2022", LocalDate.of(2022, 11, 11));
        em.persist(KIA);


        em.getTransaction().commit();

        TypedQuery<Auto> query =
                em.createQuery("SELECT auto FROM Auto auto " +
                        "WHERE YEAR(auto.anioFabricacion) = :anio", Auto.class);
        query.setParameter("anio", 2023);  // Setting years old 2023
        List<Auto> results = query.getResultList();

        for (Auto a : results) {
            System.out.println(a);
        }
    }

}
