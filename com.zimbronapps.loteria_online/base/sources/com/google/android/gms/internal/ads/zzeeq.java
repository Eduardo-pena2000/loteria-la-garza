package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.internal.d;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzeeq implements d.a, d.b {
    protected final zzcen zza = new zzcen();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbzu zze;
    protected zzbyw zzf;

    public static void zzc(Context context, x7.e eVar, Executor executor) {
        if (((Boolean) zzbiw.zzj.zze()).booleanValue() || ((Boolean) zzbiw.zzh.zze()).booleanValue()) {
            zzgzo.zzr(eVar, new zzeen(context), executor);
        }
    }

    public abstract /* synthetic */ void onConnected(Bundle bundle);

    public void onConnectionFailed(v6.b bVar) {
        int i = o0.b;
        W5.p.a("Disconnected from remote ad request service.");
        this.zza.zzd(new zzeff(1));
    }

    public void onConnectionSuspended(int i) {
        int i2 = o0.b;
        W5.p.a("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zzb() {
        synchronized (this.zzb) {
            try {
                this.zzd = true;
                if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                    this.zzf.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
