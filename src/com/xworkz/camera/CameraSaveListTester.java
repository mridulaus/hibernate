package com.xworkz.camera;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDaoImpl;
import com.xworkz.camera.entity.CameraEntity;

public class CameraSaveListTester {

	public static void main(String[] args) {

		CameraDAO dao = new CameraDaoImpl();
		
		CameraEntity entity = new CameraEntity("sony",500,"128gb",10500,2,true,true,false);
		CameraEntity entity1 = new CameraEntity("GoPro",2400,"128gb",1500,1,true,true,false);
		CameraEntity entity2 = new CameraEntity("Panasonic",1000,"256gb",1399,2,true,true,false);
		
		List<CameraEntity> list = new ArrayList<>();
		list.add(entity);
		list.add(entity1);
		list.add(entity2);
		
		dao.saveList(list);
		
	
		list.remove(list);

	}

}
