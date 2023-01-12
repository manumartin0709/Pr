package com.iesjandula.PrUD3;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name="reserva_carrito_pc")
public class ReservaCarritoPC 
{
	@EmbeddedId
	private ReservaCarritoPCId reservaCarritoPCId;
	
	@ManyToOne
	@JoinColumn(name = "id_profesor")
	@MapsId("idProfesor")
	private Profesor idProfesor;
	
	@ManyToOne
	@JoinColumn(name = "id_carrito_pc")
	@MapsId("idCarritoPC")
	private CarritoPC idCarritoPC;
	
	@MapsId("fecha")
	private Date fecha;
	
	@Column(length = 45)
	private String VerificacionPrestamo;
	
	public ReservaCarritoPC()
	{
		
	}

	public ReservaCarritoPCId getReservaCarritoPCId()
	{
		return reservaCarritoPCId;
	}

	public void setReservaCarritoPCId(ReservaCarritoPCId reservaCarritoPCId)
	{
		this.reservaCarritoPCId = reservaCarritoPCId;
	}

	public Profesor getIdProfesor()
	{
		return idProfesor;
	}

	public void setIdProfesor(Profesor idProfesor)
	{
		this.idProfesor = idProfesor;
	}

	public CarritoPC getIdCarritoPC()
	{
		return idCarritoPC;
	}

	public void setIdCarritoPC(CarritoPC idCarritoPC)
	{
		this.idCarritoPC = idCarritoPC;
	}

	public Date getFecha()
	{
		return fecha;
	}

	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}

	public String getVerificacionPrestamo()
	{
		return VerificacionPrestamo;
	}

	public void setVerificacionPrestamo(String verificacionPrestamo)
	{
		VerificacionPrestamo = verificacionPrestamo;
	}
	
	

}
