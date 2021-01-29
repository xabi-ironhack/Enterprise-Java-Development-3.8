package com.ironhack.exercise1.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Chapter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String chapterName;
	private String district;

	@OneToOne(mappedBy = "presidedChapter")
	@JoinColumn
	private Member president;

	@OneToMany(mappedBy = "chapter")
	private List<Member> members;

	@ManyToOne
	@JoinColumn(name = "association_id")
	private Association association;

	public Chapter() {
	}

	public Chapter(String chapterName, String district) {
		this.chapterName = chapterName;
		this.district = district;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Member getPresident() {
		return president;
	}

	public void setPresident(Member president) {
		this.president = president;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public com.ironhack.exercise1.model.Association getAssociation() {
		return association;
	}

	public void setAssociation(com.ironhack.exercise1.model.Association association) {
		this.association = association;
	}
}
