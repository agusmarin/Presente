package com.presente;

import java.util.ArrayList;
/* Esta es otra clase abstracta (ademas de la de ListaAlumnos) donde se contiene el array con las asistencias de los alumnos */
public abstract class ListaAsistencia {
	 private static ArrayList<Asistencia> asistencia = new ArrayList<Asistencia>();
	 
	 public static void addAsistencia(Asistencia a){
		 asistencia.add(a);
	 }
	 public static ArrayList<Asistencia> getAsistencias(){
		 return asistencia;
		 
	 }
}
