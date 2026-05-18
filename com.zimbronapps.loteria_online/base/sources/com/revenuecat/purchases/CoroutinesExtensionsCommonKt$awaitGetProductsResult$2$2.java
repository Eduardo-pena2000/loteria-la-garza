package com.revenuecat.purchases;

import Ca.I;
import Ca.s;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2 extends u implements Qa.l {
    final /* synthetic */ Ga.e $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2(Ga.e eVar) {
        super(1);
        this.$continuation = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return I.a;
    }

    public final void invoke(List list) {
        t.g(list, "storeProducts");
        this.$continuation.resumeWith(s.b(s.a(s.b(list))));
    }
}
