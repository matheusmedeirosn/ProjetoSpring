package br.com.hospital.hpem.model_entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PACIENTE_TABLE")
public class Paciente {

    @Id @GeneratedValue

    private String nome;

    private double cpf;

    private int idade;

    private String endereco;

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


}

