package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.l;
import androidx.compose.ui.layout.q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import z.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ThumbNode$measure$3 extends u implements l {
    final /* synthetic */ float $offset;
    final /* synthetic */ q $placeable;
    final /* synthetic */ ThumbNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbNode$measure$3(q qVar, ThumbNode thumbNode, float f) {
        super(1);
        this.$placeable = qVar;
        this.this$0 = thumbNode;
        this.$offset = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q.a) obj);
        return I.a;
    }

    public final void invoke(q.a layout) {
        t.g(layout, "$this$layout");
        q qVar = this.$placeable;
        a access$getOffsetAnim$p = ThumbNode.access$getOffsetAnim$p(this.this$0);
        q.a.Z(layout, qVar, (int) (access$getOffsetAnim$p != null ? ((Number) access$getOffsetAnim$p.m()).floatValue() : this.$offset), 0, 0.0f, 4, (Object) null);
    }
}
