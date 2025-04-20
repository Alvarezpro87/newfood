package br.com.alex.restaurante.service.teste;

import br.com.alex.restaurante.dao.CardapioDao;
import br.com.alex.restaurante.entity.Cardapio;
import br.com.alex.restaurante.util.CargaDeDadosUtil;
import br.com.alex.restaurante.util.JPAUtil;


import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class CardapioService {
    public static void main(String[] args) {
        EntityManager entityManager = JPAUtil.getEntityManagerNewFood();
        entityManager.getTransaction().begin();
        CargaDeDadosUtil.cadastarCategorias(entityManager);
        CargaDeDadosUtil.cadastrarProdutosCardapio(entityManager);
        CardapioDao cardapioDao = new CardapioDao(entityManager);
        System.out.println("Lista de produtos por valor: "+ cardapioDao.consultarPorValor(BigDecimal.valueOf(59.00)));
        entityManager.close();
    }
}
