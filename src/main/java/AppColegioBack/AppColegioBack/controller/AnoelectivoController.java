package AppColegioBack.AppColegioBack.controller;


import AppColegioBack.AppColegioBack.model.AnoeLectivo;
import AppColegioBack.AppColegioBack.services.AnoelectivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/Anoelectivo")
public class AnoelectivoController {

    @Autowired
    private AnoelectivoService anoelectivoService;


    @GetMapping("/Anoelectivos")
    private ResponseEntity<List<AnoeLectivo>> getAllAnoelectivo  (){
        return ResponseEntity.ok(anoelectivoService.findAll());
    }


    //listar los AnoeLectivo por id
    @GetMapping("/Anoelectivos/{id}")
    public AnoeLectivo show(@PathVariable Long id){
        return anoelectivoService.findById(id);
    }

    //Guardar AnoeLectivo
    @PostMapping("/Anoelectivos")
    @ResponseStatus(HttpStatus.CREATED)
    private AnoeLectivo create(@RequestBody AnoeLectivo anoeLectivo){
        return anoelectivoService.save(anoeLectivo);
    }

    //actualizar AnoeLectivo
    @PutMapping("/Anoelectivos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public AnoeLectivo update(@RequestBody AnoeLectivo anoeLectivo,@PathVariable Long id){
        AnoeLectivo  anoeLectivoActual=anoelectivoService.findById(id);

        anoeLectivoActual.setTemporada(anoeLectivo.getTemporada());
        anoeLectivoActual.setPeriodo(anoeLectivo.getPeriodo());
        anoeLectivoActual.setSede(anoeLectivo.getSede());


        return anoelectivoService.save(anoeLectivoActual);
    }

    //Borrar AnoeLectivo
    @DeleteMapping("/Anoelectivos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        anoelectivoService.delete(id);
    }


}
