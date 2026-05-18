package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.d;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbqd implements d.a {
    final /* synthetic */ zzcen zza;
    final /* synthetic */ zzbqf zzb;

    public zzbqd(zzbqf zzbqfVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzbqfVar);
        this.zzb = zzbqfVar;
    }

    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zzc().zzp());
        } catch (DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    public final void onConnectionSuspended(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 23);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        this.zza.zzd(new RuntimeException(sb.toString()));
    }
}
