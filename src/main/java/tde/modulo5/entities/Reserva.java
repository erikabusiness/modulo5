package tde.modulo5.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

//@Data
@Entity
@Table(name = "reserva")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@Column(nullable=false)
	private String checkout;
	
	@Column(nullable=false)
	private String checkin;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable=false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "destino_id", nullable=false)
	private Destino destino;
	
	
	public Reserva(Long id, String checkout, String checkin, Usuario usuario, Destino destino) {
		super();
		this.id = id;
		this.checkout = checkout;
		this.checkin = checkin;
		this.usuario = usuario;
		this.destino = destino;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCheckout() {
		return checkout;
	}

	public Reserva() {
		super();
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}


}


