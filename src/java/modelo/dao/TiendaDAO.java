/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import modelo.entidades.Tienda;

/**
 *
 * @author Diego
 */
public interface TiendaDAO {
    public boolean Agrega (Tienda tienda);
    public boolean Eliminar (Tienda tienda);
    public boolean Modificar (Tienda tienda);
    public ArrayList<Tienda> Listar();
}
