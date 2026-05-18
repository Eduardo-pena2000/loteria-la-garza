package com.revenuecat.purchases.ui.revenuecatui.helpers;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallResourceProviderKt {
    public static final /* synthetic */ String access$applicationName(Context context) {
        return applicationName(context);
    }

    public static final /* synthetic */ String access$getResourceEntryNameOrNull(Resources resources, int i) {
        return getResourceEntryNameOrNull(resources, i);
    }

    private static final String applicationName(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    private static final String getResourceEntryNameOrNull(Resources resources, int i) {
        try {
            return resources.getResourceEntryName(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static final ResourceProvider toResourceProvider(Context context) {
        t.g(context, "<this>");
        return new PaywallResourceProvider(context);
    }
}
