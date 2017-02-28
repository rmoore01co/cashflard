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
package jms;

import info.clashfard.jms.BoilerplateConsumer;
import info.clashfard.jms.BoilerplateProducer;
import org.junit.Test;

public class JmsTest {

    @Test
    public void test()
    {
        final BoilerplateProducer producer = new BoilerplateProducer();
        producer.produce();
        final BoilerplateConsumer consumer = new BoilerplateConsumer();
        consumer.consume();
    }
}
