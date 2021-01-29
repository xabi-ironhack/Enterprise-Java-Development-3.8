package com.ironhack.exercise2.model;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "event_id")
public class ConferenceEvent extends Event{

	@OneToMany(mappedBy = "conferenceEvent")
	private List<Speaker> speakers;

	public ConferenceEvent() {
	}

	public ConferenceEvent(Date date, Integer duration, String location, String title) {
		super(date, duration, location, title);
	}


	public List<Speaker> getSpeakers() {
		return speakers;
	}

	public void setSpeakers(List<Speaker> speakers) {
		this.speakers = speakers;
	}
}
