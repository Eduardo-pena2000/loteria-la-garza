package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.t;
import okhttp3.Route;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RouteDatabase {
    public final Set a = new LinkedHashSet();

    public final synchronized void a(Route route) {
        t.g(route, "route");
        this.a.remove(route);
    }

    public final synchronized void b(Route failedRoute) {
        t.g(failedRoute, "failedRoute");
        this.a.add(failedRoute);
    }

    public final synchronized boolean c(Route route) {
        t.g(route, "route");
        return this.a.contains(route);
    }
}
