
package Model;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author hp
 */
@Entity
public class Centro {
    @Id
    @GeneratedValue
    @Column
    private String id;
    @Column 
    private String nome;
    @Column
    private String localizacao;
    @Column
    private boolean lotado;
    @Column
    private int lotacao;
    
    private ArrayList<Operador> operadores;
   
    private ArrayList<Gestor> gestores;
    
    private ArrayList<Alojado> alojados;

    public Centro(String id, String nome, String localizacao, boolean lotado, int lotacao) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.lotado = lotado;
        this.lotacao = lotacao;
    }

    

    public Centro() {
    }
     
     

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean getLotado() {
        return lotado;
    }

    public void setLotado(boolean lotado) {
        this.lotado = lotado;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public ArrayList<Operador> getOperadores() {
        return operadores;
    }

    public void setOperadores(ArrayList<Operador> operadores) {
        this.operadores = operadores;
    }

    public ArrayList<Gestor> getGestores() {
        return gestores;
    }

    public void setGestores(ArrayList<Gestor> gestores) {
        this.gestores = gestores;
    }

    public ArrayList<Alojado> getAlojados() {
        return alojados;
    }

    public void setAlojados(ArrayList<Alojado> alojados) {
        this.alojados = alojados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
