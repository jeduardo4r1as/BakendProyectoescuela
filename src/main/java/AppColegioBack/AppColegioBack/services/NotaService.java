package AppColegioBack.AppColegioBack.services;

import AppColegioBack.AppColegioBack.model.Notas;
import AppColegioBack.AppColegioBack.repository.NotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class NotaService implements NotaInt{

    @Autowired
    private NotasRepository notasRepository;

    // Listar todas las notas
    @Override
    public List<Notas> findAll() {
        return notasRepository.findAll();
    }


    @Override
    public Notas save(Notas notas) {
        return notasRepository.save(notas);
    }

    @Override
    public Notas findById(Long id) {
        return notasRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        notasRepository.deleteById(id);
    }

    //Listar  notas por estudiante

    public List<Notas> findAllByEstudiante(Long id){
        List<Notas> buesquedanotas=new ArrayList<>();
        List<Notas> notas=notasRepository.findAll();

        for(int i=0;i<notas.size();i++){
            if(notas.get(i).getId_Estudiante().getId_Estudiante()==id){

                buesquedanotas.add(notas.get(i));

            }
        }
  return buesquedanotas;
    }

}

