package examen.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "FACTURA")
@PrimaryKeyJoinColumn(name = "FACTURAID")
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FACTURA_ID")
	private int id;

	@OneToMany(mappedBy = "renglones")
	List<RenglonXFactura> listRenglonXFacturas;

	@Column(name = "MONTO_TOTAL")
	private Double montoTotal;

	@ManyToOne
	private Mes mes;

	@ManyToOne
	private Localidad localidad;

	@ManyToOne
	private Cliente cliente;

	@ManyToOne
	private Vendedor vendedor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<RenglonXFactura> getListRenglonXFacturas() {
		return listRenglonXFacturas;
	}

	public void setListRenglonXFacturas(List<RenglonXFactura> listRenglonXFacturas) {
		this.listRenglonXFacturas = listRenglonXFacturas;
	}

	public Double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(Double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

}
