package analisis.sigiealumnibackend.domain;


import javax.persistence.*;

@Entity
public class RequisitoDeIdioma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String detalle;
    private boolean requerido;

    public RequisitoDeIdioma(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public boolean isRequerido() {
        return requerido;
    }

    public void setRequerido(boolean requerido) {
        this.requerido = requerido;
    }


}