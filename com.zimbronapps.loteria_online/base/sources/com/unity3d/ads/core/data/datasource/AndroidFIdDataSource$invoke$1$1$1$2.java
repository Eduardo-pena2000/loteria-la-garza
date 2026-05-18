package com.unity3d.ads.core.data.datasource;

import Ca.s;
import Ga.e;
import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidFIdDataSource$invoke$1$1$1$2 implements OnFailureListener {
    final /* synthetic */ e $cont;

    public AndroidFIdDataSource$invoke$1$1$1$2(e eVar) {
        this.$cont = eVar;
    }

    public final void onFailure(Exception it) {
        t.g(it, "it");
        e eVar = this.$cont;
        s.a aVar = s.b;
        eVar.resumeWith(s.b(Ca.t.a(it)));
    }
}
