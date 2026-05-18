package com.revenuecat.purchases.hybridcommon;

import Ca.I;
import Qa.l;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CommonKt$setAppstackAttributionParams$1$onSuccess$1 extends u implements l {
    final /* synthetic */ OnResult $onResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonKt$setAppstackAttributionParams$1$onSuccess$1(OnResult onResult) {
        super(1);
        this.$onResult = onResult;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map) obj);
        return I.a;
    }

    public final void invoke(Map map) {
        t.g(map, "map");
        this.$onResult.onReceived(map);
    }
}
