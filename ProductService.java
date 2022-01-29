package com.sheryians.major.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheryians.major.Repository.ProductRepository;
import com.sheryians.major.model.Category;
import com.sheryians.major.model.Product;
@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
	public void addProduct(Product product) {
		productRepository.save(product);
		
	}
	public void removeProductById(long id) {
		productRepository.deleteById(id);;
		
	}
	public Optional<Product> getProductById(long id){
		return productRepository.findById(id);
	}
	public List<Product> getAllProductsByCategoryId(int id){
		return productRepository.findAllByCategory_Id(id);
	}
}



