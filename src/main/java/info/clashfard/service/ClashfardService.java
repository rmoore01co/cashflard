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

import java.util.Collection;
import java.util.List;

import info.clashfard.domain.Clashfard;

public interface ClashfardService {

	Clashfard find(long id);

	List<Clashfard> findAll();

	Clashfard add(Clashfard clashfard);

	boolean delete(long id);
}
