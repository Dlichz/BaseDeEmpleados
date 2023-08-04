
import java.awt.Frame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Guardados {

    //String nom, ape, ns, dep, pues;
    //private static Resultado encontrado;
    private static Departamento arreglo[]= new Departamento[10];
    public Guardados(){
    }
    
    public static void main(String [] args){
    
    }
    
    public static void registro(int num1,int nuevoDia,int nuevoMes, int nuevoAnio,String departamento,String puesto,String nombre, String apellido,String nss){
        arreglo[num1]= new Departamento(nuevoDia, nuevoMes, nuevoAnio, departamento, puesto, nombre, apellido, nss);
        //arreglo[num1]= new Departamento();
        arreglo[num1].setNombre(nombre);
        arreglo[num1].setApellidos(apellido);
        arreglo[num1].setSeguro(nss);
        arreglo[num1].setDepartamento(departamento);
        arreglo[num1].setPuesto(puesto);
        arreglo[num1].contratacion.setDia(nuevoDia);
        arreglo[num1].contratacion.setMes(nuevoMes);
        arreglo[num1].contratacion.setAnio(nuevoAnio);
        //int nuevoDia, int nuevoMes, int nuevoAnio, String nombreDepartamento, String puestoActual, String nombre,String apellidos, String nss
    }
    
    public static void busqueda(String nombre){
        for(int j=0; j<10; j++){
            if( nombre.equals(arreglo[j].getNombre())) {
                //Guardados.mostrarConsulta(arreglo[j]);
                Interfaz.mostrarElemento(arreglo[j]);
                /*Interfaz.txtNombre.setText(arreglo[j].getNombre());
                Interfaz.txtApellidos.setText(arreglo[j].getApellidos());
                Interfaz.txtNss.setText(arreglo[j].getSeguro());
                Interfaz.txtDepartamento.setText(arreglo[j].getDepartamento());
                Interfaz.txtPuesto.setText(arreglo[j].getPuesto());*/
                
            }
        }
    }
    
    
    /*public static void elemento(Departamento x){
        Interfaz.txtNombre.setText(x.getNombre());
        Interfaz.txtApellidos.setText(x.getApellidos());
        Interfaz.txtNss.setText(x.getApellidos());
        Interfaz.txtDepartamento.setText(x.getDepartamento());
        Interfaz.txtPuesto.setText(x.getPuesto());
        Interfaz.txtDia.setText(String.valueOf(x.contratacion.getDia()));
        Interfaz.txtMes.setText(String.valueOf(x.contratacion.getMes()));
        Interfaz.txtAnio.setText(String.valueOf(x.contratacion.getAnio()));
        
        
        //Interfaz.txtNombre.setText(arreglo[j].getNombre());
        //Interfaz.txtApellidos.setText(arreglo[j].getApellidos());
        /*Interfaz.txtNss.setText(arreglo[j].getSeguro());
        Interfaz.txtDepartamento.setText(arreglo[j].getDepartamento());
        Interfaz.txtPuesto.setText(arreglo[j].getPuesto());
        Interfaz.txtDia.setText(String.valueOf(arreglo[j].contratacion.getDia()));
        Interfaz.txtAnio.setText(String.valueOf(arreglo[j].contratacion.getMes()));
        Interfaz.txtAnio.setText(String.valueOf(arreglo[j].contratacion.getAnio()));*/
        
} 

/*public static void main(String [ ] args) {
    Instrumento [ ] orquesta = new Instrumento[5]; // arreglo de objetos
    int i = 0;
    orquesta[i++] = new Guitarra( );
    orquesta[i++] = new Piano( );
    orquesta[i++] = new Saxofon( );
    orquesta[i++] = new Guzla( );
    orquesta[i++] = new Ukelele( );
    afinarTodo( orquesta );   }
}*/
//arreglo[num1]= new Departamento();