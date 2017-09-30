package com.renanrest.model;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author renan
 */
@Entity
@Table(name = "Turma")
@XmlRootElement
public class Turma extends AbstractEntity {
    
    @Column(length = 255, nullable = false)
    private String nome;
    
    @Column(length = 255, nullable = false)
    private String cargahoraria;
    
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    
    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    @Override
    public void updateParameters(Object entity) {
        final Turma Turma = (Turma) entity;
        this.cargahoraria = Turma.getCargahoraria();
        this.dataInicio = Turma.getDataInicio();
        this.dataFim = Turma.getDataFim();
        this.nome = Turma.getNome();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turma other = (Turma) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cargahoraria, other.cargahoraria)) {
            return false;
        }
        if (!Objects.equals(this.dataFim, other.dataFim)) {
            return false;
        }
        if (!Objects.equals(this.dataInicio, other.dataInicio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Turma{" + "nome=" + nome + ", cargahoraia=" + cargahoraria + ", dataFim=" + dataFim + ", dataInicio=" + dataInicio + '}';
    }

    public Turma() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraia(String cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    
}
