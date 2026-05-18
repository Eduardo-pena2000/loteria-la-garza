package com.revenuecat.purchases;

import Ca.s;
import com.revenuecat.purchases.interfaces.Callback;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CoroutinesExtensionsCommonKt$awaitCanMakePayments$2$1 implements Callback {
    final /* synthetic */ Ga.e $continuation;

    public CoroutinesExtensionsCommonKt$awaitCanMakePayments$2$1(Ga.e eVar) {
        this.$continuation = eVar;
    }

    public final void onReceived(Boolean bool) {
        this.$continuation.resumeWith(s.b(bool));
    }
}
