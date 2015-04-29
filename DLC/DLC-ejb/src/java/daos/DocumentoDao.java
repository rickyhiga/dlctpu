/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import dataAccess.DocumentosEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;




/**
 *
 * @author Nico
 */
public class DocumentoDao {
    @PersistenceContext(name = "DLC-ejbPU")
    private EntityManager entityManager;
    
    
    public List<DocumentosEntity> findAll() {
        List<DocumentosEntity> resp = entityManager.createNamedQuery("DocumentosEntity.findAll").getResultList();        
        return resp;
    }
    
}
