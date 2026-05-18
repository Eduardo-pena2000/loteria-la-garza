package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaqs implements ServiceConnection {
    final /* synthetic */ zzaqt zza;
    private final zzaqu zzb;

    public /* synthetic */ zzaqs(zzaqt zzaqtVar, zzaqu zzaquVar, byte[] bArr) {
        Objects.requireNonNull(zzaqtVar);
        this.zza = zzaqtVar;
        this.zzb = zzaquVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzaqw.zza("InstallReferrerClient", "Install Referrer service connected.");
        zzaqt zzaqtVar = this.zza;
        zzaqtVar.zzf(zzbcw.zzb(iBinder));
        zzaqtVar.zze(2);
        this.zzb.zza(0);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzaqw.zzb("InstallReferrerClient", "Install Referrer service disconnected.");
        zzaqt zzaqtVar = this.zza;
        zzaqtVar.zzf(null);
        zzaqtVar.zze(0);
    }
}
