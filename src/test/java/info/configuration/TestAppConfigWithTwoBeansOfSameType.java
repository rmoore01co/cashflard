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
package info.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@Import({ AppConfig.class })  -> need to component scan impl directory to make sure we're comparing apples to apples (impls to impls)
@ImportResource({"applicationContext-test.xml"})
@ComponentScan("info.clashfard.service.impl")
public class TestAppConfigWithTwoBeansOfSameType{}
