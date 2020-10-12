package com.member.model;

import java.io.Serializable;
import java.sql.Date;


public class MemberVO implements Serializable {
	private String memberId;
	private String memberAccount;
	private String memberPassword;
	private String memberName;
	private String memberNickName;
	private String memberEmail;
	private byte[] memberPhoto;
	private String memberPhone;
	private String memberAddress;
	private Date memberBirth;
	private String memberSex;
	private String memberCountry;
	private Date memberSignupDate;
	private Integer memberAuth;
	private String memberStatus;

	public MemberVO(String memberId, String memberAccount, String memberPassword, String memberName,
			String memberNickName, String memberEmail, byte[] memberPhoto, String memberPhone, String memberAddress,
			Date memberBirth, String memberSex, String memberCountry, Date memberSignupDate, Integer memberAuth,
			String memberStatus) {
		
		this.memberId = memberId;
		this.memberAccount = memberAccount;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberNickName = memberNickName;
		this.memberEmail = memberEmail;
		this.memberPhoto = memberPhoto;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.memberBirth = memberBirth;
		this.memberSex = memberSex;
		this.memberCountry = memberCountry;
		this.memberSignupDate = memberSignupDate;
		this.memberAuth = memberAuth;
		this.memberStatus = memberStatus;
	}

	public MemberVO() {

	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberAccount() {
		return memberAccount;
	}

	public void setMemberAccount(String memberAccount) {
		this.memberAccount = memberAccount;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberNickName() {
		return memberNickName;
	}

	public void setMemberNickName(String memberNickName) {
		this.memberNickName = memberNickName;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public byte[] getMemberPhoto() {
		return memberPhoto;
	}

	public void setMemberPhoto(byte[] memberPhoto) {
		this.memberPhoto = memberPhoto;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public Date getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(Date memberBirth) {
		this.memberBirth = memberBirth;
	}

	public String getMemberSex() {
		return memberSex;
	}

	public void setMemberSex(String memberSex) {
		this.memberSex = memberSex;
	}

	public String getMemberCountry() {
		return memberCountry;
	}

	public void setMemberCountry(String memberCountry) {
		this.memberCountry = memberCountry;
	}

	public Date getMemberSignupDate() {
		return memberSignupDate;
	}

	public void setMemberSignupDate(Date memberSignupDate) {
		this.memberSignupDate = memberSignupDate;
	}

	public Integer getMemberAuth() {
		return memberAuth;
	}

	public void setMemberAuth(Integer memberAuth) {
		this.memberAuth = memberAuth;
	}

	public String getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}
}
