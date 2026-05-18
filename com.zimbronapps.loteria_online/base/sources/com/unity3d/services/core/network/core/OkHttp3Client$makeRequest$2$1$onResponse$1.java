package com.unity3d.services.core.network.core;

import Qa.a;
import kotlin.jvm.internal.u;
import xb.e;
import xb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OkHttp3Client$makeRequest$2$1$onResponse$1 extends u implements a {
    final /* synthetic */ e $buffer;
    final /* synthetic */ g $source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttp3Client$makeRequest$2$1$onResponse$1(g gVar, e eVar) {
        super(0);
        this.$source = gVar;
        this.$buffer = eVar;
    }

    public final Long invoke() {
        return Long.valueOf(this.$source.F(this.$buffer, 8192L));
    }
}
