
package com.dv.persistencia.servicios.notas.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerNotasResponse", namespace = "http://notas.servicios.persistencia.dv.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerNotasResponse", namespace = "http://notas.servicios.persistencia.dv.com/")
public class ObtenerNotasResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<com.dv.persistencia.entidades.Notas> _return;

    /**
     * 
     * @return
     *     returns ArrayList<Notas>
     */
    public ArrayList<com.dv.persistencia.entidades.Notas> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<com.dv.persistencia.entidades.Notas> _return) {
        this._return = _return;
    }

}
