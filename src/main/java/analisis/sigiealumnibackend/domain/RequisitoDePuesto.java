package analisis.sigiealumnibackend.domain;

import javax.persistence.*;

@Entity
public class RequisitoDePuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idRequisito;

    //@Column(unique = true)
    private boolean requerido;

    private String detalle;

    public RequisitoDePuesto(){}

    public RequisitoDePuesto(int idRequisito, boolean requerido, String detalle) {
        this.idRequisito = idRequisito;
        this.requerido = requerido;
        this.detalle = detalle;
    }

    public int getIdRequisito() {
        return idRequisito;
    }

    public void setIdRequisito(int idRequisito) {
        this.idRequisito = idRequisito;
    }

    public boolean isRequerido() {
        return requerido;
    }

    public void setRequerido(boolean requerido) {
        this.requerido = requerido;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
