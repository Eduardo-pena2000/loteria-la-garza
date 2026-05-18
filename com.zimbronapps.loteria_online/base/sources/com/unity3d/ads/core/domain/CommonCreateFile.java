package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonCreateFile implements CreateFile {
    public File invoke(File parent, String child) {
        t.g(parent, "parent");
        t.g(child, "child");
        return new File(parent, child);
    }

    public File invoke(String pathname) {
        t.g(pathname, "pathname");
        return new File(pathname);
    }
}
