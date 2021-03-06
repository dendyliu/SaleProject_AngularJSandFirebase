
package AddProductWS;

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
@WebServiceClient(name = "AddProductWS", targetNamespace = "http://AddProductModel/", wsdlLocation = "http://localhost:8081/Marketplace_Web_Service/AddProductWS?wsdl")
public class AddProductWS_Service
    extends Service
{

    private final static URL ADDPRODUCTWS_WSDL_LOCATION;
    private final static WebServiceException ADDPRODUCTWS_EXCEPTION;
    private final static QName ADDPRODUCTWS_QNAME = new QName("http://AddProductModel/", "AddProductWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/Marketplace_Web_Service/AddProductWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADDPRODUCTWS_WSDL_LOCATION = url;
        ADDPRODUCTWS_EXCEPTION = e;
    }

    public AddProductWS_Service() {
        super(__getWsdlLocation(), ADDPRODUCTWS_QNAME);
    }

    public AddProductWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADDPRODUCTWS_QNAME, features);
    }

    public AddProductWS_Service(URL wsdlLocation) {
        super(wsdlLocation, ADDPRODUCTWS_QNAME);
    }

    public AddProductWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADDPRODUCTWS_QNAME, features);
    }

    public AddProductWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AddProductWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AddProductWS
     */
    @WebEndpoint(name = "AddProductWSPort")
    public AddProductWS getAddProductWSPort() {
        return super.getPort(new QName("http://AddProductModel/", "AddProductWSPort"), AddProductWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AddProductWS
     */
    @WebEndpoint(name = "AddProductWSPort")
    public AddProductWS getAddProductWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://AddProductModel/", "AddProductWSPort"), AddProductWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADDPRODUCTWS_EXCEPTION!= null) {
            throw ADDPRODUCTWS_EXCEPTION;
        }
        return ADDPRODUCTWS_WSDL_LOCATION;
    }

}
