package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.Docente;
import AppColegioBack.AppColegioBack.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class DocenteService implements DocenteInt {

    @Autowired
    private  DocenteRepository docenteRepository;

    //Listar todos los docentes
    @Override
    public List<Docente> findAll() {
        return docenteRepository.findAll();
    }


    @Override
    public Docente save(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public Docente findById(Long id) {
        return docenteRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        docenteRepository.deleteById(id);
    }

}
