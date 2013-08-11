package com.dv.servicios;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.bind.JAXB;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SAAJResult;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.dom.DOMSource;


public class ServicioSOAPHandler {

  private static final String NAMESPACE_URI = "http://example.com/";
  private static final QName SAY_HELLO_QNAME = new QName(NAMESPACE_URI, "sayHello");
  private static final QName SAY_GOODBYE_QNAME = new QName(NAMESPACE_URI, "sayGoodbye");
  String NombreClase;
  private MessageFactory messageFactory;

  public ServicioSOAPHandler() throws SOAPException {
    messageFactory = MessageFactory.newInstance();
  }

  public SOAPMessage handleSOAPRequest(SOAPMessage request) throws SOAPException {
    SOAPBody soapBody = request.getSOAPBody();
    Iterator iterator = soapBody.getChildElements();
    Object responsePojo = null;
    while (iterator.hasNext()) {
      Object next = iterator.next();
      if (next instanceof SOAPElement) {
        SOAPElement soapElement = (SOAPElement) next;
        QName qname = soapElement.getElementQName();
        
        //Nuevo
        
        responsePojo = handleRequest(qname, soapElement);
        
        //Fin de Nuevo
        
        
//        if (SAY_HELLO_QNAME.equals(qname)) {
//            responsePojo = handleSayHelloRequest(soapElement);
//            break;
//          } else if (SAY_GOODBYE_QNAME.equals(qname)) {
//            responsePojo = handleSayGoodbyeRequest(soapElement);
//            break;
//          }
      }
    }
    SOAPMessage soapResponse = messageFactory.createMessage();
    soapBody = soapResponse.getSOAPBody();
    if (responsePojo != null) {
      JAXB.marshal(responsePojo, new SAAJResult(soapBody));
    } else {
      SOAPFault fault = soapBody.addFault();
      fault.setFaultString("Unrecognized SOAP request.");
    }
    return soapResponse;
  }

  
  //Nuevo
	private Object handleRequest(QName qName, SOAPElement soapElement) {
		 
		Object obj = null;	
		
		try {
			obj = Class.forName(NombreClase.replace("." + NombreClase.replace(".","/").split("/")[NombreClase.replace(".","/").split("/").length-1],"") + ".jaxws." + devolverEnCapital(qName.getLocalPart())).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("pasó 1");
		
		Object Request = JAXB.unmarshal(new DOMSource(soapElement),
				obj.getClass());
		System.out.println("pasó 2");
		return Response(Request, obj, qName.getLocalPart());
	}  
	public Object Response(Object request, Object obj, String Sev){
		try {
			//Solo faltan los argumentos y la clase madre	
			
			ArrayList args = new ArrayList();
			for (Method m : request.getClass().getMethods()) {
				if(m.getName().contains("getArg"))
				{
					args.add(m.invoke(request, new Object[]{}));
				}
			}
			
			
			System.out.println("pasó 3");
			Object g = null;
			try {
				g = Class.forName(NombreClase).newInstance();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			Object responseGreeting = Metodo(Sev, g.getClass()).invoke(g, args.toArray());
			System.out.println("pasó 4");
			Object response = null;			
			
			try {
				response = Class.forName(NombreClase.replace("." + NombreClase.replace(".","/").split("/")[NombreClase.replace(".","/").split("/").length-1],"") + ".jaxws." + devolverEnCapital(Sev) + "Response").newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    
			Metodo("setReturn",response.getClass()).invoke(response, new Object[]{responseGreeting});
			
			System.out.println("pasó 5");
			return response;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	    
	  
	private Method Metodo(String nombre, Class Clase){
	    for (Method s : Clase.getMethods()) {
			if(s.getName().contains(nombre))				
					return s;
		}	 
	    return null;
	}
	
	private String devolverEnCapital(String palabra)	{
		String letra = palabra.substring(0, 1).toUpperCase();
		return letra + palabra.substring(1, palabra.length());
		
	}
  
}