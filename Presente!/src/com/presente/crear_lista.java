package com.presente;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class crear_lista extends Activity {
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.crear_lista);
	        TextView lblCantidad = (TextView) findViewById(R.id.lblCantidad);
			lblCantidad.setText("La cantidad de alumnos registrados es: "+ListaAlumnos.getCantidadAlumnos()); 
			
	    }
	 
	 //Este metodo es el que nos agrega un alumno al array de alumnos
	public void siguiente(View view){
		EditText txtName = (EditText) findViewById(R.id.txtNombre);
		Alumno a = new Alumno(txtName.getText().toString());
		ListaAlumnos.addAlumno(a);
		txtName.setText("");
		TextView lblCantidad = (TextView) findViewById(R.id.lblCantidad);
		lblCantidad.setText("La cantidad de alumnos registrados es: "+ListaAlumnos.getCantidadAlumnos()); 
		//TODO: limpiar campos o llamar de nuevo al mismo activity
		
	}
	public void volver(View view){
        /*Intent i = new Intent(this, MainActivity.class);
        startActivity(i);*/
		finish(); 
	}
}
