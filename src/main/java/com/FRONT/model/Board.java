package com.FRONT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@ToString
public class Board {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=2, max=30, message = "제목은 2자이상 30자 이하입니다.")
	private String title;
	
	@Size(min=2, max=300, message = "제목은 2자이상 300자 이하입니다.")
	private String content;
	
	
	@Size(min=2, max=300, message = "제목은 2자이상 300자 이하입니다.")
	private String content1;
	@Size(min=2, max=300, message = "제목은 2자이상 300자 이하입니다.")
	private String content2;
	@Size(min=2, max=300, message = "제목은 2자이상 300자 이하입니다.")
	private String content3;
	@Size(min=2, max=300, message = "제목은 2자이상 300자 이하입니다.")
	private String content4;
	
	
	
	public String getContent1() {
		return content1;
	}
	public void setContent1(String content1) {
		this.content1 = content1;
	}
	public String getContent2() {
		return content2;
	}
	public void setContent2(String content2) {
		this.content2 = content2;
	}
	public String getContent3() {
		return content3;
	}
	public void setContent3(String content3) {
		this.content3 = content3;
	}
	public String getContent4() {
		return content4;
	}
	public void setContent4(String content4) {
		this.content4 = content4;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
		
}