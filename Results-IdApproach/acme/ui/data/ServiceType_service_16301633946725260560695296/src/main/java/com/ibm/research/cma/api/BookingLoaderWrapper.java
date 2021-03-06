/**
 * ****************************************************************************
 *  Copyright (c) 2013 IBM Corp.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * *****************************************************************************
 */
package com.ibm.research.cma.api;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import com.acmeair.service.BookingService;
import com.acmeair.loader.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@ApplicationScoped
@Controller
@RequestMapping("/ms1/bookingloader/")
public class BookingLoaderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, BookingLoaderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.POST, value = "bookingloader")
    public  @ResponseBody int BookingLoader() {
        BookingLoaderServer newServerObj = new BookingLoaderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

