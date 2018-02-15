package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]){
        SpringApplication.run(Application.class, args);
    }

    /**
    @Bean
    public CommandLineRunner demo (BuddyInfoRepository repository, AddressBookRepository addressRepo) {
        return (args) -> {
            repository.save(new BuddyInfo("Bob","6142342343"));
            repository.save(new BuddyInfo("Andy","1234124321"));

            log.info("Buddies found with findAll();");
            log.info("--------------------------------");
            for (BuddyInfo buddy : repository.findAll()) {
                log.info(buddy.toString());
            }
            log.info("");

            BuddyInfo buddy =repository.findOne(1L);
            log.info("Buddy found with findOne(1L):");
            log.info ("-----------------------------");
            log.info(buddy.toString());
            log.info("");

            log.info("Customer found with findbyName('Bob')");
            log.info("--------------------------------------");
            for (BuddyInfo bob : repository.findByName("Bob")){
                log.info(bob.toString());
            }
            log.info("");

            // Save an address book
            AddressBook a = new AddressBook();
            a.addBuddy(new BuddyInfo("Tom", "6125454545"));
            addressRepo.save(a);
            AddressBook a2 = new AddressBook();
            a2.addBuddy(new BuddyInfo("Sarah", "653265464"));
            addressRepo.save(a2);
            // Fetch all address books
            log.info("Address Books found with findAll():");
            log.info("-------------------------------");
            for (AddressBook book : addressRepo.findAll()) {
                log.info(book.getBookId().toString());
            }
            log.info("");

        };
    }
*/

}
