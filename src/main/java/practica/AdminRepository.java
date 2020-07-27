package practica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * Admin repository
 *
 * @author Lara Camila Sánchez Correa
 * @author Iván Conde Carretero
 *
 */


@RepositoryRestResource(collectionResourceRel = "adminis", path = "adminis")
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByEmail(@Param("email")String email);

}

