/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.authorization;

import org.mayocat.accounts.model.User;
import org.xwiki.component.annotation.Role;

@Role
public interface Gatekeeper {

    boolean userHasRole(User user, org.mayocat.accounts.model.Role role);

    public int id = 0;

    public static Gatekeeper getObject(int id) {
        return null;
    }
}

