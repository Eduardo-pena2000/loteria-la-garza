package com.revenuecat.purchases.ui.revenuecatui.customercenter.composables;

import Ca.I;
import Qa.p;
import b0.g1;
import b0.m;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SettingsButtonKt$ButtonContent$1 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ long $loadingColor;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsButtonKt$ButtonContent$1(String str, boolean z, long j, int i) {
        super(2);
        this.$title = str;
        this.$loading = z;
        this.$loadingColor = j;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        SettingsButtonKt.access$ButtonContent-XO-JAsU(this.$title, this.$loading, this.$loadingColor, mVar, g1.a(this.$$changed | 1));
    }
}
