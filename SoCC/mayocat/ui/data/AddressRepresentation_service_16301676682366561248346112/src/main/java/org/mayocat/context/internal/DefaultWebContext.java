/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.context.internal;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.model.User;
import org.mayocat.configuration.ExposedSettings;
import org.mayocat.context.WebContext;
import org.mayocat.context.request.WebRequest;
import org.mayocat.context.scope.Flash;
import org.mayocat.context.scope.Session;
import org.mayocat.context.scope.cookie.CookieFlash;
import org.mayocat.context.scope.cookie.CookieSession;
import org.mayocat.theme.Breakpoint;
import org.mayocat.theme.Theme;
import com.google.common.base.Optional;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Default implementation of {@link WebContext}
 *
 * @version $Id: b13092035da000905c709872fcbd110d1037b0b8 $
 */
public class DefaultWebContext implements WebContext {

    public DefaultWebContext(Tenant tenant, User user) {
        String uri = MicroserviceApplication.projectUri + "/ms1/defaultwebcontext/defaultwebcontext?callerId=" + this.id + "&tenantId=tenant.id&userId=user.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public boolean isAvailable() {
        return (Boolean) null;
    }

    @Override
    public Tenant getTenant() {
        return (Tenant) null;
    }

    @Override
    public User getUser() {
        return (User) null;
    }

    @Override
    public void setUser(User user) {
        return;
    }

    @Override
    public void setTenant(Tenant tenant) {
        return;
    }

    @Override
    public Theme getTheme() {
        return (Theme) null;
    }

    @Override
    public void setTheme(Theme theme) {
        return;
    }

    @Override
    public void setSettings(Map<Class, Serializable> settings) {
        return;
    }

    @Override
    public <T extends ExposedSettings> T getSettings(Class<T> c) {
        return (T) null;
    }

    @Override
    public Locale getLocale() {
        return (Locale) null;
    }

    @Override
    public void setLocale(Locale locale) {
        return;
    }

    @Override
    public boolean isAlternativeLocale() {
        return (Boolean) null;
    }

    @Override
    public void setAlternativeLocale(boolean alternativeLocale) {
        return;
    }

    @Override
    public Session getSession() {
        return (Session) null;
    }

    @Override
    public void setSession(Session session) {
        return;
    }

    @Override
    public void setFlash(Flash flash) {
        return;
    }

    @Override
    public Flash getFlash() {
        return (Flash) null;
    }

    @Override
    public void flash(String name, Serializable value) {
        return;
    }

    @Override
    public void session(String name, Serializable value) {
        return;
    }

    @Override
    public WebRequest getRequest() {
        return (WebRequest) null;
    }

    @Override
    public void setRequest(WebRequest webRequest) {
        return;
    }

    public int id = 0;

    public static DefaultWebContext getObject(int id) {
        DefaultWebContext obj = (DefaultWebContext) new Object();
        obj.id = id;
        return obj;
    }
}

