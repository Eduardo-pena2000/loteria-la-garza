package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeqn extends zzbvu {
    private final String zza;
    private final zzbvs zzb;
    private final zzcen zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzeqn(String str, zzbvs zzbvsVar, zzcen zzcenVar, long j) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzcenVar;
        this.zza = str;
        this.zzb = zzbvsVar;
        this.zze = j;
        try {
            jSONObject.put("adapter_version", zzbvsVar.zzf().toString());
            jSONObject.put("sdk_version", zzbvsVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (JSONException | NullPointerException | RemoteException unused) {
        }
    }

    public static synchronized void zzd(String str, zzcen zzcenVar) {
        synchronized (zzeqn.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", str);
                    jSONObject.put("signal_error", "Adapter failed to instantiate");
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzcg)).booleanValue()) {
                        jSONObject.put("signal_error_code", 1);
                    }
                    zzcenVar.zzc(jSONObject);
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized void zzh(String str, int i) {
        try {
            if (this.zzf) {
                return;
            }
            try {
                JSONObject jSONObject = this.zzd;
                jSONObject.put("signal_error", str);
                if (((Boolean) S5.D.c().zzd(zzbhe.zzch)).booleanValue()) {
                    jSONObject.put("latency", R5.t.o().b() - this.zze);
                }
                if (((Boolean) S5.D.c().zzd(zzbhe.zzcg)).booleanValue()) {
                    jSONObject.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzcg)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    public final synchronized void zze(String str) throws RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            JSONObject jSONObject = this.zzd;
            jSONObject.put("signals", str);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzch)).booleanValue()) {
                jSONObject.put("latency", R5.t.o().b() - this.zze);
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzcg)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzf(String str) throws RemoteException {
        zzh(str, 2);
    }

    public final synchronized void zzg(c1 c1Var) throws RemoteException {
        zzh(c1Var.b, 2);
    }
}
