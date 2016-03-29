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
package info.clashfard.service;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import info.clashfard.service.impl.DefaultClashfardService;
import info.configuration.TestAppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		classes=TestAppConfig.class,
		loader=AnnotationConfigContextLoader.class)
public class OneBeanJavaBasedConfigTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testNumberOfBeans() {
		final Map<String, DefaultClashfardService> beanMap = applicationContext.getBeansOfType(DefaultClashfardService.class);
		assertEquals(1, beanMap.size());
	}
}
