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
import org.springframework.util.concurrent.ListenableFuture;

public interface PrinterGateway {
    ListenableFuture<String> print(final Clashfard clashfard);
}
