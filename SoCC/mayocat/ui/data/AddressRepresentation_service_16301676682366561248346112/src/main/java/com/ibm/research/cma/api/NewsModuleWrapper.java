/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.ibm.research.cma.api;

import java.util.ArrayList;
import java.util.List;
import org.mayocat.cms.news.meta.ArticleEntity;
import org.mayocat.meta.EntityMeta;
import org.mayocat.Module;
import org.mayocat.cms.news.*;
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
 * @version $Id: 43a26f1328b23dd9787a22b5e90295f5e4ea7353 $
 */
@Controller
@RequestMapping("/ms2/newsmodule/")
public class NewsModuleWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, NewsModuleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.POST, value = "newsmodule")
    public  @ResponseBody int NewsModule() {
        NewsModuleServer newServerObj = new NewsModuleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

