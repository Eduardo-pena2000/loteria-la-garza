package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import F.V;
import Qa.a;
import Qa.p;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import java.util.Arrays;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FooterKt$Button$2 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ a $action;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ long $color;
    final /* synthetic */ int[] $texts;
    final /* synthetic */ V $this_Button;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterKt$Button$2(V v, long j, e eVar, int[] iArr, a aVar, int i) {
        super(2);
        this.$this_Button = v;
        this.$color = j;
        this.$childModifier = eVar;
        this.$texts = iArr;
        this.$action = aVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        V v = this.$this_Button;
        long j = this.$color;
        e eVar = this.$childModifier;
        int[] iArr = this.$texts;
        FooterKt.access$Button-sW7UJKQ(v, j, eVar, Arrays.copyOf(iArr, iArr.length), this.$action, mVar, g1.a(this.$$changed | 1));
    }
}
