package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k0 extends W {
    public final /* synthetic */ d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(d dVar, int i, Bundle bundle) {
        super(dVar, i, bundle);
        Objects.requireNonNull(dVar);
        this.g = dVar;
    }

    public final boolean e() {
        this.g.zzc.c(v6.b.f);
        return true;
    }

    public final void f(v6.b bVar) {
        d dVar = this.g;
        if (dVar.enableLocalFallback() && dVar.zzg()) {
            dVar.zzf(16);
        } else {
            dVar.zzc.c(bVar);
            dVar.onConnectionFailed(bVar);
        }
    }
}
