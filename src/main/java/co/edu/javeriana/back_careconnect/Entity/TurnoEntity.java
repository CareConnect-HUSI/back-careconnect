/*package co.edu.javeriana.back_careconnect.Entity;

import java.util.ArrayList;
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
@Table(name = "turno")
public class TurnoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @JsonIgnore
    @OneToMany(mappedBy = "turnoEntity", cascade = CascadeType.ALL)
    private List<EnfermeraEntity> enfermeraEntities = new ArrayList<>();

    public TurnoEntity() {
    }

    public TurnoEntity(Long id, String nombre) {
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

    public List<EnfermeraEntity> getEnfermeraEntities() {
        return enfermeraEntities;
    }

    public void setEnfermeraEntities(List<EnfermeraEntity> enfermeraEntities) {
        this.enfermeraEntities = enfermeraEntities;
    }
}
*/