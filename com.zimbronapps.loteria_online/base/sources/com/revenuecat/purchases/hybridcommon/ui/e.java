package com.revenuecat.purchases.hybridcommon.ui;

import androidx.fragment.app.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ u a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PresentPaywallOptions c;
    public final /* synthetic */ PresentPaywallOptions d;

    public /* synthetic */ e(u uVar, String str, PresentPaywallOptions presentPaywallOptions, PresentPaywallOptions presentPaywallOptions2) {
        this.a = uVar;
        this.b = str;
        this.c = presentPaywallOptions;
        this.d = presentPaywallOptions2;
    }

    public final void run() {
        PaywallHelpersKt.a(this.a, this.b, this.c, this.d);
    }
}
