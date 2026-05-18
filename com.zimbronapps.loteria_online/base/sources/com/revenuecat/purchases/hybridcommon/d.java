package com.revenuecat.purchases.hybridcommon;

import com.revenuecat.purchases.interfaces.Callback;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class d implements Callback {
    public final /* synthetic */ OnResultAny a;

    public /* synthetic */ d(OnResultAny onResultAny) {
        this.a = onResultAny;
    }

    public final void onReceived(Object obj) {
        CommonKt.d(this.a, (Boolean) obj);
    }
}
