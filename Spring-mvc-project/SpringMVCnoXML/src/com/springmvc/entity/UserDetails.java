package com.springmvc.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "channel_name")
	private String channelName;
	
	@Column(name = "total_sub")
	private int totalSub;
	
	@Column(name = "discription")
	private String discription;
	
	@OneToOne(mappedBy = "userDetails", cascade = CascadeType.ALL)
	private User user;
	
	
	public UserDetails() {
		
	}
	
	

	public UserDetails(int id, String channelName, int totalSub, String discription) {
		this.channelName = channelName;
		this.totalSub = totalSub;
		this.discription = discription;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public int getTotalSub() {
		return totalSub;
	}

	public void setTotalSub(int totalSub) {
		this.totalSub = totalSub;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", channelName=" + channelName + ", totalSub=" + totalSub + ", discription="
				+ discription + ", user=" + user + "]";
	}
	
	
}
