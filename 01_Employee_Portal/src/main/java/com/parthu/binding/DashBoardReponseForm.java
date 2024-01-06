package com.parthu.binding;

public class DashBoardReponseForm {
	private Integer totalEnquCunt;
	private Integer enrolledCunt;
	private Integer lostCunt;
	
	public Integer getTotalEnquCunt() {
		return totalEnquCunt;
	}
	public void setTotalEnquCunt(Integer totalEnquCunt) {
		this.totalEnquCunt = totalEnquCunt;
	}
	public Integer getEnrolledCunt() {
		return enrolledCunt;
	}
	public void setEnrolledCunt(Integer enrolledCunt) {
		this.enrolledCunt = enrolledCunt;
	}
	public Integer getLostCunt() {
		return lostCunt;
	}
	public void setLostCunt(Integer lostCunt) {
		this.lostCunt = lostCunt;
	}
	
	@Override
	public String toString() {
		return "DashBoardReponseForm [totalEnquCunt=" + totalEnquCunt + ", enrolledCunt=" + enrolledCunt + ", lostCunt="
				+ lostCunt + "]";
	}
	
	

}
