package com.example.apple.homelessapp;

import java.util.Scanner;

/**
 * Created by apple on 4/30/16.
 */
public class Building {
    private int id;
    private int type;
    private boolean open;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String schedule;
    private String description;
    private String website;
    private String instructions;



    public Building()
    {
    }
    public Building(int id, int type, boolean open, String name,String address, String phone, String email, String schedule, String description,  String website, String instructions)
    {
        this.id=id;
        this.type = type;
        this.open = open;
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.email=email;
        this.schedule = schedule;
        this.description = description;

        this.website = website;
        this.instructions = instructions;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setType(int type) {this.type = type;}
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {this.email = email;}
    public void setSchedule(String schedule) {this.schedule = schedule;}
    public void setDescription(String description) {this.description = description;}
    public void setOpen(boolean open) {this.open = open;}
    public void setWebsite(String website) {this.website = website;}
    public void setInstructions(String instructions) {this.instructions = instructions;}

    public int getId() {return id;}
    public int getType() {return type;}
    public String getAddress() {return address;}
    public String getName() {return name;}
    public String getPhone() {return phone;}
    public String getEmail() {return email;}
    public String getSchedule() {return schedule;}
    public String getDescription() {return description;}
    public boolean getOpen() {return open;}
    public String getWebsite() {return website;}
    public String getInstructions() {return instructions;}


}



