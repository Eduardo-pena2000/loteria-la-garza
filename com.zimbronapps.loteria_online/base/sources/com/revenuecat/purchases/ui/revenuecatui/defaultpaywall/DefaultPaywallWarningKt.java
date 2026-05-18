package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import androidx.compose.ui.e;
import b0.B1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultPaywallWarningKt {
    public static final void DefaultPaywallWarning-3IgeMak(PaywallWarning warning, long j, e eVar, m mVar, int i, int i2) {
        t.g(warning, "warning");
        m i3 = mVar.i(-1893499378);
        if ((i & 1) == 0 && i3.j()) {
            i3.M();
        } else {
            if ((i2 & 4) != 0) {
                eVar = e.a;
            }
            if (w.L()) {
                w.U(-1893499378, i, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallWarning (DefaultPaywallWarning.kt:13)");
            }
            if (w.L()) {
                w.T();
            }
        }
        e eVar2 = eVar;
        B1 l = i3.l();
        if (l != null) {
            l.a(new DefaultPaywallWarningKt$DefaultPaywallWarning$1(warning, j, eVar2, i, i2));
        }
    }
}
