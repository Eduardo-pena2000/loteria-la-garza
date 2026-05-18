package com.google.android.gms.measurement;

import B2.a;
import android.content.Context;
import android.content.Intent;
import k7.U2;
import k7.V2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AppMeasurementReceiver extends a implements U2 {
    public V2 c;

    public void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    public void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new V2(this);
        }
        this.c.a(context, intent);
    }
}
