package com.xworkz.camera;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDaoImpl;
import com.xworkz.camera.entity.CameraEntity;

public class CameraDeleteListTester {

	public static void main(String[] args) {
	CameraDAO dao = new CameraDaoImpl();
//	CameraEntity entity = new CameraEntity("sony",500,"128gb",10500,2,true,true,false);
//	CameraEntity entity1 = new CameraEntity("GoPro",2400,"128gb",1500,1,true,true,false);
//	
	List<Integer> list = new ArrayList<>();
	list.add(7);
	list.remove(list);
	

	}

}
