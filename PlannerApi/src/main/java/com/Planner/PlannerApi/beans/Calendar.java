package com.Planner.PlannerApi.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CALENDAR")
public class Calendar {
	@Id
	@GeneratedValue
	@Column(name = "CALENDAR_ID")
	private Integer calendarId;

	public Calendar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calendar(Integer calendarId) {
		this.calendarId = calendarId;
	}

	public Integer getCalendarId() {
		return calendarId;
	}

	public void setCalendarId(Integer calendarId) {
		this.calendarId = calendarId;
	}

	@Override
	public String toString() {
		return "Calendar [calendarId=" + calendarId + "]";
	}

}
