
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
 * 2017-05-13T20:45:56.783+03:00
 * Generated source version: 2.5.9
 * 
 */

@javax.jws.WebService(
                      serviceName = "OrderServiceService",
                      portName = "OrderServicePort",
                      targetNamespace = "http://server.order.idu0080.ttu/",
                      wsdlLocation = "http://localhost:8080/BPServer/services/OrderServicePort?wsdl",
                      endpointInterface = "ttu.idu0080.order.server.OrderService")
                      
public class OrderServiceImpl implements OrderService {

    private static final Logger LOG = Logger.getLogger(OrderServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.OrderService#getOrdersByCustomerId(int  customerId )*
     */
    public java.util.List<ttu.idu0080.order.server.Order> getOrdersByCustomerId(int customerId) { 
        LOG.info("Executing operation getOrdersByCustomerId");
        System.out.println(customerId);
        try {
            java.util.List<ttu.idu0080.order.server.Order> _return = new java.util.ArrayList<ttu.idu0080.order.server.Order>();
            ttu.idu0080.order.server.Order _returnVal1 = new ttu.idu0080.order.server.Order();
            ttu.idu0080.order.server.Customer _returnVal1Customer = new ttu.idu0080.order.server.Customer();
            java.util.List<ttu.idu0080.order.server.Address> _returnVal1CustomerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.Address>();
            _returnVal1Customer.getAddresses().addAll(_returnVal1CustomerAddresses);
            _returnVal1Customer.setCustomer(486120708);
            _returnVal1Customer.setFirstName("FirstName-109643626");
            _returnVal1Customer.setLastName("LastName1741315051");
            _returnVal1.setCustomer(_returnVal1Customer);
            _returnVal1.setOrderId(-233629959);
            java.util.List<ttu.idu0080.order.server.OrderProduct> _returnVal1OrderProducts = new java.util.ArrayList<ttu.idu0080.order.server.OrderProduct>();
            ttu.idu0080.order.server.OrderProduct _returnVal1OrderProductsVal1 = new ttu.idu0080.order.server.OrderProduct();
            _returnVal1OrderProductsVal1.setOrderProduct(1679222555);
            _returnVal1OrderProductsVal1.setPrice(0.0138475895f);
            _returnVal1OrderProductsVal1.setPriceTotal(0.022065163f);
            _returnVal1OrderProductsVal1.setProductCount(90209293);
            _returnVal1OrderProductsVal1.setProductName("ProductName-1019476293");
            _returnVal1OrderProducts.add(_returnVal1OrderProductsVal1);
            _returnVal1.getOrderProducts().addAll(_returnVal1OrderProducts);
            _returnVal1.setPriceTotal(0.05121374f);
            ttu.idu0080.order.server.Seller _returnVal1Seller = new ttu.idu0080.order.server.Seller();
            java.util.List<ttu.idu0080.order.server.EntAddress> _returnVal1SellerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.EntAddress>();
            _returnVal1Seller.getAddresses().addAll(_returnVal1SellerAddresses);
            _returnVal1Seller.setEnterprise(-1569929208);
            _returnVal1Seller.setName("Name1505271637");
            _returnVal1.setSeller(_returnVal1Seller);
            ttu.idu0080.order.server.Address _returnVal1ShippingAddress = new ttu.idu0080.order.server.Address();
            _returnVal1ShippingAddress.setAddress(83347203);
            _returnVal1ShippingAddress.setCountry("Country1085615568");
            _returnVal1ShippingAddress.setCounty("County-396849467");
            _returnVal1ShippingAddress.setStreetAddress("StreetAddress1015486550");
            _returnVal1ShippingAddress.setTownVillage("TownVillage867704523");
            _returnVal1ShippingAddress.setZipcode("Zipcode-779493331");
            _returnVal1.setShippingAddress(_returnVal1ShippingAddress);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.OrderService#getAllOrders(*
     */
    public java.util.List<ttu.idu0080.order.server.Order> getAllOrders() { 
        LOG.info("Executing operation getAllOrders");
        try {
            java.util.List<ttu.idu0080.order.server.Order> _return = new java.util.ArrayList<ttu.idu0080.order.server.Order>();
            ttu.idu0080.order.server.Order _returnVal1 = new ttu.idu0080.order.server.Order();
            ttu.idu0080.order.server.Customer _returnVal1Customer = new ttu.idu0080.order.server.Customer();
            java.util.List<ttu.idu0080.order.server.Address> _returnVal1CustomerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.Address>();
            _returnVal1Customer.getAddresses().addAll(_returnVal1CustomerAddresses);
            _returnVal1Customer.setCustomer(1576637426);
            _returnVal1Customer.setFirstName("FirstName-1108543269");
            _returnVal1Customer.setLastName("LastName1382108136");
            _returnVal1.setCustomer(_returnVal1Customer);
            _returnVal1.setOrderId(1895573643);
            java.util.List<ttu.idu0080.order.server.OrderProduct> _returnVal1OrderProducts = new java.util.ArrayList<ttu.idu0080.order.server.OrderProduct>();
            ttu.idu0080.order.server.OrderProduct _returnVal1OrderProductsVal1 = new ttu.idu0080.order.server.OrderProduct();
            _returnVal1OrderProductsVal1.setOrderProduct(213974599);
            _returnVal1OrderProductsVal1.setPrice(0.16063142f);
            _returnVal1OrderProductsVal1.setPriceTotal(0.9888438f);
            _returnVal1OrderProductsVal1.setProductCount(338958719);
            _returnVal1OrderProductsVal1.setProductName("ProductName19385750");
            _returnVal1OrderProducts.add(_returnVal1OrderProductsVal1);
            _returnVal1.getOrderProducts().addAll(_returnVal1OrderProducts);
            _returnVal1.setPriceTotal(0.28287518f);
            ttu.idu0080.order.server.Seller _returnVal1Seller = new ttu.idu0080.order.server.Seller();
            java.util.List<ttu.idu0080.order.server.EntAddress> _returnVal1SellerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.EntAddress>();
            _returnVal1Seller.getAddresses().addAll(_returnVal1SellerAddresses);
            _returnVal1Seller.setEnterprise(1002404278);
            _returnVal1Seller.setName("Name-1285235156");
            _returnVal1.setSeller(_returnVal1Seller);
            ttu.idu0080.order.server.Address _returnVal1ShippingAddress = new ttu.idu0080.order.server.Address();
            _returnVal1ShippingAddress.setAddress(-1459606993);
            _returnVal1ShippingAddress.setCountry("Country-2091472671");
            _returnVal1ShippingAddress.setCounty("County1936476640");
            _returnVal1ShippingAddress.setStreetAddress("StreetAddress670723064");
            _returnVal1ShippingAddress.setTownVillage("TownVillage1686226566");
            _returnVal1ShippingAddress.setZipcode("Zipcode-69943096");
            _returnVal1.setShippingAddress(_returnVal1ShippingAddress);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.OrderService#getOrdersByOrderId(int  orderId )*
     */
    public ttu.idu0080.order.server.Order getOrdersByOrderId(int orderId) { 
        LOG.info("Executing operation getOrdersByOrderId");
        System.out.println(orderId);
        try {
            ttu.idu0080.order.server.Order _return = new ttu.idu0080.order.server.Order();
            ttu.idu0080.order.server.Customer _returnCustomer = new ttu.idu0080.order.server.Customer();
            java.util.List<ttu.idu0080.order.server.Address> _returnCustomerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.Address>();
            ttu.idu0080.order.server.Address _returnCustomerAddressesVal1 = new ttu.idu0080.order.server.Address();
            _returnCustomerAddressesVal1.setAddress(1313438363);
            _returnCustomerAddressesVal1.setCountry("Country428088194");
            _returnCustomerAddressesVal1.setCounty("County-997705965");
            _returnCustomerAddressesVal1.setStreetAddress("StreetAddress-806236492");
            _returnCustomerAddressesVal1.setTownVillage("TownVillage-136762781");
            _returnCustomerAddressesVal1.setZipcode("Zipcode2113625299");
            _returnCustomerAddresses.add(_returnCustomerAddressesVal1);
            _returnCustomer.getAddresses().addAll(_returnCustomerAddresses);
            _returnCustomer.setCustomer(-427531143);
            _returnCustomer.setFirstName("FirstName-1654611341");
            _returnCustomer.setLastName("LastName1593746315");
            _return.setCustomer(_returnCustomer);
            _return.setOrderId(-2142962989);
            java.util.List<ttu.idu0080.order.server.OrderProduct> _returnOrderProducts = new java.util.ArrayList<ttu.idu0080.order.server.OrderProduct>();
            ttu.idu0080.order.server.OrderProduct _returnOrderProductsVal1 = new ttu.idu0080.order.server.OrderProduct();
            _returnOrderProductsVal1.setOrderProduct(-2096071702);
            _returnOrderProductsVal1.setPrice(0.9555822f);
            _returnOrderProductsVal1.setPriceTotal(0.42797643f);
            _returnOrderProductsVal1.setProductCount(1254007293);
            _returnOrderProductsVal1.setProductName("ProductName-1725431352");
            _returnOrderProducts.add(_returnOrderProductsVal1);
            _return.getOrderProducts().addAll(_returnOrderProducts);
            _return.setPriceTotal(0.03050375f);
            ttu.idu0080.order.server.Seller _returnSeller = new ttu.idu0080.order.server.Seller();
            java.util.List<ttu.idu0080.order.server.EntAddress> _returnSellerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.EntAddress>();
            ttu.idu0080.order.server.EntAddress _returnSellerAddressesVal1 = new ttu.idu0080.order.server.EntAddress();
            _returnSellerAddressesVal1.setAddress(-1064335172);
            _returnSellerAddressesVal1.setCountry("Country-762208682");
            _returnSellerAddressesVal1.setCounty("County201058960");
            _returnSellerAddressesVal1.setStreetAddress("StreetAddress377395693");
            _returnSellerAddressesVal1.setTownVillage("TownVillage1386491635");
            _returnSellerAddressesVal1.setZipcode("Zipcode513737883");
            _returnSellerAddresses.add(_returnSellerAddressesVal1);
            _returnSeller.getAddresses().addAll(_returnSellerAddresses);
            _returnSeller.setEnterprise(376757747);
            _returnSeller.setName("Name-1045168818");
            _return.setSeller(_returnSeller);
            ttu.idu0080.order.server.Address _returnShippingAddress = new ttu.idu0080.order.server.Address();
            _returnShippingAddress.setAddress(1889870379);
            _returnShippingAddress.setCountry("Country-513230151");
            _returnShippingAddress.setCounty("County-1812723643");
            _returnShippingAddress.setStreetAddress("StreetAddress38623196");
            _returnShippingAddress.setTownVillage("TownVillage-295811049");
            _returnShippingAddress.setZipcode("Zipcode-1952574591");
            _return.setShippingAddress(_returnShippingAddress);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.OrderService#getOrdersByShippingAddress(java.lang.String  country ,)java.lang.String  county )*
     */
    public java.util.List<ttu.idu0080.order.server.Order> getOrdersByShippingAddress(java.lang.String country,java.lang.String county) { 
        LOG.info("Executing operation getOrdersByShippingAddress");
        System.out.println(country);
        System.out.println(county);
        try {
            java.util.List<ttu.idu0080.order.server.Order> _return = new java.util.ArrayList<ttu.idu0080.order.server.Order>();
            ttu.idu0080.order.server.Order _returnVal1 = new ttu.idu0080.order.server.Order();
            ttu.idu0080.order.server.Customer _returnVal1Customer = new ttu.idu0080.order.server.Customer();
            java.util.List<ttu.idu0080.order.server.Address> _returnVal1CustomerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.Address>();
            _returnVal1Customer.getAddresses().addAll(_returnVal1CustomerAddresses);
            _returnVal1Customer.setCustomer(-603644390);
            _returnVal1Customer.setFirstName("FirstName910379065");
            _returnVal1Customer.setLastName("LastName-466092010");
            _returnVal1.setCustomer(_returnVal1Customer);
            _returnVal1.setOrderId(606728603);
            java.util.List<ttu.idu0080.order.server.OrderProduct> _returnVal1OrderProducts = new java.util.ArrayList<ttu.idu0080.order.server.OrderProduct>();
            ttu.idu0080.order.server.OrderProduct _returnVal1OrderProductsVal1 = new ttu.idu0080.order.server.OrderProduct();
            _returnVal1OrderProductsVal1.setOrderProduct(1153070638);
            _returnVal1OrderProductsVal1.setPrice(0.9661076f);
            _returnVal1OrderProductsVal1.setPriceTotal(0.77149445f);
            _returnVal1OrderProductsVal1.setProductCount(1309386171);
            _returnVal1OrderProductsVal1.setProductName("ProductName1737907589");
            _returnVal1OrderProducts.add(_returnVal1OrderProductsVal1);
            _returnVal1.getOrderProducts().addAll(_returnVal1OrderProducts);
            _returnVal1.setPriceTotal(0.863748f);
            ttu.idu0080.order.server.Seller _returnVal1Seller = new ttu.idu0080.order.server.Seller();
            java.util.List<ttu.idu0080.order.server.EntAddress> _returnVal1SellerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.EntAddress>();
            _returnVal1Seller.getAddresses().addAll(_returnVal1SellerAddresses);
            _returnVal1Seller.setEnterprise(-1628860544);
            _returnVal1Seller.setName("Name-2094859245");
            _returnVal1.setSeller(_returnVal1Seller);
            ttu.idu0080.order.server.Address _returnVal1ShippingAddress = new ttu.idu0080.order.server.Address();
            _returnVal1ShippingAddress.setAddress(2104691155);
            _returnVal1ShippingAddress.setCountry("Country786876548");
            _returnVal1ShippingAddress.setCounty("County228669931");
            _returnVal1ShippingAddress.setStreetAddress("StreetAddress-257217272");
            _returnVal1ShippingAddress.setTownVillage("TownVillage-1324560867");
            _returnVal1ShippingAddress.setZipcode("Zipcode-220396649");
            _returnVal1.setShippingAddress(_returnVal1ShippingAddress);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ttu.idu0080.order.server.OrderService#getOrdersByCustomerLastName(java.lang.String  lastName )*
     */
    public java.util.List<ttu.idu0080.order.server.Order> getOrdersByCustomerLastName(java.lang.String lastName) { 
        LOG.info("Executing operation getOrdersByCustomerLastName");
        System.out.println(lastName);
        try {
            java.util.List<ttu.idu0080.order.server.Order> _return = new java.util.ArrayList<ttu.idu0080.order.server.Order>();
            ttu.idu0080.order.server.Order _returnVal1 = new ttu.idu0080.order.server.Order();
            ttu.idu0080.order.server.Customer _returnVal1Customer = new ttu.idu0080.order.server.Customer();
            java.util.List<ttu.idu0080.order.server.Address> _returnVal1CustomerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.Address>();
            _returnVal1Customer.getAddresses().addAll(_returnVal1CustomerAddresses);
            _returnVal1Customer.setCustomer(-1919848783);
            _returnVal1Customer.setFirstName("FirstName-978868953");
            _returnVal1Customer.setLastName("LastName736654751");
            _returnVal1.setCustomer(_returnVal1Customer);
            _returnVal1.setOrderId(-468594754);
            java.util.List<ttu.idu0080.order.server.OrderProduct> _returnVal1OrderProducts = new java.util.ArrayList<ttu.idu0080.order.server.OrderProduct>();
            ttu.idu0080.order.server.OrderProduct _returnVal1OrderProductsVal1 = new ttu.idu0080.order.server.OrderProduct();
            _returnVal1OrderProductsVal1.setOrderProduct(686252106);
            _returnVal1OrderProductsVal1.setPrice(0.56348944f);
            _returnVal1OrderProductsVal1.setPriceTotal(0.033354282f);
            _returnVal1OrderProductsVal1.setProductCount(558319933);
            _returnVal1OrderProductsVal1.setProductName("ProductName812700083");
            _returnVal1OrderProducts.add(_returnVal1OrderProductsVal1);
            _returnVal1.getOrderProducts().addAll(_returnVal1OrderProducts);
            _returnVal1.setPriceTotal(0.36032987f);
            ttu.idu0080.order.server.Seller _returnVal1Seller = new ttu.idu0080.order.server.Seller();
            java.util.List<ttu.idu0080.order.server.EntAddress> _returnVal1SellerAddresses = new java.util.ArrayList<ttu.idu0080.order.server.EntAddress>();
            _returnVal1Seller.getAddresses().addAll(_returnVal1SellerAddresses);
            _returnVal1Seller.setEnterprise(-846364316);
            _returnVal1Seller.setName("Name-271222053");
            _returnVal1.setSeller(_returnVal1Seller);
            ttu.idu0080.order.server.Address _returnVal1ShippingAddress = new ttu.idu0080.order.server.Address();
            _returnVal1ShippingAddress.setAddress(1270952561);
            _returnVal1ShippingAddress.setCountry("Country900761175");
            _returnVal1ShippingAddress.setCounty("County-780620111");
            _returnVal1ShippingAddress.setStreetAddress("StreetAddress-1685963595");
            _returnVal1ShippingAddress.setTownVillage("TownVillage-37882154");
            _returnVal1ShippingAddress.setZipcode("Zipcode111994895");
            _returnVal1.setShippingAddress(_returnVal1ShippingAddress);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
