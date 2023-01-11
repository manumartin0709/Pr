package com.example.Tablas;

@Entity
@Table(name="ReserevaCarritoPC")
public class ReservaCarritoPC 
{
	@JoinColumn(name = "idProfesor")
	@MapsId("idProfesor")
	private Profesor idProfesor;
	
	@JoinColumn(name = "idCarritoPC")
	@MapsId("idCarritoPC")
	private CarritoPC idCarritoPC;
	
	@Column(length = 45)
	private Date fecha;
	@Column(length = 45)
	private String VerificacionPrestamo;
	public ReservaCarritoPC()
	{
		
	}

}
