package com.project.onlinesystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long reviewid;
	public String username;
	public String userreview;
	public String productname;
	public String userid;
	public Long getReviewid() {
		return reviewid;
	}
	public void setReviewid(Long reviewid) {
		this.reviewid = reviewid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserreview() {
		return userreview;
	}
	public void setUserreview(String userreview) {
		this.userreview = userreview;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	public Review() {
		
	}
	
	public Review( String username, String userreview, String productname, String userid) {
		super();
		
		this.username = username;
		this.userreview = userreview;
		this.productname = productname;
		this.userid=userid;
	}
	@Override
	public String toString() {
		return "Review [reviewid=" + reviewid + ", username=" + username + ", userreview=" + userreview
				+ ", productname=" + productname + ", userid=" + userid + "]";
	}
	
	
	

}