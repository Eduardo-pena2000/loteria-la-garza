package com.unity3d.services.core.di;

import Ca.l;
import Qa.a;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class Factory implements l {
    private final a initializer;

    public Factory(a initializer) {
        t.g(initializer, "initializer");
        this.initializer = initializer;
    }

    public Object getValue() {
        return this.initializer.invoke();
    }

    public boolean isInitialized() {
        return false;
    }
}
