package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.Estudiante;
import AppColegioBack.AppColegioBack.repository.EstudianteRepository;
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
public class EstudianteService implements EstudianteInt {

    @Autowired
    private EstudianteRepository estudianteRepository;


  //Listar estudiantes de la base de datos
    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }


    @Override
    public Estudiante save(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante findById(Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        estudianteRepository.deleteById(id);
    }
}
