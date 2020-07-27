package practica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 *
 *
 * @author Lara Camila Sánchez Correa
 * @author Iván Conde Carretero
 *
 */

@RepositoryRestResource(collectionResourceRel = "empleados", path = "empleados")
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

    Empleado findByEmail(@Param("email")String email);


}
