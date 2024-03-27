package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.Area;
import AppColegioBack.AppColegioBack.repository.AreaRepository;
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
public class AreaService implements AreaInt {

    @Autowired
    private AreaRepository areaRepository;



    //Liastar todos las areas de las materias
    @Override
    public List<Area> findAll() {
        return areaRepository.findAll();
    }

    @Override
    public Area save(Area area) {
        return areaRepository.save(area);
    }

    @Override
    public Area findById(Long id) {
        return areaRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        areaRepository.deleteById(id);
    }

}
