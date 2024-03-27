package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.Docente;

import java.util.List;

public interface DocenteInt {
    public List<Docente> findAll();

    public Docente save(Docente area);

    public Docente findById(Long id);

    public void delete(Long id);
}
