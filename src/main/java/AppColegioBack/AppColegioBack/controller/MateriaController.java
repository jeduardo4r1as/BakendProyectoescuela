package AppColegioBack.AppColegioBack.controller;
import AppColegioBack.AppColegioBack.model.AnoeLectivo;
import AppColegioBack.AppColegioBack.model.Materia;
import AppColegioBack.AppColegioBack.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/Materia")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;


    @GetMapping("/Materias")
    private ResponseEntity<List<Materia>> getAllMateria (){
        return ResponseEntity.ok(materiaService.findAll());
    }


    //listar los Materia por id
    @GetMapping("/Materias/{id}")
    public Materia show(@PathVariable Long id){
        return materiaService.findById(id);
    }

    //Guardar Materia
    @PostMapping("/Materias")
    @ResponseStatus(HttpStatus.CREATED)
    private Materia create(@RequestBody Materia materia){
        return materiaService.save(materia);
    }

    //actualizar Materia
    @PutMapping("/Materias/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Materia update(@RequestBody Materia materia,@PathVariable Long id){
        Materia  materiaActual=materiaService.findById(id);

        materiaActual.setNombre(materia.getNombre());
        materiaActual.setnHoras(materia.getnHoras());
        materiaActual.setDescripcion(materia.getnHoras());


        return materiaService.save(materiaActual);
    }

    //Borrar Materia
    @DeleteMapping("/Materias/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        materiaService.delete(id);
    }


}
