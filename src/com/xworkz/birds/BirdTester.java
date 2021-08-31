package com.xworkz.birds;

import com.xworkz.birds.dao.BirdsDAO;
import com.xworkz.birds.dao.BirdsDaoImpl;
import com.xworkz.birds.entity.BirdEntity;

public class BirdTester {

	public static void main(String[] args) {
		BirdEntity ent = new BirdEntity(7, "penguin", 2, "whit n black", "Emperor Penguine ", true, true, 2.1f, 2.0f);
		
		BirdsDAO dao = new BirdsDaoImpl();
//		dao.save(ent);
		dao.readById(2);
		dao.updateNameById(2, "swan");
		dao.deleteById(1);
	}

}
