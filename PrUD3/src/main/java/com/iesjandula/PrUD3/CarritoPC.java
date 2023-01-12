package com.iesjandula.PrUD3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="CarritoPC")
public class CarritoPC 
{
	@Id
	@Column(length = 10)
	private Long id;
	@Column(length = 10, nullable = false)
	private Integer numeroPCS;
	@Column(length = 10, nullable = false)
	private Integer planta;
	@Column(length = 45, nullable = false)
	private String sistemaOperativo;
	public CarritoPC() 
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
	public Integer getNumeroPCS()
	{
		return numeroPCS;
	}
	public void setNumeroPCS(Integer numeroPCS)
	{
		this.numeroPCS = numeroPCS;
	}
	public Integer getPlanta()
	{
		return planta;
	}
	public void setPlanta(Integer planta)
	{
		this.planta = planta;
	}
	public String getSistemaOperativo()
	{
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo)
	{
		this.sistemaOperativo = sistemaOperativo;
	}
	
	


}
