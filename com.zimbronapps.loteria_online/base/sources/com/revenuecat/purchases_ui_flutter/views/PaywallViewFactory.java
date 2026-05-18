package com.revenuecat.purchases_ui_flutter.views;

import Da.S;
import android.content.Context;
import da.o;
import io.flutter.plugin.platform.i;
import io.flutter.plugin.platform.j;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallViewFactory extends j {
    private final da.b messenger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallViewFactory(da.b messenger) {
        super(o.a);
        t.g(messenger, "messenger");
        this.messenger = messenger;
    }

    public i create(Context context, int i, Object obj) {
        t.g(context, "context");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            map = S.h();
        }
        return new PaywallView(context, i, this.messenger, map);
    }
}
