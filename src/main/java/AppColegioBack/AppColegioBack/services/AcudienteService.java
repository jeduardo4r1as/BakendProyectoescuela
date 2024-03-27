package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.Acudiente;
import AppColegioBack.AppColegioBack.repository.AcudienteRepository;
import jakarta.transaction.Transactional;
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
public class AcudienteService implements AcudienteInt {

    @Autowired
    private AcudienteRepository acudienteRepository;


    //Listar todos los acudientes Acudientes
    @Override
    public List<Acudiente> findAll() {
        return acudienteRepository.findAll();
    }

    @Override
    public Acudiente save(Acudiente acudiente) {
        return null;
    }

    @Override
    public Acudiente findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }


}
