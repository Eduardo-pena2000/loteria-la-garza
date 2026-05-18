package com.revenuecat.purchases.utils;

import android.content.Context;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultIsDebugBuildProvider implements IsDebugBuildProvider {
    private final Context context;

    public DefaultIsDebugBuildProvider(Context context) {
        t.g(context, "context");
        Context applicationContext = context.getApplicationContext();
        t.f(applicationContext, "context.applicationContext");
        this.context = applicationContext;
    }

    public boolean invoke() {
        return (this.context.getApplicationInfo().flags & 2) != 0;
    }
}
