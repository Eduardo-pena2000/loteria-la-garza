package com.applovin.shadow.okhttp3.internal.connection;

import com.applovin.shadow.okhttp3.Route;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class RouteDatabase {
    private final Set failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        t.g(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(Route route) {
        t.g(route, "failedRoute");
        this.failedRoutes.add(route);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        t.g(route, "route");
        return this.failedRoutes.contains(route);
    }
}
