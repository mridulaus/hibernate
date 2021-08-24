package com.xworkz.soaps;

import com.xworkz.soaps.constants.SoapType;
import com.xworkz.soaps.dao.SoapDAO;
import com.xworkz.soaps.dao.SoapDaoImpl;
import com.xworkz.soaps.dto.SoapDTO;

public class SoapTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SoapDTO entity = new SoapDTO(1, "Aishwarya", "orange", true, false, SoapType.HUMAN);
		
		SoapDAO dao = new SoapDaoImpl();
		dao.save(entity);
			
	

	}

}
