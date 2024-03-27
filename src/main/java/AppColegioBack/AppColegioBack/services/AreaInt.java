package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.AnoeLectivo;
import AppColegioBack.AppColegioBack.model.Area;

import java.util.List;

public interface AreaInt {

    public List<Area> findAll();

    public Area save(Area area);

    public Area findById(Long id);

    public void delete(Long id);
}
