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
@Table(name = "Professor")
@XmlRootElement
public class Professor extends AbstractEntity {
    
    
    @Column(length = 255, nullable = false)
    private String nome;
    
    @Column(length = 255, nullable = false)
    private String telefone;
    
    @Column(length = 255, nullable = false)
    private String endereco;
    
    @Column(length = 255, nullable = false)
    private String conta;
    
  

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
        final Professor other = (Professor) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + ", conta=" + conta + '}';
    }

    public Professor() {
    }

    @Override
    public void updateParameters(Object entity) {
        final Professor Professor = (Professor) entity;
        this.telefone = Professor.getTelefone();
        this.endereco = Professor.getEndereco();
        this.conta = Professor.getConta();
        this.nome = Professor.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
}    