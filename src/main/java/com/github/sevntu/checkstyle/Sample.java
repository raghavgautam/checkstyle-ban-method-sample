package com.github.sevntu.checkstyle;

import org.junit.Assert; 

public class Sample {

	public Boolean shouldBeWarning() {
        Assert.assertTrue(true);
        Assert.assertFalse(true);
        System.exit(0);
		return null;
	}
}
