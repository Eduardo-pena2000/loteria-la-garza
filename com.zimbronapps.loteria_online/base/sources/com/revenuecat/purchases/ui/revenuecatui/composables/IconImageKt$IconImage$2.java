package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.p;
import android.net.Uri;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IconImageKt$IconImage$2 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ float $iconCornerRadius;
    final /* synthetic */ float $maxWidth;
    final /* synthetic */ Uri $uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconImageKt$IconImage$2(Uri uri, float f, float f2, e eVar, int i, int i2) {
        super(2);
        this.$uri = uri;
        this.$maxWidth = f;
        this.$iconCornerRadius = f2;
        this.$childModifier = eVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        IconImageKt.IconImage-djqs-MU(this.$uri, this.$maxWidth, this.$iconCornerRadius, this.$childModifier, mVar, g1.a(this.$$changed | 1), this.$$default);
    }
}
