package com.google.android.gms.internal.ads;

import V5.F0;
import android.content.Context;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbsq {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbsz zzc;
    private zzbsz zzd;

    private static final Context zzd(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final boolean zze(Context context) {
        if (((Boolean) zzbjk.zzc.zze()).booleanValue()) {
            return false;
        }
        return F0.Z(zzd(context)).a().toLowerCase(Locale.ROOT).equals("ru");
    }

    public final zzbsz zza(Context context, W5.a aVar, zzfor zzforVar) {
        zzbsz zzbszVar;
        String str;
        synchronized (this.zzb) {
            try {
                if (this.zzd == null) {
                    Context zzd = zzd(context);
                    if (zze(context)) {
                        str = (String) S5.D.c().zzd(zzbhe.zzc);
                    } else {
                        str = (String) zzbjo.zza.zze();
                    }
                    this.zzd = new zzbsz(zzd, aVar, str, zzforVar);
                }
                zzbszVar = this.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbszVar;
    }

    public final zzbsz zzb(Context context, W5.a aVar, zzfor zzforVar) {
        zzbsz zzbszVar;
        String str;
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    if (zze(context)) {
                        str = (String) S5.D.c().zzd(zzbhe.zzc);
                    } else if (((Boolean) zzbjk.zzg.zze()).booleanValue()) {
                        str = (String) S5.D.c().zzd(zzbhe.zza);
                    } else {
                        str = (String) S5.D.c().zzd(zzbhe.zzb);
                    }
                    this.zzc = new zzbsz(zzd(context), aVar, str, zzforVar);
                }
                zzbszVar = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbszVar;
    }

    public final void zzc() {
        synchronized (this.zza) {
            try {
                zzbsz zzbszVar = this.zzc;
                if (zzbszVar != null) {
                    zzbszVar.zzc();
                    this.zzc = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
