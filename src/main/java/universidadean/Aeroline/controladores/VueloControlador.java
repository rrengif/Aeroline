package universidadean.Aeroline.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import universidadean.Aeroline.modelo.Vuelo;
import universidadean.Aeroline.servicios.VueloServicio;

import java.util.List;
import java.util.Optional;


@RestController
public class VueloControlador {
    @Autowired
    private VueloServicio servicio;

        @PostMapping("/vuelo")
        public ResponseEntity<String> crearVuelo(@RequestBody Vuelo vuelo) {
            Long nroVuelo = servicio.crearVuelo(vuelo);
            return new ResponseEntity<>("El vuelo numero " + nroVuelo+ " se creo exitosamente",
                    HttpStatus.CREATED);

        }
        @GetMapping("/vuelo/{numVuelo}")
        public Optional<Vuelo> buscarVuelo(@PathVariable Long numVuelo){
            return servicio.buscarVuelo(numVuelo);
        }

        @DeleteMapping ("/vuelo/{numVuelo}/delete")
        public void borrarVuelo(@PathVariable Long numVuelo){
            servicio.borrarVuelo(numVuelo);
    }

        @GetMapping ("/vuelo/all")
        public List<Vuelo> obtenerVuelos(){
            return servicio.obtenerVuelos();
        }
        @PutMapping ("/vuelo/{numVuelo}/{date}/{hour}")
        public void modificarVuelo(@PathVariable Long numVuelo, @PathVariable String date, @PathVariable String hour) {
            servicio.modificarVuelo(numVuelo, date, hour);
        }




    }
