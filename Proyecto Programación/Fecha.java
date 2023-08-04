/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

public Fecha(int nuevoDia, int nuevoMes, int nuevoAnio){
    dia = nuevoDia;
    mes = nuevoMes;
    anio = nuevoAnio;
}
public Fecha(){
//constructor
}

public int getDia(){
	return dia;
}

public void setDia(int nuevoDia){
	this.dia=nuevoDia;
}

public int getMes(){
	return mes;
}

public void setMes(int nuevoMes){
	this.mes=nuevoMes;
}


public int getAnio(){
	return anio;
}

public void setAnio(int nuevoAnio){
	this.anio=nuevoAnio;
}
}
