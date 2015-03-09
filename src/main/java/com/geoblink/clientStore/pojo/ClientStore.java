package com.geoblink.clientStore.pojo;

import java.math.BigDecimal;

import com.vividsolutions.jts.geom.Point;

public class ClientStore {
	
	private Integer idStore;
	private String name;
	private String telephone;
	private BigDecimal sales;
	private String city;
	private Integer idBrand;
	private Integer idCompany;
	private Point latitude;
	private Point longitude;
	
	public Integer getIdStore() {
		return idStore;
	}
	public void setIdStore(Integer idStore) {
		this.idStore = idStore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public BigDecimal getSales() {
		return sales;
	}
	public void setSales(BigDecimal sales) {
		this.sales = sales;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getIdBrand() {
		return idBrand;
	}
	public void setIdBrand(Integer idBrand) {
		this.idBrand = idBrand;
	}
	public Integer getIdCompany() {
		return idCompany;
	}
	public void setIdCompany(Integer idCompany) {
		this.idCompany = idCompany;
	}
	public Point getLatitude() {
		return latitude;
	}
	public void setLatitude(Point latitude) {
		this.latitude = latitude;
	}
	public Point getLongitude() {
		return longitude;
	}
	public void setLongitude(Point longitude) {
		this.longitude = longitude;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idStore == null) ? 0 : idStore.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientStore other = (ClientStore) obj;
		if (idStore == null) {
			if (other.idStore != null)
				return false;
		} else if (!idStore.equals(other.idStore))
			return false;
		return true;
	}
	
	

}
