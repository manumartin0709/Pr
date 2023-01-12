package com.iesjandula.PrUD3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AulaInformatica")
public class AulaInformatica 
{
	@Id
	@Column(length = 10)
	private Long id;
	@Column(length = 30, nullable = false)
	private Integer numeroAula;
	@Column(length = 30, nullable = false)
	private Integer planta;
	public AulaInformatica()
	{
		
	}
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public Integer getNumeroAula()
	{
		return numeroAula;
	}
	public void setNumeroAula(Integer numeroAula)
	{
		this.numeroAula = numeroAula;
	}
	public Integer getPlanta()
	{
		return planta;
	}
	public void setPlanta(Integer planta)
	{
		this.planta = planta;
	}
	
	

}
