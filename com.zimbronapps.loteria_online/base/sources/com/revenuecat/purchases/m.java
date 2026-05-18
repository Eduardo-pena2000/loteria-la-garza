package com.revenuecat.purchases;

import android.content.DialogInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class m implements DialogInterface.OnClickListener {
    public final /* synthetic */ SimulatedStoreErrorDialogActivity a;

    public /* synthetic */ m(SimulatedStoreErrorDialogActivity simulatedStoreErrorDialogActivity) {
        this.a = simulatedStoreErrorDialogActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SimulatedStoreErrorDialogActivity.a(this.a, dialogInterface, i);
    }
}
