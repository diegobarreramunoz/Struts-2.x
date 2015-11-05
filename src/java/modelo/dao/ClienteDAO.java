/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import modelo.entidades.Cliente;

/**
 *
 * @author Diego
 */
public interface ClienteDAO {
    public boolean Agrega (Cliente cliente);
    public boolean Eliminar (Cliente cliente);
    public boolean Modificar (Cliente cliente);
    public ArrayList<Cliente> Listar();
}
