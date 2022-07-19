package com.avantika.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "ManPowerResource")
public class ManPowerResource {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="myGenerator")
	@Column
private int mId;
	@Column
private String mName;
	@Column
private Date mDob;
	
	@Column
private String mAddress;
	public ManPowerResource(String mName, Date mDob, String mAddress, long mAadhaarNo, String mSection,
			double mSalary) {
		this.mName = mName;
		this.mDob = mDob;
		this.mAddress = mAddress;
		this.mAadhaarNo = mAadhaarNo;
		this.mSection = mSection;
		this.mSalary = mSalary;
	}
	@Column
private long mAadhaarNo;
	@Column
private String mSection;
	@Column
private double mSalary;
public ManPowerResource(int mId, String mName, Date mDob, String mAddress, long mAadhaarNo, String mSection,
		double mSalary) {
	super();
	this.mId = mId;
	this.mName = mName;
	this.mDob = mDob;
	this.mAddress = mAddress;
	this.mAadhaarNo = mAadhaarNo;
	this.mSection = mSection;
	this.mSalary = mSalary;
}

public int getmId() {
	return mId;
}
public void setmId(int mId) {
	this.mId = mId;
}
public String getmName() {
	return mName;
}
public void setmName(String mName) {
	this.mName = mName;
}
public Date getmDob() {
	return mDob;
}
public void setmDob(Date mDob) {
	this.mDob = mDob;
}
public String getmAddress() {
	return mAddress;
}
public void setmAddress(String mAddress) {
	this.mAddress = mAddress;
}
public long getmAadhaarNo() {
	return mAadhaarNo;
}
public void setmAadhaarNo(long mAadhaarNo) {
	this.mAadhaarNo = mAadhaarNo;
}
public String getmSection() {
	return mSection;
}
public void setmSection(String mSection) {
	this.mSection = mSection;
}
public double getmSalary() {
	return mSalary;
}
public void setmSalary(double mSalary) {
	this.mSalary = mSalary;
}

@Override
public String toString() {
	return "ManPowerResource [mId=" + mId + ", mName=" + mName + ", mDob=" + mDob + ", mAddress=" + mAddress
			+ ", mAadhaarNo=" + mAadhaarNo + ", mSection=" + mSection + ", mSalary=" + mSalary + "]";
}
public ManPowerResource() {
	super();
}


}
