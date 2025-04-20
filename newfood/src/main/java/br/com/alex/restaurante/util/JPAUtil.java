package br.com.alex.restaurante.util;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory NEWFOOD = Persistence.createEntityManagerFactory("newFood");
    public static EntityManager getEntityManagerNewFood() {
        return NEWFOOD.createEntityManager();
    }

}
