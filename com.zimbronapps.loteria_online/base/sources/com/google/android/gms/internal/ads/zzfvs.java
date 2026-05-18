package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfvs implements d.a, d.b {
    private final zzfwj zza;
    private final zzfwd zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private boolean zze = false;

    public zzfvs(Context context, Looper looper, zzfwd zzfwdVar) {
        this.zzb = zzfwdVar;
        this.zza = new zzfwj(context, looper, this, this, 12800000);
    }

    private final void zzb() {
        synchronized (this.zzc) {
            try {
                zzfwj zzfwjVar = this.zza;
                if (zzfwjVar.isConnected() || zzfwjVar.isConnecting()) {
                    zzfwjVar.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                this.zze = true;
                try {
                    this.zza.zzp().zzf(new zzfwh(this.zzb.zzaN()));
                } catch (Exception unused) {
                } catch (Throwable th) {
                    zzb();
                    throw th;
                }
                zzb();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void zza() {
        synchronized (this.zzc) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    this.zza.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onConnectionFailed(v6.b bVar) {
    }
}
