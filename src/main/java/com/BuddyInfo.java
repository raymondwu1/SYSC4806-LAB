package com;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class BuddyInfo {

    @Id
    @GeneratedValue(strategy= AUTO)
    private Long id;
    private String name;
    private String phoneNumber;

    public BuddyInfo(){ }

    public BuddyInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return true;
        if (getClass() != obj.getClass())
            return false;
        BuddyInfo other = (BuddyInfo)obj;
        if (id == null){
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (phoneNumber == null) {
            if (other.phoneNumber != null)
                return false;
        }else if (!phoneNumber.equals(other.phoneNumber))
            return false;
        return true;
    }

    public String toString(){
        return "Name: " + this.getName() + "\n" + "Phone number: " + this.getPhoneNumber();
    }

}
