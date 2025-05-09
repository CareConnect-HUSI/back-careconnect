/*package co.edu.javeriana.back_careconnect.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "paciente")
public class PacienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private Long tipo_identificacion_id;
    private String numero_identificacion;
    private String nombre_acudiente;
    private String parentezco_acudiente;
    private String telefono_acudiente;
    private String barrio;
    private String conjunto;
    private String localidad;
    private Double latitud;
    private Double longitud;

    public PacienteEntity() {
    }

    public PacienteEntity(Long id, String nombre, String apellido, String direccion, String telefono,
            Long tipo_identificacion_id, String numero_identificacion, String nombre_acudiente,
            String parentezco_acudiente, String telefono_acudiente, String barrio, String conjunto,
            String localidad, Double latitud, Double longitud) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo_identificacion_id = tipo_identificacion_id;
        this.numero_identificacion = numero_identificacion;
        this.nombre_acudiente = nombre_acudiente;
        this.parentezco_acudiente = parentezco_acudiente;
        this.telefono_acudiente = telefono_acudiente;
        this.barrio = barrio;
        this.conjunto = conjunto;
        this.localidad = localidad;
        this.latitud = latitud;
        this.longitud = longitud;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getTipo_identificacion_id() {
        return tipo_identificacion_id;
    }

    public void setTipo_identificacion_id(Long tipo_identificacion_id) {
        this.tipo_identificacion_id = tipo_identificacion_id;
    }

    public String getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(String numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public String getNombre_acudiente() {
        return nombre_acudiente;
    }

    public void setNombre_acudiente(String nombre_acudiente) {
        this.nombre_acudiente = nombre_acudiente;
    }

    public String getParentezco_acudiente() {
        return parentezco_acudiente;
    }

    public void setParentezco_acudiente(String parentezco_acudiente) {
        this.parentezco_acudiente = parentezco_acudiente;
    }

    public String getTelefono_acudiente() {
        return telefono_acudiente;
    }

    public void setTelefono_acudiente(String telefono_acudiente) {
        this.telefono_acudiente = telefono_acudiente;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getConjunto() {
        return conjunto;
    }

    public void setConjunto(String conjunto) {
        this.conjunto = conjunto;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }
}
*/