package com.ironhack.exercise1.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Association {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer associationId;

	@OneToMany(mappedBy = "association")
	List<Chapter> chapters;

	public Association() {
	}

	public Association(Integer associationId) {
		this.associationId = associationId;
	}

	public Integer getAssociationId() {
		return associationId;
	}

	public void setAssociationId(Integer associationId) {
		this.associationId = associationId;
	}
}
