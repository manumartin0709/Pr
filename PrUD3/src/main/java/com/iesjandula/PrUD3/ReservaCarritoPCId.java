package com.iesjandula.PrUD3;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Embeddable;

@Embeddable
public class ReservaCarritoPCId implements Serializable
{
	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = -2149990752410587470L;
	/** Atrubito - ID Profesor */
	private Long idProfesor;
	/** Atrubito - ID Aula */
	private Long idCarritoPc;
	/** Atributo - Fecha*/
	private Date fecha;
	
	public ReservaCarritoPCId ()
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

	public Long getIdCarritoPc()
	{
		return idCarritoPc;
	}

	public void setIdCarritoPc(Long idCarritoPc)
	{
		this.idCarritoPc = idCarritoPc;
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
