package com.sistemas.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	@NotBlank(message = "El nombre debe tener al menos 1 letra")
	private String nombre;
	
	@Column(nullable = false)
	@NotBlank(message = "El password debe tener al menos 1 letra")
	private String clave;
	
	@Column(nullable = false)
	private String rol;
	
	@Column(nullable = false)
	private int estado;
}
