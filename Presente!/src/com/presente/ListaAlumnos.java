package com.presente;

import java.util.ArrayList;
/* Esta clase es una clase abstracta donde se encuentra el array de objetos alumnos */
public abstract class ListaAlumnos {

 private static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
 
 private static int alumnoActual=0;
 
 public static boolean incAlumno(){
	 if (alumnoActual<(alumnos.size()-1)){
	 alumnoActual++;
	 return true;
	 }
	 return false;
 }
 
 public static void decAlumnos(){
	 if (alumnoActual>0){
		 alumnoActual--;
	 }
 }
 
 public static void resetearAlumno(){
	 alumnoActual=0;
 }
 
 public static int getAlumnoActual(){
      return alumnoActual;
 }
 
 public static void addAlumno(Alumno a){
	 alumnos.add(a);
 }
 public static ArrayList<Alumno> getAlumnos(){
	 return alumnos;
 }
 
 public static Alumno getAlumno(int i){
	 return alumnos.get(i);
 }
 
 public static int getCantidadAlumnos(){
	 return alumnos.size();
 }

}