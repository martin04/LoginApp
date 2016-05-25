package com.mr.loginapp.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Martin on 5/25/2016.
 */
public class UserLoginModel implements Parcelable {

    private String username;
    private String password;

    public UserLoginModel() {
    }

    public UserLoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserLoginModel(Parcel in) {
        this.username = in.readString();
        this.password = in.readString();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getUsername());
        dest.writeString(getPassword());
    }

    public static final Parcelable.Creator<UserLoginModel> CREATOR
            = new Parcelable.Creator<UserLoginModel>() {
        public UserLoginModel createFromParcel(Parcel in) {
            return new UserLoginModel(in);
        }

        public UserLoginModel[] newArray(int size) {
            return new UserLoginModel[size];
        }
    };
}
