package com.sumita.productservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sumita.productservice.Dto.Coupon;
import com.sumita.productservice.Repo.ProductRepo;
import com.sumita.productservice.model.Product;

@RestController
@RequestMapping("/productapi")
public class ProductServiceController {
	
	@Autowired
	private ProductRepo repo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	  @Value("${CouponService.url}") private String couponServiceUrl;
	 
	
	@RequestMapping(value = "/products",method = RequestMethod.POST)
	public Product create(@RequestBody Product product)
	{
	Coupon coupon = restTemplate.getForObject(couponServiceUrl + product.getCouponCode(), Coupon.class);
	
	product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		return repo.save(product);
		
	}

}





