/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.champions.mb;


import com.champions.bean.InscripcionVO;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author hanseld
 */
@Named
@RequestScoped
public class InscripcionMB {
    
   private InscripcionVO inscripcionVO ;

    /**
     * Creates a new instance of Inscripcion
     */
    public InscripcionMB() {
        inscripcionVO = new InscripcionVO();
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
