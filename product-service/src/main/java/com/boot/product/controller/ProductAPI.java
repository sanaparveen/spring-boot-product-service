/**
 * 
 */
package com.boot.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sana parveen
 *
 */
public interface ProductAPI {

	@RequestMapping("/")
	public String home();
}
