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
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	private String nombre;
	@NotEmpty
	private String apellido;
	
	@NotEmpty
	@Size(min=8)
	private String password;
	
	//private String codigoCuidador;
	
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Past
    private Date fechaNacimiento;
	
	private String descripcion;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tipos_usuarios_id")
    private TiposUsuario tipo;
    
    @OneToMany(mappedBy="cuidador", fetch = FetchType.LAZY)
    private List<Oferta> ofertaCuidador; //cuidador
    
    // relacion muchos-muchos de entre las ofertas y los duenos.
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "ofertas_aceptadas_dueno", 
        joinColumns = @JoinColumn(name = "dueno_id"), 
        inverseJoinColumns = @JoinColumn(name = "oferta_id")
    )
    private List<Oferta> ofertaDueno;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "sala_humanos", 
        joinColumns = @JoinColumn(name = "usuario_id"), 
        inverseJoinColumns = @JoinColumn(name = "sala_id")
    )
    private List<Sala> salas;
    
    @OneToMany(mappedBy="humano", fetch = FetchType.LAZY)
    private List<Mensaje> mensajes;
    
    @OneToMany(mappedBy="usuario", fetch = FetchType.LAZY)
    private List<Mascota> mascotas;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="direccion_id")
    private Direccion direccion;
    
    @OneToMany(mappedBy="cuidadorComentador", fetch = FetchType.LAZY)
    private List<ComentarioMascota> comentariosDeCuidadoresAMascotas;
    
    
    
    public Usuario() {
    	this.mascotas= new ArrayList<Mascota>();
    	this.ofertaCuidador= new ArrayList<Oferta>();
    	this.ofertaDueno= new ArrayList<Oferta>();
    	this.comentariosDeCuidadoresAMascotas = new ArrayList<ComentarioMascota>();
    	
    }

	

//	public Usuario(@NotEmpty @Email String email, @NotEmpty String nombre, @NotEmpty String apellido,
//			@NotEmpty @Size(min = 8) String password, @NotNull @Past Date fechaNacimiento, String descripcion,
//			TiposUsuario tipo, List<Oferta> ofertaCuidador, List<Oferta> ofertaDueno, List<Mascota> mascotas) {
//		
//		this.email = email;
//		this.nombre = nombre;
//		this.apellido = apellido;
//		this.password = password;
//		this.fechaNacimiento = fechaNacimiento;
//		this.descripcion = descripcion;
//		this.tipo = tipo;
//		this.ofertaCuidador = ofertaCuidador;
//		this.ofertaDueno = ofertaDueno;
//		this.mascotas = mascotas;
//	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

//	public String getCodigoCuidador() {
//		return codigoCuidador;
//	}
//
//
//
//	public void setCodigoCuidador(String codigoCuidador) {
//		this.codigoCuidador = codigoCuidador;
//	}



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

	public TiposUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TiposUsuario tipo) {
		this.tipo = tipo;
	}


	public List<Oferta> getOfertaCuidador() {
		return ofertaCuidador;
	}



	public void setOfertaCuidador(Oferta ofertaCuidador) {
		this.ofertaCuidador.add(ofertaCuidador);
	}



	public List<Oferta> getOfertaDueno() {
		return ofertaDueno;
	}



	public void setOfertaDueno(Oferta ofertaDueno) {
		this.ofertaDueno.add(ofertaDueno);
	}



	public List<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(Mascota mascota) {
		this.mascotas.add(mascota);
	}
	
	
	
	public Direccion getDireccion() {
		return direccion;
	}



	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	


	public List<ComentarioMascota> getComentariosDeCuidadoresAMascotas() {
		return comentariosDeCuidadoresAMascotas;
	}



	public void setComentariosDeCuidadoresAMascotas(ComentarioMascota comentariosDeCuidadoresAMascotas) {
		this.comentariosDeCuidadoresAMascotas.add(comentariosDeCuidadoresAMascotas);
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
