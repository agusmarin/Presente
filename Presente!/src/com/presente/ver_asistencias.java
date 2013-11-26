package com.presente;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class ver_asistencias extends Activity {
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.ver_asistencias);
	        WebView webview = (WebView) findViewById(R.id.webView);
	        webview.getSettings().setJavaScriptEnabled(true);
	        String titulo = "<h1>Asistencias</h1>";
	        String cuerpo="";
	        /* En el siguiente for agregamos al WebView creado antes el "cuerpo" del parrafo donde se va a encontrar: Nombre,
	        Fecha y si se encontraba presente o ausente */
	        for(Asistencia asist:ListaAsistencia.getAsistencias()){
	        	cuerpo+="<br>" + asist.getAlumno().getNombre() +"  -  "+ asist.getDate() + "  -  " + (asist.isPresente() ? "Presente" : "Ausente") ;
	        }
	        webview.loadDataWithBaseURL(null,titulo+cuerpo, "text/html","UTF-8",null);
	        

}
	 /* En el siguiente metodo se borran las asistencias del Webview al presionar Limpiar */
	 public void limpiar(View view){
		 	WebView webview = (WebView) findViewById(R.id.webView);
		    webview.getSettings().setJavaScriptEnabled(true);
	        String titulo = "<h1>Asistencias</h1>";
	        webview.loadDataWithBaseURL(null,titulo, "text/html","UTF-8",null);
	 }
	 public void volver(View view){
		 	finish(); 
	 }
	 }
