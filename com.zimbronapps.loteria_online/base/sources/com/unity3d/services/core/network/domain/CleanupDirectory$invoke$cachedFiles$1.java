package com.unity3d.services.core.network.domain;

import Qa.l;
import java.io.File;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public /* synthetic */ class CleanupDirectory$invoke$cachedFiles$1 extends q implements l {
    public static final CleanupDirectory$invoke$cachedFiles$1 INSTANCE = new CleanupDirectory$invoke$cachedFiles$1();

    public CleanupDirectory$invoke$cachedFiles$1() {
        super(1, File.class, "isFile", "isFile()Z", 0);
    }

    public final Boolean invoke(File p0) {
        t.g(p0, "p0");
        return Boolean.valueOf(p0.isFile());
    }
}
