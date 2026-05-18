package com.revenuecat.purchases.ui.revenuecatui.data;

import Ca.s;
import Ga.e;
import com.revenuecat.purchases.ui.revenuecatui.utils.Resumable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallViewModelImpl$performPurchase$shouldResume$1$1 implements Resumable {
    final /* synthetic */ e $continuation;

    public PaywallViewModelImpl$performPurchase$shouldResume$1$1(e eVar) {
        this.$continuation = eVar;
    }

    public void invoke(boolean z) {
        Resumable.DefaultImpls.invoke(this, z);
    }

    public final void resume(boolean z) {
        this.$continuation.resumeWith(s.b(Boolean.valueOf(z)));
    }
}
