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

import info.clashfard.domain.Clashfard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import static info.clashfard.domain.Clashfard.clashfard;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class JmsApplication implements ApplicationRunner {

    @Autowired
    private PrinterGateway gateway;

    public static void main(String[] args) {
        SpringApplication.run(JmsApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

        // build the payloads
        final Clashfard[] payloads = {
                clashfard().withId(1).withName("one").build(),
                clashfard().withId(2).withName("two").build(),
                clashfard().withId(3).withName("three").build(),
                clashfard().withId(4).withName("four").build(),
                clashfard().withId(5).withName("five").build(),
                clashfard().withId(6).withName("six").build(),
                clashfard().withId(7).withName("seven").build(),
                clashfard().withId(8).withName("eight").build(),
                clashfard().withId(9).withName("nine").build(),
                clashfard().withId(10).withName("ten").build()};

        // asynchronous gateway demo
        // by virtue of the gateway, we no longer rely on spring integration - we have no Messages or other
        // SI specifics in our code
        for (int x=0; x<payloads.length; x++) {
            System.out.println(String.format("sending payload %s to JMS", payloads[x].toString()));
            this.gateway.print(payloads[x]);
        }
    }
}
