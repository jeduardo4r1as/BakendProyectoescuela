package AppColegioBack.AppColegioBack.controller;

import AppColegioBack.AppColegioBack.model.AnoeLectivo;
import AppColegioBack.AppColegioBack.model.Docente;
import AppColegioBack.AppColegioBack.services.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/Docente")
public class DocenteController {


    @Autowired
    private DocenteService docenteService;


    @GetMapping("/Docentes")
    private ResponseEntity<List<Docente>> getAllDocente (){
        return ResponseEntity.ok(docenteService.findAll());
    }

    //listar los Docente por id
    @GetMapping("/Docentes/{id}")
    public Docente show(@PathVariable Long id){
        return docenteService.findById(id);
    }

    //Guardar Docente
    @PostMapping("/Docentes")
    @ResponseStatus(HttpStatus.CREATED)
    private Docente create(@RequestBody Docente docente){
        return docenteService.save(docente);
    }

    //actualizar Docente
    @PutMapping("/Docentes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Docente update(@RequestBody Docente docente,@PathVariable Long id){
        Docente  docenteActual=docenteService.findById(id);

        docenteActual.setT_Docum(docente.getT_Docum());
        docenteActual.setN_Docum(docente.getN_Docum());
        docenteActual.setN_completo(docente.getN_completo());
        docenteActual.setDireccion(docente.getDireccion());
        docenteActual.setTelefono(docente.getTelefono());
        docenteActual.setEmail(docente.getEmail());
        docenteActual.setEspecializacion(docente.getEspecializacion());

        return docenteService.save(docenteActual);
    }

    //Borrar Docente
    @DeleteMapping("/Docentes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        docenteService.delete(id);
    }


}
