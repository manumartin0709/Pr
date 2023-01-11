package com.example.Tablas;

@Entity
@Table(name="CarritoTablets")
public class CarritoTablets 
{
	@Id
	@Column(length = 10)
	private Long id;
	@Column(length = 10)
	private Integer numeroTablets;
	@Column(length = 10)
	private Integer planta;
	public CarritoTablets() 
	{
		
	}

}
