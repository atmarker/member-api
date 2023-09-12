package com.cirrusjoe.members.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "MEMBERS")
@SequenceGenerator(name="seq", initialValue=4, allocationSize=100)
public class Member {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    private long id;
    String givenName;
    String sn;
    String email;
    private String telephone;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String postcode;
    private Date birthdate;
    private Timestamp created;
    private Timestamp updated;


    public Member() {
    }

    public Member(long id, String givenName, String sn, String email, String telephone, String address1, String city, String state, String postcode, Date birthdate) {
        this.setId(id);
        this.givenName = givenName;
        this.sn = sn;
        this.email = email;
        this.telephone = telephone;
        this.address1 = address1;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.birthdate = birthdate;
    }
    public Member(long id, String givenName, String sn, String email, String telephone, String address1, String address2, String city, String state, String postcode, Date birthdate) {
        this.setId(id);
        this.givenName = givenName;
        this.sn = sn;
        this.email = email;
        this.telephone = telephone;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.birthdate = birthdate;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }
}
