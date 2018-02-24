/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.CategorieEquipe;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC
 */
@Stateless
public class CategorieEquipeFacade extends AbstractFacade<CategorieEquipe> {

    @PersistenceContext(unitName = "projetTraiteurPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategorieEquipeFacade() {
        super(CategorieEquipe.class);
    }
    
}
