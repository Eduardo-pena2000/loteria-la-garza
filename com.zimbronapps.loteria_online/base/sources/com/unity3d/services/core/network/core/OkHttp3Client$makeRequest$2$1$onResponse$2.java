package com.unity3d.services.core.network.core;

import Qa.l;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OkHttp3Client$makeRequest$2$1$onResponse$2 extends u implements l {
    public static final OkHttp3Client$makeRequest$2$1$onResponse$2 INSTANCE = new OkHttp3Client$makeRequest$2$1$onResponse$2();

    public OkHttp3Client$makeRequest$2$1$onResponse$2() {
        super(1);
    }

    public final Boolean invoke(long j) {
        return Boolean.valueOf(j != -1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }
}
