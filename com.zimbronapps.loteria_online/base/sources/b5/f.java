package b5;

import Za.E;
import android.content.res.Resources;
import android.net.Uri;
import e5.m;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f implements d {
    private final boolean b(Uri uri) {
        String authority;
        return t.c(uri.getScheme(), "android.resource") && (authority = uri.getAuthority()) != null && !E.h0(authority) && uri.getPathSegments().size() == 2;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Uri a(Uri uri, m mVar) {
        if (!b(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = mVar.g().getPackageManager().getResourcesForApplication(authority);
        List pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
        if (identifier == 0) {
            throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
        }
        Uri parse = Uri.parse("android.resource://" + authority + '/' + identifier);
        t.f(parse, "parse(this)");
        return parse;
    }
}
