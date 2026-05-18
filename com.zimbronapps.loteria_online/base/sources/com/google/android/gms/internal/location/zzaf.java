package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import h7.P;
import h7.g;
import h7.h;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaf implements g {
    public final i addGeofences(h hVar, h7.h hVar2, PendingIntent pendingIntent) {
        return hVar.b(new zzac(this, hVar, hVar2, pendingIntent));
    }

    public final i removeGeofences(h hVar, PendingIntent pendingIntent) {
        return zza(hVar, P.N1(pendingIntent));
    }

    public final i zza(h hVar, P p) {
        return hVar.b(new zzad(this, hVar, p));
    }

    @Deprecated
    public final i addGeofences(h hVar, List list, PendingIntent pendingIntent) {
        h.a aVar = new h.a();
        aVar.b(list);
        aVar.d(5);
        return hVar.b(new zzac(this, hVar, aVar.c(), pendingIntent));
    }

    public final i removeGeofences(com.google.android.gms.common.api.h hVar, List list) {
        return zza(hVar, P.M1(list));
    }
}
