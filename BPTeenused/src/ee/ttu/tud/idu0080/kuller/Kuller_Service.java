package ee.ttu.tud.idu0080.kuller;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2017-05-13T23:08:03.656+03:00
 * Generated source version: 2.5.9
 * 
 */
@WebServiceClient(name = "kuller", 
                  wsdlLocation = "file:/C:/Users/Sander/Documents/Kool/Magister/2.Semester/IDU0080/4töö-workplace/BPTeenused/WebContent/kuller.wsdl",
                  targetNamespace = "http://idu0080.tud.ttu.ee/kuller/") 
public class Kuller_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://idu0080.tud.ttu.ee/kuller/", "kuller");
    public final static QName KullerSOAP = new QName("http://idu0080.tud.ttu.ee/kuller/", "kullerSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Sander/Documents/Kool/Magister/2.Semester/IDU0080/4töö-workplace/BPTeenused/WebContent/kuller.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Kuller_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Sander/Documents/Kool/Magister/2.Semester/IDU0080/4töö-workplace/BPTeenused/WebContent/kuller.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Kuller_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Kuller_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Kuller_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Kuller_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Kuller_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Kuller_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Kuller
     */
    @WebEndpoint(name = "kullerSOAP")
    public Kuller getKullerSOAP() {
        return super.getPort(KullerSOAP, Kuller.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Kuller
     */
    @WebEndpoint(name = "kullerSOAP")
    public Kuller getKullerSOAP(WebServiceFeature... features) {
        return super.getPort(KullerSOAP, Kuller.class, features);
    }

}
