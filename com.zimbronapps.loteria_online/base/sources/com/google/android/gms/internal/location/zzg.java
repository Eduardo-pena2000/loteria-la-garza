package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import h7.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzg implements b {
    public final i removeActivityUpdates(h hVar, PendingIntent pendingIntent) {
        return hVar.b(new zze(this, hVar, pendingIntent));
    }

    public final i requestActivityUpdates(h hVar, long j, PendingIntent pendingIntent) {
        return hVar.b(new zzd(this, hVar, j, pendingIntent));
    }
}
