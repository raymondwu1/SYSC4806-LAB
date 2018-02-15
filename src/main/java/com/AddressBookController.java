package com;

import com.sun.jndi.cosnaming.IiopUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddressBookController {

    @Autowired
    BuddyInfoRepository buddyRepo;

    @Autowired
    AddressBookRepository addressRepo;

    @GetMapping("/addressbook")
    public String addressBookForm(Model model) {
        model.addAttribute("books", new AddressBook());
        model.addAttribute("buddy", new BuddyInfo());
        model.addAttribute("buddies", buddyRepo.findAll());
        model.addAttribute("addressbooks", addressRepo.findAll());
        return "books";
    }

    @PostMapping("/addressbook")
    public String addressBookSubmit(@ModelAttribute("buddy") BuddyInfo buddy, @ModelAttribute("book") AddressBook book) {
        addressRepo.save(book);
        buddyRepo.save(buddy);
        return "result";
    }

}
