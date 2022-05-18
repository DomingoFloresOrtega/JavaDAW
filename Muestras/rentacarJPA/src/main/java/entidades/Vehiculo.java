package entidades;

import java.io.Serializable;
import javax.persistence.*;

// @Entity, Indica que la clase es una entidad que se va a mapear con una tabla 
// Los campos de la clase se mapearán con columnas de la tabla
@Entity

// @Table, sirve para indicar características del esquema de la tabla
// En este caso, su nombre
@Table(name="vehiculo")

// @NamedQuery, sirve para indicar consultas identificables por un nombre
@NamedQueries({
	@NamedQuery(name="Vehiculo.findAll", query="SELECT v FROM Vehiculo v"),
	@NamedQuery(name = "Vehiculo.findMatricula", query = "SELECT v FROM Vehiculo v WHERE v.matricula = :matricula"),
})


public class Vehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	// @Id, indica el atributo que va a mapear con la clave primaria de la tabla
	@Id
	// @GeneratedValue, indica que este valor se genera automáticamente cuando la entidad
	// se guarde en la tabla. En este caso IDENTITY se basa en una columna con incremento automático 
	// y permite que la base de datos genere un nuevo valor con cada operación de inserción
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String bastidor;

	private boolean disponible;

	private String marca;

	private String matricula;

	private String modelo;

	private double precio;

	public Vehiculo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBastidor() {
		return this.bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public boolean getDisponible() {
		return this.disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehiculo [id=");
		builder.append(id);
		builder.append(", bastidor=");
		builder.append(bastidor);
		builder.append(", disponible=");
		builder.append(disponible);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}

}