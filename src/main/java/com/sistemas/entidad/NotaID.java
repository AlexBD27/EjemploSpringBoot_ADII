package com.sistemas.entidad;

import java.io.Serializable;

import lombok.Data;

@Data
public class NotaID implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long alumno;
	private Long docente;
	private Long curso;
	
	public NotaID() {
		
	}

	public NotaID(Long alumno, Long docente, Long curso) {
		super();
		this.alumno = alumno;
		this.docente = docente;
		this.curso = curso;
	}
	
	
}
