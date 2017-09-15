package com.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.IDAO.IPatientDAO;
import com.domain.Patient;
import com.util.HibernateUtil;

@Repository
public class PatientDAO implements IPatientDAO {

	@Override
	public Patient fetchPatientById(int id) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Patient patients = (Patient) session.get(Patient.class, id);

		return patients;

	}

	@Override
	public List<Patient> fetchPatients() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Query query = session.createQuery("select p from Patient p");

		List<Patient> pat = query.list();

		return pat;

		
	}

}
