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
import org.mayocat.configuration.general.GeneralSettings;
import org.xwiki.component.annotation.Component;
import org.mayocat.configuration.gestalt.*;
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
 * @version $Id: 7ede20042399d889c35edf13e1a4790543248911 $
 */
@Component("general")
@Controller
@RequestMapping("/ms1/generalgestaltconfigurationsource/")
public class GeneralGestaltConfigurationSourceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, GeneralGestaltConfigurationSourceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.POST, value = "generalgestaltconfigurationsource")
    public  @ResponseBody int GeneralGestaltConfigurationSource() {
        GeneralGestaltConfigurationSourceServer newServerObj = new GeneralGestaltConfigurationSourceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

