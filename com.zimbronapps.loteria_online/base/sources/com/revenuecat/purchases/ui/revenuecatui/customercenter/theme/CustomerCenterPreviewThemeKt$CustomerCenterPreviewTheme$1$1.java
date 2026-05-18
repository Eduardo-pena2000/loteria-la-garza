package com.revenuecat.purchases.ui.revenuecatui.customercenter.theme;

import Ca.I;
import Qa.a;
import T1.m0;
import android.app.Activity;
import android.view.View;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterPreviewThemeKt$CustomerCenterPreviewTheme$1$1 extends u implements a {
    final /* synthetic */ boolean $isDarkTheme;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerCenterPreviewThemeKt$CustomerCenterPreviewTheme$1$1(View view, boolean z) {
        super(0);
        this.$view = view;
        this.$isDarkTheme = z;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        Activity context = this.$view.getContext();
        t.e(context, "null cannot be cast to non-null type android.app.Activity");
        m0.a(context.getWindow(), this.$view).b(!this.$isDarkTheme);
    }
}
