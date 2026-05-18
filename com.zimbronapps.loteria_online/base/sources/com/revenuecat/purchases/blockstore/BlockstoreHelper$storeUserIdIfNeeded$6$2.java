package com.revenuecat.purchases.blockstore;

import Ca.s;
import Ga.e;
import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BlockstoreHelper$storeUserIdIfNeeded$6$2 implements OnFailureListener {
    final /* synthetic */ e $cont;

    public BlockstoreHelper$storeUserIdIfNeeded$6$2(e eVar) {
        this.$cont = eVar;
    }

    public final void onFailure(Exception exc) {
        t.g(exc, "it");
        e eVar = this.$cont;
        s.a aVar = s.b;
        eVar.resumeWith(s.b(Ca.t.a(exc)));
    }
}
