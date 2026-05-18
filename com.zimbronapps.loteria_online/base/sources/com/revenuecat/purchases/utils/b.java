package com.revenuecat.purchases.utils;

import android.content.DialogInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ Qa.a a;

    public /* synthetic */ b(Qa.a aVar) {
        this.a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DefaultAlertDialogHelper.c(this.a, dialogInterface, i);
    }
}
