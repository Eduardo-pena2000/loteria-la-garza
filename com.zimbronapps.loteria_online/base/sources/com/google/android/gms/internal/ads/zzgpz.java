package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgpz implements ServiceConnection {
    final /* synthetic */ zzgqf zza;

    public /* synthetic */ zzgpz(zzgqf zzgqfVar, byte[] bArr) {
        Objects.requireNonNull(zzgqfVar);
        this.zza = zzgqfVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzgqf zzgqfVar = this.zza;
        zzgqfVar.zzi().zza("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzgqfVar.zzh(new zzgpy(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzgqf zzgqfVar = this.zza;
        zzgqfVar.zzi().zza("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzgqfVar.zzh(new zzgpx(this));
    }
}
