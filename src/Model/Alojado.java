
package Model;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author hp
 */
@Entity(name="Alojado")
public class Alojado {
    @Id
    @Column
    private String id;
    @Column
    private String nome;
    @Column
    private String contato;
    @Column
    private String sexo;
    @Column
    private Date nascimento;
    @Column
    private ArrayList<Parente> parentes;
    @Column
    private String idCentro;
    @Column
    private boolean presente;
    @Column
    private boolean vivo;
    @Column
    private boolean doente;
    @Column
    private String localizacao;
    @Column
    private String doenca;

    public Alojado(String nome, String contato, String id, String sexo, Date nascimento, ArrayList<Parente> parentes, String idCentro, boolean presente, boolean doente, String localizacao, String doenca) {
        this.nome = nome;
        this.contato = contato;
        this.id = id;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.parentes = parentes;
        this.idCentro = idCentro;
        this.presente = presente;
        this.doente = doente;
        this.localizacao = localizacao;
        this.doenca = doenca;
        this.vivo = true;
    }

    public Alojado() {
    }

    public Alojado(String nome, String contato, String id, String sexo, Date nascimento, ArrayList<Parente> parentes, String idCentro, boolean presente) {
        this.nome = nome;
        this.contato = contato;
        this.id = id;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.parentes = parentes;
        this.idCentro = idCentro;
        this.presente = presente;
    }

    public Alojado(String nome, String contato, String id, String sexo, Date nascimento, ArrayList<Parente> parentes, String idCentro, boolean presente, boolean doente, String doenca) {
        this.nome = nome;
        this.contato = contato;
        this.id = id;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.parentes = parentes;
        this.idCentro = idCentro;
        this.presente = presente;
        this.doente = doente;
        this.doenca = doenca;
    }
    
    
    
    
    
    
    
    
            

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public ArrayList<Parente> getParentes() {
        return parentes;
    }

    public void setParentes(ArrayList<Parente> parentes) {
        this.parentes = parentes;
    }

    public String getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(String idCentro) {
        this.idCentro = idCentro;
    }

    public boolean getPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public boolean getVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean getDoente() {
        return doente;
    }

    public void setDoente(boolean doente) {
        this.doente = doente;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }
    
    
    
    
    
    
    
}
