package com.sabre.springproject.category;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		List<Category> categorys=new ArrayList<>();
		categoryRepository.findAll()
		.forEach(categorys::add);
		return categorys;
	}
	
	public Category getCategory(String id) {
		return categoryRepository.findOne(id);
	}
	
	public void addCategory(Category category) {
		categoryRepository.save(category);
		
	}

	public void updateCategory(String id, Category category) {
		// TODO Auto-generated method stub
		categoryRepository.save(category);
	}

	public void deleteCategory(String id) {
		// TODO Auto-generated method stub
		categoryRepository.delete(id);
	}

	

}
