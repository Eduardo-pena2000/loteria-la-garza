package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import F.h;
import Qa.a;
import Qa.p;
import b0.g1;
import b0.m;
import kotlin.jvm.internal.u;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CloseButtonKt$CloseButton$2 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $actionInProgress;
    final /* synthetic */ r0 $color;
    final /* synthetic */ a $onClick;
    final /* synthetic */ boolean $shouldDisplayDismissButton;
    final /* synthetic */ h $this_CloseButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseButtonKt$CloseButton$2(h hVar, boolean z, r0 r0Var, boolean z2, a aVar, int i) {
        super(2);
        this.$this_CloseButton = hVar;
        this.$shouldDisplayDismissButton = z;
        this.$color = r0Var;
        this.$actionInProgress = z2;
        this.$onClick = aVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        CloseButtonKt.CloseButton-drOMvmE(this.$this_CloseButton, this.$shouldDisplayDismissButton, this.$color, this.$actionInProgress, this.$onClick, mVar, g1.a(this.$$changed | 1));
    }
}
