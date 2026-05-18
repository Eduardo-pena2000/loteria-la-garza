package com.unity3d.services.core.network.domain;

import Fa.b;
import java.io.File;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CleanupDirectory$invoke$$inlined$sortedBy$1 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return b.d(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
    }
}
