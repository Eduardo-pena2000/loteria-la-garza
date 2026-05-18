package com.unity3d.ads.core.domain.exposure;

import gatewayprotocol.v1.AllowedPiiKt;
import kotlin.jvm.internal.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public /* synthetic */ class CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2 extends x {
    public CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2(Object obj) {
        super(obj, AllowedPiiKt.Dsl.class, "idfa", "getIdfa()Z", 0);
    }

    public Object get() {
        return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfa());
    }

    public void set(Object obj) {
        ((AllowedPiiKt.Dsl) this.receiver).setIdfa(((Boolean) obj).booleanValue());
    }
}
