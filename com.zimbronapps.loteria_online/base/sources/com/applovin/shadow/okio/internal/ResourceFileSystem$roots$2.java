package com.applovin.shadow.okio.internal;

import Qa.a;
import java.util.List;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class ResourceFileSystem$roots$2 extends u implements a {
    final /* synthetic */ ResourceFileSystem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceFileSystem$roots$2(ResourceFileSystem resourceFileSystem) {
        super(0);
        this.this$0 = resourceFileSystem;
    }

    public final List invoke() {
        ResourceFileSystem resourceFileSystem = this.this$0;
        return ResourceFileSystem.access$toClasspathRoots(resourceFileSystem, ResourceFileSystem.access$getClassLoader$p(resourceFileSystem));
    }
}
