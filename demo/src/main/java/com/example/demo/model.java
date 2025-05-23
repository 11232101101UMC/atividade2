package com.example.demo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
    @Data
    @AllArgsConstructor
    @NoArgsConstructor

    public class UserModel {
         @Id
        private UUID ID;
        public class Usuario {
    private string nome;
    private String email;
    private String senha;

    // Construtor
    public Usuario(string nome, String email, String email) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Getters e Setters
    public string getnome() {
        return nome;
    }

    public void setnome(string nome) {
        this.id = nome;
    }

    public String getemail() {
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


    }
