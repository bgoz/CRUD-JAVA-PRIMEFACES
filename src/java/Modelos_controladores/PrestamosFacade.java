/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos_controladores;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author braya
 */
@Stateless
public class PrestamosFacade extends AbstractFacade<Prestamos> {

    @PersistenceContext(unitName = "CRUD-libreria-PrimefacesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PrestamosFacade() {
        super(Prestamos.class);
    }
    
}
