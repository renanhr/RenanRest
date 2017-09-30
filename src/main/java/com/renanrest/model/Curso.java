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
@Table(name = "Curso")
@XmlRootElement
public class Curso extends AbstractEntity {
    
    
    @Column(length = 255, nullable = false)
    private String nome;
    
    @Column(length = 255, nullable = false)
    private String titulo;
    private Date inicioCurso;
    
  

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nome);
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
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", titulo=" + titulo + '}';
    }

    public Curso() {
    }

    @Override
    public void updateParameters(Object entity) {
        final Curso ator = (Curso) entity;
        this.titulo = ator.getTitulo();
        this.inicioCurso = ator.getInicioCurso();
        this.nome = ator.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String cpf) {
        this.titulo = titulo;
    }

    public Date getInicioCurso() {
        return inicioCurso;
    }

    public void setInicioAtor(Date inicioCurso) {
        this.inicioCurso = inicioCurso;
    }
    
}
