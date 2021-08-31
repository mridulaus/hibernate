package com.xworkz.camera;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDaoImpl;
import com.xworkz.camera.entity.CameraEntity;

public class CameraTester {

	public static void main(String[] args) {
		CameraEntity entity = new CameraEntity("DJI OSMO",600,"64gb",15000,1,true,true,false);
		
		CameraDAO dao = new CameraDaoImpl();
		dao.save(entity);
		dao.update(1);
		dao.readById(1);
		dao.delete(1);

	}

}
