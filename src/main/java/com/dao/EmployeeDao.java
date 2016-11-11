package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dto.Employee;

public class EmployeeDao extends HibernateDaoSupport {
	@Autowired
	private HibernateTemplate template;
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void registerEmployee(final Employee e){
		getHibernateTemplate().executeWithNativeSession(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
               return session.save(e);
            }
        });
		System.out.println("EmployeeObj Stored sucessfully..");
	}
	public Employee getEmployeeById(int id){
		return null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Employee getEmployeeByName(final String name){
		Employee emp=(Employee)getHibernateTemplate().executeWithNativeSession(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
            	Query query=session.getNamedQuery("finduserbyname");
            	query.setParameter("nm", name);
            	List<Employee> el=query.list();
               return el.iterator().next();
            }
        });
		return emp;
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Employee> getEmployeeByDept(final String dept){
		List<Employee> el=(List<Employee>)getHibernateTemplate().executeWithNativeSession(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
            	Query query=session.getNamedQuery("finduserbydept");
            	query.setParameter("dt", dept);
            	List<Employee> el=query.list();
               return el;
            }
        });
		return el;
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Employee> getEmployeeByType(final String  type){
		List<Employee> el=(List<Employee>)getHibernateTemplate().executeWithNativeSession(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
            	Query query=session.getNamedQuery("finduserbytype");
            	query.setParameter("tp", type);
            	List<Employee> el=query.list();
               return el;
            }
        });
		return el;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void updateEmployee(final Employee e){
		getHibernateTemplate().executeWithNativeSession(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
            	Employee emp=(Employee) session.get(Employee.class, e.getId());
            	System.out.println("Emp object Fetchedfrom DB");
            	emp.setDept(e.getDept());
            	emp.setEmpType(e.getEmpType());
            	emp.setAddress(e.getAddress());
            	emp.setIsActive(e.getIsActive());
            	emp.setJoinDate(e.getJoinDate());
            	emp.setName(e.getName());
            	emp.setReleveDate(e.getReleveDate());
            	emp.setSal(e.getSal());
            	System.out.println("Employee is going to update");
               return session.save(emp);
            }
        });
		System.out.println("Employee "+e.getName()+" updated sucessfully..");
	}
	public void deleteEmployee(Employee e){}

}
