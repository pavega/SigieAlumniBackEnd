package analisis.sigiealumnibackend.restcontroller;

import analisis.sigiealumnibackend.domain.CoordinadorDeCarrera;
import analisis.sigiealumnibackend.service.CoordinadorDeCarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/api/coordinadores-de-carrera")
public class CoordinadorDeCarreraController {

    @Autowired
    private CoordinadorDeCarreraService coordinadorDeCarreraService;

    @GetMapping("/")
    public List<CoordinadorDeCarrera> list() {
        return coordinadorDeCarreraService.list();
    }


}
