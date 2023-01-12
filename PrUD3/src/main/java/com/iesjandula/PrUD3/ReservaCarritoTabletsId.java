package com.iesjandula.PrUD3;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Embeddable;

@Embeddable
public class ReservaCarritoTabletsId implements Serializable
{
	
	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = -2149990752410587470L;
	/** Atrubito - ID Profesor */
	private Long idProfesor;
	/** Atrubito - ID Aula */
	private Long idAula;
	/** Atributo - Fecha*/
	private Date Fecha;
	
	public ReservaCarritoTabletsId() 
	{
		
	}

	public Long getIdProfesor()
	{
		return idProfesor;
	}

	public void setIdProfesor(Long idProfesor)
	{
		this.idProfesor = idProfesor;
	}

	public Long getIdAula()
	{
		return idAula;
	}

	public void setIdAula(Long idAula)
	{
		this.idAula = idAula;
	}

	public Date getFecha()
	{
		return Fecha;
	}

	public void setFecha(Date fecha)
	{
		Fecha = fecha;
	}

	
}
