package com.google.firebase.analytics.connector.internal;

import B7.g;
import F7.a;
import F7.b;
import L7.c;
import L7.d;
import L7.q;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import v8.h;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    private static /* synthetic */ a lambda$getComponents$0(d dVar) {
        return b.h((g) dVar.a(g.class), (Context) dVar.a(Context.class), (i8.d) dVar.a(i8.d.class));
    }

    public static /* synthetic */ a zza(d dVar) {
        return lambda$getComponents$0(dVar);
    }

    @Keep
    @SuppressLint({"MissingPermission"})
    public List getComponents() {
        return Arrays.asList(new c[]{c.e(a.class).b(q.l(g.class)).b(q.l(Context.class)).b(q.l(i8.d.class)).f(G7.a.a).e().d(), h.b("fire-analytics", "23.0.0")});
    }
}
