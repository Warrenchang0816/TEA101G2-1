package com.memberfavorite.model;

import java.io.Serializable;

public class MemberFavoriteVO implements Serializable {
	private String memberFavoriteId;
	private String memberId;
	private String spaceId;
	
	public MemberFavoriteVO() {

	}

	public MemberFavoriteVO(String memberFavoriteId, String memberId, String spaceId) {
		this.memberFavoriteId = memberFavoriteId;
		this.memberId = memberId;
		this.spaceId = spaceId;
	}

	public String getMemberFavoriteId() {
		return memberFavoriteId;
	}

	public void setMemberFavoriteId(String memberFavoriteId) {
		this.memberFavoriteId = memberFavoriteId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getSpaceId() {
		return spaceId;
	}

	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}
}
