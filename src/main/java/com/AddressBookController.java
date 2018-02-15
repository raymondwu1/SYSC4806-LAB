package com;

import com.sun.jndi.cosnaming.IiopUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddressBookController {

    private AddressBookRepository addressRepo;

    @Autowired
    public void setRepo(AddressBookRepository addressRepo){
        this.addressRepo = addressRepo;
    }

    @RequestMapping(value="/addressbook", method= RequestMethod.PUT)
    public String createAddressBook(Model model){
        AddressBook book = new AddressBook();
        model.addAttribute("book",book);
        addressRepo.save(book);
        return "book";
    }

    @RequestMapping(value="/addressbook/buddies",method=RequestMethod.PUT)
    public String addBuddy(@RequestParam(value="name") String name,
                           @RequestParam(value="phoneNumber") String phoneNumber,
                           Model model){
        AddressBook book = addressRepo.findAll().iterator().next();
        BuddyInfo buddy = new BuddyInfo(name,phoneNumber);
        book.addBuddy(buddy);
        model.addAttribute("book",book);
        addressRepo.save(book);
        return "book";
    }

    @RequestMapping(value="/addressbook/buddies",method= RequestMethod.DELETE)
    public String removeBuddy(@RequestParam(value="name") String name,
                              @RequestParam(value="phoneNumber") String phoneNumber,
                              Model model){
        AddressBook book = addressRepo.findAll().iterator().next();
        BuddyInfo b = new BuddyInfo(name, phoneNumber);
        book.removeBuddy(b);
        model.addAttribute("book",book);
        addressRepo.save(book);
        return "book";
    }
}
