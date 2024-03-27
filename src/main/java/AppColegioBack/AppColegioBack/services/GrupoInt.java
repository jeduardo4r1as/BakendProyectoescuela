package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.Grupo;

import java.util.List;

public interface GrupoInt {
    public List<Grupo> findAll();

    public Grupo save(Grupo area);

    public Grupo findById(Long id);

    public void delete(Long id);
}
