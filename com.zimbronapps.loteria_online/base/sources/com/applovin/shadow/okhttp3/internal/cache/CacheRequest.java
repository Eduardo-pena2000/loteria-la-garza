package com.applovin.shadow.okhttp3.internal.cache;

import com.applovin.shadow.okio.Sink;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface CacheRequest {
    void abort();

    Sink body() throws IOException;
}
