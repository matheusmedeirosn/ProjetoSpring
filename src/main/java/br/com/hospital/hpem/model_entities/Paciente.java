package br.com.hospital.hpem.model_entities;

import javax.persistence.*;


@Entity
@Table(name="PACIENTE_TABLE")
public class Paciente {

    @Id @GeneratedValue()
    private Long numeroDeAtendimento;
    @Column
    private String nome;
    @Column
    private double cpf;
    @Column
    private int idade;
    @Column
    private String endereco;

    @ManyToOne
    private Medico medico;

    //CONSTRUTOR VAZIO:
    public Paciente() {
    }

    public Paciente(String nome, double cpf, int idade, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.endereco = endereco;
        this.medico = medico;
    }

    public Long getNumeroDeAtendimento() {
        return numeroDeAtendimento;
    }

    public void setNumeroDeAtendimento(Long numeroDeAtendimento) {
        this.numeroDeAtendimento = numeroDeAtendimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}

