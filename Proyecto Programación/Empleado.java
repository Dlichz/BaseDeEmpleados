/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Empleado {
    protected String nombreEmpleado;
    protected String apellidos;
    protected String numeroSeguroSocial;
    protected Fecha contratacion;//objeto de la clase Fecha

	//Cosntructor
    public Empleado(int nuevoDia, int nuevoMes, int nuevoAnio, String nombre,String apellidos, String nss){
        nombreEmpleado = nombre;
        this.apellidos= apellidos;
	numeroSeguroSocial = nss;
	contratacion = new Fecha(nuevoDia, nuevoMes, nuevoAnio);
    }
    

	public String getNombre(){
            return nombreEmpleado;
	}

	public void setNombre(String nombre){
		nombreEmpleado=nombre;
	}
        public String getApellidos(){
            return apellidos;
        }
        public void setApellidos(String apellidos){
            this.apellidos= apellidos;
        }

	public String getSeguro(){
		return numeroSeguroSocial;
	}

	public void setSeguro( String nss){
		numeroSeguroSocial= nss; 
	}
}
