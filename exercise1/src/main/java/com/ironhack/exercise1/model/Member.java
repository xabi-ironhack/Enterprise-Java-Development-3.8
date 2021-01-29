package com.ironhack.exercise1.model;

import com.ironhack.exercise1.enums.Status;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String chapterName;
	@Enumerated(EnumType.STRING)
	private Status status;
	private Date date;

	@OneToOne
	@JoinColumn(name = "presided_chapter_id")
	private Chapter presidedChapter;

	@ManyToOne
	@JoinColumn(name = "chapter_id")
	private Chapter chapter;

	public Member() {
	}

	public Member(String chapterName, Status status, Date date) {
		this.chapterName = chapterName;
		this.status = status;
		this.date = date;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public com.ironhack.exercise1.model.Chapter getChapter() {
		return chapter;
	}

	public void setChapter(com.ironhack.exercise1.model.Chapter chapter) {
		this.chapter = chapter;
	}
}
