/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping.strategy;

import java.math.BigDecimal;
import java.util.Map;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.model.Purchasable;
import org.mayocat.shop.shipping.StrategyPriceCalculator;
import org.mayocat.shop.shipping.model.Carrier;
import org.mayocat.shop.shipping.model.CarrierRule;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.test.mockito.MockitoComponentMockingRule;
import com.google.common.collect.Maps;

/**
 * @version $Id: c915857bab328961fc98574bcc66c95d0bded2d5 $
 */
public class WeightStrategyPriceCalculatorTest {

    @Rule
    public final MockitoComponentMockingRule<StrategyPriceCalculator> componentManager = new MockitoComponentMockingRule(WeightStrategyPriceCalculator.class);

    @Test
    public void testWeightStrategyPriceCalculation() throws ComponentLookupException {
        Carrier carrier = new Carrier();
        CarrierRule rule1 = new CarrierRule();
        CarrierRule rule2 = new CarrierRule();
        CarrierRule rule3 = new CarrierRule();
        rule1.setUpToValue(BigDecimal.valueOf(1));
        rule1.setPrice(BigDecimal.valueOf(10));
        rule2.setUpToValue(BigDecimal.valueOf(2));
        rule2.setPrice(BigDecimal.valueOf(19));
        rule3.setUpToValue(BigDecimal.valueOf(3));
        rule3.setPrice(BigDecimal.valueOf(27));
        carrier.addRule(rule1);
        carrier.addRule(rule2);
        carrier.addRule(rule3);
        Map<Purchasable, Long> items = Maps.newHashMap();
        Product product1 = new Product();
        // 100 grams
        product1.setWeight(BigDecimal.valueOf(0.100));
        Product product2 = new Product();
        // 1100 grams
        product2.setWeight(BigDecimal.valueOf((1100)));
        // total : 300g
        items.put(product1, 3l);
        BigDecimal price = this.componentManager.getComponentUnderTest().getPrice(carrier, items);
        Assert.assertEquals(BigDecimal.valueOf(10), price);
        // total 1100g
        items.put(product1, 11l);
        price = this.componentManager.getComponentUnderTest().getPrice(carrier, items);
        Assert.assertEquals(BigDecimal.valueOf(19), price);
        // 2200
        items.put(product2, 1l);
        price = this.componentManager.getComponentUnderTest().getPrice(carrier, items);
        Assert.assertEquals(BigDecimal.valueOf(27), price);
    }
}