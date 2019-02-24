/**
 * 
 */
package com.boot.product.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author sana parveen
 *
 */
@RestController
public class ProductController implements ProductAPI {

	@Override
	public String home() {
		return "Welcome to our product service";
	}

	
}
