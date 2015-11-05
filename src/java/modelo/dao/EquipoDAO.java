/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import modelo.entidades.Equipo;

/**
 *
 * @author Diego
 */
public interface EquipoDAO {
    public boolean Agrega (Equipo equipo);
    public boolean Eliminar (Equipo equipo);
    public boolean Modificar (Equipo equipo);
    public ArrayList<Equipo> Listar();
}
