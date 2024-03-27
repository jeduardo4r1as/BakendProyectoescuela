package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.Asignacion;
import AppColegioBack.AppColegioBack.repository.AsignacionRepository;
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
public class AsignacionService implements AsignacionInt {

    @Autowired
    private AsignacionRepository asignacionRepository;

   //Listar las todas las asignaciones
    @Override
    public List<Asignacion> findAll() {
        return asignacionRepository.findAll();
    }


    @Override
    public Asignacion save(Asignacion area) {
        return asignacionRepository.save(area);
    }

    @Override
    public Asignacion findById(Long id) {
        return asignacionRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        asignacionRepository.deleteById(id);
    }

}
