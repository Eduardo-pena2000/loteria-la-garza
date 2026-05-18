package com.unity3d.ads.core.domain.exposure;

import gatewayprotocol.v1.AllowedPiiKt;
import kotlin.jvm.internal.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public /* synthetic */ class CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4 extends x {
    public CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4(Object obj) {
        super(obj, AllowedPiiKt.Dsl.class, "idfv", "getIdfv()Z", 0);
    }

    public Object get() {
        return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfv());
    }

    public void set(Object obj) {
        ((AllowedPiiKt.Dsl) this.receiver).setIdfv(((Boolean) obj).booleanValue());
    }
}
