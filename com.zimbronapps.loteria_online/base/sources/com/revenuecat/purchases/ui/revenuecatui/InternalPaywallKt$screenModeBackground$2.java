package com.revenuecat.purchases.ui.revenuecatui;

import M.i;
import Qa.l;
import androidx.compose.foundation.a;
import androidx.compose.ui.e;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import s0.h;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalPaywallKt$screenModeBackground$2 extends u implements l {
    final /* synthetic */ long $backgroundColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalPaywallKt$screenModeBackground$2(long j) {
        super(1);
        this.$backgroundColor = j;
    }

    public final e invoke(e conditional) {
        t.g(conditional, "$this$conditional");
        e.a aVar = e.a;
        UIConstant uIConstant = UIConstant.INSTANCE;
        return a.d(h.a(aVar, i.f(uIConstant.getDefaultCornerRadius-D9Ej5fM(), uIConstant.getDefaultCornerRadius-D9Ej5fM(), 0.0f, 0.0f, 12, (Object) null)), this.$backgroundColor, (E1) null, 2, (Object) null);
    }
}
