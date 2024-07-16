package APIs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserProfileData {

    @JsonProperty("UserName")
    private String UserName;

    @JsonProperty("Email")
    private String Email;

    @JsonProperty("FirstName")
    private String FirstName;

    @JsonProperty("FirstNameAr")
    private String FirstNameAr;

    @JsonProperty("FirstNameEn")
    private String FirstNameEn;

    @JsonProperty("LastName")
    private String LastName;

    @JsonProperty("LastNameAr")
    private String LastNameAr;

    @JsonProperty("LastNameEn")
    private String LastNameEn;

    @JsonProperty("MobileNumber")
    private String MobileNumber;

    @JsonProperty("PhoneKeyId")
    private String PhoneKeyId;

    @JsonProperty("PhoneKey")
    private String PhoneKey;

    @JsonProperty("NationalID")
    private String NationalID;

    @JsonProperty("ResidenceCountryId")
    private String ResidenceCountryId;

    @JsonProperty("FullName")
    private String FullName;

    @JsonProperty("MiddleName")
    private String MiddleName;

    @JsonProperty("MiddleNameAr")
    private String MiddleNameAr;

    @JsonProperty("MiddleNameEn")
    private String MiddleNameEn;

    @JsonProperty("CityId")
    private String CityId;

    @JsonProperty("BuildingNo")
    private String BuildingNo;

    @JsonProperty("Street")
    private String Street;

    @JsonProperty("District")
    private String District;

    @JsonProperty("ProfilePhotoId")
    private String ProfilePhotoId;

    @JsonProperty("ProfilePhoto")
    private UserProfilePhoto ProfilePhoto;

    @JsonProperty("Occupation")
    private String Occupation;

    @JsonProperty("EducationLevelId")
    private String EducationLevelId;

    @JsonProperty("Latitude")
    private String Latitude;

    @JsonProperty("Longitude")
    private String Longitude;

    @JsonProperty("EducationLevelName")
    private String EducationLevelName;

    @JsonProperty("CityName")
    private String CityName;

    @JsonProperty("ResidenceCountryName")
    private String ResidenceCountryName;

    @JsonProperty("UserClassificationName")
    private String UserClassificationName;

    @JsonProperty("UserClassificationId")
    private String UserClassificationId;

    @JsonProperty("CreatedDate")
    private String CreatedDate;

    @JsonProperty("Gender")
    private String Gender;

    @JsonProperty("IsChooseCityOther")
    private String IsChooseCityOther;

    @JsonProperty("CityOther")
    private String CityOther;

    @JsonProperty("UserType")
    private String UserType;

    @JsonProperty("EntityName")
    private String EntityName;

    @JsonProperty("EntityNameAr")
    private String EntityNameAr;

    @JsonProperty("EntityNameEn")
    private String EntityNameEn;

    @JsonProperty("JobTitle")
    private String JobTitle;

    @JsonProperty("NationalityId")
    private String NationalityId;

    @JsonProperty("Nationality")
    private String Nationality;

    @JsonProperty("DelegationLetterId")
    private String DelegationLetterId;

    @JsonProperty("DelegationLetter")
    private String DelegationLetter;

    @JsonProperty("EntityTypeId")
    private String EntityTypeId;

    @JsonProperty("EntityType")
    private String EntityType;

    @JsonProperty("BeneficiaryUserType")
    private String BeneficiaryUserType;

    @JsonProperty("Id")
    private String Id;

    @JsonProperty("RowVersion")
    private String RowVersion;

    @JsonProperty("UniqueId")
    private String UniqueId;

    @JsonProperty("IsActive")
    private String IsActive;



    public String getUserName() {
        return this.UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getFirstNameAr() {
        return this.FirstNameAr;
    }

    public void setFirstNameAr(String firstNameAr) {
        this.FirstNameAr = firstNameAr;
    }

    public String getFirstNameEn() {
        return this.FirstNameEn;
    }

    public void setFirstNameEn(String firstNameEn) {
        this.FirstNameEn = firstNameEn;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getLastNameAr() {
        return this.LastNameAr;
    }

    public void setLastNameAr(String lastNameAr) {
        this.LastNameAr = lastNameAr;
    }

    public String getLastNameEn() {
        return this.LastNameEn;
    }

    public void setLastNameEn(String lastNameEn) {
        this.LastNameEn = lastNameEn;
    }

    public String getMobileNumber() {
        return this.MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.MobileNumber = mobileNumber;
    }

    public String getPhoneKeyId() {
        return this.PhoneKeyId;
    }

    public void setPhoneKeyId(String phoneKeyId) {
        this.PhoneKeyId = phoneKeyId;
    }

    public String getPhoneKey() {
        return this.PhoneKey;
    }

    public void setPhoneKey(String phoneKey) {
        this.PhoneKey = phoneKey;
    }

    public String getNationalID() {
        return this.NationalID;
    }

    public void setNationalID(String nationalID) {
        this.NationalID = nationalID;
    }

    public String getResidenceCountryId() {
        return this.ResidenceCountryId;
    }

    public void setResidenceCountryId(String residenceCountryId) {
        this.ResidenceCountryId = residenceCountryId;
    }

    public String getFullName() {
        return this.FullName;
    }

    public void setFullName(String fullName) {
        this.FullName = fullName;
    }

    public String getMiddleName() {
        return this.MiddleName;
    }

    public void setMiddleName(String middleName) {
        this.MiddleName = middleName;
    }

    public String getMiddleNameAr() {
        return this.MiddleNameAr;
    }

    public void setMiddleNameAr(String middleNameAr) {
        this.MiddleNameAr = middleNameAr;
    }

    public String getMiddleNameEn() {
        return this.MiddleNameEn;
    }

    public void setMiddleNameEn(String middleNameEn) {
        this.MiddleNameEn = middleNameEn;
    }

    public String getCityId() {
        return this.CityId;
    }

    public void setCityId(String cityId) {
        this.CityId = cityId;
    }

    public String getBuildingNo() {
        return this.BuildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.BuildingNo = buildingNo;
    }

    public String getStreet() {
        return this.Street;
    }

    public void setStreet(String street) {
        this.Street = street;
    }

    public String getDistrict() {
        return this.District;
    }

    public void setDistrict(String district) {
        this.District = district;
    }

    public String getProfilePhotoId() {
        return this.ProfilePhotoId;
    }

    public void setProfilePhotoId(String profilePhotoId) {
        this.ProfilePhotoId = profilePhotoId;
    }

    public UserProfilePhoto getProfilePhoto() {
        return this.ProfilePhoto;
    }

    public void setProfilePhoto(UserProfilePhoto profilePhoto) {
        this.ProfilePhoto = profilePhoto;
    }

    public String getOccupation() {
        return this.Occupation;
    }

    public void setOccupation(String occupation) {
        this.Occupation = occupation;
    }

    public String getEducationLevelId() {
        return this.EducationLevelId;
    }

    public void setEducationLevelId(String educationLevelId) {
        this.EducationLevelId = educationLevelId;
    }

    public String getLatitude() {
        return this.Latitude;
    }

    public void setLatitude(String latitude) {
        this.Latitude = latitude;
    }

    public String getLongitude() {
        return this.Longitude;
    }

    public void setLongitude(String longitude) {
        this.Longitude = longitude;
    }

    public String getEducationLevelName() {
        return this.EducationLevelName;
    }

    public void setEducationLevelName(String educationLevelName) {
        this.EducationLevelName = educationLevelName;
    }

    public String getCityName() {
        return this.CityName;
    }

    public void setCityName(String cityName) {
        this.CityName = cityName;
    }

    public String getResidenceCountryName() {
        return this.ResidenceCountryName;
    }

    public void setResidenceCountryName(String residenceCountryName) {
        this.ResidenceCountryName = residenceCountryName;
    }

    public String getUserClassificationName() {
        return this.UserClassificationName;
    }

    public void setUserClassificationName(String userClassificationName) {
        this.UserClassificationName = userClassificationName;
    }

    public String getUserClassificationId() {
        return this.UserClassificationId;
    }

    public void setUserClassificationId(String userClassificationId) {
        this.UserClassificationId = userClassificationId;
    }

    public String getCreatedDate() {
        return this.CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
        this.CreatedDate = createdDate;
    }

    public String getGender() {
        return this.Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public String getIsChooseCityOther() {
        return this.IsChooseCityOther;
    }

    public void setIsChooseCityOther(String isChooseCityOther) {
        this.IsChooseCityOther = isChooseCityOther;
    }

    public String getCityOther() {
        return this.CityOther;
    }

    public void setCityOther(String cityOther) {
        this.CityOther = cityOther;
    }

    public String getUserType() {
        return this.UserType;
    }

    public void setUserType(String userType) {
        this.UserType = userType;
    }

    public String getEntityName() {
        return this.EntityName;
    }

    public void setEntityName(String entityName) {
        this.EntityName = entityName;
    }

    public String getEntityNameAr() {
        return this.EntityNameAr;
    }

    public void setEntityNameAr(String entityNameAr) {
        this.EntityNameAr = entityNameAr;
    }

    public String getEntityNameEn() {
        return this.EntityNameEn;
    }

    public void setEntityNameEn(String entityNameEn) {
        this.EntityNameEn = entityNameEn;
    }

    public String getJobTitle() {
        return this.JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.JobTitle = jobTitle;
    }

    public String getNationalityId() {
        return this.NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.NationalityId = nationalityId;
    }

    public String getNationality() {
        return this.Nationality;
    }

    public void setNationality(String nationality) {
        this.Nationality = nationality;
    }

    public String getDelegationLetterId() {
        return this.DelegationLetterId;
    }

    public void setDelegationLetterId(String delegationLetterId) {
        this.DelegationLetterId = delegationLetterId;
    }

    public String getDelegationLetter() {
        return this.DelegationLetter;
    }

    public void setDelegationLetter(String delegationLetter) {
        this.DelegationLetter = delegationLetter;
    }

    public String getEntityTypeId() {
        return this.EntityTypeId;
    }

    public void setEntityTypeId(String entityTypeId) {
        this.EntityTypeId = entityTypeId;
    }

    public String getEntityType() {
        return this.EntityType;
    }

    public void setEntityType(String entityType) {
        this.EntityType = entityType;
    }

    public String getBeneficiaryUserType() {
        return this.BeneficiaryUserType;
    }

    public void setBeneficiaryUserType(String beneficiaryUserType) {
        this.BeneficiaryUserType = beneficiaryUserType;
    }

    public String getId() {
        return this.Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getRowVersion() {
        return this.RowVersion;
    }

    public void setRowVersion(String rowVersion) {
        this.RowVersion = rowVersion;
    }

    public String getUniqueId() {
        return this.UniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.UniqueId = uniqueId;
    }

    public String getIsActive() {
        return this.IsActive;
    }

    public void setIsActive(String isActive) {
        this.IsActive = isActive;
    }

}