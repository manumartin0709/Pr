package com.example.Tablas;

@Entity
@Table(name="ReservaAula")
public class ReservaAula 
{
	@EmbeddedId
	private ReservaAulaId reservaAulaId;
	@JoinColumn(name = "idProfesor")
	@MapsId("idProfesor")
	private Profesor idProfesor;
	
	@JoinColumn(name = "idAula")
	@MapsId("idAula")
	private AulaInformatica idAula;
	
	@Column(length = 45)
	private Date fecha;
	
	public ReservaAula()
	{
		
	}

}
