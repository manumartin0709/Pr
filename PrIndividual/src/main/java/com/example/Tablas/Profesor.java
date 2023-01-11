package com.example.Tablas;

@Entity
@Table(name="Profesor")
public class Profesor 
{
	@Id
	@Column(length = 10)
	private Long id;
	@Column(length = 30, nullable = null)
	private String nombre;
	@Column(length = 30, nullable = null )
	private String apellidos;
	@ManyToOne
	private AulaInformatica idAulaInformatica
	public Profesor()
	{
		
	}
	

}
