/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package regex;

import info.regex.Regex;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RegexTest {

    @Test
    public void testTwoColonsWork()
    {
        final String line = ",8796158591118,,, blah: blah, bobloblaw: bobloblaw;my;grandma;and;your;grandma";
        final Regex r = Regex.parse(line);
        assertEquals("bobloblaw: bobloblaw", r.getMessage());
        assertEquals(";my;grandma;and;your;grandma", r.getSource());
    }

    @Test
    public void testOneColonWorks()
    {
        final String line = ",8796158591118,,, blah: blah;my;grandma;and;your;grandma";
        final Regex r = Regex.parse(line);
        assertEquals("blah: blah", r.getMessage());
        assertEquals(";my;grandma;and;your;grandma", r.getSource());
    }

    @Test
    public void testCannotParseForwardSlash()
    {
        final String line = ",,,with/slash, blah: blah;my;grandma;and;your;grandma";
        final Regex r = Regex.parse(line);
        assertNull(r);
    }

    @Test
    public void testCanParseWithoutSlash()
    {
        final String line = ",,,withoutslash, blah: blah;my;grandma;and;your;grandma";
        final Regex r = Regex.parse(line);

        assertEquals("blah: blah", r.getMessage());
        assertEquals(";my;grandma;and;your;grandma", r.getSource());
    }

    @Ignore
    @Test
    public void testCanParseWithForwardSlash()
    {
        final String line = ",,,with/slash, blah: blah;my;grandma;and;your;grandma";
        final Regex r = Regex.parse(line);
        assertEquals("blah: blah", r.getMessage());
        assertEquals(";my;grandma;and;your;grandma", r.getSource());
    }

    @Test
    public void testNoColons()
    {
        final String line = ",,,;my;grandma;and;your;grandma";
        final Regex r = Regex.parse(line);

        assertEquals(",", r.getMessage());
        assertEquals(";my;grandma;and;your;grandma", r.getSource());
    }
}
