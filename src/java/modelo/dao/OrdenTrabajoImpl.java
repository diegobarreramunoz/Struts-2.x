/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import modelo.entidades.OrdenTrabajo;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Diego
 */
public class OrdenTrabajoImpl implements OrdenTrabajoDAO{

    
    Transaction tr;
    Session sn;
    
    @Override
    public boolean Agrega(OrdenTrabajo orden) {
        boolean verifica = false;
        try {
            
        } catch (Exception e) {
        }
        return verifica;
    }

    @Override
    public boolean Eliminar(OrdenTrabajo orden) {
        boolean verifica = false;
        try {
            
        } catch (Exception e) {
        }
        return verifica;
    }

    @Override
    public boolean Modificar(OrdenTrabajo orden) {
        boolean verifica = false;
        try {
            
        } catch (Exception e) {
        }
        return verifica;
    }

    @Override
    public ArrayList<OrdenTrabajo> Listar() {
        ArrayList<OrdenTrabajo> array = new ArrayList();
        try {
            
        } catch (Exception e) {
        }
        return array;
    }
    
}
