/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.ibm.research.cma.api;

import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.mayocat.context.WebContext;
import org.mayocat.shop.billing.event.OrderPaidEvent;
import org.mayocat.shop.cart.CartManager;
import org.mayocat.shop.payment.event.ExternalPaymentInitialized;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import org.xwiki.observation.EventListener;
import org.xwiki.observation.ObservationManager;
import org.xwiki.observation.event.Event;
import org.mayocat.shop.cart.internal.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: a0c8cb8d91190be3eb54eeb7ad2183a6f947bf0b $
 */
@Component
@Named("cartPaymentEventListener")
@Controller
@RequestMapping("/ms0/cartpaymenteventlistener/")
public class CartPaymentEventListenerWrapper {

    private class Listener implements EventListener {
    }

    private static int maxId = 0;

    public static HashMap<Integer, CartPaymentEventListenerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.POST, value = "cartpaymenteventlistener")
    public  @ResponseBody int CartPaymentEventListener() {
        CartPaymentEventListenerServer newServerObj = new CartPaymentEventListenerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

