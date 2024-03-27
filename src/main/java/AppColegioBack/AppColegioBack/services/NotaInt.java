package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.Notas;

import java.util.List;

public interface NotaInt {
    public List<Notas> findAll();

    public Notas save(Notas area);

    public Notas findById(Long id);

    public void delete(Long id);
}
