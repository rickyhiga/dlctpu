package views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
 
@ManagedBean
public class FileUploadView {
 
    public void handleFileUpload(FileUploadEvent event) {
        
        FacesMessage message = new FacesMessage("Ok", event.getFile().getFileName() + " subido correctamente.");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
