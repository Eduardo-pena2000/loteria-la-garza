package com.unity3d.services.core.di;

import Ca.l;
import Qa.a;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ServiceFactoryKt {
    public static final l factoryOf(a initializer) {
        t.g(initializer, "initializer");
        return new Factory(initializer);
    }
}
