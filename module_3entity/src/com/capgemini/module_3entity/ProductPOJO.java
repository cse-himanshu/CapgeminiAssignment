package com.capgemini.module_3entity;

import java.util.Objects;

public class ProductPOJO {
	private Integer id;
	private String brand;
	private String name;
	private Double price;
	/**
	 * 
	 */
	public ProductPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param brand
	 * @param name
	 * @param price
	 */
	public ProductPOJO(Integer id, String brand, String name, Double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ProductPOJO [id=" + id + ", brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, id, name, price);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductPOJO other = (ProductPOJO) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price);
	}
}
