package practica;

import javax.persistence.*;
import java.util.*;


/**
 * Clase ofertas
 *
 * @author Lara Camila Sánchez Correa
 * @author Iván Conde Carretero
 *
 */
@Entity
public class Ofertas {

    public Ofertas(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titulo;
    private double salario;
    private String ubicacion;
    private String descripcion;
    private Date dateLimit;

    private int visibilidad; // 1 visible 0 no visible


    @ManyToOne
    @JoinColumn(name="Company")
    private Company company;


    @OneToMany(mappedBy="ofertas")
    private Collection<Registro> registro;



    public int getVisibilidad() {
        return visibilidad;
    }

    public Collection<Registro> getRegistro() {
        return registro;
    }

    public void setRegistro(Collection<Registro> registro) {
        this.registro = registro;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getDateLimit() {
        return dateLimit;
    }

    public void setDateLimit(Date dateLimit) {
        this.dateLimit = dateLimit;
    }

    public int isVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(int visibilidad) {
        this.visibilidad = visibilidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
