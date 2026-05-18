package com.applovin.shadow.okio.internal;

import Fa.b;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class ZipFilesKt$buildIndex$$inlined$sortedBy$1 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return b.d(((ZipEntry) obj).getCanonicalPath(), ((ZipEntry) obj2).getCanonicalPath());
    }
}
