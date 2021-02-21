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

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;

@Entity
@Table(name = "RENGLON")
@PrimaryKeyJoinColumn(name = "RENGLON_ID")
public class RenglonXFactura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RENGLONXFACTURA_ID")
	private int id;

	@Column(name = "IVA")
	private Integer iva;

	@Column(name = "RENGLON")
	private Integer renglon;

	@Column(name = "MONTO_SIN_IVA")
	private Double montoSinIva;

	@OneToOne
	@JoinColumn(name = "VENDEDOR_ID_AUX", referencedColumnName = "JEFE_ID", updatable = false)
	private Producto producto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getIva() {
		return iva;
	}

	public void setIva(Integer iva) {
		this.iva = iva;
	}

	public Integer getRenglon() {
		return renglon;
	}

	public void setRenglon(Integer renglon) {
		this.renglon = renglon;
	}

	public Double getMontoSinIva() {
		return montoSinIva;
	}

	public void setMontoSinIva(Double montoSinIva) {
		this.montoSinIva = montoSinIva;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
