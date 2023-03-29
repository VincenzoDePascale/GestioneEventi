package model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="evento")
@NamedQuery(name="evento.findAll", query = "SELECT e FROM evento e")
public class Evento implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String titolo;
	
	@Column(nullable = false)
	private LocalDate dataevento;
	
	@Column(nullable = false)
	private String descrizione;
	
	@Column(nullable = false)
	private String tipoevento;
	
	@Column(nullable = false)
	private Integer numeromassimopartecipanti;

		public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getDataEvento() {
		return dataevento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataevento = dataEvento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getTipoEvento() {
		return tipoevento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoevento = tipoEvento;
	}

	public Integer getNumeroMassimoPartecipanti() {
		return numeromassimopartecipanti;
	}

	public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
		this.numeromassimopartecipanti = numeroMassimoPartecipanti;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", dataevento=" + dataevento + ", descrizione=" + descrizione
				+ ", tipoevento=" + tipoevento + ", numeromassimopartecipanti=" + numeromassimopartecipanti + "]";
	}
	
}
