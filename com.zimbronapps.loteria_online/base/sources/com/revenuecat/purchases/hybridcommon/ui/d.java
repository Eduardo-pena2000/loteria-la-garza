package com.revenuecat.purchases.hybridcommon.ui;

import android.os.Bundle;
import androidx.fragment.app.O;
import androidx.fragment.app.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class d implements O {
    public final /* synthetic */ PresentPaywallOptions a;
    public final /* synthetic */ u b;
    public final /* synthetic */ String c;

    public /* synthetic */ d(PresentPaywallOptions presentPaywallOptions, u uVar, String str) {
        this.a = presentPaywallOptions;
        this.b = uVar;
        this.c = str;
    }

    public final void a(String str, Bundle bundle) {
        PaywallHelpersKt.b(this.a, this.b, this.c, str, bundle);
    }
}
