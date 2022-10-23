package com.example.CoronaInformProject.Member;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Member {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private int numberHouse;
    private LocalDate birthDate;
    private String phone;
    private String mobilePhone;

    private LocalDate positiveResultDate;
    private LocalDate recoveryDate;

    private LocalDate firstVaccinationDate;
    private String firstManufacturer;
    private LocalDate secondVaccinationDate;
    private String secondManufacturer;
    private LocalDate thirdVaccinationDate;
    private String thirdManufacturer;
    private LocalDate fourthVaccinationDate;
    private String fourthManufacturer;

    public Member(Long id,
                  String firstName,
                  String lastName,
                  String city,
                  String street,
                  int numberHouse,
                  LocalDate birthDate,
                  String phone,
                  String mobilePhone,
                  LocalDate positiveResultDate,
                  LocalDate recoveryDate,
                  LocalDate firstVaccinationDate,
                  String firstManufacturer,
                  LocalDate secondVaccinationDate,
                  String secondManufacturer,
                  LocalDate thirdVaccinationDate,
                  String thirdManufacturer,
                  LocalDate fourthVaccinationDate,
                  String fourthManufacturer) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.numberHouse = numberHouse;
        this.birthDate = birthDate;
        this.phone = phone;
        this.mobilePhone = mobilePhone;
        this.positiveResultDate = positiveResultDate;
        this.recoveryDate = recoveryDate;
        this.firstVaccinationDate = firstVaccinationDate;
        this.firstManufacturer = firstManufacturer;
        this.secondVaccinationDate = secondVaccinationDate;
        this.secondManufacturer = secondManufacturer;
        this.thirdVaccinationDate = thirdVaccinationDate;
        this.thirdManufacturer = thirdManufacturer;
        this.fourthVaccinationDate = fourthVaccinationDate;
        this.fourthManufacturer = fourthManufacturer;
    }

    public Member() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public LocalDate getPositiveResultDate() {
        return positiveResultDate;
    }

    public void setPositiveResultDate(LocalDate positiveResultDate) {
        this.positiveResultDate = positiveResultDate;
    }

    public LocalDate getRecoveryDate() {
        return recoveryDate;
    }

    public void setRecoveryDate(LocalDate recoveryDate) {
        this.recoveryDate = recoveryDate;
    }

    public LocalDate getFirstVaccinationDate() {
        return firstVaccinationDate;
    }

    public void setFirstVaccinationDate(LocalDate firstVaccinationDate) {
        this.firstVaccinationDate = firstVaccinationDate;
    }

    public String getFirstManufacturer() {
        return firstManufacturer;
    }

    public void setFirstManufacturer(String firstManufacturer) {
        this.firstManufacturer = firstManufacturer;
    }

    public LocalDate getSecondVaccinationDate() {
        return secondVaccinationDate;
    }

    public void setSecondVaccinationDate(LocalDate secondVaccinationDate) {
        this.secondVaccinationDate = secondVaccinationDate;
    }

    public String getSecondManufacturer() {
        return secondManufacturer;
    }

    public void setSecondManufacturer(String secondManufacturer) {
        this.secondManufacturer = secondManufacturer;
    }

    public LocalDate getThirdVaccinationDate() {
        return thirdVaccinationDate;
    }

    public void setThirdVaccinationDate(LocalDate thirdVaccinationDate) {
        this.thirdVaccinationDate = thirdVaccinationDate;
    }

    public String getThirdManufacturer() {
        return thirdManufacturer;
    }

    public void setThirdManufacturer(String thirdManufacturer) {
        this.thirdManufacturer = thirdManufacturer;
    }

    public LocalDate getFourthVaccinationDate() {
        return fourthVaccinationDate;
    }

    public void setFourthVaccinationDate(LocalDate fourthVaccinationDate) {
        this.fourthVaccinationDate = fourthVaccinationDate;
    }

    public String getFourthManufacturer() {
        return fourthManufacturer;
    }

    public void setFourthManufacturer(String fourthManufacturer) {
        this.fourthManufacturer = fourthManufacturer;
    }
}
