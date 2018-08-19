package com.sree.app.Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.sree.app.Dto.PgDto;


@Repository
public class PgDao {
	@Autowired
	private SessionFactory factory;
	public boolean saveUser(PgDto dto){
		boolean flag=false;
		Session session=null;
		Transaction tx=null;
     try {
    	 session=factory.openSession();
    	 tx=session.beginTransaction();
    	 session.save(dto);
    	 tx.commit();
    	 flag=true;
		
	} catch (HibernateException e) {
		// TODO: handle exception
		e.printStackTrace();
		tx.rollback();
		flag=false;
	}
	return flag;	
	}
	public boolean authenicateuser(PgDto dto) {
		boolean flag=false;
		Session session=null;
		String hql="SELECT dto FROM register_table dto WHERE dto.email_id=:usrnm AND dto.password=:pwd";
		try {
			session=factory.openSession();
			Query query=session.createQuery(hql);
			query.setParameter("usrnm", dto.getPersonEmailId());
			query.setParameter("pwd", dto.getPassword());
			PgDto logInDto=(PgDto) query.uniqueResult();
			if(logInDto!=null){
				flag=true;
			}
			
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
		
	}


}


