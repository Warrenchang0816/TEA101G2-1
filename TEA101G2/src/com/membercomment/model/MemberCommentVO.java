package com.membercomment.model;

import java.io.Serializable;
import java.sql.Date;

public class MemberCommentVO implements Serializable{
	private String memberCommentId;
	private String memberAId;
	private String memberBId;
	private String memberCommentContent;
	private Double memberCommentLevel;
	private Date memberCommentDate;
	
	public MemberCommentVO() {
		
	}

	public MemberCommentVO(String memberCommentId, String memberAId, String memberBId, String memberCommentContent,
			Double memberCommentLevel, Date memberCommentDate) {
		this.memberCommentId = memberCommentId;
		this.memberAId = memberAId;
		this.memberBId = memberBId;
		this.memberCommentContent = memberCommentContent;
		this.memberCommentLevel = memberCommentLevel;
		this.memberCommentDate = memberCommentDate;
	}

	public String getMemberCommentId() {
		return memberCommentId;
	}

	public void setMemberCommentId(String memberCommentId) {
		this.memberCommentId = memberCommentId;
	}

	public String getMemberAId() {
		return memberAId;
	}

	public void setMemberAId(String memberAId) {
		this.memberAId = memberAId;
	}

	public String getMemberBId() {
		return memberBId;
	}

	public void setMemberBId(String memberBId) {
		this.memberBId = memberBId;
	}

	public String getMemberCommentContent() {
		return memberCommentContent;
	}

	public void setMemberCommentContent(String memberCommentContent) {
		this.memberCommentContent = memberCommentContent;
	}

	public Double getMemberCommentLevel() {
		return memberCommentLevel;
	}

	public void setMemberCommentLevel(Double memberCommentLevel) {
		this.memberCommentLevel = memberCommentLevel;
	}

	public Date getMemberCommentDate() {
		return memberCommentDate;
	}

	public void setMemberCommentDate(Date memberCommentDate) {
		this.memberCommentDate = memberCommentDate;
	}
}
