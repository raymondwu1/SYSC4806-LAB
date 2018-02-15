package com;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue(strategy= AUTO)
    private Long bookId;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BuddyInfo> buddyList;

    private String title;

    public AddressBook(){this.buddyList = new ArrayList<BuddyInfo>();}

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public Long getBookId(){
        return bookId;
    }

    public void setBookId(Long bookId){
        this.bookId = bookId;
    }

    public List<BuddyInfo> getBuddyList(){
        return buddyList;
    }

    public void setBuddyList(List<BuddyInfo> buddyList){
        this.buddyList = buddyList;
    }

    public void addBuddy(BuddyInfo buddy){
        buddyList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddyList.remove(buddy);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return true;
        if (getClass() != obj.getClass())
            return false;
        AddressBook other = (AddressBook)obj;
        if (bookId == null){
            if (other.bookId != null)
                return false;
        } else if (!bookId.equals(other.bookId))
            return false;
        if (buddyList == null) {
            if (other.buddyList != null)
                return false;
        } else if (!buddyList.equals(other.buddyList))
            return false;
        return true;
    }


}
