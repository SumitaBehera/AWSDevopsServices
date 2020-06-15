package com.sumita.couponservice.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sumita.couponservice.Repo.CouponRepo;
import com.sumita.couponservice.model.Coupon;

@RestController
@RequestMapping("/CouponApi")
public class CouponRestController {
	
	@Autowired
	CouponRepo repo;
	
	@RequestMapping(value = "/coupons",method = RequestMethod.POST)
	public Coupon create (@RequestBody Coupon coupon)
	{
		return repo.save(coupon);
		
	}
	
	@RequestMapping(value = "/coupons/{code}",method = RequestMethod.GET)
	public Coupon getCoupon(@PathVariable("code") String code)
	{
		return repo.findByCode(code);
	}
	

}