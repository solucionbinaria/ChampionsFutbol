/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.champions.mb;

import com.champions.bean.InscripcionVO;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.ServletContext;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author hanseld
 */
@Named
@RequestScoped
public class InscripcionMB {

    private InscripcionVO inscripcionVO;

    /**
     * Creates a new instance of Inscripcion
     */
    public InscripcionMB() {
        inscripcionVO = new InscripcionVO();
    }

    public void guardarFoto(FileUploadEvent event) throws IOException {

        inscripcionVO.setRutaImagen(this.guardarImagenDir(event.getFile().getInputstream(),
                event.getFile().getFileName()));

    }

    public String guardarImagenDir(InputStream in, String nombreFile) {

        String ubicacionImagen = null;
        ServletContext sc = (ServletContext) FacesContext.getCurrentInstance().
                getExternalContext().getContext();

        String path = sc.getRealPath("") + File.separatorChar + "resources"
                + File.separatorChar + "img" + File.separatorChar + "tmp"
                + File.separatorChar; //+ nombreFile;

        File f = null;
        //InputStream in = null;

        try {
            f = new File(path);
            //in = new ByteArrayInputStream(bs);
            FileOutputStream out = new FileOutputStream(new File(f, nombreFile));

            int read = 0;
            /*byte[] bytes = new byte[1024];
             while((read = in.read(bytes)) != -1) {
             out.write(read);
             }*/

            while ((read = in.read()) >= 0) {
                out.write(read);
            }

            out.flush();
            out.close();
            ubicacionImagen = "resources/img/tmp/" + nombreFile;

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(e.getMessage()));
        }

        return ubicacionImagen;
    }

    /**
     * @return the inscripcionVO
     */
    public InscripcionVO getInscripcionVO() {
        return inscripcionVO;
    }

    /**
     * @param inscripcionVO the inscripcionVO to set
     */
    public void setInscripcionVO(InscripcionVO inscripcionVO) {
        this.inscripcionVO = inscripcionVO;
    }

}
