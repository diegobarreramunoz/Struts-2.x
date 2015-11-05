/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import modelo.entidades.Cliente;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Diego
 */
public class ClienteImpl implements ClienteDAO{

    Transaction tr = null;
    Session sn;
    
    
    @Override
    public boolean Agrega(Cliente cliente) {
        boolean verifica = false;
        try {
            sn = HibernateUtil.getSessionFactory().getCurrentSession();
            tr = sn.beginTransaction();
            sn.save(cliente);
            tr.commit();
            verifica=true;
        } catch (Exception e) {
            if(tr!=null){
                tr.rollback();
            }
            verifica = false;
        }
        return verifica;
    }

    @Override
    public boolean Eliminar(Cliente cliente) {
        boolean verifica = false;
        try {
            sn = HibernateUtil.getSessionFactory().getCurrentSession();
            tr = sn.beginTransaction();
            sn.delete(cliente);
            tr.commit();
            verifica=true;
        } catch (Exception e) {
            if(tr!=null){
                tr.rollback();
            }
            verifica = false;
        }
        return verifica;
    }

    @Override
    public boolean Modificar(Cliente cliente) {
        boolean verifica = false;
        try {
            sn = HibernateUtil.getSessionFactory().getCurrentSession();
            tr = sn.beginTransaction();
            sn.update(cliente);
            tr.commit();
            verifica=true;
        } catch (Exception e) {
            if(tr!=null){
                tr.rollback();
            }
            verifica = false;
        }
        return verifica;
    }

    @Override
    public ArrayList<Cliente> Listar() {
        try {
            sn = HibernateUtil.getSessionFactory().getCurrentSession();
            tr = sn.beginTransaction();
            return (ArrayList<Cliente>) sn.createQuery("from Cliente").list();
        } catch (Exception e) {
            return null;
        }
    }
    
}
