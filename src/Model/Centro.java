
package Model;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author hp
 */
@Entity
public class Centro {
    @Id
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
    @Column
    private ArrayList<Operador> operadores;
    @Column
    private ArrayList<Gestor> gestores;
    @Column
    private ArrayList<Alojado> alojados;

    public Centro(String nome, String id, String localizacao, int lotacao, ArrayList<Operador> operadores, ArrayList<Gestor> gestores, ArrayList<Alojado> alojados) {
        this.nome = nome;
        this.id = id;
        this.localizacao = localizacao;
        this.lotacao = lotacao;
        this.operadores = operadores;
        this.gestores = gestores;
        this.alojados = alojados;
        this.lotado = false;
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
