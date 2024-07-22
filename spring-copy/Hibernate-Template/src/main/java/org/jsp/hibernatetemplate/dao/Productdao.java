package org.jsp.hibernatetemplate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.jsp.hibernatetemplate.dto.Product;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class Productdao {
	private HibernateTemplate template;
	
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Transactional
	public Product saveproduct(Product p) {
		template.save(p);
		return p;
	}
	
	@Transactional
	public Product updateproduct(Product p) {
		Product dp=template.get(Product.class, p.getId());
		if(dp!=null) {
			dp.setBrand(p.getBrand());
			dp.setCategory(p.getCategory());
			dp.setDescription(p.getDescription());
			dp.setName(p.getName());
			dp.setCost(p.getCost());
			template.update(dp);
			return dp;
		}
		return null;
	}
	
	@Transactional
	public Product FindById(int id) {
		return template.get(Product.class, id);
		
	}
	
	@Transactional
	public List<Product> FindALL(){
		return template.loadAll(Product.class);
		
	}
	
	@Transactional
	public boolean deleteproduct(int id) {
		Product p= FindById(id);
		if(p!=null) {
			template.delete(p);
			return true;
		}
		return false;
	}
}
