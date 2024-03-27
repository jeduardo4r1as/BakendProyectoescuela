package AppColegioBack.AppColegioBack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "Asignacion")
public class Asignacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Asignacion")
    private int id_Asignacion;

    @ManyToOne
    @JoinColumn(name = "id_Materia", referencedColumnName = "id_Materia")
    private Materia id_Materia;

    @ManyToOne
    @JoinColumn(name = "id_Grupo", referencedColumnName = "id_Grupo")
    private Grupo id_Grupo;

    @ManyToOne
    @JoinColumn(name = "id_Docente", referencedColumnName = "id_Docente")
    private Docente id_Docente;

    @ManyToOne
    @JoinColumn(name = "id_Anoelectivo", referencedColumnName = "id_Anoelectivo")
    private AnoeLectivo id_Anoelectivo;

    @Column(name = "p_inicial")
    private String pInicial;

    @Column(name = "p_final")
    private String pFinal;

    @Column(name = "sede")
    private String sede;

    // Constructor, getters, and setters
    public Asignacion() {}

    public Asignacion(int id_Asignacion, Materia id_Materia, Grupo id_Grupo, Docente id_Docente, AnoeLectivo id_Anoelectivo, String pInicial, String pFinal, String sede) {
        this.id_Asignacion = id_Asignacion;
        this.id_Materia = id_Materia;
        this.id_Grupo = id_Grupo;
        this.id_Docente = id_Docente;
        this.id_Anoelectivo = id_Anoelectivo;
        this.pInicial = pInicial;
        this.pFinal = pFinal;
        this.sede = sede;
    }

    public int getId_Asignacion() {
        return id_Asignacion;
    }

    public void setId_Asignacion(int id_Asignacion) {
        this.id_Asignacion = id_Asignacion;
    }

    public Materia getId_Materia() {
        return id_Materia;
    }

    public void setId_Materia(Materia id_Materia) {
        this.id_Materia = id_Materia;
    }

    public Grupo getId_Grupo() {
        return id_Grupo;
    }

    public void setId_Grupo(Grupo id_Grupo) {
        this.id_Grupo = id_Grupo;
    }

    public Docente getId_Docente() {
        return id_Docente;
    }

    public void setId_Docente(Docente id_Docente) {
        this.id_Docente = id_Docente;
    }

    public AnoeLectivo getId_Anoelectivo() {
        return id_Anoelectivo;
    }

    public void setId_Anoelectivo(AnoeLectivo id_Anoelectivo) {
        this.id_Anoelectivo = id_Anoelectivo;
    }

    public String getpInicial() {
        return pInicial;
    }

    public void setpInicial(String pInicial) {
        this.pInicial = pInicial;
    }

    public String getpFinal() {
        return pFinal;
    }

    public void setpFinal(String pFinal) {
        this.pFinal = pFinal;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
