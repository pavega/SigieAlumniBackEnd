package analisis.sigiealumnibackend.domain;

import analisis.sigiealumnibackend.repository.OfertaLaboralRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class OfertaLaboralTest {

    @Autowired
    private OfertaLaboralRepository ofertaLaboralRepository;


    @Test
    @Rollback(false)
    public void insercion_de_oferta_laboral(){

        CoordinadorDeCarrera coordinadorDeCarrera = new CoordinadorDeCarrera(0,"Carolina", "Brenes", "carolina.brenes@ucr.ac.cr");
        Organizacion organizacion = new Organizacion(0,"Akamai","shopif@com.cr","25537890");

        RequisitoDeCertificacion certificacion = new RequisitoDeCertificacion(0,"Bachiller en Informática Empresarial",true);
        RequisitoDeExperienciaLaboral experienciaLaboral = new RequisitoDeExperienciaLaboral(0,"2 años",true);
        RequisitoDeHabilidadBlanda habilidadBlanda = new RequisitoDeHabilidadBlanda(0,"Trabajo en equipo",true);
        RequisitoDeHabilidadTecnica habilidadTecnica = new RequisitoDeHabilidadTecnica(0,"Conocimiento del lenguaje Java",true);
        RequisitoDeIdioma idioma = new RequisitoDeIdioma(0,"Inglés Intermedio",true);

        List<RequisitoDeCertificacion> certificaciones = new ArrayList<>();
        List<RequisitoDeExperienciaLaboral> experienciasLaborales = new ArrayList<>();
        List<RequisitoDeHabilidadBlanda> habilidadesBlandas = new ArrayList<>();
        List<RequisitoDeHabilidadTecnica> habilidadesTecnicas = new ArrayList<>();
        List<RequisitoDeIdioma> idiomas = new ArrayList<>();

        habilidadesBlandas.add(habilidadBlanda);
        certificaciones.add(certificacion);
        habilidadesTecnicas.add(habilidadTecnica);
        experienciasLaborales.add(experienciaLaboral);
        idiomas.add(idioma);

        OfertaLaboral ofertaLaboral = new OfertaLaboral(null,"Desarrollador Back-End", "Diurna", "I",
                4, "dsfg", new Date(2027,12,20), "Disponible", coordinadorDeCarrera,
                idiomas, habilidadesBlandas, certificaciones, habilidadesTecnicas, experienciasLaborales, organizacion);

        OfertaLaboral ofertaLaboralInsertada = ofertaLaboralRepository.save(ofertaLaboral);

        assertNotNull(ofertaLaboralInsertada);

    }
}
