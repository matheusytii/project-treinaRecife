package br.com.projeto.projetotreina.model;

import jakarta.persistence.*;


@Entity
@Table (name = "status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @colunmn (nullable = false , unique = true)
    private String nome; //progamado , executando, comcluído


    public Status (){}
    public Status (string nome) {this.nome = nome;}

    public Long getId (){ resturn id;}
    public void setId (Long id) { this.id = id;}

    public String getNome() {return nome;}
    public void setNome (String nome) {this.nome = nome;}


    


    
}
