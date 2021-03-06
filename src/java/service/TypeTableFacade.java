/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TypeTable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC
 */
@Stateless
public class TypeTableFacade extends AbstractFacade<TypeTable> {

    @PersistenceContext(unitName = "projetTraiteurPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TypeTableFacade() {
        super(TypeTable.class);
    }
    
}
