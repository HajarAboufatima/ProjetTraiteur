/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author PC
 */
@Entity
public class EquipeFete implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    private String id;
    @ManyToOne
    private CategorieEquipe categorieEquipe;
    @ManyToOne
    private Fete fete;

    public CategorieEquipe getCategorieEquipe() {
        return categorieEquipe;
    }

    public void setCategorieEquipe(CategorieEquipe categorieEquipe) {
        this.categorieEquipe = categorieEquipe;
    }

  

    public Fete getFete() {
        return fete;
    }

    public void setFete(Fete fete) {
        this.fete = fete;
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
        if (!(object instanceof EquipeFete)) {
            return false;
        }
        EquipeFete other = (EquipeFete) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.EquipeFete[ id=" + id + " ]";
    }

}
