package AppColegioBack.AppColegioBack.controller;


import AppColegioBack.AppColegioBack.model.AnoeLectivo;
import AppColegioBack.AppColegioBack.model.Notas;
import AppColegioBack.AppColegioBack.services.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/Materia")
public class NotasController {

    @Autowired
    private NotaService  notaService;

    @GetMapping("/Notas")
    private ResponseEntity<List<Notas>> getAllNotas (){
        return ResponseEntity.ok(notaService.findAll());
    }

    @GetMapping("/Notas/{id}")
    private ResponseEntity<List<Notas>> getAllNotasByEstudiantes (@PathVariable("id") Long idEstudiante){
        return ResponseEntity.ok(notaService.findAllByEstudiante(idEstudiante));
    }

    //listar los Notas por id
    @GetMapping("/Notasb/{id}")
    public Notas show(@PathVariable Long id){
        return notaService.findById(id);
    }

    //Guardar Notas
    @PostMapping("/Notas")
    @ResponseStatus(HttpStatus.CREATED)
    private Notas create(@RequestBody Notas notas){
        return notaService.save(notas);
    }

    //actualizar Notas
    @PutMapping("/Notas/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Notas update(@RequestBody Notas notas,@PathVariable Long id){
        Notas  notasActual=notaService.findById(id);

        notasActual.setNota_Cognitivo(notas.getNota_Cognitivo());
        notasActual.setNota_Personal(notas.getNota_Personal());
        notasActual.setNota_Social(notas.getNota_Social());
        notasActual.setAusencias(notas.getAusencias());
        notasActual.setNota_Final(notas.getNota_Final());
        notasActual.setNota_Recup(notas.getNota_Recup());

        return notaService.save(notasActual);
    }

    //Borrar Notas
    @DeleteMapping("/Notas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        notaService.delete(id);
    }

}

