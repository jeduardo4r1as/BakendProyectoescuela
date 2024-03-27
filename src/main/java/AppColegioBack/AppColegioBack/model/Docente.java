package AppColegioBack.AppColegioBack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Docente")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Docente")
    private int id_Docente;

    @Column(name = "t_Docum", length = 45)
    private String t_Docum;

    @Column(name = "n_Docum", length = 45)
    private String n_Docum;

    @Column(name = "n_completo", length = 45)
    private String n_completo;

    @Column(name = "direccion", length = 45)
    private String direccion;

    @Column(name = "telefono", length = 45)
    private String telefono;

    @Column(name = "email", length = 45)
    private String email;

    @Column(name = "especializacion", length = 45)
    private String especializacion;

    // Constructor, getters, and setters


    public Docente() {
    }

    public Docente(int id_Docente, String t_Docum, String n_Docum, String n_completo, String direccion, String telefono, String email, String especializacion) {
        this.id_Docente = id_Docente;
        this.t_Docum = t_Docum;
        this.n_Docum = n_Docum;
        this.n_completo = n_completo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.especializacion = especializacion;
    }

    public int getId_Docente() {
        return id_Docente;
    }

    public void setId_Docente(int id_Docente) {
        this.id_Docente = id_Docente;
    }

    public String getT_Docum() {
        return t_Docum;
    }

    public void setT_Docum(String t_Docum) {
        this.t_Docum = t_Docum;
    }

    public String getN_Docum() {
        return n_Docum;
    }

    public void setN_Docum(String n_Docum) {
        this.n_Docum = n_Docum;
    }

    public String getN_completo() {
        return n_completo;
    }

    public void setN_completo(String n_completo) {
        this.n_completo = n_completo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
}
