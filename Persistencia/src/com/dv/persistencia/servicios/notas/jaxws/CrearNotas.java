
package com.dv.persistencia.servicios.notas.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "crearNotas", namespace = "http://notas.servicios.persistencia.dv.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearNotas", namespace = "http://notas.servicios.persistencia.dv.com/")
public class CrearNotas {

    @XmlElement(name = "arg0", namespace = "")
    private com.dv.persistencia.entidades.Notas arg0;

    /**
     * 
     * @return
     *     returns Notas
     */
    public com.dv.persistencia.entidades.Notas getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.dv.persistencia.entidades.Notas arg0) {
        this.arg0 = arg0;
    }

}
