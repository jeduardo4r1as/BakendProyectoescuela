package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.Materia;
import AppColegioBack.AppColegioBack.repository.MateriaRepository;
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
public class MateriaService implements MateriaInt {

    @Autowired
    private MateriaRepository materiaRepository;

//listar   todas las materias
    @Override
    public List<Materia> findAll() {
        return materiaRepository.findAll();
    }

    @Override
    public Materia save(Materia materia) {
        return materiaRepository.save(materia);
    }

    @Override
    public Materia findById(Long id) {
        return materiaRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        materiaRepository.deleteById(id);

    }

}
