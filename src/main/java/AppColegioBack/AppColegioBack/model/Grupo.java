package AppColegioBack.AppColegioBack.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "Grupo")
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Grupo")
    private int id_Grupo;

    @Column(name = "nombreGrupo")
    private String nombreGrupo;

    @Column(name = "jornada")
    private String jornada;

    @Column(name = "sede")
    private String sede;

    @ManyToOne
    @JoinColumn(name = "id_Docente", referencedColumnName = "id_Docente")
    private Docente id_Docente;

    // Constructor, getters, and setters


    public Grupo() {
    }

    public Grupo(int id_Grupo, String nombreGrupo, String jornada, String sede, Docente id_Docente) {
        this.id_Grupo = id_Grupo;
        this.nombreGrupo = nombreGrupo;
        this.jornada = jornada;
        this.sede = sede;
        this.id_Docente = id_Docente;
    }

    public int getId_Grupo() {
        return id_Grupo;
    }

    public void setId_Grupo(int id_Grupo) {
        this.id_Grupo = id_Grupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Docente getId_Docente() {
        return id_Docente;
    }

    public void setId_Docente(Docente id_Docente) {
        this.id_Docente = id_Docente;
    }
}