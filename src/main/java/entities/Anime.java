/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author lainpunk1
 */
@Entity
@Table(name = "animes")
@NamedQueries({
    @NamedQuery(name = "Animes.findAll", query = "SELECT a FROM Animes a"),
    @NamedQuery(name = "Animes.findById", query = "SELECT a FROM Animes a WHERE a.id = :id"),
    @NamedQuery(name = "Animes.findByNombre", query = "SELECT a FROM Animes a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Animes.findByGenero", query = "SELECT a FROM Animes a WHERE a.genero = :genero"),
    @NamedQuery(name = "Animes.findByAutor", query = "SELECT a FROM Animes a WHERE a.autor = :autor"),
    @NamedQuery(name = "Animes.findByEstudio", query = "SELECT a FROM Animes a WHERE a.estudio = :estudio")})
public class Anime implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "genero")
    private String genero;
    @Size(max = 2147483647)
    @Column(name = "autor")
    private String autor;
    @Size(max = 2147483647)
    @Column(name = "estudio")
    private String estudio;

    public Anime() {
    }

    public Anime(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anime)) {
            return false;
        }
        Anime other = (Anime) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Animes[ id=" + id + " ]";
    }
    
}
