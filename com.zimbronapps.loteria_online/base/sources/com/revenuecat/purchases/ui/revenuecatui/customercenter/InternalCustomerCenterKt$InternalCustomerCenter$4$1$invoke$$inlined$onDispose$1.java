package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import androidx.lifecycle.o;
import androidx.lifecycle.r;
import b0.X;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalCustomerCenterKt$InternalCustomerCenter$4$1$invoke$$inlined$onDispose$1 implements X {
    final /* synthetic */ r $lifecycleOwner$inlined;
    final /* synthetic */ o $observer$inlined;

    public InternalCustomerCenterKt$InternalCustomerCenter$4$1$invoke$$inlined$onDispose$1(r rVar, o oVar) {
        this.$lifecycleOwner$inlined = rVar;
        this.$observer$inlined = oVar;
    }

    public void dispose() {
        this.$lifecycleOwner$inlined.getLifecycle().removeObserver(this.$observer$inlined);
    }
}
