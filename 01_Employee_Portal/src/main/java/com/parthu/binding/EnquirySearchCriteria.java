package com.parthu.binding;

public class EnquirySearchCriteria {
	private String classMode;
	private String courseName;
	private String enquiryStatus;
	
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
		return "EnquirySearchCriteria [classMode=" + classMode + ", courseName=" + courseName + ", enquiryStatus="
				+ enquiryStatus + "]";
	}
	
	
}
