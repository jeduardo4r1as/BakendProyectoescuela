package AppColegioBack.AppColegioBack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "Notas")
public class Notas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;


    @ManyToOne
    @JoinColumn(name = "id_Estudiante", referencedColumnName = "id_Estudiante")
    private Estudiante id_Estudiante;

    @ManyToOne
    @JoinColumn(name = "id_Asignacion", referencedColumnName = "id_Asignacion")
    private Asignacion id_Asignacion;

    @Column(name = "nota_Cognitivo")
    private Double nota_Cognitivo;

    @Column(name = "nota_Personal")
    private Double nota_Personal;

    @Column(name = "nota_Social")
    private Double nota_Social;

    @Column(name = "ausencias")
    private int ausencias;

    @Column(name = "nota_Final")
    private Double nota_Final;

    @Column(name = "nota_Recup")
    private Double nota_Recup;

    // Constructor, getters, and setters


    public Notas() {
    }

    public Notas(int codigo, Estudiante id_Estudiante, Asignacion id_Asignacion, Double nota_Cognitivo, Double nota_Personal, Double nota_Social, int ausencias, Double nota_Final, Double nota_Recup) {
        this.codigo = codigo;
        this.id_Estudiante = id_Estudiante;
        this.id_Asignacion = id_Asignacion;
        this.nota_Cognitivo = nota_Cognitivo;
        this.nota_Personal = nota_Personal;
        this.nota_Social = nota_Social;
        this.ausencias = ausencias;
        this.nota_Final = nota_Final;
        this.nota_Recup = nota_Recup;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Estudiante getId_Estudiante() {
        return id_Estudiante;
    }

    public void setId_Estudiante(Estudiante id_Estudiante) {
        this.id_Estudiante = id_Estudiante;
    }

    public Asignacion getId_Asignacion() {
        return id_Asignacion;
    }

    public void setId_Asignacion(Asignacion id_Asignacion) {
        this.id_Asignacion = id_Asignacion;
    }

    public Double getNota_Cognitivo() {
        return nota_Cognitivo;
    }

    public void setNota_Cognitivo(Double nota_Cognitivo) {
        this.nota_Cognitivo = nota_Cognitivo;
    }

    public Double getNota_Personal() {
        return nota_Personal;
    }

    public void setNota_Personal(Double nota_Personal) {
        this.nota_Personal = nota_Personal;
    }

    public Double getNota_Social() {
        return nota_Social;
    }

    public void setNota_Social(Double nota_Social) {
        this.nota_Social = nota_Social;
    }

    public int getAusencias() {
        return ausencias;
    }

    public void setAusencias(int ausencias) {
        this.ausencias = ausencias;
    }

    public Double getNota_Final() {
        return nota_Final;
    }

    public void setNota_Final(Double nota_Final) {
        this.nota_Final = nota_Final;
    }

    public Double getNota_Recup() {
        return nota_Recup;
    }

    public void setNota_Recup(Double nota_Recup) {
        this.nota_Recup = nota_Recup;
    }
}