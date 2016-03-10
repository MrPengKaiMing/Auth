package com.mingge.common;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Repository;

/**
 * 
 * @类描述：
 * @项目名称：user-core
 * @包名： com.mingge.common
 * @类名称：BaseDaoImpl
 * @创建人：Mr.Peng
 * @创建时间：2016年3月10日下午9:15:45
 * @修改人：Mr.Peng
 * @修改时间：2016年3月10日下午9:15:45
 * @修改备注：
 * @version v1.0
 * @see [nothing]
 * @bug [nothing]
 * @Copyright go3c
 * @mail *@qq.com
 */
@Repository
public class BaseDaoImpl<T> extends DaoSupport implements IBaseDao<T>{
	@Autowired
	private SessionFactory sessionFactory;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void add(T t) {
		sessionFactory.getCurrentSession().save(t);
		
	}

	public void update(T t) {
		sessionFactory.getCurrentSession().update(t);
	}

	public void saveOrUpdate(T t) {
		sessionFactory.getCurrentSession().saveOrUpdate(t);
	}

	public void merge(T t) {
		sessionFactory.getCurrentSession().merge(t);
	}

	public void delete(T t) {
		sessionFactory.getCurrentSession().delete(t);
	}

	public List<T> find(String hql, Object... param) {
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		if (param!=null&&param.length>0) {
			for(int i=0;i<param.length;i++){
				query.setParameter(i, param[i]);
			}
		}
		return query.list();
	}

	public List<T> find(String hql, List<Object> param) {
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		if (param != null && param.size() > 0) {
			for (int i = 0; i < param.size(); i++) {
				query.setParameter(i, param.get(i));
			}
		}
		return query.list();
	}

	public List<T> find(String hql, int page, int rows, List<Object> param) {
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		if (param != null && param.size() > 0) {
			for (int i = 0; i < param.size(); i++) {
				query.setParameter(i, param.get(i));
			}
		}
		return query.setFirstResult((page-1)*rows).setMaxResults(rows).list();
	}

	public List<T> find(String hql, int page, int rows, Object... param) {
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		if (param != null && param.length > 0) {
			for (int i = 0; i < param.length; i++) {
				q.setParameter(i, param[i]);
			}
		}
		return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();
	}

	public T get(Class<T> c, Serializable id) {
		return (T) sessionFactory.getCurrentSession().get(c, id);
	}

	public T get(String hql, Object... param) {
		List l = this.find(hql, param);
		if (l != null && l.size() > 0) {
			return (T) l.get(0);
		}
		return null;
	}

	public T get(String hql, List<Object> param) {
		List l = this.find(hql, param);
		if (l != null && l.size() > 0) {
			return (T) l.get(0);
		}
		return null;
	}

	public T load(Class<T> c, Serializable id) {
		return (T)sessionFactory.getCurrentSession().load(c, id);
	}

	public Long count(String hql, Object... param) {
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		if (param != null && param.length > 0) {
			for (int i = 0; i < param.length; i++) {
				q.setParameter(i, param[i]);
			}
		}
		return (Long) q.uniqueResult();
	}

	public Long count(String hql, List<Object> param) {
		Query q =sessionFactory.getCurrentSession().createQuery(hql);
		if (param != null && param.size() > 0) {
			for (int i = 0; i < param.size(); i++) {
				q.setParameter(i, param.get(i));
			}
		}
		return (Long) q.uniqueResult();
	}

	public Integer executeHql(String hql) {
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		return q.executeUpdate();
	}

	@Override
	protected void checkDaoConfig() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

}
