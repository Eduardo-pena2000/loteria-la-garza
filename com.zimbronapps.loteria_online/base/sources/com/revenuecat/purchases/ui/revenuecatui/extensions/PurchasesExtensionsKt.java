package com.revenuecat.purchases.ui.revenuecatui.extensions;

import T4.d;
import android.content.Context;
import com.revenuecat.purchases.Purchases;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PurchasesExtensionsKt {
    public static final d getImageLoaderTyped(Purchases.Companion companion, Context context) {
        t.g(companion, "<this>");
        t.g(context, "context");
        Object imageLoader = Purchases.Companion.getImageLoader(context);
        t.e(imageLoader, "null cannot be cast to non-null type coil.ImageLoader");
        return (d) imageLoader;
    }
}
