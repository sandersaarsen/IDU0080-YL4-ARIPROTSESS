package ee.ttu.tud.idu0080.kuller;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2017-05-13T23:28:01.903+03:00
 * Generated source version: 2.5.9
 * 
 */
@WebService(targetNamespace = "http://idu0080.tud.ttu.ee/kuller/", name = "kuller")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Kuller {

    @WebMethod(action = "http://idu0080.tud.ttu.ee/kuller/getKullerid")
    @WebResult(name = "KulleridVastus", targetNamespace = "http://idu0080.tud.ttu.ee/kuller/", partName = "parameters")
    public KulleridVastus getKullerid();
}
