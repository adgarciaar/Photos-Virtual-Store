
package Integracion;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSDerechosAutor", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:63413/WSDerechosAutor.svc?singleWsdl")
public class WSDerechosAutor
    extends Service
{

    private final static URL WSDERECHOSAUTOR_WSDL_LOCATION;
    private final static WebServiceException WSDERECHOSAUTOR_EXCEPTION;
    private final static QName WSDERECHOSAUTOR_QNAME = new QName("http://tempuri.org/", "WSDerechosAutor");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:63413/WSDerechosAutor.svc?singleWsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSDERECHOSAUTOR_WSDL_LOCATION = url;
        WSDERECHOSAUTOR_EXCEPTION = e;
    }

    public WSDerechosAutor() {
        super(__getWsdlLocation(), WSDERECHOSAUTOR_QNAME);
    }

    public WSDerechosAutor(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSDERECHOSAUTOR_QNAME, features);
    }

    public WSDerechosAutor(URL wsdlLocation) {
        super(wsdlLocation, WSDERECHOSAUTOR_QNAME);
    }

    public WSDerechosAutor(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSDERECHOSAUTOR_QNAME, features);
    }

    public WSDerechosAutor(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSDerechosAutor(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IWSDerechosAutor
     */
    @WebEndpoint(name = "BasicHttpBinding_IWSDerechosAutor")
    public IWSDerechosAutor getBasicHttpBindingIWSDerechosAutor() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IWSDerechosAutor"), IWSDerechosAutor.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSDerechosAutor
     */
    @WebEndpoint(name = "BasicHttpBinding_IWSDerechosAutor")
    public IWSDerechosAutor getBasicHttpBindingIWSDerechosAutor(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IWSDerechosAutor"), IWSDerechosAutor.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSDERECHOSAUTOR_EXCEPTION!= null) {
            throw WSDERECHOSAUTOR_EXCEPTION;
        }
        return WSDERECHOSAUTOR_WSDL_LOCATION;
    }

}
