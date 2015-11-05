/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import modelo.entidades.Equipo;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Diego
 */
public class EquipoImpl implements EquipoDAO{

    
    Transaction tr;
    Session sn;
    
    @Override
    public boolean Agrega(Equipo equipo) {
        boolean verifica = false;
        try {
            
        } catch (Exception e) {
        }
        return verifica;
    }

    @Override
    public boolean Eliminar(Equipo equipo) {
        boolean verifica = false;
        try {
            
        } catch (Exception e) {
        }
        return verifica;
    }

    @Override
    public boolean Modificar(Equipo equipo) {
        boolean verifica = false;
        try {
            
        } catch (Exception e) {
        }
        return verifica;
    }

    @Override
    public ArrayList<Equipo> Listar() {
        ArrayList<Equipo> array = new ArrayList();
        try {
            
        } catch (Exception e) {
        }
        return array;
    }
    
}
