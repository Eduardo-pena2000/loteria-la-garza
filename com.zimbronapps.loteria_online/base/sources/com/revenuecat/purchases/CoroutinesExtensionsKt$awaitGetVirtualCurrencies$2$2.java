package com.revenuecat.purchases;

import Ca.I;
import Ca.s;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CoroutinesExtensionsKt$awaitGetVirtualCurrencies$2$2 extends u implements Qa.l {
    final /* synthetic */ Ga.e $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtensionsKt$awaitGetVirtualCurrencies$2$2(Ga.e eVar) {
        super(1);
        this.$continuation = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((VirtualCurrencies) obj);
        return I.a;
    }

    public final void invoke(VirtualCurrencies virtualCurrencies) {
        t.g(virtualCurrencies, "it");
        this.$continuation.resumeWith(s.b(virtualCurrencies));
    }
}
