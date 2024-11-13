package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class MstGoods {
	
	private int id;
	
	private String goodsName;
	
	private int price;
	
	private Timestamp createdAt;
	
	private Timestamp updatedAd;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Timestamp getCreateAd() {
		return createdAt;
	}
	public void setCreatedAd(Timestamp createdAd) {
		this.createdAt = createdAd;
	}
	
	public Timestamp getUpdatedAd() {
		return updatedAd;
	}
	public void getUpdatedAd(Timestamp updatedAd) {
		this.updatedAd = updatedAd;
	}
	

}
