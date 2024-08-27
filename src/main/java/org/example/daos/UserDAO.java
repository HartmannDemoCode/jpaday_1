package org.example.daos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.entities.User;
import org.example.persistence.HibernateConfig;

import java.util.Set;

/**
 * Purpose:
 *
 * @author: Thomas Hartmann
 */
public class UserDAO implements IDAO<User>{
    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();
    @Override
    public User getById(Integer id) {
        //return null;

        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Set<User> getAll() {
        //return null;

        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void create(User user) {
        try(EntityManager em = emf.createEntityManager()){
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        }

    }

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        userDAO.create(
                User
                        .builder()
                        .username("user1")
                        .password("Password123")
                        .email("user1@mail.com")
                        .build()
        );
    }
}
