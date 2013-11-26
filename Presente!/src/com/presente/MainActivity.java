package com.presente;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    //Los siguientes metodos son los que te permiten ir a un activity, o en el caso de el ultimo, cerrar la aplicación
    public void ejecutarva(View view) {
        Intent i = new Intent(this, ver_asistencias.class);
        startActivity(i);
    }
    public void ejecutarta(View view) {   
    	Intent i = new Intent(this, tomar_asistencias.class);
        startActivity(i);
    }
    public void ejecutarcl(View view) {
        Intent i = new Intent(this, crear_lista.class);
        startActivity(i);
    }
    public void cerrar(View view){
    	finish();
    }
    }

