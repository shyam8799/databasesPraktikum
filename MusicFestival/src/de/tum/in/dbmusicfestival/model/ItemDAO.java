package de.tum.in.dbmusicfestival.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.tum.in.dbmusicfestival.bean.Item;
import de.tum.in.dbmusicfestival.exception.MusicFestivalException;

public class ItemDAO {

	public List<Item> fetchItemsList() throws ClassNotFoundException, SQLException, MusicFestivalException {
		Class.forName("org.postgresql.Driver");
		Connection conn=DBConfiguration.createConnection();
		Statement fetchItems=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet itemsList=fetchItems.executeQuery("SELECT * FROM item ");
		if(!itemsList.next()){
			throw new MusicFestivalException("No Items Found!!");
		}
		List<Item> items = new ArrayList<Item>();
		itemsList.beforeFirst();
		while(itemsList.next()){
			Item item=new Item();
			item.setItemId(itemsList.getInt("itemid"));
			item.setoId(itemsList.getInt("oid"));
			item.setName(itemsList.getString("name"));
			item.setType(itemsList.getString("type"));
			item.setPrice(itemsList.getDouble("price"));
			item.setStock(itemsList.getInt("stock"));
			items.add(item);
		}
		conn.close();
		return items;
	}
}
