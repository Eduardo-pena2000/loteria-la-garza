package com.revenuecat.purchases.ui.revenuecatui.helpers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ContextExtensionsKt {
    public static final /* synthetic */ Activity getActivity(Context context) {
        t.g(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            t.f(context, "currentContext.baseContext");
        }
        return null;
    }
}
