package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.Acudiente;
import java.util.List;


public interface AcudienteInt {

    public List<Acudiente> findAll();

    public Acudiente save(Acudiente acudiente);

    public Acudiente findById(Long id);

    public void delete(Long id);
}
