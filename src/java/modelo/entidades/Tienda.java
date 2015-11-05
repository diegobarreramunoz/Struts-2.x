package modelo.entidades;
// Generated 28-10-2015 22:20:51 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tienda generated by hbm2java
 */
public class Tienda  implements java.io.Serializable {


     private int codTienda;
     private String direccion;
     private Long telefono;
     private String nombre;
     private Set ordenTrabajos = new HashSet(0);
     private Set personals = new HashSet(0);

    public Tienda() {
    }

	
    public Tienda(int codTienda) {
        this.codTienda = codTienda;
    }
    public Tienda(int codTienda, String direccion, Long telefono, String nombre, Set ordenTrabajos, Set personals) {
       this.codTienda = codTienda;
       this.direccion = direccion;
       this.telefono = telefono;
       this.nombre = nombre;
       this.ordenTrabajos = ordenTrabajos;
       this.personals = personals;
    }
   
    public int getCodTienda() {
        return this.codTienda;
    }
    
    public void setCodTienda(int codTienda) {
        this.codTienda = codTienda;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Long getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getOrdenTrabajos() {
        return this.ordenTrabajos;
    }
    
    public void setOrdenTrabajos(Set ordenTrabajos) {
        this.ordenTrabajos = ordenTrabajos;
    }
    public Set getPersonals() {
        return this.personals;
    }
    
    public void setPersonals(Set personals) {
        this.personals = personals;
    }




}


