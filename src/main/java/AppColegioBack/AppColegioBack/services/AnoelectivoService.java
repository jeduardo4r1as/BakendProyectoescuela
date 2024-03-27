package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.AnoeLectivo;
import AppColegioBack.AppColegioBack.repository.AnoelectivoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AnoelectivoService implements AnoelectivoInt {

    @Autowired
    private AnoelectivoRepository anoelectivoRepository;


    //Liastar todos los años electivos
    @Override
    public List<AnoeLectivo> findAll() {
        return anoelectivoRepository.findAll();
    }




    @Override
    public AnoeLectivo save(AnoeLectivo anoeLectivo) {
        return anoelectivoRepository.save(anoeLectivo);
    }

    @Override
    public AnoeLectivo findById(Long id) {
        return anoelectivoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        anoelectivoRepository.deleteById(id);
    }


}
