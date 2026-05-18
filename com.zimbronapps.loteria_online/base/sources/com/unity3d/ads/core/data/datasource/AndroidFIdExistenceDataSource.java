package com.unity3d.ads.core.data.datasource;

import Ca.s;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidFIdExistenceDataSource implements FIdExistenceDataSource {
    private final String className;

    public AndroidFIdExistenceDataSource(String className) {
        t.g(className, "className");
        this.className = className;
    }

    public boolean invoke() {
        Object b;
        try {
            s.a aVar = s.b;
            b = s.b(Class.forName(this.className));
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(Ca.t.a(th));
        }
        return s.h(b);
    }
}
