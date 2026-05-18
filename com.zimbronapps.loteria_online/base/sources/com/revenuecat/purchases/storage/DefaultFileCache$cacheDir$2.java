package com.revenuecat.purchases.storage;

import Qa.a;
import java.io.File;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DefaultFileCache$cacheDir$2 extends u implements a {
    final /* synthetic */ DefaultFileCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFileCache$cacheDir$2(DefaultFileCache defaultFileCache) {
        super(0);
        this.this$0 = defaultFileCache;
    }

    public final File invoke() {
        File file = new File(DefaultFileCache.access$getContext$p(this.this$0).getCacheDir(), "rc_files");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
