/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Arquivo.NewHibernateUtil;
import Model.Alojado;
import Model.Centro;
import Model.Funcionario;
import Model.Parente;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Edson Nhancale
 */
public class TodosDao<T> {
   public boolean salvar(T t){
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        try {
            s.saveOrUpdate( t);
            tx.commit();
            return true;
                    
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return false;
        }
      finally {
            s.close();
            sf.close();
        }
    }
  ////////////////////////////////////////////////////////////////////////////// 
   public static List listarFuncionarios(){
       SessionFactory sf = NewHibernateUtil.getSessionFactory();
       Session s = sf.openSession(); 
       List<Funcionario> lista =null;
       try {
           lista =  s.createQuery("from Funcionario").list();
       } catch (Exception e) {
       }finally{
        s.close();
       }
       return lista;
   }
   /////////////////////////////////////////////////////////////////////////////
   public static List listarParentes(){
       SessionFactory sf = NewHibernateUtil.getSessionFactory();
       Session s = sf.openSession(); 
       List<Parente> lista =null;
       try {
           lista =  s.createQuery("from Parente").list();
       } catch (Exception e) {
       }finally{
        s.close();
       }
       return lista;
   }
   /////////////////////////////////////////////////////////////////////////////
   
      /////////////////////////////////////////////////////////////////////////////
   public static List listarAlojado(){
       SessionFactory sf = NewHibernateUtil.getSessionFactory();
       Session s = sf.openSession(); 
       List<Alojado> lista =null;
       try {
           lista =  s.createQuery("from Alojado").list();
       } catch (Exception e) {
       }finally{
        s.close();
       }
       return lista;
   }
   /////////////////////////////////////////////////////////////////////////////
   
   /////////////////////////////////////////////////////////////////////////////
   public static List listarCentro(){
       SessionFactory sf = NewHibernateUtil.getSessionFactory();
       Session s = sf.openSession(); 
       List<Centro> lista =null;
       try {
           lista =  s.createQuery("from Centro").list();
       } catch (Exception e) {
       }finally{
        s.close();
       }
       return lista;
   }
   /////////////////////////////////////////////////////////////////////////////
   public boolean deletar(T t){
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        try {
            s.delete(t);
            tx.commit();
            return true;
                    
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return false;
        }
      finally {
            s.close();
            sf.close();
        }
    }
}
