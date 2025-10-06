package br.com.projeto.projetotreina.model;

import jakarta.persistence.*; //Define anotações do jpa para mapear as classes no banco de dados
import jakarta.validation.constraints.NotBlank; // fornece a validações pra garantir antes de slavar no banco de dados "@NotBlank, @NotNull etc."
import jakarta.validation.constraints.NotNull; // 
import java.time.OffsetDateTime; //Tipo de dado pra guarda data/hora com fuso horário


@Entity
@Table (name ="atividade")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank
    private String titulo;


    @ManyToOne(optional = false)
    @JoinColumn(name = "status_id")
    private Status status;

    @Column(nullable = false, updatable = false)
    private OffsetDateTime dataCriacao;

    private OffsetDateTime dataInicio;
    private OffsetDateTime  dataFimProposta;
    private OffsetDateTime  dataFimEncerramento;

    @ManyToOne(optional = false)
    @JoinColumn(name = "pessoa_id")
    private Pessoa responsavel;


    @PrePersist
    public void PrePersist() {
        this.dataCriacao = OffsetDateTime.now();
    }

    public Long getId() { return id;}
    public void setId (Long id) { this.id = id;}
    public String getTitulo() {return titulo;}
    public void setTitulo (String titulo) {this.titulo = titulo;}   
    public Status geStatus () { return status;}
    public void  setStatus (Status status) {this.status = status;}
    public OffsetDateTime getDataCriacao (){return dataCriacao;}
    public OffsetDateTime getDataInicio (){ return dataInicio;}
    public void setDataInicio (OffsetDateTime dataInicio) {this.dataInicio = dataInicio;}
    public OffsetDateTime getDataFimProposta (){return dataFimProposta;}
    public void setdataFimProposta(OffsetDateTime dataFimProposta) { this.dataFimProposta = dataFimProposta;}
    public OffsetDateTime getDataFimEncerramento(){return dataFimEncerramento;}
    public void setDataFimEncerramento (OffsetDateTime dataFimEncerramento) {this.dataFimEncerramento = dataFimEncerramento;}
    public Pessoa getResponsavel (){ return responsavel;}
    public void SetResponsavel (Pessoa responsavel) {this.responsavel = responsavel;}

    
}
