package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public /* synthetic */ class InternalPaywallKt$LoadedPaywall$1$1$1 extends q implements l {
    public InternalPaywallKt$LoadedPaywall$1$1$1(Object obj) {
        super(1, obj, PaywallViewModel.class, "selectPackage", "selectPackage(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TemplateConfiguration.PackageInfo) obj);
        return I.a;
    }

    public final void invoke(TemplateConfiguration.PackageInfo p0) {
        t.g(p0, "p0");
        ((PaywallViewModel) this.receiver).selectPackage(p0);
    }
}
