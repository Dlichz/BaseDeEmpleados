/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Nueva {
    private static Interfaz miInterfaz;
    private static Guardados miRegistro;
    private static Resultado errorBusqueda;
    //private static Error miError;
    
    public static void main(String[] args) {
        miInterfaz = new Interfaz();
        miRegistro = new Guardados();
        //miError = new Error();
        //jugador = new JugadorRegistrado();
        //miInterfaz.setVisible(true);
        //miInterfaz.setLocationRelativeTo(null);
        
    }
    //int num1,int nuevoDia,int nuevoMes, int nuevoAnio,String departamento,String puesto,String nombre, String apellido,String nss)
    public static void RecibirDatos(int num1,int nuevoDia,int nuevoMes,int nuevoAnio, String departamento, String puesto, String nombre, String apellido, String nss) {
        miRegistro.registro( num1,nuevoDia,nuevoMes,nuevoAnio,departamento, puesto,nombre,apellido,nss);
    }
    
  
    public static void MostrarInterfazError() {
        errorBusqueda.setVisible(true);
        errorBusqueda.setLocationRelativeTo(null);
        
    }
    public static void IniciarConsulta(String nombre) {
        miRegistro.busqueda(nombre);
    }
    
    

}
