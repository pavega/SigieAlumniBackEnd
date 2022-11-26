package analisis.sigiealumnibackend.service;

import analisis.sigiealumnibackend.domain.OfertaLaboral;
import analisis.sigiealumnibackend.repository.OfertaLaboralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OfertaLaboralService {

    @Autowired
    private OfertaLaboralRepository ofertaLaboralRepository;

    public List<OfertaLaboral> list(){return ofertaLaboralRepository.findAll();}

    public OfertaLaboral get(int id){return ofertaLaboralRepository.findById(id).get();}

    public void save(OfertaLaboral ofertaLaboral){ofertaLaboralRepository.save(ofertaLaboral);}

    public void delete(int id){ofertaLaboralRepository.deleteById(id);}
}
