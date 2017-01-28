package com.home;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sattu on 1/28/17.
 */
public class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @Test
    public void getValue() throws Exception {
        String response = utils.getValue("Satya");
        Assert.assertEquals("Hello Satya", response);
    }

}