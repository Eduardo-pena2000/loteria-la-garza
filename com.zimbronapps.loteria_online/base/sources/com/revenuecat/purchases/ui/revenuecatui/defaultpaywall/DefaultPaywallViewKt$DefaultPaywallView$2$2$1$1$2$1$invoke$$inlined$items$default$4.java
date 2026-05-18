package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Ca.I;
import G.c;
import Qa.a;
import Qa.l;
import Qa.r;
import b0.m;
import b0.w;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$invoke$$inlined$items$default$4 extends u implements r {
    final /* synthetic */ long $foregroundOnAccentColor$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ long $mainColor$inlined;
    final /* synthetic */ l $onSelectPackage$inlined;
    final /* synthetic */ TemplateConfiguration.PackageInfo $selectedPackage$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$invoke$$inlined$items$default$4(List list, long j, long j2, TemplateConfiguration.PackageInfo packageInfo, l lVar) {
        super(4);
        this.$items = list;
        this.$mainColor$inlined = j;
        this.$foregroundOnAccentColor$inlined = j2;
        this.$selectedPackage$inlined = packageInfo;
        this.$onSelectPackage$inlined = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((c) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
        return I.a;
    }

    public final void invoke(c cVar, int i, m mVar, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (mVar.U(cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= mVar.d(i) ? 32 : 16;
        }
        if ((i3 & 147) == 146 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
        }
        TemplateConfiguration.PackageInfo packageInfo = (TemplateConfiguration.PackageInfo) this.$items.get(i);
        mVar.V(-350675214);
        Package rcPackage = packageInfo.getRcPackage();
        long j = this.$mainColor$inlined;
        long j2 = this.$foregroundOnAccentColor$inlined;
        boolean c = t.c(this.$selectedPackage$inlined, packageInfo);
        mVar.V(819982243);
        boolean U = mVar.U(this.$onSelectPackage$inlined) | mVar.U(packageInfo);
        Object C = mVar.C();
        if (U || C == m.a.a()) {
            C = new DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$2$1$1(this.$onSelectPackage$inlined, packageInfo);
            mVar.t(C);
        }
        mVar.P();
        DefaultProductCellKt.DefaultProductCell-qi6gXK8(rcPackage, j, j2, c, (a) C, null, mVar, 0, 32);
        mVar.P();
        if (w.L()) {
            w.T();
        }
    }
}
