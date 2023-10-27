package com.daizzyinfo.chipnavigation_demo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LawyersDetailsModel {


    @SerializedName("staff_id")
    @Expose
    private Integer staffId;
    @SerializedName("suid")
    @Expose
    private String suid;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getSuid() {
        return suid;
    }

    public void setSuid(String suid) {
        this.suid = suid;
    }





    @SerializedName("about_staff")
    @Expose
    private String aboutStaff;

    public String getAboutStaff() {
        return aboutStaff;
    }

    public void setAboutStaff(String aboutStaff) {
        this.aboutStaff = aboutStaff;
    }






    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("ls_uid")
    @Expose
    private String lsUid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("fathername")
    @Expose
    private Object fathername;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("mobile")
    @Expose
    private String mobile;
    @SerializedName("whatsapp_no")
    @Expose
    private String whatsappNo;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("dob")
    @Expose
    private String dob;
    @SerializedName("age")
    @Expose
    private String age;
    @SerializedName("role_id")
    @Expose
    private Integer roleId;
    @SerializedName("isVerified")
    @Expose
    private Integer isVerified;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("aadhaar_no")
    @Expose
    private String aadhaarNo;
    @SerializedName("pancard_no")
    @Expose
    private String pancardNo;
    @SerializedName("license_no")
    @Expose
    private String licenseNo;
    @SerializedName("account_no")
    @Expose
    private Object accountNo;
    @SerializedName("ifsc_code")
    @Expose
    private Object ifscCode;
    @SerializedName("profile")
    @Expose
    private String profile;
    @SerializedName("aadhar_card_photo")
    @Expose
    private String aadharCardPhoto;
    @SerializedName("pan_card_photo")
    @Expose
    private String panCardPhoto;
    @SerializedName("email_verified_at")
    @Expose
    private Object emailVerifiedAt;
    @SerializedName("practice_areas")
    @Expose
    private String practiceAreas;
    @SerializedName("about_lawyer")
    @Expose
    private String aboutLawyer;
    @SerializedName("bar_council_reg_date")
    @Expose
    private String barCouncilRegDate;
    @SerializedName("bar_council_license")
    @Expose
    private String barCouncilLicense;
    @SerializedName("bar_council_docs")
    @Expose
    private String barCouncilDocs;
    @SerializedName("state_id")
    @Expose
    private String stateId;
    @SerializedName("city_id")
    @Expose
    private String cityId;
    @SerializedName("category_id")
    @Expose
    private Integer categoryId;
    @SerializedName("department")
    @Expose
    private String department;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("office_address")
    @Expose
    private String officeAddress;
    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("experience")
    @Expose
    private String experience;
    @SerializedName("languages")
    @Expose
    private String languages;
    @SerializedName("court")
    @Expose
    private String court;
    @SerializedName("fee")
    @Expose
    private String fee;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("last_seen")
    @Expose
    private String lastSeen;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("remember_token")
    @Expose
    private Object rememberToken;
    @SerializedName("device_token")
    @Expose
    private Object deviceToken;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("state_name")
    @Expose
    private String stateName;
    @SerializedName("city_name")
    @Expose
    private String cityName;
    @SerializedName("category_name")
    @Expose
    private String categoryName;
    @SerializedName("rating")
    @Expose
    private Object rating;
    @SerializedName("review")
    @Expose
    private Object review;
    @SerializedName("department_name")
    @Expose
    private String departmentName;
    @SerializedName("designation_name")
    @Expose
    private String designationName;
    @SerializedName("court_name")
    @Expose
    private String courtName;
    @SerializedName("tax")
    @Expose
    private Integer tax;
    @SerializedName("portal_charge")
    @Expose
    private Integer portalCharge;
    @SerializedName("days")
    @Expose
    private List<DayModel> days;
    @SerializedName("timeslot")
    @Expose
    private List<TimeslotModel> timeslot;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLsUid() {
        return lsUid;
    }

    public void setLsUid(String lsUid) {
        this.lsUid = lsUid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getFathername() {
        return fathername;
    }

    public void setFathername(Object fathername) {
        this.fathername = fathername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWhatsappNo() {
        return whatsappNo;
    }

    public void setWhatsappNo(String whatsappNo) {
        this.whatsappNo = whatsappNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Integer isVerified) {
        this.isVerified = isVerified;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(String aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public String getPancardNo() {
        return pancardNo;
    }

    public void setPancardNo(String pancardNo) {
        this.pancardNo = pancardNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public Object getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Object accountNo) {
        this.accountNo = accountNo;
    }

    public Object getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(Object ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getAadharCardPhoto() {
        return aadharCardPhoto;
    }

    public void setAadharCardPhoto(String aadharCardPhoto) {
        this.aadharCardPhoto = aadharCardPhoto;
    }

    public String getPanCardPhoto() {
        return panCardPhoto;
    }

    public void setPanCardPhoto(String panCardPhoto) {
        this.panCardPhoto = panCardPhoto;
    }

    public Object getEmailVerifiedAt() {
        return emailVerifiedAt;
    }

    public void setEmailVerifiedAt(Object emailVerifiedAt) {
        this.emailVerifiedAt = emailVerifiedAt;
    }

    public String getPracticeAreas() {
        return practiceAreas;
    }

    public void setPracticeAreas(String practiceAreas) {
        this.practiceAreas = practiceAreas;
    }

    public String getAboutLawyer() {
        return aboutLawyer;
    }

    public void setAboutLawyer(String aboutLawyer) {
        this.aboutLawyer = aboutLawyer;
    }

    public String getBarCouncilRegDate() {
        return barCouncilRegDate;
    }

    public void setBarCouncilRegDate(String barCouncilRegDate) {
        this.barCouncilRegDate = barCouncilRegDate;
    }

    public String getBarCouncilLicense() {
        return barCouncilLicense;
    }

    public void setBarCouncilLicense(String barCouncilLicense) {
        this.barCouncilLicense = barCouncilLicense;
    }

    public String getBarCouncilDocs() {
        return barCouncilDocs;
    }

    public void setBarCouncilDocs(String barCouncilDocs) {
        this.barCouncilDocs = barCouncilDocs;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(Object rememberToken) {
        this.rememberToken = rememberToken;
    }

    public Object getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(Object deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    public Object getReview() {
        return review;
    }

    public void setReview(Object review) {
        this.review = review;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDesignationName() {
        return designationName;
    }

    public void setDesignationName(String designationName) {
        this.designationName = designationName;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public Integer getPortalCharge() {
        return portalCharge;
    }

    public void setPortalCharge(Integer portalCharge) {
        this.portalCharge = portalCharge;
    }

    public List<DayModel> getDays() {
        return days;
    }

    public void setDays(List<DayModel> days) {
        this.days = days;
    }

    public List<TimeslotModel> getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(List<TimeslotModel> timeslot){
        this.timeslot = timeslot;
    }








    }













