package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tutores database table.
 * 
 */
@Entity
@Table(name="tutores")
@NamedQuery(name="Tutore.findAll", query="SELECT t FROM Tutore t")
public class Tutore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codTutor;

	private String ape1Tutor;

	private String ape2Tutor;

	private int codUnidad;

	private String direccion;

	private String email;

	private String nomTutor;

	private String tel;

	private int unidades_codUnidad;

	//bi-directional many-to-one association to Alumnado
	@OneToMany(mappedBy="tutore")
	private List<Alumnado> alumnados;

	//bi-directional one-to-one association to Unidade
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codTutor", referencedColumnName="codTutor")
	private Unidade unidade;

	public Tutore() {
	}

	public int getCodTutor() {
		return this.codTutor;
	}

	public void setCodTutor(int codTutor) {
		this.codTutor = codTutor;
	}

	public String getApe1Tutor() {
		return this.ape1Tutor;
	}

	public void setApe1Tutor(String ape1Tutor) {
		this.ape1Tutor = ape1Tutor;
	}

	public String getApe2Tutor() {
		return this.ape2Tutor;
	}

	public void setApe2Tutor(String ape2Tutor) {
		this.ape2Tutor = ape2Tutor;
	}

	public int getCodUnidad() {
		return this.codUnidad;
	}

	public void setCodUnidad(int codUnidad) {
		this.codUnidad = codUnidad;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomTutor() {
		return this.nomTutor;
	}

	public void setNomTutor(String nomTutor) {
		this.nomTutor = nomTutor;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getUnidades_codUnidad() {
		return this.unidades_codUnidad;
	}

	public void setUnidades_codUnidad(int unidades_codUnidad) {
		this.unidades_codUnidad = unidades_codUnidad;
	}

	public List<Alumnado> getAlumnados() {
		return this.alumnados;
	}

	public void setAlumnados(List<Alumnado> alumnados) {
		this.alumnados = alumnados;
	}

	public Alumnado addAlumnado(Alumnado alumnado) {
		getAlumnados().add(alumnado);
		alumnado.setTutore(this);

		return alumnado;
	}

	public Alumnado removeAlumnado(Alumnado alumnado) {
		getAlumnados().remove(alumnado);
		alumnado.setTutore(null);

		return alumnado;
	}

	public Unidade getUnidade() {
		return this.unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	@Override
	public String toString() {
		return "Tutore [codTutor=" + codTutor + ", ape1Tutor=" + ape1Tutor + ", ape2Tutor=" + ape2Tutor + ", codUnidad="
				+ codUnidad + ", direccion=" + direccion + ", email=" + email + ", nomTutor=" + nomTutor + ", tel="
				+ tel + ", unidades_codUnidad=" + unidades_codUnidad + ", alumnados=" + alumnados + ", unidade="
				+ unidade + "]";
	}
}