
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ttu.idu0080.order.server;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2017-05-13T21:57:36.774+03:00
 * Generated source version: 2.5.9
 * 
 */

@javax.jws.WebService(
                      serviceName = "CourierServiceService",
                      portName = "CourierServicePort",
                      targetNamespace = "http://server.order.idu0080.ttu/",
                      wsdlLocation = "file:/C:/Users/Sander/Documents/Kool/Magister/2.Semester/IDU0080/4töö-workplace/BPCourier/WebContent/couriers_1.wsdl",
                      endpointInterface = "ttu.idu0080.order.server.CourierService")
                      
public class CourierServiceImpl implements CourierService {

    private static final Logger LOG = Logger.getLogger(CourierServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.CourierService#getCouriersByAddress(java.lang.String  country ,)java.lang.String  county )*
     */
    public java.util.List<ttu.idu0080.order.server.Courier> getCouriersByAddress(java.lang.String country,java.lang.String county) { 
        LOG.info("Executing operation getCouriersByAddress");
        System.out.println(country);
        System.out.println(county);
        try {
            java.util.List<ttu.idu0080.order.server.Courier> _return = new java.util.ArrayList<ttu.idu0080.order.server.Courier>();
            ttu.idu0080.order.server.Courier _returnVal1 = new ttu.idu0080.order.server.Courier();
            java.util.List<ttu.idu0080.order.server.EntAddress> _returnVal1Addresses = new java.util.ArrayList<ttu.idu0080.order.server.EntAddress>();
            ttu.idu0080.order.server.EntAddress _returnVal1AddressesVal1 = new ttu.idu0080.order.server.EntAddress();
            _returnVal1AddressesVal1.setAddress(-722273680);
            _returnVal1AddressesVal1.setCountry("Country1052005186");
            _returnVal1AddressesVal1.setCounty("County-1080265421");
            _returnVal1AddressesVal1.setStreetAddress("StreetAddress-1297321481");
            _returnVal1AddressesVal1.setTownVillage("TownVillage-309701336");
            _returnVal1AddressesVal1.setZipcode("Zipcode-1638914608");
            _returnVal1Addresses.add(_returnVal1AddressesVal1);
            _returnVal1.getAddresses().addAll(_returnVal1Addresses);
            _returnVal1.setEnterprise(-1809179043);
            _returnVal1.setName("Name-2125616886");
            _returnVal1.setPercentFromOrder(-656702962);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.CourierService#getCourierById(int  courierId )*
     */
    public ttu.idu0080.order.server.Courier getCourierById(int courierId) { 
        LOG.info("Executing operation getCourierById");
        try {
        	for(Courier courier : Database.couriers)
        		if(courier.getEnterprise() == courierId)
        			return courier;
        	return null;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.CourierService#getAllCouriers(*
     */
    public java.util.List<ttu.idu0080.order.server.Courier> getAllCouriers() { 
        LOG.info("Executing operation getAllCouriers");
        try {
        	return Database.couriers;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
