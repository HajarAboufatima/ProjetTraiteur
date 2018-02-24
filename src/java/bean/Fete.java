/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author PC
 */
@Entity
public class Fete implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFete;
    private Double avance;
    private int nbrDeTables;
    private Double montant;
    @ManyToOne
    private Salle salle;
    @OneToMany(mappedBy = "fete")
    private List<ProduitFete> produitFetes;
    @ManyToOne
    private TypeTable typeTable;
    @ManyToOne
    private Client client;
    @OneToMany(mappedBy = "fete")
    private List<EquipeFete> equipeFetes;

    @OneToMany(mappedBy = "fete")
    private List<Paiement> paiements;

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }

    public Date getDateFete() {
        return dateFete;
    }

    public void setDateFete(Date dateFete) {
        this.dateFete = dateFete;
    }

    public Double getAvance() {
        return avance;
    }

    public void setAvance(Double avance) {
        this.avance = avance;
    }

    public int getNbrDeTables() {
        return nbrDeTables;
    }

    public void setNbrDeTables(int nbrDeTables) {
        this.nbrDeTables = nbrDeTables;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public List<ProduitFete> getProduitFetes() {
        return produitFetes;
    }

    public void setProduitFetes(List<ProduitFete> produitFetes) {
        this.produitFetes = produitFetes;
    }

    public TypeTable getTypeTable() {
        return typeTable;
    }

    public void setTypeTable(TypeTable typeTable) {
        this.typeTable = typeTable;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<EquipeFete> getEquipeFetes() {
        return equipeFetes;
    }

    public void setEquipeFetes(List<EquipeFete> equipeFetes) {
        this.equipeFetes = equipeFetes;
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
        if (!(object instanceof Fete)) {
            return false;
        }
        Fete other = (Fete) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Fete[ id=" + id + " ]";
    }

}
