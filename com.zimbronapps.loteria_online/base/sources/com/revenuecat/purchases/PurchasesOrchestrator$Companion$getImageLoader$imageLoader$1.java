package com.revenuecat.purchases;

import Na.n;
import W4.a;
import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$Companion$getImageLoader$imageLoader$1 extends u implements Qa.a {
    final /* synthetic */ String $cacheFolder;
    final /* synthetic */ Context $context;
    final /* synthetic */ long $maxCacheSizeBytes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$Companion$getImageLoader$imageLoader$1(Context context, String str, long j) {
        super(0);
        this.$context = context;
        this.$cacheFolder = str;
        this.$maxCacheSizeBytes = j;
    }

    public final W4.a invoke() {
        a.a aVar = new a.a();
        File cacheDir = this.$context.getCacheDir();
        t.f(cacheDir, "context.cacheDir");
        return aVar.b(n.w(cacheDir, this.$cacheFolder)).d(this.$maxCacheSizeBytes).a();
    }
}
