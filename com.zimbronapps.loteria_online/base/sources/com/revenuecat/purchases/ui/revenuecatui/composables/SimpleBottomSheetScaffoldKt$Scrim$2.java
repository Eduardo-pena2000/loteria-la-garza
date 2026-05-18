package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.a;
import Qa.p;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SimpleBottomSheetScaffoldKt$Scrim$2 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p $content;
    final /* synthetic */ e $modifier;
    final /* synthetic */ a $onClick;
    final /* synthetic */ float $radius;
    final /* synthetic */ boolean $show;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBottomSheetScaffoldKt$Scrim$2(boolean z, float f, a aVar, e eVar, p pVar, int i, int i2) {
        super(2);
        this.$show = z;
        this.$radius = f;
        this.$onClick = aVar;
        this.$modifier = eVar;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        SimpleBottomSheetScaffoldKt.access$Scrim-EUb7tLY(this.$show, this.$radius, this.$onClick, this.$modifier, this.$content, mVar, g1.a(this.$$changed | 1), this.$$default);
    }
}
