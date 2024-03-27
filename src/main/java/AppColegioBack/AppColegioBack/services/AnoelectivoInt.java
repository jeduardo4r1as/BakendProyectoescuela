package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.AnoeLectivo;

import java.util.List;

public interface AnoelectivoInt {

    public List<AnoeLectivo> findAll();

    public AnoeLectivo save(AnoeLectivo anoeLectivo);

    public AnoeLectivo findById(Long id);

    public void delete(Long id);
}
