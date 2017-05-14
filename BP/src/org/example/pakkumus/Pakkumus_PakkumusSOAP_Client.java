
package org.example.pakkumus;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2017-05-14T00:15:26.328+03:00
 * Generated source version: 2.5.9
 * 
 */
public final class Pakkumus_PakkumusSOAP_Client {

    private static final QName SERVICE_NAME = new QName("http://www.example.org/pakkumus/", "pakkumus");

    private Pakkumus_PakkumusSOAP_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Pakkumus_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Pakkumus_Service ss = new Pakkumus_Service(wsdlURL, SERVICE_NAME);
        Pakkumus port = ss.getPakkumusSOAP();  
        
        {
        System.out.println("Invoking teePakkumus...");
        org.example.pakkumus.PakkumusParing _teePakkumus_parameters = new org.example.pakkumus.PakkumusParing();
        _teePakkumus_parameters.setKullerId(671879063);
        org.example.pakkumus.TellimusType _teePakkumus_parametersTellimus = new org.example.pakkumus.TellimusType();
        _teePakkumus_parametersTellimus.setOrderId(-1329563623);
        _teePakkumus_parametersTellimus.setPriceTotal(0.589395871833426);
        org.example.pakkumus.Seller _teePakkumus_parametersTellimusSeller = new org.example.pakkumus.Seller();
        java.util.List<org.example.pakkumus.Address> _teePakkumus_parametersTellimusSellerAddresses = new java.util.ArrayList<org.example.pakkumus.Address>();
        _teePakkumus_parametersTellimusSeller.getAddresses().addAll(_teePakkumus_parametersTellimusSellerAddresses);
        _teePakkumus_parametersTellimusSeller.setEnterprise(-990812052);
        _teePakkumus_parametersTellimusSeller.setName("Name-116134847");
        _teePakkumus_parametersTellimus.setSeller(_teePakkumus_parametersTellimusSeller);
        org.example.pakkumus.Address _teePakkumus_parametersTellimusShippingAddress = new org.example.pakkumus.Address();
        _teePakkumus_parametersTellimusShippingAddress.setAddress(-1871634587);
        _teePakkumus_parametersTellimusShippingAddress.setCountry("Country-2037983640");
        _teePakkumus_parametersTellimusShippingAddress.setCounty("County1821200986");
        _teePakkumus_parametersTellimusShippingAddress.setStreetAddress("StreetAddress-712913559");
        _teePakkumus_parametersTellimusShippingAddress.setTownVillage("TownVillage-571958402");
        _teePakkumus_parametersTellimusShippingAddress.setZipcode("Zipcode-1868208263");
        _teePakkumus_parametersTellimus.setShippingAddress(_teePakkumus_parametersTellimusShippingAddress);
        _teePakkumus_parameters.setTellimus(_teePakkumus_parametersTellimus);
        org.example.pakkumus.PakkumusVastus _teePakkumus__return = port.teePakkumus(_teePakkumus_parameters);
        System.out.println("teePakkumus.result=" + _teePakkumus__return);


        }

        System.exit(0);
    }

}
