package hashtable.minindexsum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumIndexSumofTwoListsTest {

    @Test
    public void findRestaurant() {
        Assert.assertEquals(new String[]{"Shogun"}, MinimumIndexSumofTwoLists.findRestaurant(
                new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"}));
    }
}