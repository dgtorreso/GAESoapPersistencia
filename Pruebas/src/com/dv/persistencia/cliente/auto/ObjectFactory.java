
package com.dv.persistencia.cliente.auto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dv.persistencia.cliente.auto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CrearUsuario_QNAME = new QName("http://usuarios.servicios.persistencia.dv.com/", "crearUsuario");
    private final static QName _ModificarUsuarioResponse_QNAME = new QName("http://usuarios.servicios.persistencia.dv.com/", "modificarUsuarioResponse");
    private final static QName _CrearUsuarioResponse_QNAME = new QName("http://usuarios.servicios.persistencia.dv.com/", "crearUsuarioResponse");
    private final static QName _ModificarUsuario_QNAME = new QName("http://usuarios.servicios.persistencia.dv.com/", "modificarUsuario");
    private final static QName _EliminarUsuarioResponse_QNAME = new QName("http://usuarios.servicios.persistencia.dv.com/", "eliminarUsuarioResponse");
    private final static QName _ObtenerListaUsuarios_QNAME = new QName("http://usuarios.servicios.persistencia.dv.com/", "obtenerListaUsuarios");
    private final static QName _ObtenerUsuarioResponse_QNAME = new QName("http://usuarios.servicios.persistencia.dv.com/", "obtenerUsuarioResponse");
    private final static QName _EliminarUsuario_QNAME = new QName("http://usuarios.servicios.persistencia.dv.com/", "eliminarUsuario");
    private final static QName _ObtenerListaUsuariosResponse_QNAME = new QName("http://usuarios.servicios.persistencia.dv.com/", "obtenerListaUsuariosResponse");
    private final static QName _ObtenerUsuario_QNAME = new QName("http://usuarios.servicios.persistencia.dv.com/", "obtenerUsuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dv.persistencia.cliente.auto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerListaUsuariosResponse }
     * 
     */
    public ObtenerListaUsuariosResponse createObtenerListaUsuariosResponse() {
        return new ObtenerListaUsuariosResponse();
    }

    /**
     * Create an instance of {@link EliminarUsuario }
     * 
     */
    public EliminarUsuario createEliminarUsuario() {
        return new EliminarUsuario();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioResponse }
     * 
     */
    public ObtenerUsuarioResponse createObtenerUsuarioResponse() {
        return new ObtenerUsuarioResponse();
    }

    /**
     * Create an instance of {@link ObtenerListaUsuarios }
     * 
     */
    public ObtenerListaUsuarios createObtenerListaUsuarios() {
        return new ObtenerListaUsuarios();
    }

    /**
     * Create an instance of {@link EliminarUsuarioResponse }
     * 
     */
    public EliminarUsuarioResponse createEliminarUsuarioResponse() {
        return new EliminarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ModificarUsuario }
     * 
     */
    public ModificarUsuario createModificarUsuario() {
        return new ModificarUsuario();
    }

    /**
     * Create an instance of {@link CrearUsuarioResponse }
     * 
     */
    public CrearUsuarioResponse createCrearUsuarioResponse() {
        return new CrearUsuarioResponse();
    }

    /**
     * Create an instance of {@link ModificarUsuarioResponse }
     * 
     */
    public ModificarUsuarioResponse createModificarUsuarioResponse() {
        return new ModificarUsuarioResponse();
    }

    /**
     * Create an instance of {@link CrearUsuario }
     * 
     */
    public CrearUsuario createCrearUsuario() {
        return new CrearUsuario();
    }

    /**
     * Create an instance of {@link ObtenerUsuario }
     * 
     */
    public ObtenerUsuario createObtenerUsuario() {
        return new ObtenerUsuario();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.servicios.persistencia.dv.com/", name = "crearUsuario")
    public JAXBElement<CrearUsuario> createCrearUsuario(CrearUsuario value) {
        return new JAXBElement<CrearUsuario>(_CrearUsuario_QNAME, CrearUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.servicios.persistencia.dv.com/", name = "modificarUsuarioResponse")
    public JAXBElement<ModificarUsuarioResponse> createModificarUsuarioResponse(ModificarUsuarioResponse value) {
        return new JAXBElement<ModificarUsuarioResponse>(_ModificarUsuarioResponse_QNAME, ModificarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.servicios.persistencia.dv.com/", name = "crearUsuarioResponse")
    public JAXBElement<CrearUsuarioResponse> createCrearUsuarioResponse(CrearUsuarioResponse value) {
        return new JAXBElement<CrearUsuarioResponse>(_CrearUsuarioResponse_QNAME, CrearUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.servicios.persistencia.dv.com/", name = "modificarUsuario")
    public JAXBElement<ModificarUsuario> createModificarUsuario(ModificarUsuario value) {
        return new JAXBElement<ModificarUsuario>(_ModificarUsuario_QNAME, ModificarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.servicios.persistencia.dv.com/", name = "eliminarUsuarioResponse")
    public JAXBElement<EliminarUsuarioResponse> createEliminarUsuarioResponse(EliminarUsuarioResponse value) {
        return new JAXBElement<EliminarUsuarioResponse>(_EliminarUsuarioResponse_QNAME, EliminarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.servicios.persistencia.dv.com/", name = "obtenerListaUsuarios")
    public JAXBElement<ObtenerListaUsuarios> createObtenerListaUsuarios(ObtenerListaUsuarios value) {
        return new JAXBElement<ObtenerListaUsuarios>(_ObtenerListaUsuarios_QNAME, ObtenerListaUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.servicios.persistencia.dv.com/", name = "obtenerUsuarioResponse")
    public JAXBElement<ObtenerUsuarioResponse> createObtenerUsuarioResponse(ObtenerUsuarioResponse value) {
        return new JAXBElement<ObtenerUsuarioResponse>(_ObtenerUsuarioResponse_QNAME, ObtenerUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.servicios.persistencia.dv.com/", name = "eliminarUsuario")
    public JAXBElement<EliminarUsuario> createEliminarUsuario(EliminarUsuario value) {
        return new JAXBElement<EliminarUsuario>(_EliminarUsuario_QNAME, EliminarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.servicios.persistencia.dv.com/", name = "obtenerListaUsuariosResponse")
    public JAXBElement<ObtenerListaUsuariosResponse> createObtenerListaUsuariosResponse(ObtenerListaUsuariosResponse value) {
        return new JAXBElement<ObtenerListaUsuariosResponse>(_ObtenerListaUsuariosResponse_QNAME, ObtenerListaUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usuarios.servicios.persistencia.dv.com/", name = "obtenerUsuario")
    public JAXBElement<ObtenerUsuario> createObtenerUsuario(ObtenerUsuario value) {
        return new JAXBElement<ObtenerUsuario>(_ObtenerUsuario_QNAME, ObtenerUsuario.class, null, value);
    }

}
