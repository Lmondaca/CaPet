package com.grupo3.cuidares.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="cuidados_especiales")
public class CuidadoEspecial {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String cuidado;
	
	@NotEmpty
	private String descripcionCuidado;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="mascota_id")
    private Mascota mascotaEspecial;

	public CuidadoEspecial() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCuidado() {
		return cuidado;
	}

	public void setCuidado(String cuidado) {
		this.cuidado = cuidado;
	}

	public String getDescripcionCuidado() {
		return descripcionCuidado;
	}

	public void setDescripcionCuidado(String descripcionCuidado) {
		this.descripcionCuidado = descripcionCuidado;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Mascota getMascotaEspecial() {
		return mascotaEspecial;
	}

	public void setMascotaEspecial(Mascota mascotaEspecial) {
		this.mascotaEspecial = mascotaEspecial;
	}
	
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    

}
