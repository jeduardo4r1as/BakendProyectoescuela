package AppColegioBack.AppColegioBack.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "Area")
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Area")
    private int id_Area;

    @Column(name = "nombre")
    private String nombre;

    // Constructor, getters, and setters

    public Area() {
    }

    public Area(int id_Area, String nombre) {
        this.id_Area = id_Area;
        this.nombre = nombre;
    }

    public int getId_Area() {
        return id_Area;
    }

    public void setId_Area(int id_Area) {
        this.id_Area = id_Area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}