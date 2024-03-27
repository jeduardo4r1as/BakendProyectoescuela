package AppColegioBack.AppColegioBack.controller;

import AppColegioBack.AppColegioBack.model.Area;
import AppColegioBack.AppColegioBack.services.AreaService;
import AppColegioBack.AppColegioBack.services.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/Area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping("/Areas")
    private ResponseEntity<List<Area>> getAllArea  (){
        return ResponseEntity.ok(areaService.findAll());
    }

    //listar los AREA por id
    @GetMapping("/Areas/{id}")
    public Area show(@PathVariable Long id){
        return areaService.findById(id);
    }

    //Guardar AREA
    @PostMapping("/Areas")
    @ResponseStatus(HttpStatus.CREATED)
    private Area create(@RequestBody Area area){
        return areaService.save(area);
    }

    //actualizar AREA
    @PutMapping("/Areas/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Area update(@RequestBody Area area,@PathVariable Long id){
        Area  areaActual=areaService.findById(id);

        areaActual.setNombre(area.getNombre());



        return areaService.save(areaActual);
    }

    //Borrar AREA
    @DeleteMapping("/Anoelectivos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        areaService.delete(id);
    }

}
