package practica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Oferta Repository para realizar las Query a la tabla OFERTAS
 *
 * @author Lara Sánchez Correa
 * @author Iván Conde Carretero
 *
 */

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "ofertas", path = "ofertas")

public interface OfertasRepository extends JpaRepository<Ofertas, Long> {


    List<Ofertas> findByUbicacion(@Param("ubicacion") String ubicacion);

    List<Ofertas> findByTitulo(@Param("titulo") String titulo);

    List<Ofertas> findBySalario(@Param("salario") Double salario);

    @Query(value = "SELECT ofertas.titulo, company.name_company, ofertas.id FROM ofertas INNER JOIN company ON ofertas.company = test.company.id WHERE test.ofertas.id NOT IN (SELECT registro.ofertas FROM registro)", nativeQuery = true)
    Object[] findVacias();

    @Query(value = "SELECT name_company, titulo, total, x.id FROM test.ofertas x LEFT OUTER JOIN  (SELECT registro.ofertas , count(*) AS TOTAL FROM test.registro GROUP BY registro.ofertas) y ON x.id = y.ofertas INNER JOIN test.company ON x.company = test.company.id ORDER BY total", nativeQuery = true)
    Object[] findQ2();

    @Query(value = "select AVG(ofertas.salario), ofertas.Ubicacion, count(*) as Total from test.ofertas group by ofertas.Ubicacion ORDER BY ofertas.Ubicacion ASC", nativeQuery = true)
    Object[] findQ3();

    @Query(value = "SELECT empleado.nombre, empleado.apellidos,  empleado.ciudad, empleado.provincia, total  FROM test.ofertas x \n" +
            "LEFT  JOIN  (SELECT registro.empleados, registro.ofertas , count(*) AS TOTAL FROM test.registro GROUP BY registro.empleados) y ON x.id = y.ofertas\n" +
            "RIGHT  JOIN test.empleado ON y.empleados = test.empleado.id\n" +
            "LEFT  JOIN test.company ON x.company = test.company.id ORDER BY total DESC", nativeQuery = true)
    Object[] findQ4();

    @Query(value ="SELECT * FROM test.ofertas WHERE id LIKE '%:text%' OR salario LIKE '%:text%' OR titulo LIKE '%:text%' OR ubicacion LIKE '%:text%' OR visibilidad LIKE '%:text%' OR company LIKE '%:text%'", nativeQuery = true)
    List<Ofertas> findByFreeText(@Param("text") String text);

    @Query(value ="SELECT * FROM test.ofertas WHERE salario LIKE '%:text%'", nativeQuery = true)
    List<Ofertas> findByText(@Param("text") String text);


    @Query(value="SELECT test.empleado.nombre, test.empleado.apellidos FROM test.empleado INNER JOIN test.registro ON test.registro.empleados = test.empleado.id INNER JOIN test.ofertas WHERE test.ofertas.id = :id", nativeQuery = true)
    Object[] findApuntados(@Param("id") String id);


}
