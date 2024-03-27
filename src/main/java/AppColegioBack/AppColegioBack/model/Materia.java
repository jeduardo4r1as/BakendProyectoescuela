package AppColegioBack.AppColegioBack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "Materia")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Materia")
    private int id_Materia;

    @ManyToOne
    @JoinColumn(name = "id_Area", referencedColumnName = "id_Area")
    private Area id_Area;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "n_horas")
    private String nHoras;

    @Column(name = "descripcion")
    private String descripcion;

    // Constructor, getters, and setters


    public Materia() {
    }

    public Materia(int id_Materia, Area id_Area, String nombre, String nHoras, String descripcion) {
        this.id_Materia = id_Materia;
        this.id_Area = id_Area;
        this.nombre = nombre;
        this.nHoras = nHoras;
        this.descripcion = descripcion;
    }

    public int getId_Materia() {
        return id_Materia;
    }

    public void setId_Materia(int id_Materia) {
        this.id_Materia = id_Materia;
    }

    public Area getId_Area() {
        return id_Area;
    }

    public void setId_Area(Area id_Area) {
        this.id_Area = id_Area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnHoras() {
        return nHoras;
    }

    public void setnHoras(String nHoras) {
        this.nHoras = nHoras;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}