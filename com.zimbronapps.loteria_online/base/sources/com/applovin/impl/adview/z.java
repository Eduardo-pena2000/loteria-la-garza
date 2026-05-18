package com.applovin.impl.adview;

import android.content.DialogInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class z implements DialogInterface.OnDismissListener {
    public final /* synthetic */ a a;

    public /* synthetic */ z(a aVar) {
        this.a = aVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        a.s(this.a, dialogInterface);
    }
}
