package com.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class ConnectionUtils {
	
	@Autowired
	static HibernateTemplate hibernateTemplate;
	public static final void setHibernateTemplate(
			HibernateTemplate hibernateTemplate) {
		ConnectionUtils.hibernateTemplate = hibernateTemplate;
	}


	public static HibernateTemplate getHibernateTemplateForApp(){
		
		return hibernateTemplate;
	}

}
