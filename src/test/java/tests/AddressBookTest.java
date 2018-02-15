package tests;

import com.AddressBook;
import com.BuddyInfo;
import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {

    @Test
    public void testGetBookId() throws Exception {
        AddressBook book = new AddressBook();
        book.setBookId(2L);
        Assert.assertTrue(book.getBookId() == 2L);
    }

    @Test
    public void testSetBookId() throws Exception {
        AddressBook book = new AddressBook();
        book.setBookId(5L);
        Assert.assertTrue(book.getBookId() == 5L);
    }

    @Test
    public void testGetTitle() throws Exception {
        AddressBook book = new AddressBook();
        book.setTitle("My Book");
        Assert.assertEquals(book.getTitle(), "My Book");
    }

    @Test
    public void testSetTitle() throws Exception {
        AddressBook book = new AddressBook();
        book.setTitle("My Address Book");
        Assert.assertEquals(book.getTitle(), "My Address Book");
    }


}