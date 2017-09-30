package com.renanrest.model;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author renan
 */
@Entity
@Table(name = "Matricula")
@XmlRootElement
public class Matricula extends AbstractEntity {
    
    
    @Column(length = 255, nullable = false)
    private String turma;
    
    @Column(length = 255, nullable = false)
    private String aluno;
    
    @Temporal(TemporalType.DATE)
    private Date dataMatricula;
    
    @Temporal(TemporalType.DATE)
    private Date valorMatricula;    
    private Date datamatricula;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.turma);
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
        final Matricula other = (Matricula) obj;
        if (!Objects.equals(this.turma, other.turma)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Matricula{" + "turma=" + turma + ", aluno=" + aluno + ", dataMatricula=" + dataMatricula + ", valorMatricula=" + valorMatricula + '}';
    }

    public Matricula() {
    }

    @Override
    public void updateParameters(Object entity) {
        final Matricula Matricula = (Matricula) entity;
        this.aluno = Matricula.getAluno();
        this.valorMatricula = Matricula.getValorMatricula();
        this.dataMatricula = Matricula.getDataMatricula();
        this.turma = Matricula.getTurma();
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date datamatricula) {
        this.datamatricula = datamatricula;
    }

    public Date getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(Date valormatricula) {
        this.valorMatricula = valormatricula;
    }
    
}
