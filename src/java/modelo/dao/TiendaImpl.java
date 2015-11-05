/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import modelo.entidades.Tienda;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Diego
 */
public class TiendaImpl implements TiendaDAO{

    Transaction tr;
    Session sn;
    
    @Override
    public boolean Agrega(Tienda tienda) {
        boolean verifica = false;
        try {
            
        } catch (Exception e) {
        }
        return verifica;
    }

    @Override
    public boolean Eliminar(Tienda tienda) {
        boolean verifica = false;
        try {
            
        } catch (Exception e) {
        }
        return verifica;
    }

    @Override
    public boolean Modificar(Tienda tienda) {
        boolean verifica = false;
        try {
            
        } catch (Exception e) {
        }
        return verifica;
    }

    @Override
    public ArrayList<Tienda> Listar() {
        ArrayList<Tienda> array = new ArrayList();
        try {
            
        } catch (Exception e) {
        }
        return array;
    }
    
}
