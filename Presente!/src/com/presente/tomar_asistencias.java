package com.presente;

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class tomar_asistencias extends Activity {
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.tomar_asistencias);
	        /*Este try nos nos permite que si el usuario intenta tomar asistencia sin haber 
	        creado una lista de alumnos antes, avisarle a este que primero proceda a este paso
	         	Al iniciar el activity si hay una lista de alumnos se muestra el nombre del primer alumno que habia sido registrado*/
	        try {
	        ListaAlumnos.resetearAlumno();
	        TextView nombre = (TextView) findViewById(R.id.lblNombreParaTA);
	        nombre.setText(ListaAlumnos.getAlumno(ListaAlumnos.getAlumnoActual()).getNombre());
	        }catch(Exception e){
	        	finish(); 
	        	Toast.makeText(this , "Debes crear una lista antes" , Toast.LENGTH_LONG).show();
	        }

	    }
	 public void ausente(View view){
		 tomarAsistencia(false);
	 }
	 public void presente(View view){
		 tomarAsistencia(true);
	 }
	
	public void tomarAsistencia(boolean falto){
		TextView nombre = (TextView) findViewById(R.id.lblNombreParaTA);
		java.util.Date date = new Date();
		/*Aca definimos el objeto a de la clase Alumno, que lo sacamos de ListaAlumnos que es donde se encuentran todos estos.
		 Luego agregamos un objeto Asistencia donde le pasamos el alumno a que creamos antes, la fecha y el boolean si falto
		  o no (Los metodos de esto están arriba)*/
		Alumno a = ListaAlumnos.getAlumno(ListaAlumnos.getAlumnoActual());
		ListaAsistencia.addAsistencia(new Asistencia(a, date, falto));
		/*Lo que hacemos aca es mostrar en un TextView el nombre del alumnos que se esta por tomar asistencia*/
		if (ListaAlumnos.incAlumno()){
	        nombre.setText(ListaAlumnos.getAlumno(ListaAlumnos.getAlumnoActual()).getNombre());
		}
		else{
			//Cuando se temrina de tomar asistencia a todos los alumnos se bloquean los botones "presente" y "ausente"
			nombre.setText("Finalizado");
	        Button miBoton1 = (Button)findViewById(R.id.button1);
	        miBoton1.setEnabled(false);
	        Button miBoton2 = (Button)findViewById(R.id.btnCerrar);
	        miBoton2.setEnabled(false);
		}
	}
	public void volver (View view){
        /*Intent i = new Intent(this, MainActivity.class);
        startActivity(i);*/
		finish(); 
	}
}
