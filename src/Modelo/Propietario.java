/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Propietario extends Persona {
    private String nit;
    private String cui;
    public Propietario(){}
    public Propietario(String nit, String cui, String nombres, String apellidos, String direccion, String fecha_nacimiento, String telefono) {
        super(nombres, apellidos, direccion, fecha_nacimiento, telefono);
        this.nit = nit;
        this.cui = cui;
    }

    public Propietario(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }
    @Override
    public void agregar(){
    System.out.println("Nit: " + this.getNit() );
    System.out.println("Cui: " + this.getCui() );
    System.out.println("Nombre: " + this.getNombres() );
    System.out.println("Apellidos: " + this.getApellidos() );
    System.out.println("Direccion: " + this.getDireccion() );
    System.out.println("Telefono: " + this.getTelefono() );
    System.out.println("Fecha Nacimiento: " + this.getFecha_nacimiento() );
    System.out.println("------------------------------------------------------");
    }
    
}
