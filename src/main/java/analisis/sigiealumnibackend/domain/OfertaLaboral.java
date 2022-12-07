package analisis.sigiealumnibackend.domain;

import org.hibernate.annotations.FilterJoinTable;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class OfertaLaboral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombrePuesto;
    private String tipoJornada;
    private String extensionContrato;
    private int numVacantes;
    private String enlaceContacto;
    private Date disponibleHasta;
    private String estado;

    @ManyToOne
    private CoordinadorDeCarrera creadoPor;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ofertalaboral_id")
    private List<RequisitoDeIdioma> idiomas;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ofertalaboral_id")
    private List<RequisitoDeHabilidadBlanda> habilidadesBlandas;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ofertalaboral_id")
    private List<RequisitoDeCertificacion> certificaciones;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ofertalaboral_id")
    private List<RequisitoDeHabilidadTecnica> habilidadesTecnicas;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ofertalaboral_id")
    private List<RequisitoDeExperienciaLaboral> experienciaLaboral;

    @OneToOne(cascade = CascadeType.ALL)
    private Organizacion organizacion;

    public OfertaLaboral(){}


    public int getId() {
        return id;
    }

    public void setId(int idOfertaLaboral) {
        this.id = idOfertaLaboral;
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

    public List<RequisitoDeIdioma> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<RequisitoDeIdioma> idiomas) {
        this.idiomas = idiomas;
    }

    public List<RequisitoDeHabilidadBlanda> getHabilidadesBlandas() {
        return habilidadesBlandas;
    }

    public void setHabilidadesBlandas(List<RequisitoDeHabilidadBlanda> habilidadesBlandas) {
        this.habilidadesBlandas = habilidadesBlandas;
    }

    public List<RequisitoDeCertificacion> getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(List<RequisitoDeCertificacion> certificaciones) {
        this.certificaciones = certificaciones;
    }

    public List<RequisitoDeHabilidadTecnica> getHabilidadesTecnicas() {
        return habilidadesTecnicas;
    }

    public void setHabilidadesTecnicas(List<RequisitoDeHabilidadTecnica> habilidadesTecnicas) {
        this.habilidadesTecnicas = habilidadesTecnicas;
    }

    public List<RequisitoDeExperienciaLaboral> getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(List<RequisitoDeExperienciaLaboral> experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }

    public void addIdiomas(RequisitoDeIdioma idioma){
        this.idiomas.add(idioma);
    }

    public void addHabilidadBlanda(RequisitoDeHabilidadBlanda habilidadBlanda){
        this.habilidadesBlandas.add(habilidadBlanda);
    }

    public void addCertificacion(RequisitoDeCertificacion certificacion){
        this.certificaciones.add(certificacion);
    }

    public void addHabilidadTecnica(RequisitoDeHabilidadTecnica habilidadTecnica){
        this.habilidadesTecnicas.add(habilidadTecnica);
    }

    public void addExperienciaLaboral(RequisitoDeExperienciaLaboral experienciaLaboral){
        this.experienciaLaboral.add(experienciaLaboral);
    }

}
