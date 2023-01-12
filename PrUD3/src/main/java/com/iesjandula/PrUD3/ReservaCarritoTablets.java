package com.iesjandula.PrUD3;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name="ReservaCarritoTablets")
public class ReservaCarritoTablets 
{
	@JoinColumn(name = "idProfesor")
	@MapsId("idProfesor")
	private Profesor idProfesor;
	
	@JoinColumn(name = "idCarritoTablets")
	@MapsId("idCarritoTablets")
	private CarritoTablets idCarritoTablets;
	
	@Column(length = 45)
	private Date fecha;
	@Column(length = 45)
	private String VerificacionPrestamo;
	
	public ReservaCarritoTablets()
	{
		
	}

}
