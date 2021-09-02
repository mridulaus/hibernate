package com.xworkz.camera;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDaoImpl;
import com.xworkz.camera.entity.CameraEntity;

public class CameraTester {

	public static void main(String[] args) {
		CameraEntity entity = new CameraEntity("FujiFilm",500,"128gb",3999,1,true,true,false);
		
		CameraDAO dao = new CameraDaoImpl();
		dao.save(entity);
		dao.update(2);
		dao.readById(1);
		dao.delete(2);
		

		

	}

}
