package com.example.prueba;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public List<Product> getAllProducts() {
		return (List<Product>) productRepository.findAll();
	}
	
	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable("id") String id) {
		return productRepository.findById(id).get();
	}

}
