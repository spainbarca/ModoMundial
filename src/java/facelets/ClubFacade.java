/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facelets;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Noah
 */
@Stateless
public class ClubFacade extends AbstractFacade<Club> {

    @PersistenceContext(unitName = "ModoMundialOficialPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClubFacade() {
        super(Club.class);
    }
    
}
