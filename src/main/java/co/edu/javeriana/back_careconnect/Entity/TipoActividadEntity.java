/*package co.edu.javeriana.back_careconnect.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_actividad")
public class TipoActividadEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "tipoActividad", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ActividadEntity> actividades;



    public TipoActividadEntity() {
    }

    public TipoActividadEntity(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    public List<ActividadEntity> getActividades() {
        return actividades;
    }
    
    public void setActividades(List<ActividadEntity> actividades) {
        this.actividades = actividades;
    }
}
*/