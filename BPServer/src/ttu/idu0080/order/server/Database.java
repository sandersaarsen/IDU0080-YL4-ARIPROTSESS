package ttu.idu0080.order.server;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	public static List<ttu.idu0080.order.server.Order> orders = new ArrayList<ttu.idu0080.order.server.Order>();
	public static List<ttu.idu0080.order.server.Courier> couriers = new ArrayList<ttu.idu0080.order.server.Courier>();
	public static List<ttu.idu0080.order.server.OrderShipment> orderShipments = new ArrayList<ttu.idu0080.order.server.OrderShipment>();
	
	public static int orderIdGen;
	
	static {
		orderIdGen = 1;
		
		//Dummy data
		final Address address1 = new Address(1, "Eesti", "Harjumaa", " Ehitajate tee 5", "Tallinn", "12616");
		final Address address2 = new Address(2, "Eesti", "Harjumaa", " Narva mnt 25", "Tallinn", "10120");
        Seller seller1 = new Seller(new ArrayList<EntAddress>(){{add(new EntAddress(1, "Eesti", "Tartumaa", "Ulikooli 18", "Tartu", "50090"));}}, 1, "K&L");
        final OrderProduct orderProduct1 = new OrderProduct(1, 1.2f, 2.4f, 2, "Kahvel");
        final OrderProduct orderProduct2 = new OrderProduct(1, 1.4f, 4.2f, 3, "Lusikas");
        
        orders.add(new Order(new Customer(new ArrayList<Address>(){{add(address1);}},  1, "Timo", "Toru"), 1, new ArrayList<OrderProduct>(){{add(orderProduct1);}}, 2.4f, seller1, address1));
        orders.add(new Order(new Customer(new ArrayList<Address>(){{add(address2);}},  2, "Juss", "Karu"), 2, new ArrayList<OrderProduct>(){{add(orderProduct1);add(orderProduct2);}}, 6.6f, seller1, address2));
        
        couriers.add(new Courier(new ArrayList<EntAddress>(){{add(new EntAddress(2, "Eesti", "Viljandi maakond", "Posti 1", "Viljandi", "71013 "));}}, 1, "Best courier", 10));
        couriers.add(new Courier(new ArrayList<EntAddress>(){{add(new EntAddress(3, "Eesti", "Harjumaa", "Raekoja plats 2", "Tallinn", "20307 "));}}, 2, "Courier24", 15));
    }

}
