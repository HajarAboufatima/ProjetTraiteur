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
import javax.persistence.OneToOne;

/**
 *
 * @author PC
 */
@Entity
public class ProduitFete implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    
    private String id;
    private Long qteFete;
    private int qteCasse;
    @OneToOne
    private Produit produit;
    @ManyToOne
    private Fete fete;

    public Long getQteFete() {
        return qteFete;
    }

    public void setQteFete(Long qteFete) {
        this.qteFete = qteFete;
    }

    public int getQteCasse() {
        return qteCasse;
    }

    public void setQteCasse(int qteCasse) {
        this.qteCasse = qteCasse;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
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
        if (!(object instanceof ProduitFete)) {
            return false;
        }
        ProduitFete other = (ProduitFete) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.ProduitFete[ id=" + id + " ]";
    }
    
}
