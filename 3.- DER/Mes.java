package examen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "MES")
@PrimaryKeyJoinColumn(name = "MESID")
public class Mes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MES_ID")
	private int id;

	@Column(name = "NOMBRE", length = 255)
	private String nombre;

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

}
