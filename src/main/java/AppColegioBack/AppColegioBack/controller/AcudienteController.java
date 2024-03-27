package AppColegioBack.AppColegioBack.controller;

import AppColegioBack.AppColegioBack.model.Acudiente;
import AppColegioBack.AppColegioBack.services.AcudienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/Acudiente")
public class AcudienteController {

    @Autowired
    private AcudienteService acudienteService;


    //listar todos los acudientes
    @GetMapping("/Acudientes")
    private ResponseEntity<List<Acudiente>> getAllAcudientes  (){
        return ResponseEntity.ok(acudienteService.findAll());
    }
    //listar los acudientes por id
    @GetMapping("/Acudientes/{id}")
    public Acudiente show(@PathVariable Long id){
        return acudienteService.findById(id);
    }

    //Guardar acudiente
    @PostMapping("/Acudientes")
    @ResponseStatus(HttpStatus.CREATED)
    private Acudiente create(@RequestBody Acudiente acudiente){
       return acudienteService.save(acudiente);
    }

    //actualizar acudiente
    @PutMapping("/Acudientes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Acudiente update(@RequestBody Acudiente acudiente,@PathVariable Long id){
        Acudiente  acudienteActual=acudienteService.findById(id);

        acudienteActual.setNombre_Completo(acudiente.getNombre_Completo());
        acudienteActual.setDireccion(acudiente.getDireccion());
        acudienteActual.setTelefono(acudiente.getTelefono());
        acudienteActual.setCelular(acudiente.getCelular());
        acudienteActual.setParentesco(acudiente.getParentesco());
        acudienteActual.setOcupacion(acudiente.getOcupacion());

        return acudienteService.save(acudienteActual);
    }

    //Borrar acudiente
    @DeleteMapping("/Acudientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        acudienteService.delete(id);

    }

}
