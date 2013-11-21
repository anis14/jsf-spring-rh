package br.com.rh.comum;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactory {

	private static ClassPathXmlApplicationContext ctx;

	static {
		ctx = new ClassPathXmlApplicationContext("/WebContent/WEB-INF/applicationContext.xml");
	}

	private BeanFactory() {
	}

	public static Object getBean(String beanName) {
		return ctx.getBean(beanName);
	}

	public static Object getBean(String beanName, Class classe) {
		return ctx.getBean(beanName, classe);
	}

}
