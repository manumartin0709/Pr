package com.example.Tablas;

@Embeddable
public class ReservaAulaId implements Serializable
{
	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = -2149990752410587470L;
	/** Atrubito - ID Profesor */
	private Long idProfesor;
	/** Atrubito - ID Aula */
	private Long idAula;
	
	public ReservaAulaId() 
	{
		
	}
}
