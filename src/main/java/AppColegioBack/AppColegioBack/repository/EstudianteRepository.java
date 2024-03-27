package AppColegioBack.AppColegioBack.repository;

import AppColegioBack.AppColegioBack.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EstudianteRepository  extends JpaRepository<Estudiante,Long> {
}
