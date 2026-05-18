package com.google.android.gms.internal.ads;

import S5.Y1;
import S5.l2;
import V5.o0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import z.Y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzccq {
    private final AtomicReference zzb = new AtomicReference((Object) null);
    private final Object zzc = new Object();
    private String zzd = null;
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zze = new AtomicInteger(-1);
    private final AtomicReference zzf = new AtomicReference((Object) null);
    private final AtomicReference zzg = new AtomicReference((Object) null);
    private final ConcurrentMap zzh = new ConcurrentHashMap(9);
    private final Object zzi = new Object();

    public static final Bundle zzq(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NumberFormatException | NullPointerException unused) {
                }
            }
        }
        return bundle;
    }

    public static final boolean zzr(Context context) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzaT)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, "com.google.android.gms.ads.dynamite") < ((Integer) S5.D.c().zzd(zzbhe.zzaU)).intValue()) {
            return false;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzaV)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final void zzs(Context context, String str, String str2, Bundle bundle) {
        if (zza(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                String valueOf = String.valueOf(str2);
                int i = o0.b;
                W5.p.d("Invalid event ID: ".concat(valueOf), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
                ConcurrentMap concurrentMap = this.zzh;
                Method method = (Method) concurrentMap.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
                        concurrentMap.put("logEventInternal", method);
                    } catch (Exception unused) {
                        zzw("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.zzf.get(), new Object[]{"am", str, bundle2});
                } catch (Exception unused2) {
                    zzw("logEventInternal", true);
                }
            }
        }
    }

    private final Method zzt(Context context, String str) {
        ConcurrentMap concurrentMap = this.zzh;
        Method method = (Method) concurrentMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, (Class[]) null);
            concurrentMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzw(str, false);
            return null;
        }
    }

    private final void zzu(Context context, String str, String str2) {
        if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            ConcurrentMap concurrentMap = this.zzh;
            Method method = (Method) concurrentMap.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, new Class[]{String.class});
                    concurrentMap.put(str2, method);
                } catch (Exception unused) {
                    zzw(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzf.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                o0.k(sb.toString());
            } catch (Exception unused2) {
                zzw(str2, false);
            }
        }
    }

    private final Object zzv(String str, Context context) {
        AtomicReference atomicReference = this.zzf;
        if (!zzx(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return zzt(context, str).invoke(atomicReference.get(), (Object[]) null);
        } catch (Exception unused) {
            zzw(str, true);
            return null;
        }
    }

    private final void zzw(String str, boolean z) {
        AtomicBoolean atomicBoolean = this.zza;
        if (atomicBoolean.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        String sb2 = sb.toString();
        int i = o0.b;
        W5.p.f(sb2);
        if (z) {
            W5.p.f("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
    }

    private final boolean zzx(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            Y.a(atomicReference, (Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            return true;
        } catch (Exception unused) {
            zzw("getInstance", z);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(android.content.Context r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzaL
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L63
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.zza
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L63
        L1c:
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzaW
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()
            java.lang.Object r0 = r2.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r5.zze
            int r3 = r0.get()
            r4 = -1
            if (r3 != r4) goto L5c
            S5.B.a()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r3 = W5.g.E(r6, r3)
            if (r3 != 0) goto L59
            S5.B.a()
            boolean r6 = W5.g.F(r6)
            if (r6 == 0) goto L59
            int r6 = V5.o0.b
            java.lang.String r6 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            W5.p.f(r6)
            r0.set(r1)
            goto L5c
        L59:
            r0.set(r2)
        L5c:
            int r6 = r0.get()
            if (r6 != r2) goto L63
            return r2
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccq.zza(android.content.Context):boolean");
    }

    public final void zzb(Context context, Y1 y1) {
        zzccr.zzb(context).zza().zzc(y1);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzaY)).booleanValue() && zza(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    public final void zzc(Context context, l2 l2Var) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzaY)).booleanValue() && zza(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    public final void zzd(Context context, String str) {
        if (zza(context)) {
            zzu(context, str, "beginAdUnitExposure");
        }
    }

    public final void zze(Context context, String str) {
        if (zza(context)) {
            zzu(context, str, "endAdUnitExposure");
        }
    }

    public final String zzf(Context context) {
        if (zza(context)) {
            AtomicReference atomicReference = this.zzf;
            if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str = (String) zzt(context, "getCurrentScreenName").invoke(atomicReference.get(), (Object[]) null);
                    if (str == null) {
                        str = (String) zzt(context, "getCurrentScreenClass").invoke(atomicReference.get(), (Object[]) null);
                    }
                    return str == null ? "" : str;
                } catch (Exception unused) {
                    zzw("getCurrentScreenName", false);
                }
            }
        }
        return "";
    }

    @Deprecated
    public final void zzg(Context context, String str) {
        if (zza(context) && (context instanceof Activity) && zzx(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzg, false)) {
            ConcurrentMap concurrentMap = this.zzh;
            Method method = (Method) concurrentMap.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", new Class[]{Activity.class, String.class, String.class});
                    concurrentMap.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    zzw("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzg.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception unused2) {
                zzw("setCurrentScreen", false);
            }
        }
    }

    public final String zzh(Context context) {
        if (!zza(context)) {
            return null;
        }
        synchronized (this.zzc) {
            try {
                String str = this.zzd;
                if (str != null) {
                    return str;
                }
                String str2 = (String) zzv("getGmpAppId", context);
                this.zzd = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String zzi(Context context) {
        ExecutorService threadPoolExecutor;
        if (!zza(context)) {
            return null;
        }
        long longValue = ((Long) S5.D.c().zzd(zzbhe.zzaR)).longValue();
        if (longValue < 0) {
            return (String) zzv("getAppInstanceId", context);
        }
        AtomicReference atomicReference = this.zzb;
        if (atomicReference.get() == null) {
            if (E6.e.c()) {
                threadPoolExecutor = zzfym.zza().zza(((Integer) S5.D.c().zzd(zzbhe.zzaS)).intValue(), new zzcco(this), 2);
            } else {
                zzbgv zzbgvVar = zzbhe.zzaS;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) S5.D.c().zzd(zzbgvVar)).intValue(), ((Integer) S5.D.c().zzd(zzbgvVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzcco(this));
            }
            Y.a(atomicReference, (Object) null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) atomicReference.get()).submit(new zzccp(this, context)).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String zzj(Context context) {
        Object zzv;
        if (zza(context) && (zzv = zzv("generateEventId", context)) != null) {
            return zzv.toString();
        }
        return null;
    }

    public final void zzk(Context context, String str, Map map) {
        zzs(context, "_ac", str, zzq(map));
    }

    public final void zzl(Context context, String str, Map map) {
        zzs(context, "_ai", str, zzq(map));
    }

    public final void zzm(Context context, String str) {
        zzs(context, "_aq", str, null);
    }

    public final void zzn(Context context, String str) {
        zzs(context, "_aa", str, null);
    }

    public final void zzo(Context context, String str, String str2, String str3, int i) {
        if (zza(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zzs(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 64 + String.valueOf(i).length());
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            o0.k(sb.toString());
        }
    }

    public final /* synthetic */ String zzp(Context context) {
        return (String) zzv("getAppInstanceId", context);
    }
}
