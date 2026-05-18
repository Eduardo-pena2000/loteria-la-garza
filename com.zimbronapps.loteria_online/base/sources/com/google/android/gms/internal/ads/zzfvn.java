package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.d;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfvn implements d.a, d.b {
    protected final zzfwj zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfvn(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfwj zzfwjVar = new zzfwj(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfwjVar;
        this.zzd = new LinkedBlockingQueue();
        zzfwjVar.checkAvailabilityAndConnect();
    }

    public static zzaxg zzc() {
        zzawg zzj = zzaxg.zzj();
        zzj.zzl(32768L);
        return (zzaxg) zzj.zzbm();
    }

    public final void onConnected(Bundle bundle) {
        zzfwo zzd = zzd();
        if (zzd != null) {
            try {
                try {
                    this.zzd.put(zzd.zze(new zzfwk(this.zzb, this.zzc)).zza());
                } catch (Throwable unused) {
                    this.zzd.put(zzc());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                zzb();
                this.zze.quit();
                throw th;
            }
            zzb();
            this.zze.quit();
        }
    }

    public final void onConnectionFailed(v6.b bVar) {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    public final void onConnectionSuspended(int i) {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    public final zzaxg zza(int i) {
        zzaxg zzaxgVar;
        try {
            zzaxgVar = (zzaxg) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzaxgVar = null;
        }
        return zzaxgVar == null ? zzc() : zzaxgVar;
    }

    public final void zzb() {
        zzfwj zzfwjVar = this.zza;
        if (zzfwjVar != null) {
            if (zzfwjVar.isConnected() || zzfwjVar.isConnecting()) {
                zzfwjVar.disconnect();
            }
        }
    }

    public final zzfwo zzd() {
        try {
            return this.zza.zzp();
        } catch (IllegalStateException | DeadObjectException unused) {
            return null;
        }
    }
}
