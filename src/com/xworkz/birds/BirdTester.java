package com.xworkz.birds;

import com.xworkz.birds.dao.BirdsDAO;
import com.xworkz.birds.dao.BirdsDaoImpl;
import com.xworkz.birds.entity.BirdEntity;

public class BirdTester {

	public static void main(String[] args) {
		BirdEntity entity = new BirdEntity(2, "parrot", 2, "green", "Hyacinth Macaw ", true, true, 3.1f, 2.3f);
		
		BirdsDAO dao = new BirdsDaoImpl();
		dao.save(entity);
		dao.readById(2);
	}

}
