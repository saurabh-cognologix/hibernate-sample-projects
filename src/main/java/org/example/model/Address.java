package org.example.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer addressId;
    @Column(length = 50,name = "STREET")
    private String street;
    @Column(name="CITY",length = 50)
    private String city;
    private Boolean isOpne;

    @Transient
    private Double x;

    @Column(name="Added_Date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Lob
    private Byte[] image;

    public Address() {
    }

    public Address(Integer addressId, String street, String city, Boolean isOpne, Double x, Date addedDate, Byte[] image) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.isOpne = isOpne;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getOpne() {
        return isOpne;
    }

    public void setOpne(Boolean opne) {
        isOpne = opne;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }
}
