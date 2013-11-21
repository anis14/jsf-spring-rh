package br.com.rh.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.rh.model.Servidor;

@Repository
public class ServidorDao extends HibernateDaoSupport {
/*
	private SessionFactory factory;

	@Autowired
	public void servidorImplDao(final SessionFactory factory) {
		this.factory = factory;
	}
*/
	@Transactional(readOnly = true)
	public List<Servidor> lista() {
		return getHibernateTemplate().loadAll(Servidor.class);
	}

}
