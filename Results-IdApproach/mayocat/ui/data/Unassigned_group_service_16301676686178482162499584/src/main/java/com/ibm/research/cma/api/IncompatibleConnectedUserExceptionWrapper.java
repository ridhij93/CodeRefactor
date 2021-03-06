/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.ibm.research.cma.api;

import org.mayocat.accounts.*;
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
 * @version $Id: 238ceeb42db4bd7f3a7f2011d8cfb131ff0bca89 $
 */
@Controller
@RequestMapping("/ms5/incompatibleconnecteduserexception/")
public class IncompatibleConnectedUserExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, IncompatibleConnectedUserExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.POST, value = "incompatibleconnecteduserexception")
    public  @ResponseBody int IncompatibleConnectedUserException() {
        IncompatibleConnectedUserExceptionServer newServerObj = new IncompatibleConnectedUserExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.POST, value = "incompatibleconnecteduserexception")
    public  @ResponseBody int IncompatibleConnectedUserException(@RequestParam String message) {
        IncompatibleConnectedUserExceptionServer newServerObj = new IncompatibleConnectedUserExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

