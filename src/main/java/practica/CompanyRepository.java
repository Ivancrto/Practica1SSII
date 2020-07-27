package practica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * Company repository
 *
 * @author Lara Camila Sánchez Correa
 * @author Iván Conde Carretero
 *
 */


@RepositoryRestResource(collectionResourceRel = "companies", path = "companies")
public interface CompanyRepository extends JpaRepository<Company, Long>  {
    Company findByEmail(@Param("email")String email);
}
