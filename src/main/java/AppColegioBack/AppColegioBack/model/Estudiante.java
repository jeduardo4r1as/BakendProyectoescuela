package AppColegioBack.AppColegioBack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "Estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Estudiante")
    private int id_Estudiante;

    @ManyToOne
    @JoinColumn(name = "id_Acudiente", referencedColumnName = "id_Acudiente")
    private Acudiente id_Acudiente;

    @ManyToOne
    @JoinColumn(name = "id_Grupo", referencedColumnName = "id_Grupo")
    private Grupo id_Grupo;

    @Column(name = "tipo_docum")
    private String tipoDocumento;

    @Column(name = "n_docum")
    private String numeroDocumento;

    @Column(name = "genero")
    private String genero;

    @Column(name = "f_nac")
    private Date fechaNacimiento;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "p_nombre")
    private String primerNombre;

    @Column(name = "s_nombre")
    private String segundoNombre;

    @Column(name = "p_apellido")
    private String primerApellido;

    @Column(name = "s_apellido")
    private String segundoApellido;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "barrio")
    private String barrio;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "estrato")
    private String estrato;

    @Column(name = "discapacidad")
    private String discapacidad;

    // Constructor, getters, and setters


    public Estudiante() {
    }

    public Estudiante(int id_Estudiante, Acudiente id_Acudiente, Grupo id_Grupo, String tipoDocumento, String numeroDocumento, String genero, Date fechaNacimiento, String ciudad, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String direccion, String barrio, String telefono, String estrato, String discapacidad) {
        this.id_Estudiante = id_Estudiante;
        this.id_Acudiente = id_Acudiente;
        this.id_Grupo = id_Grupo;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.direccion = direccion;
        this.barrio = barrio;
        this.telefono = telefono;
        this.estrato = estrato;
        this.discapacidad = discapacidad;
    }

    public int getId_Estudiante() {
        return id_Estudiante;
    }

    public void setId_Estudiante(int id_Estudiante) {
        this.id_Estudiante = id_Estudiante;
    }

    public Acudiente getId_Acudiente() {
        return id_Acudiente;
    }

    public void setId_Acudiente(Acudiente id_Acudiente) {
        this.id_Acudiente = id_Acudiente;
    }

    public Grupo getId_Grupo() {
        return id_Grupo;
    }

    public void setId_Grupo(Grupo id_Grupo) {
        this.id_Grupo = id_Grupo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }
}