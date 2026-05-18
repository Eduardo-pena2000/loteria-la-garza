package com.applovin.shadow.okio.internal;

import Qa.l;
import com.applovin.shadow.okio.internal.ResourceFileSystem;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class ResourceFileSystem$toJarRoot$zip$1 extends u implements l {
    public static final ResourceFileSystem$toJarRoot$zip$1 INSTANCE = new ResourceFileSystem$toJarRoot$zip$1();

    public ResourceFileSystem$toJarRoot$zip$1() {
        super(1);
    }

    public final Boolean invoke(ZipEntry zipEntry) {
        t.g(zipEntry, "entry");
        return Boolean.valueOf(ResourceFileSystem.Companion.access$keepPath(ResourceFileSystem.access$getCompanion$p(), zipEntry.getCanonicalPath()));
    }
}
