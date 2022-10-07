package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbsProductDao implements ProductDao{
	public void add(Product product) {
//		saddece ve sade db erişim kodları yazılır...SQL
		System.out.println("JDBC ile veri tabanına  eklendi");
	}

}
