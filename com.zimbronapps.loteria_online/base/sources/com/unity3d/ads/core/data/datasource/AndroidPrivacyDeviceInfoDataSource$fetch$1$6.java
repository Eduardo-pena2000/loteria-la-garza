package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.PiiKt;
import kotlin.jvm.internal.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public /* synthetic */ class AndroidPrivacyDeviceInfoDataSource$fetch$1$6 extends x {
    public AndroidPrivacyDeviceInfoDataSource$fetch$1$6(Object obj) {
        super(obj, PiiKt.Dsl.class, "appsetId", "getAppsetId()Ljava/lang/String;", 0);
    }

    public Object get() {
        return ((PiiKt.Dsl) this.receiver).getAppsetId();
    }

    public void set(Object obj) {
        ((PiiKt.Dsl) this.receiver).setAppsetId((String) obj);
    }
}
