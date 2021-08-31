package com.xworkz.camera.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.xworkz.camera.entity.CameraEntity;
import com.xworkz.camera.util.SFUtil;

public class CameraDaoImpl implements CameraDAO {
	private SessionFactory fact = SFUtil.getFactory();

	@Override
	public int save(CameraEntity entity) {
		try (Session ref = fact.openSession()) {
			Transaction transact = ref.beginTransaction();
			int pk = (int) ref.save(entity);
			transact.commit();
			System.out.println(pk);
			return pk;
		}

	}

	@Override
	public CameraEntity readById(int id) {
		try (Session ref = fact.openSession()) {
			CameraEntity camera = ref.get(CameraEntity.class, id);

			return camera;
		}
	}

	@Override
	public void update(int id) {
		try (Session ref = fact.openSession()) {
			Transaction transact = ref.beginTransaction();
			CameraEntity entity = ref.get(CameraEntity.class,  id);
			entity.setMemoryCardSize("256gb");
			ref.update(entity);
			ref.getTransaction().commit();
			System.out.println("data is updated   " + entity);
		}

	}

	@Override
	public void delete(int id) {
		try (Session ref = fact.openSession()) {
			Transaction transact = ref.beginTransaction();
			CameraEntity entity = ref.get(CameraEntity.class, id);

			ref.delete(entity);
			ref.getTransaction().commit();
			System.out.println("data is  deleted   " + entity);
		}

	}

}
