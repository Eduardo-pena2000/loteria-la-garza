package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbyp implements zzbyr {
    public static zzbyr zza;
    static zzbyr zzb;
    static zzbyr zzc;
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final W5.a zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;
    private Set zzp;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbyp(android.content.Context r3, W5.a r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzf = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.zzh = r0
            com.google.android.gms.internal.ads.zzfym.zza()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r2.zzi = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.zzn = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2f
            android.content.Context r3 = r3.getApplicationContext()
        L2f:
            r2.zzg = r3
            r2.zzj = r4
            com.google.android.gms.internal.ads.zzbgv r4 = com.google.android.gms.internal.ads.zzbhe.zziZ
            com.google.android.gms.internal.ads.zzbhc r0 = S5.D.c()
            java.lang.Object r4 = r0.zzd(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L50
            android.os.Handler r4 = W5.g.b
            if (r3 == 0) goto L50
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L52
        L50:
            r3 = r0
            goto L61
        L52:
            G6.d r4 = G6.e.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.f(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
        L61:
            r2.zzk = r3
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zziN
            com.google.android.gms.internal.ads.zzbhc r4 = S5.D.c()
            java.lang.Object r4 = r4.zzd(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L82
            android.os.Handler r4 = W5.g.b
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L83
        L82:
            r4 = r1
        L83:
            r2.zzl = r4
            com.google.android.gms.internal.ads.zzbhc r4 = S5.D.c()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb2
            android.content.Context r3 = r2.zzg
            android.os.Handler r4 = W5.g.b
            if (r3 != 0) goto L9c
            goto Lb3
        L9c:
            G6.d r3 = G6.e.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r3 = r3.f(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            if (r3 != 0) goto Lab
            goto Lb3
        Lab:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            goto Lb3
        Lb2:
            r0 = r1
        Lb3:
            r2.zzm = r0
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zziJ
            com.google.android.gms.internal.ads.zzbhc r4 = S5.D.c()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 <= 0) goto Lce
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.zzp = r3
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyp.<init>(android.content.Context, W5.a):void");
    }

    public static zzbyr zza(Context context) {
        synchronized (zze) {
            try {
                if (zza == null) {
                    if (zzj(context)) {
                        zza = new zzbyp(context, W5.a.M1());
                    } else {
                        zza = new zzbyq();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    public static zzbyr zzb(Context context, W5.a aVar) {
        synchronized (zze) {
            try {
                if (zzc == null) {
                    boolean z = false;
                    if (((Boolean) zzbiw.zzc.zze()).booleanValue()) {
                        if (!((Boolean) S5.D.c().zzd(zzbhe.zziH)).booleanValue() || ((Boolean) zzbiw.zza.zze()).booleanValue()) {
                            z = true;
                        }
                    }
                    if (zzj(context)) {
                        zzbyp zzbypVar = new zzbyp(context, aVar);
                        zzbypVar.zzl();
                        zzbypVar.zzk();
                        zzc = zzbypVar;
                    } else if (!z || context == null) {
                        zzc = new zzbyq();
                    } else {
                        zzbyp zzbypVar2 = new zzbyp(context, aVar, true);
                        zzbypVar2.zzl();
                        zzbypVar2.zzk();
                        zzc = zzbypVar2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:11:0x002d, B:12:0x003b, B:13:0x0042), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzbyr zzc(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbyp.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbyr r1 = com.google.android.gms.internal.ads.zzbyp.zzb     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L42
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zziI     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L39
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L3b
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zziH     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L39
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L3b
            if (r3 == 0) goto L3b
            com.google.android.gms.internal.ads.zzbyp r1 = new com.google.android.gms.internal.ads.zzbyp     // Catch: java.lang.Throwable -> L39
            W5.a r2 = W5.a.M1()     // Catch: java.lang.Throwable -> L39
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzbyp.zzb = r1     // Catch: java.lang.Throwable -> L39
            goto L42
        L39:
            r3 = move-exception
            goto L46
        L3b:
            com.google.android.gms.internal.ads.zzbyq r3 = new com.google.android.gms.internal.ads.zzbyq     // Catch: java.lang.Throwable -> L39
            r3.<init>()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzbyp.zzb = r3     // Catch: java.lang.Throwable -> L39
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzbyr r3 = com.google.android.gms.internal.ads.zzbyp.zzb
            return r3
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyp.zzc(android.content.Context):com.google.android.gms.internal.ads.zzbyr");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:11:0x0035, B:12:0x003c), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzbyr zzd(android.content.Context r3, W5.a r4) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbyp.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbyr r1 = com.google.android.gms.internal.ads.zzbyp.zzb     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L3c
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zziI     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zziH     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L35
            com.google.android.gms.internal.ads.zzbyp r1 = new com.google.android.gms.internal.ads.zzbyp     // Catch: java.lang.Throwable -> L33
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbyp.zzb = r1     // Catch: java.lang.Throwable -> L33
            goto L3c
        L33:
            r3 = move-exception
            goto L40
        L35:
            com.google.android.gms.internal.ads.zzbyq r3 = new com.google.android.gms.internal.ads.zzbyq     // Catch: java.lang.Throwable -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbyp.zzb = r3     // Catch: java.lang.Throwable -> L33
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbyr r3 = com.google.android.gms.internal.ads.zzbyp.zzb
            return r3
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyp.zzd(android.content.Context, W5.a):com.google.android.gms.internal.ads.zzbyr");
    }

    public static String zze(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th) {
        return zzgrt.zza(W5.g.p(zze(th)));
    }

    private static boolean zzj(Context context) {
        if (context == null) {
            return false;
        }
        synchronized (zze) {
            try {
                if (zzd == null) {
                    zzd = Boolean.valueOf(S5.B.h().nextInt(100) < ((Integer) S5.D.c().zzd(zzbhe.zzoh)).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) S5.D.c().zzd(zzbhe.zziH)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final void zzk() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbym(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzl() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbyn(this, thread.getUncaughtExceptionHandler()));
    }

    public final void zzg(Thread thread, Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= W5.g.x(stackTraceElement.getClassName());
                    z2 |= zzbyp.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int intValue = ((Integer) S5.D.c().zzd(zzbhe.zziJ)).intValue();
            if (intValue > 0) {
                if (this.zzp.size() >= intValue) {
                    return;
                }
                String zzf = zzf(th);
                if (this.zzp.contains(zzf)) {
                    return;
                } else {
                    this.zzp.add(zzf);
                }
            }
            if (!z || z2) {
                return;
            }
            if (!this.zzo) {
                zzh(th, "");
            }
            if (this.zzn.getAndSet(true) || !((Boolean) zzbiw.zzc.zze()).booleanValue()) {
                return;
            }
            zzbgp.zzb(this.zzg);
        }
    }

    public final void zzh(Throwable th, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    public final void zzi(Throwable th, String str, float f) {
        Throwable th2;
        String str2;
        PackageInfo f2;
        ActivityManager.MemoryInfo n;
        if (this.zzo) {
            return;
        }
        Handler handler = W5.g.b;
        boolean z = false;
        if (((Boolean) zzbjn.zze.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z2 = ((Boolean) S5.D.c().zzd(zzbhe.zzcW)).booleanValue() && stackTrace != null && stackTrace.length == 0 && W5.g.x(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (W5.g.x(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z2) {
                    th2 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String zze2 = zze(th);
            String zzf = ((Boolean) S5.D.c().zzd(zzbhe.zzkf)).booleanValue() ? zzf(th) : "";
            double d = f;
            double random = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (random < d) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    z = G6.e.a(this.zzg).g();
                } catch (Throwable th5) {
                    W5.p.d("Error fetching instant app info", th5);
                }
                try {
                    str2 = this.zzg.getPackageName();
                } catch (Throwable unused) {
                    W5.p.f("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i2 = Build.VERSION.SDK_INT;
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i2));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + str4.length());
                    sb.append(str3);
                    sb.append(" ");
                    sb.append(str4);
                    str4 = sb.toString();
                }
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("device", str4);
                W5.a aVar = this.zzj;
                Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("js", aVar.a).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zze2).appendQueryParameter("eids", TextUtils.join(",", S5.D.b().zze())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "839961582").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbjn.zzc.zze()));
                Context context = this.zzg;
                Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(v6.h.f().a(context))).appendQueryParameter("lite", true != aVar.e ? "0" : "1");
                if (!TextUtils.isEmpty(zzf)) {
                    appendQueryParameter5.appendQueryParameter("hash", zzf);
                }
                if (((Boolean) S5.D.c().zzd(zzbhe.zziO)).booleanValue() && (n = W5.g.n(context)) != null) {
                    appendQueryParameter5.appendQueryParameter("available_memory", Long.toString(n.availMem));
                    appendQueryParameter5.appendQueryParameter("total_memory", Long.toString(n.totalMem));
                    appendQueryParameter5.appendQueryParameter("is_low_memory", true != n.lowMemory ? "0" : "1");
                }
                if (((Boolean) S5.D.c().zzd(zzbhe.zziN)).booleanValue()) {
                    String str5 = this.zzl;
                    if (!TextUtils.isEmpty(str5)) {
                        appendQueryParameter5.appendQueryParameter("countrycode", str5);
                    }
                    String str6 = this.zzm;
                    if (!TextUtils.isEmpty(str6)) {
                        appendQueryParameter5.appendQueryParameter("psv", str6);
                    }
                    if (i2 >= 26) {
                        f2 = u4.b.a();
                    } else if (context == null) {
                        f2 = null;
                    } else {
                        try {
                            f2 = G6.e.a(context).f("com.android.webview", 128);
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    if (f2 != null) {
                        appendQueryParameter5.appendQueryParameter("wvvc", Integer.toString(f2.versionCode));
                        appendQueryParameter5.appendQueryParameter("wvvn", f2.versionName);
                        appendQueryParameter5.appendQueryParameter("wvpn", f2.packageName);
                    }
                }
                PackageInfo packageInfo = this.zzk;
                if (packageInfo != null) {
                    appendQueryParameter5.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    appendQueryParameter5.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(appendQueryParameter5.toString());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    this.zzi.execute(new zzbyo(new W5.v(this.zzg, null), (String) it.next()));
                }
            }
        }
    }

    public zzbyp(Context context, W5.a aVar, boolean z) {
        this(context, aVar);
        this.zzo = true;
    }
}
