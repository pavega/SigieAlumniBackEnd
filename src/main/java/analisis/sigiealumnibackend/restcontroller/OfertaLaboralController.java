package analisis.sigiealumnibackend.restcontroller;

import analisis.sigiealumnibackend.domain.OfertaLaboral;
import analisis.sigiealumnibackend.service.OfertaLaboralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/api/ofertas-laborales")
public class OfertaLaboralController {

    @Autowired
    private OfertaLaboralService ofertaLaboralService;

    @GetMapping("/")
    public List<OfertaLaboral> list() {
        return ofertaLaboralService.list();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OfertaLaboral> get(@PathVariable Integer id) {
        try {
            OfertaLaboral ofertaLaboral = ofertaLaboralService.get(id);
            return new ResponseEntity<OfertaLaboral>(ofertaLaboral, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<OfertaLaboral>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody OfertaLaboral ofertaLaboral) {
        ofertaLaboralService.save(ofertaLaboral);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        ofertaLaboralService.delete(id);
    }

    @PutMapping("/")
    public void update(@RequestBody OfertaLaboral ofertaLaboral){
        ofertaLaboralService.save(ofertaLaboral);
    }
}
