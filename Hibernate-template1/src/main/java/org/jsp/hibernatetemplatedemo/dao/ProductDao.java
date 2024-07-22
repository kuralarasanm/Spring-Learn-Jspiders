package org.jsp.hibernatetemplatedemo.dao;

import java.util.List;


import org.jsp.hibernatetemplatedemp.dto.Product;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class ProductDao {
	private HibernateTemplate template;
	@Transactional
	public Product saveProduct(Product p) {
		template.save(p);
		return p;
	}
	@Transactional
	public Product updateProduct(Product p) {
		Product dp=template.get(Product.class,p.getId());
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
	public Product findbyId(int id) {
		return template.get(Product.class,id);
		
	}
	public List<Product>findAll(){
		return template.loadAll(Product.class);
	}
	@Transactional
	public boolean deleteproduct(int id) {
		Product p= findbyId(id);
	if(p!=null) {
		template.delete(p);	
		return true;
		}
	return false;
	}
	public HibernateTemplate getTemplate() {
		return template;
	}
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
}
