/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlctest2;

import interfaces.DocumentoFacadeRemote;
import javax.ejb.EJB;

/**
 *
 * @author user
 */
public class Main {

    @EJB
    private static DocumentoFacadeRemote doc;
    public static void main(String[] args) {
       
        System.out.println(doc.listarDocsString());
    }
    
    
}
