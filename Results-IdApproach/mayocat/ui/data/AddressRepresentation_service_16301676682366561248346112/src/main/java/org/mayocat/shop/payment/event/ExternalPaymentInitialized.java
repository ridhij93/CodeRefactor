/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.event;

import org.xwiki.observation.event.AbstractFilterableEvent;
import org.xwiki.observation.event.Event;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 5eef57fbd653c776476e752256e0f2057a45dbcf $
 */
public class ExternalPaymentInitialized extends AbstractFilterableEvent implements Event {

    public int id = 0;

    public static ExternalPaymentInitialized getObject(int id) {
        ExternalPaymentInitialized obj = (ExternalPaymentInitialized) new Object();
        obj.id = id;
        return obj;
    }
}

