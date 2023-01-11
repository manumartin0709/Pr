package com.example.Tablas;

@Entity
@Table(name="CarritoPC")
public class CarritoPC 
{
	@Id
	@Column(length = 10)
	private Long id;
	@Column(length = 10)
	private Integer numeroPCS;
	@Column(length = 10)
	private Integer planta;
	@Column(length = 45)
	private String sistemaOperativo;
	public CarritoPC() 
	{
		
	}


}
