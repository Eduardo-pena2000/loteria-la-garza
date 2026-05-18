package com.revenuecat.purchases.ui.revenuecatui.extensions;

import Qa.l;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UrisKt {
    public static final void openUriOrElse(Context context, String uri, l fallbackAction) {
        t.g(context, "<this>");
        t.g(uri, "uri");
        t.g(fallbackAction, "fallbackAction");
        try {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uri)));
            } catch (ActivityNotFoundException e) {
                fallbackAction.invoke(e);
            }
        } catch (IllegalArgumentException e2) {
            fallbackAction.invoke(e2);
        }
    }
}
