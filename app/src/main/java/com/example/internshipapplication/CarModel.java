package com.example.internshipapplication;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class CarModel implements Parcelable {

    public static final Creator<CarModel> CREATOR = new Creator<CarModel>() {
        @Override
        public CarModel createFromParcel(Parcel in) { return new CarModel(in); }

        @Override
        public CarModel[] newArray(int size) { return new CarModel[size]; }
    };
    public String carName;
    public int carHorsePower;
    public int carMaxSpeed;
    public String carColor;
    public int carYear;
    public int carPhoto;


    public CarModel (String carName, int carHorsePower, int carMaxSpeed, String carColor, int carYear, int carPhoto) {
        this.carName = carName;
        this.carHorsePower = carHorsePower;
        this.carMaxSpeed = carMaxSpeed;
        this.carColor = carColor;
        this.carYear = carYear;
        this.carPhoto = carPhoto;
    }
    protected CarModel(Parcel in) {
        carName = in.readString();
        carHorsePower = in.readInt();
        carMaxSpeed = in.readInt();
        carColor = in.readString();
        carYear = in.readInt();
        carPhoto = in.readInt();
    }

    public String getCarName() { return carName; }

    public void setCarName(String carName) { this.carName = carName; }

    public int getCarHorsePower() { return carHorsePower; }

    public void setCarHorsePower(int carHorsePower) { this.carHorsePower = carHorsePower; }

    public int getCarMaxSpeed() { return  carMaxSpeed; }

    public void setCarMaxSpeed(int carMaxSpeed) { this.carMaxSpeed = carMaxSpeed; }

    public String getCarColor() {return carColor; }

    public void setCarColor(String carColor) { this.carColor = carColor; }

    public int getCarYear() { return carYear; }

    public void setCarYear(int carYear) { this.carYear = carYear; }

    public int getCarPhoto() { return carPhoto; }

    public void setCarPhoto(int carPhoto) { this.carPhoto = carPhoto; }

    @NonNull
    @Override
    public String toString() {
        return "Car: " + carName + "\n" + "Horse Power: " + carHorsePower + "\n" + "Max. Speed: " +
                carMaxSpeed + "\n" + "Color: " + carColor + "\n" + "Year: " + carYear;
    }

    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(carName);
        parcel.writeInt(carHorsePower);
        parcel.writeInt(carMaxSpeed);
        parcel.writeString(carColor);
        parcel.writeInt(carYear);
        parcel.writeInt(carPhoto);
    }
}
