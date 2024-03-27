package AppColegioBack.AppColegioBack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "Ano_Lectivo")
public class AnoeLectivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Anoelectivo")
    private int id_Anoelectivo;

    @Column(name = "temporada")
    private int temporada;

    @Column(name = "periodo")
    private int periodo;

    @Column(name = "sede")
    private String sede;

    // Constructor, getters, and setters


    public AnoeLectivo() {}

    public AnoeLectivo(int id_Anoelectivo, int temporada, int periodo, String sede) {
        this.id_Anoelectivo = id_Anoelectivo;
        this.temporada = temporada;
        this.periodo = periodo;
        this.sede = sede;
    }

    public int getId_Anoelectivo() {
        return id_Anoelectivo;
    }

    public void setId_Anoelectivo(int id_Anoelectivo) {
        this.id_Anoelectivo = id_Anoelectivo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
