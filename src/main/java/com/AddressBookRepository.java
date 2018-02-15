package com;

import com.AddressBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

public interface AddressBookRepository extends CrudRepository<AddressBook, Long>{

    List<AddressBook> findByTitle(String title);
}
