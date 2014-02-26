/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.champions.bean;

import java.util.Date;

/**
 *
 * @author hanseld
 */
public class InscripcionVO {
    
    private Long documentoIdentidad;
    private Date fechaExpedicionDocumento;
    private Date fechaNacimento;
    private String rutaImagen;

    /**
     * @return the documentoIdentidad
     */
    public Long getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    /**
     * @param documentoIdentidad the documentoIdentidad to set
     */
    public void setDocumentoIdentidad(Long documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    /**
     *
    /**
     * @return the fechaNacimento
     */
    public Date getFechaNacimento() {
        return fechaNacimento;
    }

    /**
     * @param fechaNacimento the fechaNacimento to set
     */
    public void setFechaNacimento(Date fechaNacimento) {
        this.fechaNacimento = fechaNacimento;
    }

    /**
     * @return the fechaExpedicionDocumento
     */
    public Date getFechaExpedicionDocumento() {
        return fechaExpedicionDocumento;
    }

    /**
     * @param fechaExpedicionDocumento the fechaExpedicionDocumento to set
     */
    public void setFechaExpedicionDocumento(Date fechaExpedicionDocumento) {
        this.fechaExpedicionDocumento = fechaExpedicionDocumento;
    }

    /**
     * @return the rutaImagen
     */
    public String getRutaImagen() {
        return rutaImagen;
    }

    /**
     * @param rutaImagen the rutaImagen to set
     */
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
    
    
}
