/**
 * (C) Copyright IBM Corporation 2015.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.research.cma.api;

import java.math.BigDecimal;
import java.util.Date;
import com.ibm.websphere.samples.daytrader.web.jsf.*;
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
@RequestMapping("/ms4/orderdata/")
public class OrderDataWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, OrderDataServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.POST, value = "orderdata_integer_string_date_date_bigdecimal_string_double_string")
    public  @ResponseBody int OrderData(@RequestParam Integer orderID, @RequestParam String orderStatus, @RequestParam int openDateId, @RequestParam int completeDateId, @RequestParam int orderFeeId, @RequestParam String orderType, @RequestParam double quantity, @RequestParam String symbol) {
        OrderDataServer newServerObj = new OrderDataServer(orderID, orderStatus, openDate, completeDate, orderFee, orderType, quantity, symbol);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.POST, value = "orderdata")
    public  @ResponseBody int OrderData(@RequestParam Integer orderID, @RequestParam String orderStatus, @RequestParam int openDateId, @RequestParam int completeDateId, @RequestParam int orderFeeId, @RequestParam String orderType, @RequestParam double quantity, @RequestParam String symbol, @RequestParam int priceId) {
        OrderDataServer newServerObj = new OrderDataServer(orderID, orderStatus, openDate, completeDate, orderFee, orderType, quantity, symbol, price);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}
