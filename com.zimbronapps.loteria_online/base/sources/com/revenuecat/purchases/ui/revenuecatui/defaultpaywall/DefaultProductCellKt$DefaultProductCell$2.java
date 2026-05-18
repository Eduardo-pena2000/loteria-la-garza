package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Ca.I;
import Qa.a;
import Qa.p;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import com.revenuecat.purchases.Package;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultProductCellKt$DefaultProductCell$2 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $accentColor;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ e $modifier;
    final /* synthetic */ a $onSelect;
    final /* synthetic */ Package $pkg;
    final /* synthetic */ long $selectedFontColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultProductCellKt$DefaultProductCell$2(Package r1, long j, long j2, boolean z, a aVar, e eVar, int i, int i2) {
        super(2);
        this.$pkg = r1;
        this.$accentColor = j;
        this.$selectedFontColor = j2;
        this.$isSelected = z;
        this.$onSelect = aVar;
        this.$modifier = eVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        DefaultProductCellKt.DefaultProductCell-qi6gXK8(this.$pkg, this.$accentColor, this.$selectedFontColor, this.$isSelected, this.$onSelect, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
    }
}
