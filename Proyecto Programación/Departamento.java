/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Departamento extends Empleado{
    protected String nombreDepartamento;
    protected String puestoActual;		

public Departamento(int nuevoDia, int nuevoMes, int nuevoAnio, String nombreDepartamento, String puestoActual, String nombre,String apellidos, String nss){
	super(nuevoDia, nuevoMes, nuevoAnio, nombre,apellidos, nss);
	this.nombreDepartamento= nombreDepartamento;
        this.puestoActual = puestoActual;
}


    public void setDepartamento(String departamento){
    nombreDepartamento=departamento;
    }

    public String getDepartamento(){
        return nombreDepartamento;
    }
    
    public String getPuesto(){
        return puestoActual;
    }

    public void setPuesto(String puesto){
        puestoActual=puesto;
    }
    
    public static void mostrarElemento(Departamento x){
        Interfaz.txtNombre.setText(x.getNombre());
        Interfaz.txtApellidos.setText(x.getApellidos());
        Interfaz.txtNss.setText(x.getApellidos());
        Interfaz.txtDepartamento.setText(x.getDepartamento());
        Interfaz.txtPuesto.setText(x.getPuesto());
        Interfaz.txtDia.setText(String.valueOf(x.contratacion.getDia()));
        Interfaz.txtMes.setText(String.valueOf(x.contratacion.getMes()));
        Interfaz.txtAnio.setText(String.valueOf(x.contratacion.getAnio()));
    }

}
