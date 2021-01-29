package com.ironhack.exercise2.model;
import javax.persistence.*;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer presentationDuration;

    @ManyToOne
    @JoinColumn(name = "conference_event_id")
    private ConferenceEvent conferenceEvent;

    public Speaker(String name, Integer presentationDuration) {
        this.name = name;
        this.presentationDuration = presentationDuration;
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

    public Integer getPresentationDuration() {
        return presentationDuration;
    }

    public ConferenceEvent getConferenceEvent() {
        return conferenceEvent;
    }

    public void setConferenceEvent(ConferenceEvent conferenceEvent) {
        this.conferenceEvent = conferenceEvent;
    }

    public void setPresentationDuration(Integer presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

}