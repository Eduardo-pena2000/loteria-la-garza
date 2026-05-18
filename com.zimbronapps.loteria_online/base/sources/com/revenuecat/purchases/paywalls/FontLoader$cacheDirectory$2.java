package com.revenuecat.purchases.paywalls;

import java.io.File;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FontLoader$cacheDirectory$2 extends u implements Qa.a {
    final /* synthetic */ FontLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontLoader$cacheDirectory$2(FontLoader fontLoader) {
        super(0);
        this.this$0 = fontLoader;
    }

    public final File invoke() {
        File access$getProvidedCacheDir$p = FontLoader.access$getProvidedCacheDir$p(this.this$0);
        if (access$getProvidedCacheDir$p != null) {
            return access$getProvidedCacheDir$p;
        }
        File cacheDir = FontLoader.access$getContext$p(this.this$0).getCacheDir();
        if (cacheDir != null) {
            return new File(cacheDir, "rc_paywall_fonts");
        }
        return null;
    }
}
