package com.revenuecat.purchases.blockstore;

import Qa.l;
import com.google.android.gms.tasks.OnSuccessListener;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class a implements OnSuccessListener {
    public final /* synthetic */ l a;

    public /* synthetic */ a(l lVar) {
        this.a = lVar;
    }

    public final void onSuccess(Object obj) {
        BlockstoreHelper.1.i(this.a, obj);
    }
}
