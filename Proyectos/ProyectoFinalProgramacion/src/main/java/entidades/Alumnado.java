package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the alumnado database table.
 * 
 */
@Entity
@Table(name="alumnado")
@NamedQuery(name="Alumnado.findAll", query="SELECT a FROM Alumnado a")
public class Alumnado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codAlumnado;

	private boolean alergias;

	private String ape1Alumnado;

	private String ape2Alumnado;

	private String codpostal;

	private String desAlergias;

	private String direccion;

	private String nombreAlumnado;

	private String provincia;

	//bi-directional many-to-one association to Tutore
	@ManyToOne(fetch=FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="codTutor")
	private Tutore tutore;

	public Alumnado() {
	}

	public int getCodAlumnado() {
		return this.codAlumnado;
	}

	public void setCodAlumnado(int codAlumnado) {
		this.codAlumnado = codAlumnado;
	}

	public boolean isAlergias() {
		return alergias;
	}

	public void setAlergias(boolean alergias) {
		this.alergias = alergias;
		
	}

	public String getApe1Alumnado() {
		return this.ape1Alumnado;
	}

	public void setApe1Alumnado(String ape1Alumnado) {
		this.ape1Alumnado = ape1Alumnado;
	}

	public String getApe2Alumnado() {
		return this.ape2Alumnado;
	}

	public void setApe2Alumnado(String ape2Alumnado) {
		this.ape2Alumnado = ape2Alumnado;
	}

	public String getCodpostal() {
		return this.codpostal;
	}

	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}

	public String getDesAlergias() {
		return this.desAlergias;
	}

	public void setDesAlergias(String desAlergias) {
		this.desAlergias = desAlergias;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombreAlumnado() {
		return this.nombreAlumnado;
	}

	public void setNombreAlumnado(String nombreAlumnado) {
		this.nombreAlumnado = nombreAlumnado;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Tutore getTutore() {
		return this.tutore;
	}

	public void setTutore(Tutore tutore) {
		this.tutore = tutore;
	}

	@Override
	public String toString() {
		return "Alumnado [codAlumnado=" + codAlumnado + ", alergias=" + alergias + ", ape1Alumnado=" + ape1Alumnado
				+ ", ape2Alumnado=" + ape2Alumnado + ", codpostal=" + codpostal + ", desAlergias=" + desAlergias
				+ ", direccion=" + direccion + ", nombreAlumnado=" + nombreAlumnado + ", provincia=" + provincia
				+ ", tutore=" + tutore + "]";
	}

}