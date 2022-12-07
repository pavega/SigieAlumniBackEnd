package analisis.sigiealumnibackend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CoordinadorDeCarrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellidos;
    private String correoInstitucional;


    public CoordinadorDeCarrera(){}

    public CoordinadorDeCarrera(int id, String nombre, String apellidos, String correoInstitucional) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correoInstitucional = correoInstitucional;
    }

    public int getId() {
        return id;
    }

    public void setId(int idPersonaCoordinadora) {
        this.id = idPersonaCoordinadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
}
