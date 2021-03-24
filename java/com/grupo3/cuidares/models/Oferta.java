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
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ofertas")
public class Oferta {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String titulo;
	
	@NotEmpty
	private String descripcion;
	
	@Positive
	private Double precio;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cuidador_id")
    private Usuario cuidador;  //Este usuario solo sera a los que tengan tipo_usuario = "cuidador"
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "ofertas_aceptadas_dueno", 
        joinColumns = @JoinColumn(name = "oferta_id"), 
        inverseJoinColumns = @JoinColumn(name = "dueno_id")
    )
    private List<Usuario> dueno;
	
	
	public Oferta(){
		this.dueno= new ArrayList<Usuario>();
		
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	
	public Usuario getCuidador() {
		return cuidador;
	}



	public void setCuidador(Usuario cuidador) {
		this.cuidador = cuidador;
	}



	public List<Usuario> getDueno() {
		return dueno;
	}



	public void setDueno(Usuario dueno) {
		this.dueno.add(dueno);
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
