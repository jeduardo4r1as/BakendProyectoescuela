package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.Grupo;
import AppColegioBack.AppColegioBack.repository.GrupoRepository;
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
public class GrupoService implements GrupoInt {

    @Autowired
    private GrupoRepository grupoRepository;




    @Override
    public List<Grupo> findAll() {
        return grupoRepository.findAll();
    }


    @Override
    public Grupo save(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    @Override
    public Grupo findById(Long id) {
        return grupoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        grupoRepository.deleteById(id);
    }

}
