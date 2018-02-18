/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author PC
 */
@Entity
public class Salle implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    
    private String id;//adresse
    private String libelle;
    private String teleFix;
    private int nbrTablesMin;
    private int nbrTablesMax;
    private Double prixBase;
    @OneToMany(mappedBy = "salle")
    private List<Fete> fetes;
    @OneToOne
    private Magasin magasin;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getTeleFix() {
        return teleFix;
    }

    public void setTeleFix(String teleFix) {
        this.teleFix = teleFix;
    }

    public int getNbrTablesMin() {
        return nbrTablesMin;
    }

    public void setNbrTablesMin(int nbrTablesMin) {
        this.nbrTablesMin = nbrTablesMin;
    }

    public int getNbrTablesMax() {
        return nbrTablesMax;
    }

    public void setNbrTablesMax(int nbrTablesMax) {
        this.nbrTablesMax = nbrTablesMax;
    }

    public Double getPrixBase() {
        return prixBase;
    }

    public void setPrixBase(Double prixBase) {
        this.prixBase = prixBase;
    }

    public List<Fete> getFetes() {
        return fetes;
    }

    public void setFetes(List<Fete> fetes) {
        this.fetes = fetes;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        if (!(object instanceof Salle)) {
            return false;
        }
        Salle other = (Salle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Salle[ id=" + id + " ]";
    }
    
}
