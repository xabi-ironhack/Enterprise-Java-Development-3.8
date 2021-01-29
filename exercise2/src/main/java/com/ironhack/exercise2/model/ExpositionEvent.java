package com.ironhack.exercise2.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name = "event_id")
public class ExpositionEvent extends Event{

	public ExpositionEvent() {
	}

	public ExpositionEvent(Date date, Integer duration, String location, String title) {
		super(date, duration, location, title);
	}
}
