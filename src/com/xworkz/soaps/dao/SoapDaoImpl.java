package com.xworkz.soaps.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.soaps.dto.*;
import com.xworkz.soaps.dto.SoapDTO;

public class SoapDaoImpl implements SoapDAO {

	@Override
	public int save(SoapDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(SoapDTO.class);
		SessionFactory session = config.buildSessionFactory();
		Session ref = session.openSession();
		Transaction transact = ref.beginTransaction();
		int primarykey = (int)ref.save(entity);
		transact.commit();
		System.out.println(primarykey);
		ref.close();
		session.close();
	
		return primarykey;
	}

	@Override
	public int read(SoapDTO entity) {

		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(SoapDTO.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		SoapDTO dt = (SoapDTO) session.get(SoapDTO.class, 2);
		System.out.println(dt);
		tr.commit();
		session.close();
		factory.close();

		return 1;
	}

	@Override
	public int update(SoapDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(SoapDTO.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		SoapDTO dt = (SoapDTO) session.get(SoapDTO.class, 2);
		dt.setBrandAmbassador("sahana");
		session.update(dt);
		session.getTransaction().commit();
		System.out.println("updated ambassdor : " + dt);
		session.close();
		return 1;
	}

	@Override
	public int delete(SoapDTO entity) {
		Configuration con = new Configuration();
		con.configure();
		con.addAnnotatedClass(SoapDTO.class);
		SessionFactory sessionfact = con.buildSessionFactory();
		Session session = sessionfact.openSession();
		Object obj = session.load(SoapDTO.class, new Integer(3));
		SoapDTO dt = (SoapDTO) obj;
		Transaction tr = session.beginTransaction();
		session.delete(dt);
		System.out.println("data is  deleted from the row");
		tr.commit();
		session.close();
		sessionfact.close();
		return 1;
	}

}
