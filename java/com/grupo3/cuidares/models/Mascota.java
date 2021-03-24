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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="mascotas")
public class Mascota {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String nombre;
	
	@NotNull @Positive
	private Integer edad;
	
	@NotEmpty
	private String descripcion;
	
	
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="duenos_usuarios_id")
    private Usuario usuario;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tipo_mascota_id")
    private TipoMascota tipoMascota;
    
    @OneToMany(mappedBy="mascotaEspecial", fetch = FetchType.LAZY)
    private List<CuidadoEspecial> cuidadosMascota;
    
    @OneToMany(mappedBy="mascotaComentada", fetch = FetchType.LAZY)
    private List<ComentarioMascota> comentariosHechosPorCuidadores;
    
    public Mascota() {
    	this.cuidadosMascota = new ArrayList<CuidadoEspecial>();
    	this.comentariosHechosPorCuidadores = new ArrayList<ComentarioMascota>();
    	
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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoMascota getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(TipoMascota tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	
	
	public List<CuidadoEspecial> getCuidadosMascota() {
		return cuidadosMascota;
	}



	public void setCuidadosMascota(CuidadoEspecial cuidadoMascota) {
		this.cuidadosMascota.add(cuidadoMascota);
	}
	
	


	public List<ComentarioMascota> getComentariosHechosPorCuidadores() {
		return comentariosHechosPorCuidadores;
	}



	public void setComentariosHechosPorCuidadores(ComentarioMascota comentariosHechosPorCuidadores) {
		this.comentariosHechosPorCuidadores.add(comentariosHechosPorCuidadores);
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
