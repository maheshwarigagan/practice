package binarySearch.eliminationGame;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EliminationGameTest {

    @Test
    public void lastRemaining() {
        Assert.assertEquals(6, EliminationGame.lastRemaining(12));
    }
}