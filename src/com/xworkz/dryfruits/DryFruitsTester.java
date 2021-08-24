package com.xworkz.dryfruits;

import com.xworkz.dryfruits.dao.DryFruitsDAO;
import com.xworkz.dryfruits.dao.DryFruitsDaoImpl;
import com.xworkz.dryfruits.dto.DryFruitsDTO;

public class DryFruitsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DryFruitsDTO entity = new DryFruitsDTO(1,"dates" , "Kimia" ,"SaudiArabia" , 674 , "Amazon");
		
		DryFruitsDAO dao = new DryFruitsDaoImpl();
		dao.save(entity);

	}

}
