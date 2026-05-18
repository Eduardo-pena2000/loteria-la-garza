package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Ca.I;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ShowCustomerCenter extends h.a {
    public static final int $stable = 0;

    public void parseResult(int i, Intent intent) {
    }

    public Intent createIntent(Context context, I input) {
        t.g(context, "context");
        t.g(input, "input");
        return CustomerCenterActivity.Companion.createIntent$revenuecatui_defaultsBc8Release(context);
    }

    public /* bridge */ /* synthetic */ Object parseResult(int i, Intent intent) {
        parseResult(i, intent);
        return I.a;
    }
}
