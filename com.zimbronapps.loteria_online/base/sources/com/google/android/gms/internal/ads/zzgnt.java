package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgnt implements zzgnb {
    private long zza = -1;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private final long zzi = SystemClock.uptimeMillis();

    public zzgnt(zzgao zzgaoVar) {
    }

    private static boolean zza(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object invoke = view.getClass().getMethod("getAdConfiguration", (Class[]) null).invoke(view, (Object[]) null);
            Integer num = (Integer) invoke.getClass().getField("adType").get(invoke);
            num.intValue();
            String str = (String) invoke.getClass().getMethod("adTypeToString", new Class[]{Integer.TYPE}).invoke((Object) null, new Object[]{num});
            if (str.contains("INTERSTITIAL") || str.contains("APP_OPEN")) {
                return true;
            }
            return str.contains("REWARDED");
        } catch (SecurityException | ReflectiveOperationException | NullPointerException unused) {
            return false;
        }
    }

    private static DisplayMetrics zze(Context context) {
        WindowManager windowManager;
        if ((Build.VERSION.SDK_INT >= 33 && !B.a(context)) || (windowManager = (WindowManager) context.getSystemService("window")) == null) {
            return null;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private final void zzf(Map map) {
        map.put("tcq", Long.valueOf(this.zza));
        map.put("tpq", Long.valueOf(this.zzb));
        map.put("tcc", Long.valueOf(this.zzg));
        map.put("tpc", Long.valueOf(this.zzh));
        map.put("tpv", Long.valueOf(this.zzd));
        map.put("tcv", Long.valueOf(this.zzc));
        map.put("tchv", Long.valueOf(this.zze));
        map.put("tphv", Long.valueOf(this.zzf));
        map.put("tst", Long.valueOf(this.zzi));
    }

    public final synchronized void zzb(Map map) {
        this.zzb = this.zza;
        this.zza = SystemClock.uptimeMillis();
        zzf(map);
    }

    public final synchronized void zzc(Map map, Context context, View view) {
        try {
            this.zzd = this.zzc;
            this.zzc = SystemClock.uptimeMillis();
            long j = this.zze;
            if (j != -1) {
                this.zzf = j;
            }
            DisplayMetrics zze = zze(context);
            if (zze != null) {
                int i = zze.widthPixels * zze.heightPixels;
                if (view != null) {
                    int min = Math.min(view.getWidth(), zze.widthPixels) * Math.min(view.getHeight(), zze.heightPixels);
                    if (min + min >= i || (min == 0 && zza(view))) {
                        this.zze = this.zzc;
                    }
                }
                zzf(map);
            }
            this.zze = -1L;
            zzf(map);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(Map map) {
        this.zzh = this.zzg;
        this.zzg = SystemClock.uptimeMillis();
        zzf(map);
    }
}
