/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import beans.DocumentoBean;
import bussines.Documento;
import daos.DocumentoDao;
import dataAccess.DocumentosEntity;
import interfaces.DocumentoFacadeRemote;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author user
 */
@Stateless
public class DocumentoFacade implements DocumentoFacadeRemote {

    @Inject
    DocumentoDao docDao;



    @Override
    public List<DocumentoBean> listarDocumentos(String filtro) {
        List<DocumentosEntity> entidades = docDao.findAll();
        LinkedList<DocumentoBean> beans = new LinkedList<>();
        entitiesToBeans(entidades, beans);

        return beans;
    }

    @Override
    public List<DocumentoBean> listarDocumentos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   

    private void entitiesToBeans(List<DocumentosEntity> entidades, LinkedList<DocumentoBean> beans) {
        for (DocumentosEntity entidad : entidades) {
            beans.add(new Documento(entidad).getBean());
        }
    }

    public String listarDocsString() {
        StringBuilder st = new StringBuilder();
        List<DocumentosEntity> entidades = docDao.findAll();
        for (DocumentosEntity e : entidades) {
            st.append(e.toString()).append("\n");
           
        }
        return st.toString();
    }
}
