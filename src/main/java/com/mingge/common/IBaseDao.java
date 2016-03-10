package com.mingge.common;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao<T> {
	public void add(T t);
	public void update(T t);
	/**
	 * 保存或更新对象
	 * @param t
	 */
	public void saveOrUpdate(T t);
	/**
	 * 合并一个对象
	 * @param t
	 */
	public void merge(T t);
	public void delete(T t);
	/**
	 * 查找对象集合
	 * 
	 * @param hql
	 * @param param
	 * @return List<T>
	 */
	public List<T> find(String hql, Object... param);
	/**
	 * 查找对象集合
	 * @param hql
	 * @param param
	 * @return List<T>
	 */
	public List<T> find(String hql, List<Object> param);
	/**
	 * 查找对象集合,带分页
	 * 
	 * @param hql
	 * @param page
	 * @param rows
	 * @param param
	 * @return 分页后的List<T>
	 */
	public List<T> find(String hql, int page, int rows, List<Object> param);

	/**
	 * 查找对象集合,带分页
	 * @param hql
	 * @param page
	 * @param rows
	 * @param param
	 * @return 分页后的List<T>
	 */
	public List<T> find(String hql, int page, int rows, Object... param);

	/**
	 * 获得一个对象
	 * @param c
	 * @param id
	 * @return Object
	 */
	public T get(Class<T> c, Serializable id);

	/**
	 * 获得一个对象
	 * @param hql
	 * @param param
	 * @return Object
	 */
	public T get(String hql, Object... param);

	/**
	 * 获得一个对象
	 * @param hql
	 * @param param
	 * @return Object
	 */
	public T get(String hql, List<Object> param);

	/**
	 * 获得一个对象
	 * @param c
	 * @param id
	 * @return Object
	 */
	public T load(Class<T> c, Serializable id);

	/**
	 * select count(*) from 类
	 * @param hql
	 * @param param
	 * @return Long
	 */
	public Long count(String hql, Object... param);

	/**
	 * select count(*) from 类
	 * @param hql
	 * @param param
	 * @return Long
	 */
	public Long count(String hql, List<Object> param);

	/**
	 * 执行HQL语句
	 * @param hql
	 * @return 相应数目
	 */
	public Integer executeHql(String hql);
}
