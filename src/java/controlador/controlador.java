/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.opensymphony.xwork2.ModelDriven;
import java.util.ArrayList;
import modelo.dao.ClienteDAO;
import modelo.dao.ClienteImpl;
import modelo.entidades.Cliente;

/**
 *
 * @author Diego
 */
public class controlador implements ModelDriven<Cliente>{
    private Cliente cliente = new Cliente();
    private ArrayList<Cliente> listaClientes=new ArrayList();
    ClienteDAO clienteDAO;
    private String msg="";

    public controlador() {
        this.clienteDAO = new ClienteImpl();
    }
    
    
    
    @Override
    public Cliente getModel() {
        return cliente;
    }
    public String agregar(){
        if(clienteDAO.Agrega(cliente)){
            msg="Se agrego Correctamente";
        }else{
            msg="No se agrego";
        }
        return "fin";
    }
    
    public String listar(){
        listaClientes=clienteDAO.Listar();
        return "fin";
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public String getMsg() {
        return msg;
    }
    
    public String agregarInicio(){
        return "exito";
    }
    
    public String listarInicio(){
        return "exito";
    }
    
}
