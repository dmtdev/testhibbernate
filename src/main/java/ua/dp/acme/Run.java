package ua.dp.acme;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 15.03.2017.
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("work!");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("somenamezzz");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        User user = new User();
        user.setUserName("username");
        user.setPassword("pwd");

        Role r1 = new Role();

        Role r2 = new Role();
        r1.setRoleName("SuperAdmin");
        r2.setRoleName("Admin");
        entityManager.persist(r1);
        entityManager.persist(r2);

        List<Role> roles = new ArrayList<>();
        roles.add(r1);
        roles.add(r2);
        user.setRoles(roles);

        entityManager.persist(user);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
