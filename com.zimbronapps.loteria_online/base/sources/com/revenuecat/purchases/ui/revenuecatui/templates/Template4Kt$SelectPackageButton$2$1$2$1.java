package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import Qa.l;
import W0.B;
import W0.D;
import Z0.e;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template4Kt$SelectPackageButton$2$1$2$1 extends u implements l {
    final /* synthetic */ String $discountText;
    final /* synthetic */ boolean $isSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template4Kt$SelectPackageButton$2$1$2$1(boolean z, String str) {
        super(1);
        this.$isSelected = z;
        this.$discountText = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((D) obj);
        return I.a;
    }

    public final void invoke(D semantics) {
        t.g(semantics, "$this$semantics");
        B.d0(semantics, this.$isSelected);
        String str = this.$discountText;
        if (str != null) {
            B.i0(semantics, new e(str, (List) null, (List) null, 6, (k) null));
        }
    }
}
