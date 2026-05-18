package com.google.android.gms.internal.measurement;

import H1.e;
import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import s7.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzjy implements zzjv {
    private static zzjy zza;
    private final Context zzb;
    private final ContentObserver zzc;
    private boolean zzd;

    private zzjy() {
        this.zzd = false;
        this.zzb = null;
        this.zzc = null;
    }

    public static zzjy zza(Context context) {
        zzjy zzjyVar;
        synchronized (zzjy.class) {
            try {
                if (zza == null) {
                    zza = e.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzjy(context) : new zzjy();
                }
                zzjy zzjyVar2 = zza;
                if (zzjyVar2 != null && zzjyVar2.zzc != null && !zzjyVar2.zzd) {
                    try {
                        context.getContentResolver().registerContentObserver(zzjg.zza, true, zza.zzc);
                        ((zzjy) m.j(zza)).zzd = true;
                    } catch (SecurityException e) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e);
                    }
                }
                zzjyVar = (zzjy) m.j(zza);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzjyVar;
    }

    public static synchronized void zzc() {
        Context context;
        synchronized (zzjy.class) {
            try {
                zzjy zzjyVar = zza;
                if (zzjyVar != null && (context = zzjyVar.zzb) != null && zzjyVar.zzc != null && zzjyVar.zzd) {
                    context.getContentResolver().unregisterContentObserver(zza.zzc);
                }
                zza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final String zze(String str) {
        Context context = this.zzb;
        if (context != null && !zzjm.zzb(context)) {
            try {
                return (String) zzjv.zzh(new zzjx(this, str));
            } catch (NullPointerException | SecurityException | IllegalStateException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
            }
        }
        return null;
    }

    public final /* synthetic */ String zzd(String str) {
        return zzjf.zza(((Context) m.j(this.zzb)).getContentResolver(), str, null);
    }

    private zzjy(Context context) {
        this.zzd = false;
        this.zzb = context;
        this.zzc = new zzjw(this, null);
    }
}
