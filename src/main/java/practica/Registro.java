package practica;

import javax.persistence.*;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.*;


/**
 *
 *
 * @author Lara Camila Sánchez Correa
 * @author Iván Conde Carretero
 *
 */

@Entity
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date fecha;

    public Registro(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name="Ofertas")
    private Ofertas ofertas;


    @ManyToOne
    @JoinColumn(name="Empleados")
    private Empleado empleado;



    public Ofertas getOfertas() {
        return ofertas;
    }

    public void setOfertas(Ofertas ofertas) {
        this.ofertas = ofertas;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
