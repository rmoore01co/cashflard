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
package info.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    private static final Pattern pattern = Pattern
            .compile("\"?(?:[\\w: /'=]*,)+\\s*(?<message>[\\w\\s:'\"#.,=!\\-\\[\\]@]+ *)\"?\\s*(?<source>;.*)\\s*");

    private String message;
    private String source;

    private Regex(final String message, final String source)
    {
        this.message = message;
        this.source = source;
    }

    public static Regex parse(final String line)
    {
        final Matcher matcher = pattern.matcher(line);
        if (matcher.matches())
        {
            final String message = matcher.group("message");
            final String source = matcher.group("source");
            return new Regex(message, source);
        }
        return null;
    }

    public String getMessage() {
        return message;
    }

    public String getSource() {
        return source;
    }
}
