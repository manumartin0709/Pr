package com.iesjandula.PrUD3;

import java.util.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name="reserva_aula")
public class ReservaAula 
{
	@EmbeddedId
	private ReservaAulaId reservaAulaId;
	
	@ManyToOne
	@JoinColumn(name = "id_profesor")
	@MapsId("idProfesor")
	private Profesor idProfesor;
	
	@ManyToOne
	@JoinColumn(name = "id_aula")
	@MapsId("idAula")
	private AulaInformatica idAula;
	
	@MapsId("fecha")
	private Date fecha;
	
	public ReservaAula()
	{
		
	}

	public ReservaAulaId getReservaAulaId()
	{
		return reservaAulaId;
	}

	public void setReservaAulaId(ReservaAulaId reservaAulaId)
	{
		this.reservaAulaId = reservaAulaId;
	}

	public Profesor getIdProfesor()
	{
		return idProfesor;
	}

	public void setIdProfesor(Profesor idProfesor)
	{
		this.idProfesor = idProfesor;
	}

	public AulaInformatica getIdAula()
	{
		return idAula;
	}

	public void setIdAula(AulaInformatica idAula)
	{
		this.idAula = idAula;
	}

	public Date getFecha()
	{
		return fecha;
	}

	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}

}
