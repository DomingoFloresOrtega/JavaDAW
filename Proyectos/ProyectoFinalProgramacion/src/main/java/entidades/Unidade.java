package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the unidades database table.
 * 
 */
@Entity
@Table(name="unidades")
@NamedQuery(name="Unidade.findAll", query="SELECT u FROM Unidade u")
public class Unidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codUnidad;

	private String numMaxAlum;

	private String tutoria;

	//bi-directional one-to-one association to Tutore
	@OneToOne(mappedBy="unidade", fetch=FetchType.LAZY)
	private Tutore tutore;

	public Unidade() {
	}

	public int getCodUnidad() {
		return this.codUnidad;
	}

	public void setCodUnidad(int codUnidad) {
		this.codUnidad = codUnidad;
	}

	public String getNumMaxAlum() {
		return this.numMaxAlum;
	}

	public void setNumMaxAlum(String numMaxAlum) {
		this.numMaxAlum = numMaxAlum;
	}

	public String getTutoria() {
		return this.tutoria;
	}

	public void setTutoria(String tutoria) {
		this.tutoria = tutoria;
	}

	public Tutore getTutore() {
		return this.tutore;
	}

	public void setTutore(Tutore tutore) {
		this.tutore = tutore;
	}

}