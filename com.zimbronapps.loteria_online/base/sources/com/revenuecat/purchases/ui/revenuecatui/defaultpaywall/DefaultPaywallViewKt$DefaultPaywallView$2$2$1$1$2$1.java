package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Ca.I;
import G.y;
import Qa.l;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import j0.i;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1 extends u implements l {
    final /* synthetic */ long $foregroundOnAccentColor;
    final /* synthetic */ long $mainColor;
    final /* synthetic */ l $onSelectPackage;
    final /* synthetic */ List $packages;
    final /* synthetic */ TemplateConfiguration.PackageInfo $selectedPackage;

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final Object invoke(TemplateConfiguration.PackageInfo it) {
            t.g(it, "it");
            return it.getRcPackage().getIdentifier();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1(List list, long j, long j2, TemplateConfiguration.PackageInfo packageInfo, l lVar) {
        super(1);
        this.$packages = list;
        this.$mainColor = j;
        this.$foregroundOnAccentColor = j2;
        this.$selectedPackage = packageInfo;
        this.$onSelectPackage = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((y) obj);
        return I.a;
    }

    public final void invoke(y LazyColumn) {
        t.g(LazyColumn, "$this$LazyColumn");
        List list = this.$packages;
        1 r0 = 1.INSTANCE;
        long j = this.$mainColor;
        long j2 = this.$foregroundOnAccentColor;
        TemplateConfiguration.PackageInfo packageInfo = this.$selectedPackage;
        l lVar = this.$onSelectPackage;
        LazyColumn.a(list.size(), r0 != null ? new DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$invoke$$inlined$items$default$2(r0, list) : null, new DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$invoke$$inlined$items$default$3(DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$invoke$$inlined$items$default$1.INSTANCE, list), i.b(-632812321, true, new DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$invoke$$inlined$items$default$4(list, j, j2, packageInfo, lVar)));
        if (this.$packages.isEmpty()) {
            return;
        }
        y.e(LazyColumn, (Object) null, (Object) null, ComposableSingletons$DefaultPaywallViewKt.INSTANCE.getLambda-1$revenuecatui_defaultsBc8Release(), 3, (Object) null);
    }
}
