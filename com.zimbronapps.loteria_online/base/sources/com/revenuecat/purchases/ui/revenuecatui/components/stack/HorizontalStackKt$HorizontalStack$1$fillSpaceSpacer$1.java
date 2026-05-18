package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Ca.I;
import F.V;
import F.Y;
import Qa.q;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HorizontalStackKt$HorizontalStack$1$fillSpaceSpacer$1 extends u implements q {
    final /* synthetic */ V $this_Row;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalStackKt$HorizontalStack$1$fillSpaceSpacer$1(V v) {
        super(3);
        this.$this_Row = v;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(((Number) obj).floatValue(), (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(float f, m mVar, int i) {
        if ((i & 6) == 0) {
            i |= mVar.c(f) ? 4 : 2;
        }
        if ((i & 19) == 18 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(-865996447, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.HorizontalStack.<anonymous>.<anonymous> (HorizontalStack.kt:43)");
        }
        Y.a(V.c(this.$this_Row, e.a, f, false, 2, (Object) null), mVar, 0);
        if (w.L()) {
            w.T();
        }
    }
}
