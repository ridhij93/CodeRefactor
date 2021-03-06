/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.ibm.research.cma.api;

import org.mayocat.accounts.model.Tenant;
import org.mayocat.shop.taxes.PriceWithTaxes;
import org.mayocat.shop.taxes.Taxable;
import org.mayocat.shop.cart.*;
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
 * @version $Id: c29c999cdd6b481edd28ceeb1e179a8c0b5cf7be $
 */
@Controller
@RequestMapping("/ms5/cartitembuilder/")
public class CartItemBuilderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CartItemBuilderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.POST, value = "cartitembuilder")
    public  @ResponseBody int CartItemBuilder() {
        CartItemBuilderServer newServerObj = new CartItemBuilderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

