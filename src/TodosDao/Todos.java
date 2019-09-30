/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TodosDao;

import Controller.TodosDao;
import Model.*;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Edson Nhancale
 */
public class Todos {
    public static void main(String[] args) {

        
        List<Funcionario> po = TodosDao.listarFuncionarios();
        List<Parente> parente = TodosDao.listarParentes();
        List<Centro> centro = TodosDao.listarCentro();
//        
//        for (Operador func: po) {
//            JOptionPane.showMessageDialog(null, "Nome: "+func.getNome());
//            System.out.println("Nome"+func.getNome());
//        }
         
//       TodosDao<Funcionario> crud = new TodosDao<Funcionario>();
//        Gestor teste = new Gestor();        
//        teste.setNome("Edson Carlos Nhancale");
//        teste.setSexo("Masculino");
//        crud.salvar(teste);
     
//       TodosDao<Funcionario> crud = new TodosDao<Funcionario>();
//        Operador teste = new Operador();
//        teste.setId(3);
//        crud.deletar(teste);
        
//        for (Funcionario func: po) {
//            JOptionPane.showMessageDialog(null, func.getNome());
//            System.out.println("Nome: "+func.getNome());
//        }
        
//        for (Centro centros: centro) {
//            JOptionPane.showMessageDialog(null, centros.getNome());
//            System.out.println("Nome: "+centros.getNome());
//        }

// TodosDao<Centro> crud = new TodosDao<Centro>();
//        Centro teste = new Centro();
//        teste.setNome("Matola");
//        crud.salvar(teste);

   
        
        for (Centro centros: centro) {
            JOptionPane.showMessageDialog(null, centros.getNome());
            System.out.println("Nome: "+centros.getNome());
        }

    }
    
}
