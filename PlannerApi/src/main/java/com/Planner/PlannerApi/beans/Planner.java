package com.Planner.PlannerApi.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PLANNER")
public class Planner {
	@Id
	@GeneratedValue
	@Column(name = "PLANNER_ID")
	private Integer plannerId;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CALENDAR_ID")
	private Calendar calendarId;

	public Planner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Planner(Integer plannerId, Calendar calendarId) {
		super();
		this.plannerId = plannerId;
		this.calendarId = calendarId;
	}

	public Integer getPlannerId() {
		return plannerId;
	}

	public void setPlannerId(Integer plannerId) {
		this.plannerId = plannerId;
	}

	public Calendar getCalendarId() {
		return calendarId;
	}

	public void setCalendarId(Calendar calendarId) {
		this.calendarId = calendarId;
	}

	@Override
	public String toString() {
		return "Planner [plannerId=" + plannerId + ", calendarId=" + calendarId + "]";
	}

}
