package com.revenuecat.purchases.utils;

import android.content.DialogInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ Qa.a a;

    public /* synthetic */ a(Qa.a aVar) {
        this.a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DefaultAlertDialogHelper.b(this.a, dialogInterface, i);
    }
}
