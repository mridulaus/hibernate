package com.xworkz.camera.dao;

import java.util.List;

import com.xworkz.camera.entity.CameraEntity;

public interface CameraDAO {
	int save(CameraEntity entity);

	CameraEntity readById(int id);

	void update(int id);

	void delete(int id);

	void saveList(List<CameraEntity> entity);

	void deleteList(List<Integer> id);

}
