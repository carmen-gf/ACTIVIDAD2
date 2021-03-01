package clases.ito.poo;

import java.time.LocalDate;

public class CuentaBancaria {
	
	private long numCuenta;
	private String nomCliente;
	private float saldo = 0F;
	private LocalDate fechaApertura = null;
	private LocalDate fechaActualizacion = null;
	
	public CuentaBancaria(long numCuenta, String nomCliente, float saldo, LocalDate fechaApertura) {
		super();
		this.numCuenta = numCuenta;
		this.nomCliente = nomCliente;
		this.saldo = saldo;
		this.fechaApertura = fechaApertura;
	}
	
	public boolean deposito (float cantidad) {
		
		this.saldo = this.saldo + cantidad;
		return true;
	}
	
	public boolean retiro (float cantidad) {
		
		this.saldo = this.saldo - cantidad;
		return true;
	}
	
	@Override
	public String toString() {
		return "CuentaBancaria [numCuenta=" + numCuenta + ", nomCliente=" + nomCliente + ", saldo=" + saldo
				+ ", fechaApertura=" + fechaApertura + ", fechaActualizacion=" + fechaActualizacion + "]";
	}
	public long getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(long numCuenta) {
		this.numCuenta = numCuenta;
	}
	public String getNomCliente() {
		return nomCliente;
	}
	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public LocalDate getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(LocalDate fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	

}
