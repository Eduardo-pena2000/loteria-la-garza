package com.unity3d.ads.core.data.datasource;

import Ca.I;
import Ca.s;
import Ga.e;
import Qa.l;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidFIdDataSource$invoke$1$1$1$1 extends u implements l {
    final /* synthetic */ e $cont;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFIdDataSource$invoke$1$1$1$1(e eVar) {
        super(1);
        this.$cont = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return I.a;
    }

    public final void invoke(String str) {
        this.$cont.resumeWith(s.b(str));
    }
}
