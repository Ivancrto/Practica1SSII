package practica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


/**
 *
 *
 * @author Lara Camila Sánchez Correa
 * @author Iván Conde Carretero
 *
 */


@RepositoryRestResource(collectionResourceRel = "registro", path = "registro")
public interface RegistroRepository extends JpaRepository<Registro, Long> {


}
