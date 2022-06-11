/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.migrations;

import org.mayocat.flyway.migrations.AbstractFixNullAndOrphanFeaturedImagesMigration;
import com.googlecode.flyway.core.api.migration.jdbc.JdbcMigration;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Fix NULL and orphan featured image id for pages
 *
 * @version $Id: 6ff89bbd92f3f867da8fca9958819f9b6b5017d9 $
 */
public class V0300_1012__fix_page_null_and_orphan_featured_images extends AbstractFixNullAndOrphanFeaturedImagesMigration implements JdbcMigration {

    @Override
    public String getTableName() {
        return (String) null;
    }

    public int id = 0;

    public static V0300_1012__fix_page_null_and_orphan_featured_images getObject(int id) {
        V0300_1012__fix_page_null_and_orphan_featured_images obj = (V0300_1012__fix_page_null_and_orphan_featured_images) new Object();
        obj.id = id;
        return obj;
    }
}

