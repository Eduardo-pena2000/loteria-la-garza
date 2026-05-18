package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfwp implements zzfvk {
    private final Object zza;
    private final zzfwq zzb;
    private final zzfxb zzc;
    private final zzfvh zzd;
    private final boolean zze;

    public zzfwp(Object obj, zzfwq zzfwqVar, zzfxb zzfxbVar, zzfvh zzfvhVar, boolean z) {
        this.zza = obj;
        this.zzb = zzfwqVar;
        this.zzc = zzfxbVar;
        this.zzd = zzfvhVar;
        this.zze = z;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzaxw zza = zzaxx.zza();
        zza.zzd(5);
        zza.zza(zzian.zzs(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzaxx) zza.zzbm()).zzaN(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.zza;
        } catch (Exception e) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", new Class[]{Map.class, Map.class}).invoke(obj, new Object[]{null, map2});
    }

    public final synchronized String zza(Context context, String str) {
        byte[] zzj;
        try {
            Map zzb = this.zzc.zzb();
            zzb.put("f", "q");
            zzb.put("ctx", context);
            zzb.put("aid", (Object) null);
            zzj = zzj(null, zzb);
            if (this.zze) {
                zzb.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzi(zzj);
    }

    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        byte[] zzj;
        try {
            Map zzc = this.zzc.zzc();
            zzc.put("f", "v");
            zzc.put("ctx", context);
            zzc.put("aid", (Object) null);
            zzc.put("view", view);
            zzc.put("act", activity);
            zzj = zzj(null, zzc);
            if (this.zze) {
                zzc.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzi(zzj);
    }

    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        byte[] zzj;
        try {
            Map zzd = this.zzc.zzd();
            zzd.put("f", "c");
            zzd.put("ctx", context);
            zzd.put("cs", str2);
            zzd.put("aid", (Object) null);
            zzd.put("view", view);
            zzd.put("act", activity);
            zzj = zzj(null, zzd);
            if (this.zze) {
                zzd.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzi(zzj);
    }

    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfwz {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Map zze = this.zzc.zze();
            zze.put("aid", (Object) null);
            zze.put("evt", motionEvent);
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("he", new Class[]{Map.class}).invoke(obj, new Object[]{zze});
            this.zzd.zzb(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfwz(2005, (Throwable) e);
        }
    }

    public final zzfwq zze() {
        return this.zzb;
    }

    public final synchronized boolean zzf() throws zzfwz {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e) {
            throw new zzfwz(2001, (Throwable) e);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", (Class[]) null).invoke(obj, (Object[]) null)).booleanValue();
    }

    public final synchronized void zzg() throws zzfwz {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("close", (Class[]) null).invoke(obj, (Object[]) null);
            this.zzd.zzb(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfwz(2003, (Throwable) e);
        }
    }

    public final synchronized int zzh() throws zzfwz {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e) {
            throw new zzfwz(2006, (Throwable) e);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
    }
}
