package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.l;
import Qa.p;
import U0.f;
import X.m0;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import d1.H;
import d1.L;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FooterKt$Button$1$3$3$1 extends u implements p {
    final /* synthetic */ e $childModifier;
    final /* synthetic */ long $color;
    final /* synthetic */ int $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterKt$Button$1$3$3$1(int i, e eVar, long j) {
        super(2);
        this.$it = i;
        this.$childModifier = eVar;
        this.$color = j;
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
            w.U(1301841013, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Button.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Footer.kt:235)");
        }
        String a = f.a(this.$it, mVar, 0);
        int a2 = j.b.a();
        m0.b(a, this.$childModifier, this.$color, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, j.h(a2), 0L, 0, true, 0, 0, (l) null, FooterConstants.INSTANCE.style(mVar, 6), mVar, 0, 384, 60920);
        if (w.L()) {
            w.T();
        }
    }
}
