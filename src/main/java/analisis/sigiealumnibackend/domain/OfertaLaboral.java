package analisis.sigiealumnibackend.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class OfertaLaboral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOfertaLaboral;
    private String nombrePuesto;
    private String tipoJornada;
    private String extensionContrato;
    private int numVacantes;
    private String enlaceContacto;
    private Date disponibleHasta;
    private String estado;

    @ManyToOne
    private CoordinadorDeCarrera creadoPor;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "detalle",
            orphanRemoval = true)
    private List<RequisitoDePuesto> idiomas;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "detalle",
            orphanRemoval = true)
    private List<RequisitoDePuesto> habilidadesBlandas;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "detalle",
            orphanRemoval = true)
    private List<RequisitoDePuesto> certificaciones;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "detalle",
            orphanRemoval = true)
    private List<RequisitoDePuesto> habilidadesTecnicas;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "detalle",
            orphanRemoval = true)
    private List<RequisitoDePuesto> experienciaLaboral;

    @ManyToOne
    private Organizacion organizacion;

    public OfertaLaboral(int idOfertaLaboral, String nombrePuesto, String tipoJornada, String extensionContrato, int numVacantes, String enlaceContacto, Date disponibleHasta, String estado, CoordinadorDeCarrera creadoPor, List<RequisitoDePuesto> idiomas, List<RequisitoDePuesto> habilidadesBlandas, List<RequisitoDePuesto> certificaciones, List<RequisitoDePuesto> habilidadesTecnicas, List<RequisitoDePuesto> experienciaLaboral, Organizacion organizacion) {
        this.idOfertaLaboral = idOfertaLaboral;
        this.nombrePuesto = nombrePuesto;
        this.tipoJornada = tipoJornada;
        this.extensionContrato = extensionContrato;
        this.numVacantes = numVacantes;
        this.enlaceContacto = enlaceContacto;
        this.disponibleHasta = disponibleHasta;
        this.estado = estado;
        this.creadoPor = creadoPor;
        this.idiomas = idiomas;
        this.habilidadesBlandas = habilidadesBlandas;
        this.certificaciones = certificaciones;
        this.habilidadesTecnicas = habilidadesTecnicas;
        this.experienciaLaboral = experienciaLaboral;
        this.organizacion = organizacion;
    }

    public int getIdOfertaLaboral() {
        return idOfertaLaboral;
    }

    public void setIdOfertaLaboral(int idOfertaLaboral) {
        this.idOfertaLaboral = idOfertaLaboral;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public String getExtensionContrato() {
        return extensionContrato;
    }

    public void setExtensionContrato(String extensionContrato) {
        this.extensionContrato = extensionContrato;
    }

    public int getNumVacantes() {
        return numVacantes;
    }

    public void setNumVacantes(int numVacantes) {
        this.numVacantes = numVacantes;
    }

    public String getEnlaceContacto() {
        return enlaceContacto;
    }

    public void setEnlaceContacto(String enlaceContacto) {
        this.enlaceContacto = enlaceContacto;
    }

    public Date getDisponibleHasta() {
        return disponibleHasta;
    }

    public void setDisponibleHasta(Date disponibleHasta) {
        this.disponibleHasta = disponibleHasta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public CoordinadorDeCarrera getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(CoordinadorDeCarrera creadoPor) {
        this.creadoPor = creadoPor;
    }

    public List<RequisitoDePuesto> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<RequisitoDePuesto> idiomas) {
        this.idiomas = idiomas;
    }

    public List<RequisitoDePuesto> getHabilidadesBlandas() {
        return habilidadesBlandas;
    }

    public void setHabilidadesBlandas(List<RequisitoDePuesto> habilidadesBlandas) {
        this.habilidadesBlandas = habilidadesBlandas;
    }

    public List<RequisitoDePuesto> getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(List<RequisitoDePuesto> certificaciones) {
        this.certificaciones = certificaciones;
    }

    public List<RequisitoDePuesto> getHabilidadesTecnicas() {
        return habilidadesTecnicas;
    }

    public void setHabilidadesTecnicas(List<RequisitoDePuesto> habilidadesTecnicas) {
        this.habilidadesTecnicas = habilidadesTecnicas;
    }

    public List<RequisitoDePuesto> getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(List<RequisitoDePuesto> experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }

    public void addIdiomas(RequisitoDePuesto idioma){
        this.idiomas.add(idioma);
    }

    public void addHabilidadBlanda(RequisitoDePuesto habilidadBlanda){
        this.habilidadesBlandas.add(habilidadBlanda);
    }

    public void addCertificacion(RequisitoDePuesto certificacion){
        this.certificaciones.add(certificacion);
    }

    public void addHabilidadTecnica(RequisitoDePuesto habilidadTecnica){
        this.habilidadesTecnicas.add(habilidadTecnica);
    }

    public void addExperienciaLaboral(RequisitoDePuesto experienciaLaboral){
        this.experienciaLaboral.add(experienciaLaboral);
    }
}
