/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import modelo.entidades.OrdenTrabajo;

/**
 *
 * @author Diego
 */
public interface OrdenTrabajoDAO {
    public boolean Agrega (OrdenTrabajo orden);
    public boolean Eliminar (OrdenTrabajo orden);
    public boolean Modificar (OrdenTrabajo orden);
    public ArrayList<OrdenTrabajo> Listar();
}
