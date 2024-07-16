package APIs;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BeneficiaryRegs {

        @JsonProperty("UserName")
        private String userName;

        @JsonProperty("Email")
        private String email;

        @JsonProperty("FirstNameAr")
        private String firstNameAr;

        @JsonProperty("FirstNameEn")
        private String firstNameEn;

        @JsonProperty("LastNameAr")
        private String lastNameAr;

        @JsonProperty("LastNameEn")
        private String lastNameEn;

        @JsonProperty("MobileNumber")
        private String mobileNumber;

        @JsonProperty("PhoneKeyId")
        private int phoneKeyId;

        @JsonProperty("NationalID")
        private String nationalID;

        @JsonProperty("Gender")
        private String gender;

        @JsonProperty("ResidenceCountryId")
        private int residenceCountryId;

        @JsonProperty("CityId")
        private int cityId;

        @JsonProperty("BuildingNo")
        private String buildingNo;

        @JsonProperty("Street")
        private String street;

        @JsonProperty("District")
        private String district;

        @JsonProperty("Occupation")
        private String occupation;

        @JsonProperty("EducationLevelId")
        private int educationLevelId;

        @JsonProperty("Password")
        private String password;

        @JsonProperty("UserClassificationId")
        private int userClassificationId;

        @JsonProperty("MiddleNameAr")
        private String middleNameAr;

        @JsonProperty("MiddleNameEn")
        private String middleNameEn;

        public String getUserName() {
            return this.userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getEmail() {
            return this.email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


        public String getFirstNameAr() {
            return this.firstNameAr;
        }

        public void setFirstNameAr(String firstNameAr) {
            this.firstNameAr = firstNameAr;
        }

        public String getFirstNameEn() {
            return this.firstNameEn;
        }

        public void setFirstNameEn(String firstNameEn) {
            this.firstNameEn = firstNameEn;
        }

        public String getLastNameAr() {
            return this.lastNameAr;
        }

        public void setLastNameAr(String lastNameAr) {
            this.lastNameAr = lastNameAr;
        }

        public String getLastNameEn() {
            return this.lastNameEn;
        }

        public void setLastNameEn(String lastNameEn) {
            this.lastNameEn = lastNameEn;
        }

        public String getMobileNumber() {
            return this.mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public int getPhoneKeyId() {
            return this.phoneKeyId;
        }

        public void setPhoneKeyId(int phoneKeyId) {
            this.phoneKeyId = phoneKeyId;
        }

        public String getNationalID() {
            return this.nationalID;
        }

        public void setNationalID(String nationalID) {
            this.nationalID = nationalID;
        }

        public String getGender() {
            return this.gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getResidenceCountryId() {
            return this.residenceCountryId;
        }

        public void setResidenceCountryId(int residenceCountryId) {
            this.residenceCountryId = residenceCountryId;
        }

        public int getCityId() {
            return this.cityId;
        }

        public void setCityId(int cityId) {
            this.cityId = cityId;
        }

        public String getBuildingNo() {
            return this.buildingNo;
        }

        public void setBuildingNo(String buildingNo) {
            this.buildingNo = buildingNo;
        }

        public String getStreet() {
            return this.street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getDistrict() {
            return this.district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }


        public String getOccupation() {
            return this.occupation;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }

        public int getEducationLevelId() {
            return this.educationLevelId;
        }

        public void setEducationLevelId(int educationLevelId) {
            this.educationLevelId = educationLevelId;
        }


        public String getPassword() {
            return this.password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getUserClassificationId() {
            return this.userClassificationId;
        }

        public void setUserClassificationId(int userClassificationId) {
            this.userClassificationId = userClassificationId;
        }

        public String getMiddleNameAr() {
            return this.middleNameAr;
        }

        public void setMiddleNameAr(String middleNameAr) {
            this.middleNameAr = middleNameAr;
        }

        public String getMiddleNameEn() {
            return this.middleNameEn;
        }

        public void setMiddleNameEn(String middleNameEn) {
            this.middleNameEn = middleNameEn;
        }

}
