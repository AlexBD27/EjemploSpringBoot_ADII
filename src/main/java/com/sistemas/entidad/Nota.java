package com.sistemas.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@IdClass(NotaID.class)
@Table(name = "notas")
@Data
public class Nota {
	
	@Id
	@NotNull
	@ManyToOne
	@JoinColumn(referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_alumno_notas"))
	private Alumno alumno;
	
	@Id
	@NotNull
	@ManyToOne
	@JoinColumn(referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_docente_notas"))
	private Docente docente;
	
	@Id
	@NotNull
	@ManyToOne
	@JoinColumn(referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_curso_notas"))
	private Curso curso;
	
	private Double unidad1;
	private Double unidad2;
	private Double unidad3;
}
