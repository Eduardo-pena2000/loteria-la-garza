package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.t;
import n6.a;
import n6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbt implements a {
    public final i getSpatulaHeader(h hVar) {
        t.l(hVar);
        return hVar.b(new zzbs(this, hVar));
    }

    public final i performProxyRequest(h hVar, b bVar) {
        t.l(hVar);
        t.l(bVar);
        return hVar.b(new zzbq(this, hVar, bVar));
    }
}
