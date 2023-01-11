package com.example.Tablas;

@Entity
@Table(name="AulaInformatica")
public class AulaInformatica 
{
	@Id
	@Column(length = 10)
	private Long id;
	@Column(length = 30, nullable = null)
	private Int numeroAula;
	@Column(length = 30, nullable = null)
	private Int planta;
	public AulaInformatica()
	{
		
	}

}
