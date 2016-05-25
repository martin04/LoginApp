package com.mr.loginapp.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Martin on 5/25/2016.
 */
public class TokenModel implements Parcelable {

    private String token;

    public TokenModel() {
    }

    public TokenModel(String token) {
        this.token = token;
    }

    public TokenModel(Parcel in){
        this.token = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getToken());
    }

    public static final Parcelable.Creator<TokenModel> CREATOR
            = new Parcelable.Creator<TokenModel>() {
        public TokenModel createFromParcel(Parcel in) {
            return new TokenModel(in);
        }

        public TokenModel[] newArray(int size) {
            return new TokenModel[size];
        }
    };
}
