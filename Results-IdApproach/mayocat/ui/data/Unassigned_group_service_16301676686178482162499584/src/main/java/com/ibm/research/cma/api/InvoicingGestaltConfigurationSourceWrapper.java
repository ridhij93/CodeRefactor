/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.ibm.research.cma.api;

import javax.inject.Inject;
import org.mayocat.configuration.GestaltConfigurationSource;
import org.xwiki.component.annotation.Component;
import org.mayocat.shop.invoicing.*;
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
 * @version $Id: bfbc00c7c24c811269ffadf8bb71d29c2dfd3cb8 $
 */
@Component("invoicing")
@Controller
@RequestMapping("/ms5/invoicinggestaltconfigurationsource/")
public class InvoicingGestaltConfigurationSourceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, InvoicingGestaltConfigurationSourceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.POST, value = "invoicinggestaltconfigurationsource")
    public  @ResponseBody int InvoicingGestaltConfigurationSource() {
        InvoicingGestaltConfigurationSourceServer newServerObj = new InvoicingGestaltConfigurationSourceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

