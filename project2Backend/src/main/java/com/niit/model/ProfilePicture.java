package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="s180396_profilepicture")
@SequenceGenerator(name="profilepictureidseq",sequenceName="profilepictureidseq")

public class ProfilePicture {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="profilepictureidseq")

	private String loginname;
	private byte[] image;
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
}