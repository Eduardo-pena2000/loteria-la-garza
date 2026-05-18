package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import j6.b;
import j6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbo extends g {
    public zzbo(Activity activity, c cVar) {
        super(activity, b.a, cVar == null ? c.b : cVar, g.a.c);
    }

    public final Task getSpatulaHeader() {
        return doRead(w.builder().b(new zzbk(this)).e(1520).a());
    }

    public final Task performProxyRequest(n6.b bVar) {
        return doWrite(w.builder().b(new zzbl(this, bVar)).e(1518).a());
    }

    public zzbo(Context context, c cVar) {
        super(context, b.a, cVar == null ? c.b : cVar, g.a.c);
    }
}
