package AppColegioBack.AppColegioBack.controller;


import AppColegioBack.AppColegioBack.model.AnoeLectivo;
import AppColegioBack.AppColegioBack.model.Grupo;
import AppColegioBack.AppColegioBack.services.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/Estudiante")
public class GrupoController {

    @Autowired
    private GrupoService grupoService;


    @GetMapping("/Grupos")
    private ResponseEntity<List<Grupo>> getAllGrupo (){
        return ResponseEntity.ok(grupoService.findAll());
    }

    @GetMapping("/Grupos/{id}")
    public Grupo show(@PathVariable Long id){
        return grupoService.findById(id);
    }

    //Guardar Grupo
    @PostMapping("/Grupos")
    @ResponseStatus(HttpStatus.CREATED)
    private Grupo create(@RequestBody Grupo grupo){
        return grupoService.save(grupo);
    }

    //actualizar Grupo
    @PutMapping("/Grupos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Grupo update(@RequestBody Grupo grupo,@PathVariable Long id){
        Grupo  grupoActual=grupoService.findById(id);

        grupoActual.setNombreGrupo(grupo.getNombreGrupo());
        grupoActual.setJornada(grupo.getJornada());
        grupoActual.setSede(grupo.getSede());


        return grupoService.save(grupoActual);
    }

    //Borrar Grupo
    @DeleteMapping("/Grupos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        grupoService.delete(id);
    }

}
