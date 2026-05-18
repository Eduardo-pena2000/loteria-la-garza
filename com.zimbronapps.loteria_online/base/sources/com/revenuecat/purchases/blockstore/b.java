package com.revenuecat.purchases.blockstore;

import com.google.android.gms.tasks.OnFailureListener;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class b implements OnFailureListener {
    public final /* synthetic */ Qa.a a;

    public /* synthetic */ b(Qa.a aVar) {
        this.a = aVar;
    }

    public final void onFailure(Exception exc) {
        BlockstoreHelper.1.a(this.a, exc);
    }
}
