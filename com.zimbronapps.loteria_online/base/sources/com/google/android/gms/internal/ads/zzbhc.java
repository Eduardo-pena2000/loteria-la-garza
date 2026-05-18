package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbhc implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbhg.zza(new zzbgz(sharedPreferences)));
            } catch (JSONException unused) {
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0125 A[Catch: all -> 0x000e, DONT_GENERATE, TRY_ENTER, TryCatch #3 {all -> 0x000e, blocks: (B:8:0x0008, B:10:0x000c, B:12:0x0011, B:14:0x0016, B:15:0x0018, B:17:0x002a, B:18:0x002e, B:20:0x0030, B:38:0x00a3, B:39:0x00aa, B:48:0x00d9, B:49:0x00e0, B:56:0x0125, B:57:0x012c, B:70:0x016e, B:71:0x0175, B:93:0x0177, B:94:0x017e, B:23:0x0045, B:28:0x0063, B:30:0x006c, B:31:0x0074, B:33:0x007a, B:35:0x008a, B:37:0x009f, B:41:0x00ac, B:43:0x00b0, B:45:0x00c0, B:47:0x00d5, B:51:0x00e2, B:54:0x0121, B:59:0x012e, B:61:0x013b, B:63:0x0149, B:64:0x0152, B:66:0x0160, B:68:0x0164, B:69:0x0167, B:73:0x00f3, B:75:0x0101, B:77:0x0109, B:79:0x0114, B:84:0x004c, B:86:0x0059), top: B:7:0x0008, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #1 {all -> 0x0053, blocks: (B:23:0x0045, B:28:0x0063, B:30:0x006c, B:31:0x0074, B:33:0x007a, B:35:0x008a, B:37:0x009f, B:41:0x00ac, B:43:0x00b0, B:45:0x00c0, B:47:0x00d5, B:51:0x00e2, B:54:0x0121, B:59:0x012e, B:61:0x013b, B:63:0x0149, B:64:0x0152, B:66:0x0160, B:68:0x0164, B:69:0x0167, B:73:0x00f3, B:75:0x0101, B:77:0x0109, B:79:0x0114, B:84:0x004c, B:86:0x0059), top: B:22:0x0045, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhc.zza(android.content.Context):void");
    }

    public final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    public final Object zzd(zzbgv zzbgvVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbgvVar.zzf();
            }
        }
        if (zzbgvVar.zzm() != 2) {
            return (zzbgvVar.zzm() == 1 && this.zzh.has(zzbgvVar.zze())) ? zzbgvVar.zzc(this.zzh) : zzbhg.zza(new zzbhb(this, zzbgvVar));
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbgvVar.zzf() : zzbgvVar.zza(bundle);
    }

    public final Object zze(zzbgv zzbgvVar) {
        return (this.zzd || this.zza) ? zzd(zzbgvVar) : zzbgvVar.zzf();
    }

    public final /* synthetic */ Object zzf(zzbgv zzbgvVar) {
        return zzbgvVar.zzd(this.zze);
    }
}
