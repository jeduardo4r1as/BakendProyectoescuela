package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.Estudiante;

import java.util.List;

public interface EstudianteInt {
    public List<Estudiante> findAll();

    public Estudiante save(Estudiante area);

    public Estudiante findById(Long id);

    public void delete(Long id);
}
