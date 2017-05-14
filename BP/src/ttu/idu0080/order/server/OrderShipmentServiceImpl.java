
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ttu.idu0080.order.server;

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
 * 2017-05-14T00:56:25.937+03:00
 * Generated source version: 2.5.9
 * 
 */

@javax.jws.WebService(
                      serviceName = "OrderShipmentServiceService",
                      portName = "OrderShipmentServicePort",
                      targetNamespace = "http://server.order.idu0080.ttu/",
                      wsdlLocation = "http://localhost:8080/BPServer/services/OrderShipmentServicePort?wsdl",
                      endpointInterface = "ttu.idu0080.order.server.OrderShipmentService")
                      
public class OrderShipmentServiceImpl implements OrderShipmentService {

    private static final Logger LOG = Logger.getLogger(OrderShipmentServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.OrderShipmentService#getOrderShipmentsByOrderIdRyhmName(int  orderId ,)java.lang.String  ryhmName )*
     */
    public java.util.List<ttu.idu0080.order.server.OrderShipment> getOrderShipmentsByOrderIdRyhmName(int orderId,java.lang.String ryhmName) { 
        LOG.info("Executing operation getOrderShipmentsByOrderIdRyhmName");
        System.out.println(orderId);
        System.out.println(ryhmName);
        try {
            java.util.List<ttu.idu0080.order.server.OrderShipment> _return = new java.util.ArrayList<ttu.idu0080.order.server.OrderShipment>();
            ttu.idu0080.order.server.OrderShipment _returnVal1 = new ttu.idu0080.order.server.OrderShipment();
            _returnVal1.setApproxDeliveryDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-05-14T00:56:25.946+03:00"));
            _returnVal1.setCourierName("CourierName1057052648");
            _returnVal1.setOrder(-1093273593);
            _returnVal1.setOrderShipment(2085296530);
            _returnVal1.setRyhmName("RyhmName-1917375352");
            _returnVal1.setShippingPrice(0.8736394256228386);
            _returnVal1.setTrackingNumber("TrackingNumber787147248");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.OrderShipmentService#insertOrderShipment(int  orderId ,)java.lang.String  ryhmName ,)java.lang.String  trackingNumber ,)java.lang.String  courierName ,)javax.xml.datatype.XMLGregorianCalendar  approxDeliveryDate ,)double  shippingPrice )*
     */
    public int insertOrderShipment(int orderId,java.lang.String ryhmName,java.lang.String trackingNumber,java.lang.String courierName,javax.xml.datatype.XMLGregorianCalendar approxDeliveryDate,double shippingPrice) { 
        LOG.info("Executing operation insertOrderShipment");
        System.out.println(orderId);
        System.out.println(ryhmName);
        System.out.println(trackingNumber);
        System.out.println(courierName);
        System.out.println(approxDeliveryDate);
        System.out.println(shippingPrice);
        try {
            int _return = 263554607;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}