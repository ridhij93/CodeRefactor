/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart;

import org.xwiki.component.annotation.Role;

/**
 * @version $Id: 015e20fe610b9b766140266613b3d48619209473 $
 */
@Role
public interface CartLoader {

    Cart load(CartContents contents);
}
