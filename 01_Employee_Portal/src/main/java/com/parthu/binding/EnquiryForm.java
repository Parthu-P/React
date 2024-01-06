package com.parthu.binding;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class EnquiryForm {
//	@Id
//	@GeneratedValue
//	private Integer enquiryId;
	private String studentName;
	private Long phNo;
	private String classMode;
	private String courseName;
	private String enquiryStatus;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getPhNo() {
		return phNo;
	}
	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}
	public String getClassMode() {
		return classMode;
	}
	public void setClassMode(String classMode) {
		this.classMode = classMode;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getEnquiryStatus() {
		return enquiryStatus;
	}
	public void setEnquiryStatus(String enquiryStatus) {
		this.enquiryStatus = enquiryStatus;
	}
	
	@Override
	public String toString() {
		return "EnquiryForm [studentName=" + studentName + ", phNo=" + phNo + ", classMode=" + classMode
				+ ", courseName=" + courseName + ", enquiryStatus=" + enquiryStatus + "]";
	}
	
	
}
