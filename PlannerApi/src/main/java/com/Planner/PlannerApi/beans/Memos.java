package com.Planner.PlannerApi.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MEMOS")
public class Memos {
	@Id
	@GeneratedValue
	@Column(name = "MEMO_ID")
	private Integer memoId;
	@Column(name = "MEMO")
	private String memo;
	@ManyToOne
	@JoinColumn(name = "PATIENT_ID")
	private Patient patient;

	public Memos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Memos(Integer memoId, String memo) {
		// super();
		this.memoId = memoId;
		this.memo = memo;
	}

	public Integer getMemoId() {
		return memoId;
	}

	public void setMemoId(Integer memoId) {
		this.memoId = memoId;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {
		return "Memos [memoId=" + memoId + ", memo=" + memo + "]";
	}

}
