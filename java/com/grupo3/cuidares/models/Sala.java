package com.grupo3.cuidares.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="salas")
public class Sala {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	
	private String nombre;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "sala_humanos", 
        joinColumns = @JoinColumn(name = "sala_id"), 
        inverseJoinColumns = @JoinColumn(name = "usuario_id")
    )
    private List<Usuario> usuarios;
	
	@OneToMany(mappedBy="salaObjetivo", fetch = FetchType.LAZY)
	private List<Mensaje> mensajesEnviado;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

	public Sala() {
		this.usuarios= new ArrayList<Usuario>();
		this.mensajesEnviado= new ArrayList<Mensaje>();
	}
	

	

	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public List<Usuario> getUsuarios() {
		return usuarios;
	}




	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}




	public List<Mensaje> getMensajesEnviado() {
		return mensajesEnviado;
	}




	public void setMensajesEnviado(List<Mensaje> mensajesEnviado) {
		this.mensajesEnviado = mensajesEnviado;
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




	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	

}
