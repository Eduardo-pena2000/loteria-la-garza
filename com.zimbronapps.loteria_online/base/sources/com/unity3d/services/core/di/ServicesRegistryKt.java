package com.unity3d.services.core.di;

import Qa.l;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ServicesRegistryKt {
    public static final ServicesRegistry registry(l registry) {
        t.g(registry, "registry");
        ServicesRegistry servicesRegistry = new ServicesRegistry();
        registry.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
