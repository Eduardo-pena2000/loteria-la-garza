package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Ca.I;
import Qa.a;
import Qa.p;
import b0.g1;
import b0.m;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultPaywallViewKt$DefaultPaywallFooter$2 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $foregroundOnAccentColor;
    final /* synthetic */ long $mainColor;
    final /* synthetic */ a $onPurchase;
    final /* synthetic */ a $onRestore;
    final /* synthetic */ boolean $purchaseEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaywallViewKt$DefaultPaywallFooter$2(a aVar, a aVar2, boolean z, long j, long j2, int i) {
        super(2);
        this.$onPurchase = aVar;
        this.$onRestore = aVar2;
        this.$purchaseEnabled = z;
        this.$mainColor = j;
        this.$foregroundOnAccentColor = j2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        DefaultPaywallViewKt.access$DefaultPaywallFooter-ZkgLGzA(this.$onPurchase, this.$onRestore, this.$purchaseEnabled, this.$mainColor, this.$foregroundOnAccentColor, mVar, g1.a(this.$$changed | 1));
    }
}
