package analisis.sigiealumnibackend.restcontroller;

import analisis.sigiealumnibackend.domain.CoordinadorDeCarrera;
import analisis.sigiealumnibackend.service.CoordinadorDeCarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

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

    @GetMapping("/{id}")
    public ResponseEntity<CoordinadorDeCarrera> get(@PathVariable Integer id) {
        try {
            CoordinadorDeCarrera coordinadorDeCarrera = coordinadorDeCarreraService.get(id);
            return new ResponseEntity<CoordinadorDeCarrera>(coordinadorDeCarrera, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<CoordinadorDeCarrera>(HttpStatus.NOT_FOUND);
        }
    }

}
