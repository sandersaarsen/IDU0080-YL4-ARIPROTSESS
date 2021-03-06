package ee.ttu.tud.idu0080.bp;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2017-05-13T20:45:14.084+03:00
 * Generated source version: 2.5.9
 * 
 */
@WebServiceClient(name = "bp", 
                  wsdlLocation = "file:/C:/Users/Sander/Documents/Kool/Magister/2.Semester/IDU0080/4töö-workplace/BP/WebContent/bp.wsdl",
                  targetNamespace = "http://idu0080.tud.ttu.ee/bp/") 
public class Bp_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://idu0080.tud.ttu.ee/bp/", "bp");
    public final static QName BpSOAP = new QName("http://idu0080.tud.ttu.ee/bp/", "bpSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Sander/Documents/Kool/Magister/2.Semester/IDU0080/4töö-workplace/BP/WebContent/bp.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Bp_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Sander/Documents/Kool/Magister/2.Semester/IDU0080/4töö-workplace/BP/WebContent/bp.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Bp_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Bp_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Bp_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Bp_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Bp_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Bp_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Bp
     */
    @WebEndpoint(name = "bpSOAP")
    public Bp getBpSOAP() {
        return super.getPort(BpSOAP, Bp.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Bp
     */
    @WebEndpoint(name = "bpSOAP")
    public Bp getBpSOAP(WebServiceFeature... features) {
        return super.getPort(BpSOAP, Bp.class, features);
    }

}
