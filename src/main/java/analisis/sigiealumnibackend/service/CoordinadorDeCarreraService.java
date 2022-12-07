package analisis.sigiealumnibackend.service;

import analisis.sigiealumnibackend.domain.CoordinadorDeCarrera;
import analisis.sigiealumnibackend.repository.CoordinadorDeCarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CoordinadorDeCarreraService {
    @Autowired
    private CoordinadorDeCarreraRepository CoordinadorDeCarreraRepository;

    public List<CoordinadorDeCarrera> list(){return CoordinadorDeCarreraRepository.findAll();}

    public CoordinadorDeCarrera get(int id){return CoordinadorDeCarreraRepository.findById(id).get();}

    public void save(CoordinadorDeCarrera CoordinadorDeCarrera){CoordinadorDeCarreraRepository.save(CoordinadorDeCarrera);}

    public void delete(int id){CoordinadorDeCarreraRepository.deleteById(id);}
}
