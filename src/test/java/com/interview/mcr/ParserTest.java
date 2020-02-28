package com.interview.mcr;

import org.junit.Assert;
import org.junit.Test;

public class ParserTest {
    Parser parser = new ParserImpl();

    @Test
    public void testParseLineOne_Surname_with_GivenName() {
        // P<USAROGGER<<MICHAEL<<<<<<<<<<<<<<<<<<<<<<<<
        String data = "P<USAROGGER<<MICHAEL<<<<<<<<<<<<<<<<<<<<<<<<";
        LineOne actual = parser.parseLineOne(data);
        Assert.assertNotNull(actual);
        Assert.assertEquals("ROGGER", actual.surname);
        Assert.assertEquals("MICHAEL", actual.givenName);
    }


    @Test
    public void testParseLineOne_Surname_with_Longer_GivenName() {
        // P<USAROGGER<<MICHAEL<<<<<<<<<<<<<<<<<<<<<<<<
        String data = "P<USARICHARDS<STEVENS<JR<<GEORGE<MICHAEL<<<<";
        LineOne actual = parser.parseLineOne(data);
        Assert.assertNotNull(actual);
        Assert.assertEquals("RICHARDS STEVENS JR", actual.surname);
        Assert.assertEquals("GEORGE MICHAEL", actual.givenName);
    }

    @Test
    public void testParseLineOne_Surname_Only() {
        // P<USAROGGER<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        String data = "P<USAROGGER<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<";
        LineOne actual = parser.parseLineOne(data);
        Assert.assertNotNull(actual);
        Assert.assertEquals("ROGGER", actual.surname);
        Assert.assertNull(actual.givenName);
    }
}
