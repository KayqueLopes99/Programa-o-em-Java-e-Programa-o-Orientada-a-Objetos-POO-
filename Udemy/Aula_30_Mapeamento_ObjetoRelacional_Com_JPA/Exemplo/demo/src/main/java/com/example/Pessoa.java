package com.example;
/**
 * Importa a interface Serializable do pacote java.io.
 * 
 * A interface Serializable é usada para marcar classes que podem ser serializadas,
 * ou seja, convertidas em um fluxo de bytes para armazenamento ou transmissão.
 * Quando uma classe implementa Serializable, seus objetos podem ser:
 * - Salvos em arquivos
 * - Transmitidos pela rede
 * - Armazenados em bancos de dados
 * 
 * Esta é uma interface marcadora (marker interface) que não define métodos,
 * apenas indica que a classe suporta serialização.
 * 
 * @see java.io.Serializable
 */
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Pessoa implements Serializable{

    private static final long serialVersionUID = 1L; // Identificador único para a serialização

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    private String nome;
    private String email;

    
    public Pessoa() {
    }


    public Pessoa(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
    }

}