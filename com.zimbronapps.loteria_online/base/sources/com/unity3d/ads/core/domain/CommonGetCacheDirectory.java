package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonGetCacheDirectory implements GetCacheDirectory {
    public File invoke(File cacheDirectoryBase, String cacheDirectoryPath) {
        t.g(cacheDirectoryBase, "cacheDirectoryBase");
        t.g(cacheDirectoryPath, "cacheDirectoryPath");
        return new File(cacheDirectoryBase, cacheDirectoryPath);
    }
}
