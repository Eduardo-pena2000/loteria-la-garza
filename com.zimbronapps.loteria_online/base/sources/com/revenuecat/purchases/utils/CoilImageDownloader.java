package com.revenuecat.purchases.utils;

import android.content.Context;
import android.net.Uri;
import com.revenuecat.purchases.PurchasesOrchestrator;
import e5.h;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CoilImageDownloader {
    private final Context applicationContext;

    public CoilImageDownloader(Context applicationContext) {
        t.g(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    public final void downloadImage(Uri uri) {
        t.g(uri, "uri");
        PurchasesOrchestrator.Companion.getImageLoader(this.applicationContext).c(new h.a(this.applicationContext).c(uri).a());
    }
}
