package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.Materia;

import java.util.List;

public interface MateriaInt {
    public List<Materia> findAll();

    public Materia save(Materia area);

    public Materia findById(Long id);

    public void delete(Long id);
}
