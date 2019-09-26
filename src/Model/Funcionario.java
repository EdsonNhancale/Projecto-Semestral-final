/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author hp
 */
@Entity (name="Funcionario")
@Table(name="Funcionario")
public abstract class Funcionario implements Serializable{
    @Id
    @GeneratedValue
    @Column(name="id_funcionario")
     private int id;
    @Column(name="nome")
     private String nome;
     @Column(name="contacto")
     private String contacto;
     @Column(name="email")
     private String email;
     @Column(name="tipoDeDocumento")
     private String tipoDeDocumento;
     @Column(name="nrDocumento")
     private String nrDocumento;
     @Column(name="estado")
     private boolean estado;
     @Column(name="dataNascimento")
     private Date dataNascimento;
     @Column(name="sexo")
     private  String sexo;
     @Column
     private String tipoFuncionario;

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", contacto=" + contacto + ", email=" + email + ", tipoDeDocumento=" + tipoDeDocumento + ", nrDocumento=" + nrDocumento + ", estado=" + estado + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + '}';
    }

    public Funcionario(String nome, String contacto, String email, String tipoDeDocumento, String nrDocumento, Date dataNascimento, String sexo) {
        this.nome = nome;
        this.contacto = contacto;
        this.email = email;
        this.tipoDeDocumento = tipoDeDocumento;
        this.nrDocumento = nrDocumento;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.estado = true;
    }
     
     
     

    public Funcionario(String nome, String contacto, String email, String tipo, String nrDocumento, int id, boolean estado, Date dataNascimento, String sexo) {
        this.nome = nome;
        this.contacto = contacto;
        this.email = email;
        this.tipoDeDocumento = tipo;
        this.nrDocumento = nrDocumento;
        this.id = id;
        this.estado = estado;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public Funcionario() {
    }
     
     
     

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
     

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
     

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipoDeDocumento;
    }

    public void setTipo(String tipo) {
        this.tipoDeDocumento = tipo;
    }

    public String getNrDocumento() {
        return nrDocumento;
    }

    public void setNrDocumento(String nrDocumento) {
        this.nrDocumento = nrDocumento;
    }

    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(String tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }
    
}
