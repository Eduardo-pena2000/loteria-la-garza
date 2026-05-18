package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import F.V;
import Qa.l;
import Qa.q;
import W0.D;
import W0.s;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import j0.i;
import java.util.ArrayList;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FooterKt$Button$1$3 extends u implements q {
    final /* synthetic */ e $childModifier;
    final /* synthetic */ long $color;
    final /* synthetic */ int[] $texts;

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final void invoke(D clearAndSetSemantics) {
            t.g(clearAndSetSemantics, "$this$clearAndSetSemantics");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((D) obj);
            return I.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterKt$Button$1$3(int[] iArr, e eVar, long j) {
        super(3);
        this.$texts = iArr;
        this.$childModifier = eVar;
        this.$color = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((V) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(V TextButton, m mVar, int i) {
        t.g(TextButton, "$this$TextButton");
        int i2 = (i & 6) == 0 ? i | (mVar.U(TextButton) ? 4 : 2) : i;
        if ((i2 & 19) == 18 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(365963733, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Button.<anonymous>.<anonymous> (Footer.kt:216)");
        }
        e c = s.c(e.a, 1.INSTANCE);
        mVar.V(-1033616621);
        int[] iArr = this.$texts;
        e eVar = this.$childModifier;
        long j = this.$color;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i3 : iArr) {
            arrayList.add(i.d(-1943754282, true, new FooterKt$Button$1$3$2$1(i3, eVar, j), mVar, 54));
        }
        mVar.P();
        mVar.V(-1033598812);
        int[] iArr2 = this.$texts;
        e eVar2 = this.$childModifier;
        long j2 = this.$color;
        ArrayList arrayList2 = new ArrayList(iArr2.length);
        for (int i4 : iArr2) {
            arrayList2.add(i.d(1301841013, true, new FooterKt$Button$1$3$3$1(i4, eVar2, j2), mVar, 54));
        }
        mVar.P();
        AdaptiveComposableKt.AdaptiveComposable(TextButton, c, FooterKt.access$Button_sW7UJKQ$merge(arrayList, arrayList2), mVar, i2 & 14, 0);
        if (w.L()) {
            w.T();
        }
    }
}
