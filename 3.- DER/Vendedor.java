package examen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "VENDEDOR")
@PrimaryKeyJoinColumn(name = "VENDEDOR_ID")
public class Vendedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VENDEDOR_ID")
	private int id;

	@Column(name = "NOMBRE", length = 255)
	private String nombre;
	
	@OneToOne
	@JoinColumn(name = "VENDEDOR_ID_AUX",  referencedColumnName = "JEFE_ID", updatable = false)
	private Vendedor jefe; 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vendedor getJefe() {
		return jefe;
	}

	public void setJefe(Vendedor jefe) {
		this.jefe = jefe;
	}

}
