package com.example;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;

public class Program {
    public static void main(String[] args) {

        // Criação de objetos Pessoa (não utilizados no código atual)
       // Pessoa p1 = new Pessoa(null, "Kayque Lopes", "kaiquelopes.601@gmail.com");
       // Pessoa p2 = new Pessoa(null, "Isabelly", "Isabelly765@gmail.com");
       // Pessoa p3 = new Pessoa(null, "Samuel", "SamueLSaturno342@gmail.com");

        // Cria a fábrica de EntityManager usando a unidade de persistência "exemplo-jpa"
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        
        // Cria o EntityManager para gerenciar as operações com o banco de dados
        EntityManager em = emf.createEntityManager();

        // Inicia uma transação com o banco de dados
        em.getTransaction().begin();

        // Busca uma Pessoa pelo ID 1 no banco de dados
        Pessoa pessoaEncontrada = em.find(Pessoa.class, 1);
        
        // Exibe os dados da pessoa encontrada
        System.out.println(pessoaEncontrada);

        // Confirma (commit) a transação
        em.getTransaction().commit();
        
        System.out.println("Pessoas inseridas com sucesso!");
    }
}
