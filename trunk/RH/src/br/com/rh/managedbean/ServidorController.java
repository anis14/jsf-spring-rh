package br.com.rh.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.rh.comum.BeanFactory;
import br.com.rh.dao.ServidorDao;
import br.com.rh.model.Servidor;


@ManagedBean(name="servidorController")
@RequestScoped
public class ServidorController implements Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public List<Servidor> servidores;
		
	public ServidorController() {
		servidores = new ArrayList();
	}
	
	public String listServidores(){
		//ServidorDao servidorDao = (ServidorDao) BeanFactory.getBean("servidorDao", ServidorDao.class);
		//servidores.add(new Servidor());
		System.out.println("teste bean");
		return "pages/listservidor";
	}
    
}
