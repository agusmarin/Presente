package com.presente;

import java.util.Date;

public class Asistencia {
	private Alumno alumno;
	private java.util.Date date;
	private boolean presente;
	
	public Asistencia(Alumno alumno, Date date, boolean presente) {
		this.alumno = alumno;
		this.date = date;
		this.presente = presente;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}
		
	
}
