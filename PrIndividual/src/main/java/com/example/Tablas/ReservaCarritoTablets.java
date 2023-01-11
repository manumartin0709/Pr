package com.example.Tablas;

@Entity
@Table(name="ReservaCarritoTablets")
public class ReservaCarritoTablets 
{
	@JoinColumn(name = "idProfesor")
	@MapsId("idProfesor")
	private Profesor idProfesor;
	
	@JoinColumn(name = "idCarritoTablets")
	@MapsId("idCarritoTablets")
	private CarritoTablets idCarritoTablets;
	
	@Column(length = 45)
	private Date fecha;
	@Column(length = 45)
	private String VerificacionPrestamo;
	
	public ReservaCarritoTablets()
	{
		
	}

}
