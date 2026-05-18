package com.revenuecat.purchases.ui.revenuecatui.templates;

import Qa.l;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template1Kt$HeaderImage$1$1$2$1 extends u implements l {
    final /* synthetic */ int $screenHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template1Kt$HeaderImage$1$1$2$1(int i) {
        super(1);
        this.$screenHeight = i;
    }

    public final e invoke(e conditional) {
        t.g(conditional, "$this$conditional");
        return g.i(g.h(conditional, 0.0f, 1, (Object) null), h.g(h.g(this.$screenHeight) / 2.0f));
    }
}
