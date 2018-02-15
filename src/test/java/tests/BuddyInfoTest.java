package tests;

import com.BuddyInfo;
import org.junit.Assert;
import org.junit.Test;


public class BuddyInfoTest {

    @Test
    public void testGetName() throws Exception {
        BuddyInfo buddy = new BuddyInfo("George", "6139876543");
        Assert.assertEquals("George", buddy.getName());
    }

    @Test
    public void testSetName() throws Exception {
        BuddyInfo buddy = new BuddyInfo();
        buddy.setName("Bob");
        Assert.assertEquals("Bob", buddy.getName());
    }

    @Test
    public void testGetPhoneNumber() throws Exception {
        BuddyInfo buddy = new BuddyInfo("George", "6139876543");
        Assert.assertEquals("6139876543", buddy.getPhoneNumber());
    }

    @Test
    public void testSetPhoneNumber() throws Exception {
        BuddyInfo buddy = new BuddyInfo();
        buddy.setPhoneNumber("6131231234");
        Assert.assertEquals("6131231234", buddy.getPhoneNumber());
    }

    @Test
    public void testEquals() throws Exception{
        BuddyInfo buddy = new BuddyInfo();
        BuddyInfo buddy2 = new BuddyInfo();
        Assert.assertEquals(buddy,buddy2);
    }

    @Test
    public void testToString() throws Exception {
        BuddyInfo buddy = new BuddyInfo("George", "6139876543");
        Assert.assertEquals("Name: George\nPhone number: 6139876543", buddy.toString());
    }


}