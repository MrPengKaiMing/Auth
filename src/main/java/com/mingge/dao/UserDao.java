package com.mingge.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mingge.common.BaseDaoImpl;

@Repository
public class UserDao<User>{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return  sessionFactory.openSession();
	}
	public List<User> findAll(String hql,Object... param ){
		
		Query query=getSession().createQuery(hql);
		if (param!=null&&param.length>0) {
			for(int i=0;i<param.length;i++){
				query.setParameter(i, param[i]);
			}
		}

		return query.list();
	}
}
