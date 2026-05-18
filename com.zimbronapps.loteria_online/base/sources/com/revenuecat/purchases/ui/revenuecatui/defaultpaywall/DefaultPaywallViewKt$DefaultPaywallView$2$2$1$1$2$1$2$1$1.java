package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Ca.I;
import Qa.a;
import Qa.l;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$2$1$1 extends u implements a {
    final /* synthetic */ l $onSelectPackage;
    final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$2$1$1(l lVar, TemplateConfiguration.PackageInfo packageInfo) {
        super(0);
        this.$onSelectPackage = lVar;
        this.$packageInfo = packageInfo;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$onSelectPackage.invoke(this.$packageInfo);
    }
}
