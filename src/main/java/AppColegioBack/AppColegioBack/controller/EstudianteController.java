package AppColegioBack.AppColegioBack.controller;

import AppColegioBack.AppColegioBack.model.Estudiante;
import AppColegioBack.AppColegioBack.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/Estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;


    @GetMapping("/Estudiantes")
    private ResponseEntity<List<Estudiante>> getAllEstudiante (){
        return ResponseEntity.ok(estudianteService.findAll());
    }


    //listar los Estudiante por id
    @GetMapping("/Estudiantes/{id}")
    public Estudiante show(@PathVariable Long id){
        return estudianteService.findById(id);
    }

    //Guardar Estudiante
    @PostMapping("/Estudiantes")
    @ResponseStatus(HttpStatus.CREATED)
    private Estudiante create(@RequestBody Estudiante estudiante){
        return estudianteService.save(estudiante);
    }

    //actualizar Estudiante
    @PutMapping("/Estudiantes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Estudiante update(@RequestBody Estudiante estudiante,@PathVariable Long id){
        Estudiante  estudianteActual=estudianteService.findById(id);

        estudianteActual.setTipoDocumento(estudiante.getTipoDocumento());
        estudianteActual.setNumeroDocumento(estudiante.getNumeroDocumento());
        estudianteActual.setGenero(estudiante.getGenero());
        estudianteActual.setFechaNacimiento(estudiante.getFechaNacimiento());
        estudianteActual.setCiudad(estudiante.getCiudad());
        estudianteActual.setPrimerNombre(estudiante.getPrimerNombre());
        estudianteActual.setSegundoNombre(estudiante.getSegundoNombre());
        estudianteActual.setPrimerApellido(estudiante.getPrimerApellido());
        estudianteActual.setSegundoApellido(estudiante.getSegundoApellido());
        estudianteActual.setDireccion(estudiante.getDireccion());
        estudianteActual.setBarrio(estudiante.getBarrio());
        estudianteActual.setTelefono(estudiante.getTelefono());
        estudianteActual.setEstrato(estudiante.getEstrato());
        estudianteActual.setDiscapacidad(estudiante.getDiscapacidad());



        return estudianteService.save(estudianteActual);
    }

    //Borrar Estudiante
    @DeleteMapping("/Estudiantes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        estudianteService.delete(id);
    }

}
