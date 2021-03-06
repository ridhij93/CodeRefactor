/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.ibm.research.cma.api;

import org.xwiki.observation.event.AbstractFilterableEvent;
import org.xwiki.observation.event.Event;
import org.mayocat.model.event.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ms2/entitycreatedevent/")
public class EntityCreatedEventWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, EntityCreatedEventServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.POST, value = "entitycreatedevent")
    public  @ResponseBody int EntityCreatedEvent() {
        EntityCreatedEventServer newServerObj = new EntityCreatedEventServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

