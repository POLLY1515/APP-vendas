package io.github.polly1515.vendasapi.rest.produtos;

import java.math.BigDecimal;

public class ProdutoFormRequest {
	
	private String description;
	private String name;
	private  BigDecimal price;
	private String sku;
	
	
	
	
	public ProdutoFormRequest() {
		
	}


	public ProdutoFormRequest(String description, String name, BigDecimal price, String sku) {
		super();
		this.description = description;
		this.name = name;
		this.price = price;
		this.sku = sku;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public String getSku() {
		return sku;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}


	@Override
	public String toString() {
		return "ProdutoFormRequest [description=" + description + ", name=" + name + ", price=" + price + ", sku=" + sku
				+ "]";
	}

	
	
	
}
