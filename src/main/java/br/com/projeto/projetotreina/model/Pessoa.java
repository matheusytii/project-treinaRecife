package br.com.projeto.projetotreina.model;

import org.hibernate.validator.internal.IgnoreForbiddenApisErrors;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table (name = "pessoa", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;


    @NotBlank
    @Email
    @Column(nullable = false, unique = true)
    private String email;

    private String avatar;

    public Pessoa(){}

        public Pessoa(String nome, String email, String avatar){

            this.nome = nome;
            this.email = email;
            this.avatar = avatar;
        }

        public Long getid() {return id;}
        public void setid (Long id) {this.id =id;}
        public String getNome() {return nome;}
        public void setNome (String nome) {this.nome = nome;}
        public String getEmail () {return email;}
        public void  setEmail (String email) { this.email = email;}
        public String getAvatar() {return avatar;}
        public void setAvatar (String avatar) { this.avatar = avatar;}


    }

