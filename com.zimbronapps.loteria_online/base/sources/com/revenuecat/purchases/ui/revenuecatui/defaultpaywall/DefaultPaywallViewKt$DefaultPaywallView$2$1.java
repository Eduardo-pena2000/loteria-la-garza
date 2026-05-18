package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Ca.I;
import Qa.a;
import Qa.p;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import java.util.List;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultPaywallViewKt$DefaultPaywallView$2$1 extends u implements p {
    final /* synthetic */ long $foregroundOnAccentColor;
    final /* synthetic */ long $mainColor;
    final /* synthetic */ a $onPurchase;
    final /* synthetic */ a $onRestore;
    final /* synthetic */ List $packages;
    final /* synthetic */ TemplateConfiguration.PackageInfo $selectedPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaywallViewKt$DefaultPaywallView$2$1(List list, a aVar, a aVar2, TemplateConfiguration.PackageInfo packageInfo, long j, long j2) {
        super(2);
        this.$packages = list;
        this.$onPurchase = aVar;
        this.$onRestore = aVar2;
        this.$selectedPackage = packageInfo;
        this.$mainColor = j;
        this.$foregroundOnAccentColor = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        if ((i & 3) == 2 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(-1275945433, i, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallView.<anonymous>.<anonymous> (DefaultPaywallView.kt:153)");
        }
        if (!this.$packages.isEmpty()) {
            DefaultPaywallViewKt.access$DefaultPaywallFooter-ZkgLGzA(this.$onPurchase, this.$onRestore, this.$selectedPackage != null, this.$mainColor, this.$foregroundOnAccentColor, mVar, 0);
        }
        if (w.L()) {
            w.T();
        }
    }
}
