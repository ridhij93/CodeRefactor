/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.ibm.research.cma.api;

import org.mayocat.model.*;
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
 * @version $Id: 5031916edb52731d88f088ec72a30dcdf37324c2 $
 */
@Controller
@RequestMapping("/ms5/entityandparent/")
public class EntityAndParentWrapper<E extends Entity> {

    private static int maxId = 0;

    public static HashMap<Integer, EntityAndParentServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.POST, value = "entityandparent")
    public  @ResponseBody int EntityAndParent(@RequestParam int parentId, @RequestParam int entityId) {
        EntityAndParentServer newServerObj = new EntityAndParentServer((EntityAndParent<E>) new Object(), E.getObject(entityId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

