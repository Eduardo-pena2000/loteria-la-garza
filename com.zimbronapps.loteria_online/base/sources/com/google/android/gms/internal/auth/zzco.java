package com.google.android.gms.internal.auth;

import H1.e;
import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzco implements zzcl {
    private static zzco zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzco() {
        this.zzb = null;
        this.zzc = null;
    }

    public static zzco zza(Context context) {
        zzco zzcoVar;
        synchronized (zzco.class) {
            try {
                if (zza == null) {
                    zza = e.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzco(context) : new zzco();
                }
                zzcoVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcoVar;
    }

    public static synchronized void zze() {
        Context context;
        synchronized (zzco.class) {
            try {
                zzco zzcoVar = zza;
                if (zzcoVar != null && (context = zzcoVar.zzb) != null && zzcoVar.zzc != null) {
                    context.getContentResolver().unregisterContentObserver(zza.zzc);
                }
                zza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zzb(String str) {
        Context context = this.zzb;
        if (context != null && !zzcc.zza(context)) {
            try {
                return (String) zzcj.zza(new zzcm(this, str));
            } catch (NullPointerException | SecurityException | IllegalStateException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    public final /* synthetic */ String zzd(String str) {
        return zzcb.zza(this.zzb.getContentResolver(), str, null);
    }

    private zzco(Context context) {
        this.zzb = context;
        zzcn zzcnVar = new zzcn(this, null);
        this.zzc = zzcnVar;
        context.getContentResolver().registerContentObserver(zzcb.zza, true, zzcnVar);
    }
}
