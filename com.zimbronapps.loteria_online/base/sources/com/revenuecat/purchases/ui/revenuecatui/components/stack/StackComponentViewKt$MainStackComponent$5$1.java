package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Ca.I;
import Qa.p;
import Qa.q;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentViewKt$MainStackComponent$5$1 extends u implements p {
    final /* synthetic */ e $borderModifier;
    final /* synthetic */ e $innerShapeModifier;
    final /* synthetic */ q $stack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentViewKt$MainStackComponent$5$1(q qVar, e eVar, e eVar2) {
        super(2);
        this.$stack = qVar;
        this.$borderModifier = eVar;
        this.$innerShapeModifier = eVar2;
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
            w.U(-848942762, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.MainStackComponent.<anonymous>.<anonymous> (StackComponentView.kt:683)");
        }
        this.$stack.invoke(this.$borderModifier.then(this.$innerShapeModifier), mVar, 48);
        if (w.L()) {
            w.T();
        }
    }
}
