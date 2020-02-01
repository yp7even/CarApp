package com.example.carapp;

import android.os.Parcel;
import android.os.Parcelable;

public class carModel implements Parcelable {

    String Address, city,  country,Mfr_CommonName,Mfr_Name,PrincipalFirstName;

    public carModel(String address, String city, String country, String mfr_CommonName, String mfr_Name, String principalFirstName) {
        this.Address = address;
        this.city = city;
        this.country = country;
        this.Mfr_CommonName = mfr_CommonName;
        this.Mfr_Name = mfr_Name;
        this.PrincipalFirstName = principalFirstName;
    }

    protected carModel(Parcel in) {
        Address = in.readString();
        city = in.readString();
        country = in.readString();
        Mfr_CommonName = in.readString();
        Mfr_Name = in.readString();
        PrincipalFirstName = in.readString();
    }

    public static final Creator<carModel> CREATOR = new Creator<carModel>() {
        @Override
        public carModel createFromParcel(Parcel in) {
            return new carModel(in);
        }

        @Override
        public carModel[] newArray(int size) {
            return new carModel[size];
        }
    };

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMfr_CommonName() {
        return Mfr_CommonName;
    }

    public void setMfr_CommonName(String mfr_CommonName) {
        Mfr_CommonName = mfr_CommonName;
    }

    public String getMfr_Name() {
        return Mfr_Name;
    }

    public void setMfr_Name(String mfr_Name) {
        Mfr_Name = mfr_Name;
    }

    public String getPrincipalFirstName() {
        return PrincipalFirstName;
    }

    public void setPrincipalFirstName(String principalFirstName) {
        PrincipalFirstName = principalFirstName;
    }

    public static Creator<carModel> getCREATOR() {
        return CREATOR;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Address);
        dest.writeString(city);
        dest.writeString(country);
        dest.writeString(Mfr_CommonName);
        dest.writeString(Mfr_Name);
        dest.writeString(PrincipalFirstName);

    }
}
