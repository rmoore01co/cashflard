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

public class BoilerplateConsumer {

    public void consume()
    {
        try {
            final ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
            final Connection connection = connectionFactory.createConnection();
            connection.start();

            final Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            final Destination destination = session.createQueue("BOILERPLATE.TESTQUEUE");

            final MessageConsumer consumer = session.createConsumer(destination);

            final Message message = consumer.receive(5000);

            if (message instanceof TextMessage) {
                final TextMessage textMessage = (TextMessage) message;
                final String text = textMessage.getText();
                System.out.println("Received: " + text);
            } else {
                System.out.println("Received: " + message);
            }

            consumer.close();
            session.close();
            connection.close();

        } catch(final Exception e) {}
    }
}
