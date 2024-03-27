package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.Asignacion;

import java.util.List;

public interface AsignacionInt {

    public List<Asignacion> findAll();

    public Asignacion save(Asignacion area);

    public Asignacion findById(Long id);

    public void delete(Long id);
}
