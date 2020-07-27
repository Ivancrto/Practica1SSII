package practica;

import javax.persistence.*;
import javax.persistence.Id;


/**
 *
 *
 * @author Lara Camila Sánchez Correa
 * @author Iván Conde Carretero
 *
 */


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String apellidos;
    private String email;
    private String contraseña;
    private Perfil perfil;
    private String provincia;
    private String ciudad;


    //Enumerado para los tres tipos de perfil
    public enum Perfil
    {
        USER, COMPANY, ADMIN
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
