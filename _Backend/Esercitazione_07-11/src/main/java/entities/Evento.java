package entities;
import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Eventi")
public class Evento {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "nome")
	private String titolo;
	
	@Column(name = "data")
	private LocalDate dataEvento;
	
	@Column(name = "descrizione")
	private String descrizione;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo")
	private TipoEvento tipoEvento;
	
	@Column(name = "capacità_max")
	private int numeroMassimoPartecipanti;
	
	public Evento() {}
	
	public Evento(String _titolo, LocalDate _dataEvento, String _descrizione, TipoEvento _tipoEvento, int _numeroMassimoPartecipanti) {
		
		this.titolo = _titolo;
		this.dataEvento = _dataEvento;
		this.descrizione = _descrizione;
		this.tipoEvento = _tipoEvento;
		this.numeroMassimoPartecipanti = _numeroMassimoPartecipanti;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public int getNumeroMassimoPartecipanti() {
		return numeroMassimoPartecipanti;
	}

	public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}
	
	
}
