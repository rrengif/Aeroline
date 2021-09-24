package universidadean.Aeroline.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import universidadean.Aeroline.modelo.Vuelo;
import universidadean.Aeroline.repositorios.VueloRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class VueloServicio {
    @Autowired
    private VueloRepositorio repositorio;
    //guarda un nuevo vuelo
    public Long crearVuelo(Vuelo v){
        Vuelo nuevoVuelo = repositorio.save(v);
        return nuevoVuelo.getNumero();

    }
    //Retorna un vuelo especificado
    public Optional<Vuelo> buscarVuelo(Long numeroVuelo){
        return repositorio.findById(numeroVuelo);
    }
    //Borrar vuelo

    public void borrarVuelo(Long numeroVuelo){
        repositorio.deleteById(numeroVuelo);
    }

    //Trae todos los vuelos

    public List<Vuelo> obtenerVuelos() {
        return (List<Vuelo>) repositorio.findAll();
    }

    // actualizar fecha y hora
            
    public void modificarVuelo(Long numeroVuelo, String date, String hour){
       Optional<Vuelo> vueloModificar = repositorio.findById(numeroVuelo);
        if (vueloModificar.isPresent()) {
            Vuelo vuelo = vueloModificar.get();
            vuelo.setFecha(date);
            vuelo.setHora(hour);
            repositorio.save(vuelo);
        }
    }
}
