/*package co.edu.javeriana.back_careconnect.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "actividad")
public class ActividadEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    
    private String descripcion;

    private Integer cantidad;

    private String fecha_registro;

    private String usuario_registra;

    @ManyToOne
    @JoinColumn(name = "tipo_actividad_id")
    private TipoActividadEntity tipoActividad;


    public ActividadEntity() {
    }

    public ActividadEntity(Long id, String nombre, String descripcion, Integer cantidad,
            String fecha_registro, String usuario_registra) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.fecha_registro = fecha_registro;
        this.usuario_registra = usuario_registra;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getUsuario_registra() {
        return usuario_registra;
    }

    public void setUsuario_registra(String usuario_registra) {
        this.usuario_registra = usuario_registra;
    }

    public TipoActividadEntity getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(TipoActividadEntity tipoActividad) {
        this.tipoActividad = tipoActividad;
    }
}
*/