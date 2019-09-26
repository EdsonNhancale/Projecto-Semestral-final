
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author hp
 */
@Entity
public class Parente {
  @Id
  @Column
  private String nome;
  @Column
  private String grauParentesco;
  @Column
  private String contacto;

    public Parente(String nome, String grauParentesco, String contacto) {
        this.nome = nome;
        this.grauParentesco = grauParentesco;
        this.contacto = contacto;
    }

    public Parente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }
   
    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

     
}
