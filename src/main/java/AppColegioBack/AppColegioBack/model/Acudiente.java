package AppColegioBack.AppColegioBack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Acudiente")
public class Acudiente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Acudiente")
    private int id_Acudiente;

    @Column(name = "nombre_Completo", length = 45)
    private String nombre_Completo;

    @Column(name = "direccion", length = 45)
    private String direccion;

    @Column(name = "telefono")
    private int telefono;

    @Column(name = "celular")
    private int celular;

    @Column(name = "parentesco", length = 45)
    private String parentesco;

    @Column(name = "ocupacion", length = 45)
    private String ocupacion;


    // Constructor, getters, and setters


    public Acudiente() {
    }

    public Acudiente(int id_Acudiente, String nombre_Completo, String direccion, int telefono, int celular, String parentesco, String ocupacion) {
        this.id_Acudiente = id_Acudiente;
        this.nombre_Completo = nombre_Completo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.parentesco = parentesco;
        this.ocupacion = ocupacion;
    }

    public int getId_Acudiente() {
        return id_Acudiente;
    }

    public void setId_Acudiente(int id_Acudiente) {
        this.id_Acudiente = id_Acudiente;
    }

    public String getNombre_Completo() {
        return nombre_Completo;
    }

    public void setNombre_Completo(String nombre_Completo) {
        this.nombre_Completo = nombre_Completo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}