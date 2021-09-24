package universidadean.Aeroline.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import universidadean.Aeroline.modelo.Vuelo;

import java.util.Optional;

@Repository

public interface VueloRepositorio extends CrudRepository<Vuelo, Long> {

}
