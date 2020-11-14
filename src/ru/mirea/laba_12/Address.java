package ru.mirea.laba_12;

import java.lang.reflect.Array;

public class Address {
    public String Country;
    public String Region;
    public String City;
    public String Street;
    public String House;
    public String Housing;
    public String Apartment;
    public String address;

    public Address(String address) {
        this.address = address;
        addressSplit();
    }

    public void addressSplit(){
        String []temp = new String[7];
        int index = 0;
        for(String i : this.address.split(",")){
            for (String j : i.split(";")){
                for(String k : j.split("\\.")){
                    temp[index++] = k;
                }
            }
        }
        this.Country = temp[0];
        this.Region = temp[1];
        this.City = temp[2];
        this.Street = temp[3];
        this.House = temp[4];
        this.Housing = temp[5];
        this.Apartment = temp[6];
    }

    @Override
    public String toString() {
        return "Address{ " +
                "Country=[" + Country + ']' +
                ", Region=[" + Region + ']' +
                ", City=[" + City + ']' +
                ", Street=[" + Street + ']' +
                ", House=[" + House + ']' +
                ", Housing=[" + Housing + ']' +
                ", Apartment=["+ Apartment + ']' +
                " }";
    }

    public static void main(String[] args) {
        Address address = new Address("a;v,d,s,d,f,d");
        System.out.println(address);
    }
}
