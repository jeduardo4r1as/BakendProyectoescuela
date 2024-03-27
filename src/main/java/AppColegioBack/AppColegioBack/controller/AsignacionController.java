package AppColegioBack.AppColegioBack.controller;


import AppColegioBack.AppColegioBack.model.AnoeLectivo;
import AppColegioBack.AppColegioBack.model.Asignacion;
import AppColegioBack.AppColegioBack.services.AsignacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/Asignacion")

public class AsignacionController {

    @Autowired
    private AsignacionService asignacionService;


    @GetMapping("/Asignaciones")
    private ResponseEntity<List<Asignacion>> getAllAsignacion (){
        return ResponseEntity.ok(asignacionService.findAll());
    }

    //listar los AnoeLectivo por id
    @GetMapping("/Asignaciones/{id}")
    public Asignacion show(@PathVariable Long id){
        return asignacionService.findById(id);
    }

    //Guardar AnoeLectivo
    @PostMapping("/Asignaciones")
    @ResponseStatus(HttpStatus.CREATED)
    private Asignacion create(@RequestBody Asignacion asignacion){
        return asignacionService.save(asignacion);
    }

    //actualizar AnoeLectivo
    @PutMapping("/Asignaciones/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Asignacion update(@RequestBody Asignacion asignacion,@PathVariable Long id){
        Asignacion  asignacionActual=asignacionService.findById(id);

        asignacionActual.setpInicial(asignacion.getpInicial());
        asignacionActual.setpFinal(asignacion.getpFinal());
        asignacionActual.setSede(asignacion.getSede());


        return asignacionService.save(asignacionActual);
    }

    //Borrar acudiente
    @DeleteMapping("/Asignaciones/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        asignacionService.delete(id);
    }

}
