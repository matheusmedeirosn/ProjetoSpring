package br.com.hospital.hpem.model_entities;


import javax.persistence.*;

@Entity
@Table(name="MEDICO_TABLE")
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;
    @Column
    private Long crm;
    @Column
    private String nomedomedico;
    @Column
    private String especialidade;


    public Medico(Long crm, String nomedomedico, String especialidade) {
        this.crm = crm;
        this.nomedomedico = nomedomedico;
        this.especialidade = especialidade;
    }
    public Medico () {

    }

    public Long getCrm() {
        return crm;
    }

    public void setCrm(Long crm) {
        this.crm = crm;
    }

    public String getNomedomedico() {
        return nomedomedico;
    }

    public void setNomedomedico(String nomedomedico) {
        this.nomedomedico = nomedomedico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
