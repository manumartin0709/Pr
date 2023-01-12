package com.iesjandula.PrUD3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="CarritoTablets")
public class CarritoTablets 
{
	@Id
	@Column(length = 10)
	private Long id;
	@Column(length = 10, nullable = false)
	private Integer numeroTablets;
	@Column(length = 10, nullable = false)
	private Integer planta;
	public CarritoTablets() 
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
	public Integer getNumeroTablets()
	{
		return numeroTablets;
	}
	public void setNumeroTablets(Integer numeroTablets)
	{
		this.numeroTablets = numeroTablets;
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
