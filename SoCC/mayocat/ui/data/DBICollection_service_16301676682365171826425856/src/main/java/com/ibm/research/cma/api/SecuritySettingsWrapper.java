/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.ibm.research.cma.api;

import javax.validation.Valid;
import org.hibernate.validator.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.mayocat.configuration.*;
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
@RequestMapping("/ms0/securitysettings/")
public class SecuritySettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, SecuritySettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.POST, value = "securitysettings")
    public  @ResponseBody int SecuritySettings() {
        SecuritySettingsServer newServerObj = new SecuritySettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

