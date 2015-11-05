/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import modelo.entidades.Personal;


/**
 *
 * @author Diego
 */
public interface PersonalDAO {
    public boolean Agrega (Personal personal);
    public boolean Eliminar (Personal personal);
    public boolean Modificar (Personal personal);
    public ArrayList<Personal> Listar();
}
