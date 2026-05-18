package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.PiiKt;
import kotlin.jvm.internal.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public /* synthetic */ class AndroidPrivacyDeviceInfoDataSource$fetch$1$3 extends x {
    public AndroidPrivacyDeviceInfoDataSource$fetch$1$3(Object obj) {
        super(obj, PiiKt.Dsl.class, "fid", "getFid()Ljava/lang/String;", 0);
    }

    public Object get() {
        return ((PiiKt.Dsl) this.receiver).getFid();
    }

    public void set(Object obj) {
        ((PiiKt.Dsl) this.receiver).setFid((String) obj);
    }
}
