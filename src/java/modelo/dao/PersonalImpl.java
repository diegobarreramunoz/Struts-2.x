/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import modelo.entidades.Personal;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Diego
 */
public class PersonalImpl implements PersonalDAO{

    
    Transaction tr;
    Session sn;
    
    @Override
    public boolean Agrega(Personal personal) {
        boolean verifica = false;
        try {
            
        } catch (Exception e) {
        }
        return verifica;
    }

    @Override
    public boolean Eliminar(Personal personal) {
        boolean verifica = false;
        try {
            
        } catch (Exception e) {
        }
        return verifica;
    }

    @Override
    public boolean Modificar(Personal personal) {
        boolean verifica = false;
        try {
            
        } catch (Exception e) {
        }
        return verifica;
    }

    @Override
    public ArrayList<Personal> Listar() {
        ArrayList<Personal> array = new ArrayList();
        try {
            
        } catch (Exception e) {
        }
        return array;
    }
    
}
