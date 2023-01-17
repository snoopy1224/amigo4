package com.lec.amigo.vo;
// 23p 펫시터지원서.  일단 시터정보 모두 가져옴.
import java.beans.Transient;

public class SitterVO {     // SitterApplyVO  s-sit사진, m-회원명, s-성별, s-birth, m-연락처, 
							//  m-주소, s-흡연, s-현재일, s-가능일, s-시간대, s-반려경험, s-타인반려, s-자기소개
							//  s 는 펫시터,  m 은 회원(멤버)
	
		
	private int sit_no;
	private int user_no;
	private String sit_gender;
	private String sit_birth;
	private boolean sit_smoking;
	private String sit_job;
	private String sit_days;
	private String sit_time;
	private boolean sit_exp;
	private String sit_care_exp;
	private String sit_intro;
	private String sit_photo;
	private boolean sit_auth_is;
	public int getSit_no() {
		return sit_no;
	}
	public void setSit_no(int sit_no) {
		this.sit_no = sit_no;
	}
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public String getSit_gender() {
		return sit_gender;
	}
	public void setSit_gender(String sit_gender) {
		this.sit_gender = sit_gender;
	}
	public String getSit_birth() {
		return sit_birth;
	}
	public void setSit_birth(String sit_birth) {
		this.sit_birth = sit_birth;
	}
	public boolean isSit_smoking() {
		return sit_smoking;
	}
	public void setSit_smoking(boolean sit_smoking) {
		this.sit_smoking = sit_smoking;
	}
	public String getSit_job() {
		return sit_job;
	}
	public void setSit_job(String sit_job) {
		this.sit_job = sit_job;
	}
	public String getSit_days() {
		return sit_days;
	}
	public void setSit_days(String sit_days) {
		this.sit_days = sit_days;
	}
	public String getSit_time() {
		return sit_time;
	}
	public void setSit_time(String sit_time) {
		this.sit_time = sit_time;
	}
	public boolean isSit_exp() {
		return sit_exp;
	}
	public void setSit_exp(boolean sit_exp) {
		this.sit_exp = sit_exp;
	}
	public String getSit_care_exp() {
		return sit_care_exp;
	}
	public void setSit_care_exp(String sit_care_exp) {
		this.sit_care_exp = sit_care_exp;
	}
	public String getSit_intro() {
		return sit_intro;
	}
	public void setSit_intro(String sit_intro) {
		this.sit_intro = sit_intro;
	}
	public String getSit_photo() {
		return sit_photo;
	}
	public void setSit_photo(String sit_photo) {
		this.sit_photo = sit_photo;
	}
	public boolean isSit_auth_is() {
		return sit_auth_is;
	}
	public void setSit_auth_is(boolean sit_auth_is) {
		this.sit_auth_is = sit_auth_is;
	}
	
	@Override
	public String toString() {
		return "SitApplyVO [sit_no=" + sit_no + ", user_no=" + user_no + ", sit_gender=" + sit_gender + ", sit_birth="
				+ sit_birth + ", sit_smoking=" + sit_smoking + ", sit_job=" + sit_job + ", sit_days=" + sit_days
				+ ", sit_time=" + sit_time + ", sit_exp=" + sit_exp + ", sit_care_exp=" + sit_care_exp + ", sit_intro="
				+ sit_intro + ", sit_photo=" + sit_photo + ", sit_auth_is=" + sit_auth_is + "]";
	}

	
	
}
