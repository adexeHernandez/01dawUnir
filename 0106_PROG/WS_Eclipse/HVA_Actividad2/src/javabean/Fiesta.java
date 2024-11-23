package javabean;

public class Fiesta {

	// Constantes de la clase
	private static final int PRECIO_INVITADO = 5;
	private static final int PRECIO_BEBIDA = 2;
	private static final int PRECIO_BOCADILLO = 3;

	private String tipoFiesta;
	private String direccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	private String fecha;
	private String hora;

	public Fiesta(String tipoFiesta, String direccion, int bocadillos, int bebidas, int invitados, String fecha,
			String hora) {
		super();
		this.tipoFiesta = tipoFiesta;
		this.direccion = direccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.invitados = invitados;
		this.fecha = fecha;
		this.hora = hora;
	}

	public Fiesta() {
		super();
	}

	public String getTipoFiesta() {
		return tipoFiesta;
	}

	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getBocadillos() {
		return bocadillos;
	}

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	public int getBebidas() {
		return bebidas;
	}

	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	public int getInvitados() {
		return invitados;
	}

	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Fiesta [tipoFiesta=" + tipoFiesta + ", direccion=" + direccion + ", bocadillos=" + bocadillos
				+ ", bebidas=" + bebidas + ", invitados=" + invitados + ", fecha=" + fecha + ", hora=" + hora + "]";
	}

	// A partir de aquí se incluyen los Metodos Propios

	// Para el numero de invitados

	public void invitar() {
		this.invitados++;
	}

	public void invitar(int cantidad) {
		if (cantidad > 0) {
			this.invitados += cantidad;
		}
	}

	public void cancelarInvitacion() {
		if (this.invitados > 0) {
			this.invitados--;
		}
	}

	public void cancelarInvitacion(int cantidad) {
		if (cantidad > 0 && cantidad <= this.invitados) {
			this.invitados -= cantidad;
		}
	}

	// Con esto podemos calcular el precio de la fiesta

	public int precioFiesta() {
		return (invitados * PRECIO_INVITADO) + (bebidas * PRECIO_BEBIDA) + (bocadillos * PRECIO_BOCADILLO);
	}

	// Aqui un método para verificar si hay suficientes bocadillos y bebidas

	public String verificarRecursos() {
		if (bocadillos < invitados && bebidas < invitados) {
			return "Faltan bocadillos y bebidas.";
		} else if (bocadillos < invitados) {
			return "Faltan bocadillos.";
		} else if (bebidas < invitados) {
			return "Faltan bebidas.";
		} else {
			return "Tienes bocadillos y bebidas suficientes.";
		}
	}

}
