package com.ironhack.exercise2.model;

import com.ironhack.exercise2.enums.Status;

import javax.persistence.*;
import java.util.List;

@Entity
public class Guest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	@Enumerated(EnumType.STRING)
	private Status status;
	@ManyToOne
	private Event event;

	public Guest() {
	}

	public Guest(String name, Status status, Event event) {
		this.name = name;
		this.status = status;
		this.event = event;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
}
