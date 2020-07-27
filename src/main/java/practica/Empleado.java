package practica;

import javax.persistence.CascadeType;
import javax.persistence.*;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.*;


/**
 * Empleado clase
 *
 * @author Lara Camila Sánchez Correa
 * @author Iván Conde Carretero
 *
 */


@Entity
public class Empleado extends Usuario {

    @OneToMany(mappedBy="empleado")
        private Collection<Registro> registro;


    private Date nacimiento;

    public Empleado(){
        super( );
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }


}
