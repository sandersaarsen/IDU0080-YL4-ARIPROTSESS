
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ee.ttu.tud.idu0080.kuller;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2017-05-13T23:28:01.886+03:00
 * Generated source version: 2.5.9
 * 
 */

@javax.jws.WebService(
                      serviceName = "kuller",
                      portName = "kullerSOAP",
                      targetNamespace = "http://idu0080.tud.ttu.ee/kuller/",
                      wsdlLocation = "file:/C:/Users/Sander/Documents/Kool/Magister/2.Semester/IDU0080/4töö-workplace/BP/WebContent/kuller.wsdl",
                      endpointInterface = "ee.ttu.tud.idu0080.kuller.Kuller")
                      
public class KullerImpl implements Kuller {

    private static final Logger LOG = Logger.getLogger(KullerImpl.class.getName());

    /* (non-Javadoc)
     * @see ee.ttu.tud.idu0080.kuller.Kuller#getKullerid(*
     */
    public ee.ttu.tud.idu0080.kuller.KulleridVastus getKullerid() { 
        LOG.info("Executing operation getKullerid");
        try {
            ee.ttu.tud.idu0080.kuller.KulleridVastus _return = new ee.ttu.tud.idu0080.kuller.KulleridVastus();
            java.util.List<ee.ttu.tud.idu0080.kuller.Kuller_Type> _returnKuller = new java.util.ArrayList<ee.ttu.tud.idu0080.kuller.Kuller_Type>();
            ee.ttu.tud.idu0080.kuller.Kuller_Type _returnKullerVal1 = new ee.ttu.tud.idu0080.kuller.Kuller_Type();
            _returnKullerVal1.setKullerId(-1273115262);
            _returnKullerVal1.setNimi("Nimi-1840471454");
            _returnKuller.add(_returnKullerVal1);
            _return.getKuller().addAll(_returnKuller);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
