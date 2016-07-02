package de.tum.in.dbmusicfestival.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.tum.in.dbmusicfestival.bean.Shop;
import de.tum.in.dbmusicfestival.exception.MusicFestivalException;

public class ShopDAO {

	public List<Shop> fetchShopsSetUp() throws ClassNotFoundException, SQLException, MusicFestivalException {
		Class.forName("org.postgresql.Driver");
		Connection conn=DBConfiguration.createConnection();
		Statement fetchShops=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet shopsAvailable=fetchShops.executeQuery("SELECT * FROM shop GROUP BY shopid ORDER BY ownertype ASC");
		if(!shopsAvailable.next()){
			throw new MusicFestivalException("No Shops Found!!");
		}
		List<Shop> shops= new ArrayList<Shop>();
		shopsAvailable.beforeFirst();
		while(shopsAvailable.next()){
			Shop shop=new Shop();
			shop.setShopId(shopsAvailable.getInt("shopid"));
			shop.setName(shopsAvailable.getString("name"));
			shop.setOwnerType(shopsAvailable.getString("ownertype"));
			shops.add(shop);
		}
		conn.close();
		return shops;
	}
}
