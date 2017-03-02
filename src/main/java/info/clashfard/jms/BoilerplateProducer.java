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
package info.clashfard.jms;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class BoilerplateProducer {

    public void produce() {
        try {
            final ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
            final Connection connection = connectionFactory.createConnection();
            connection.start();

            final Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            final Destination destination = session.createQueue("BOILERPLATE.TESTQUEUE");

            final MessageProducer producer = session.createProducer(destination);
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

            final String text = "Boilerplate test message from " + Thread.currentThread().getName();
            final TextMessage message = session.createTextMessage(text);

            producer.send(message);

            session.close();
            connection.close();
        } catch(final Exception e) {

        }
    }
}
