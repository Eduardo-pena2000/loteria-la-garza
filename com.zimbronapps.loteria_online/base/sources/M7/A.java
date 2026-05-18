package m7;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;
import v6.h;
import v6.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class a {
    public static final h a = h.f();
    public static final Object b = new Object();
    public static Method c = null;
    public static boolean d = false;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091 A[Catch: all -> 0x0029, TryCatch #2 {, blocks: (B:4:0x0015, B:8:0x001c, B:10:0x0041, B:11:0x0046, B:16:0x002d, B:17:0x0048, B:21:0x0091, B:22:0x0096, B:24:0x0098, B:25:0x00a6, B:26:0x0053, B:30:0x0057, B:33:0x0081), top: B:3:0x0015, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[Catch: all -> 0x0029, TryCatch #2 {, blocks: (B:4:0x0015, B:8:0x001c, B:10:0x0041, B:11:0x0046, B:16:0x002d, B:17:0x0048, B:21:0x0091, B:22:0x0096, B:24:0x0098, B:25:0x00a6, B:26:0x0053, B:30:0x0057, B:33:0x0081), top: B:3:0x0015, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0015, B:8:0x001c, B:10:0x0041, B:11:0x0046, B:16:0x002d, B:17:0x0048, B:21:0x0091, B:22:0x0096, B:24:0x0098, B:25:0x00a6, B:26:0x0053, B:30:0x0057, B:33:0x0081), top: B:3:0x0015, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r12) {
        /*
            r0 = 1
            java.lang.String r1 = "Context must not be null"
            com.google.android.gms.common.internal.t.m(r12, r1)
            v6.h r1 = m7.a.a
            r2 = 11925000(0xb5f608, float:1.6710484E-38)
            r1.k(r12, r2)
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r3 = m7.a.b
            monitor-enter(r3)
            boolean r4 = m7.a.d     // Catch: java.lang.Throwable -> L29
            r5 = 0
            if (r4 != 0) goto L48
            java.lang.String r4 = "Failed to load providerinstaller module: "
            com.google.android.gms.dynamite.DynamiteModule$b r6 = com.google.android.gms.dynamite.DynamiteModule.f     // Catch: java.lang.Throwable -> L29 com.google.android.gms.dynamite.DynamiteModule.a -> L2c
            java.lang.String r7 = "com.google.android.gms.providerinstaller.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r6 = com.google.android.gms.dynamite.DynamiteModule.e(r12, r6, r7)     // Catch: java.lang.Throwable -> L29 com.google.android.gms.dynamite.DynamiteModule.a -> L2c
            android.content.Context r4 = r6.b()     // Catch: java.lang.Throwable -> L29 com.google.android.gms.dynamite.DynamiteModule.a -> L2c
            goto L3f
        L29:
            r12 = move-exception
            goto La7
        L2c:
            r6 = move-exception
            java.lang.String r7 = "ProviderInstaller"
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L29
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = r4.concat(r6)     // Catch: java.lang.Throwable -> L29
            android.util.Log.w(r7, r4)     // Catch: java.lang.Throwable -> L29
            r4 = r5
        L3f:
            if (r4 == 0) goto L48
            java.lang.String r0 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            b(r4, r12, r0)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            return
        L48:
            boolean r4 = m7.a.d     // Catch: java.lang.Throwable -> L29
            java.lang.String r6 = "Failed to report request stats: "
            android.content.Context r7 = v6.l.d(r12)     // Catch: java.lang.Throwable -> L29
            if (r7 != 0) goto L53
            goto L8f
        L53:
            m7.a.d = r0     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L8e
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L80
            java.lang.String r8 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.String r9 = "reportRequestStats2"
            java.lang.ClassLoader r10 = r7.getClassLoader()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L80
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            com.google.android.gms.internal.common.zzi r11 = com.google.android.gms.internal.common.zzi.zzb(r11, r12)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L80
            com.google.android.gms.internal.common.zzh r1 = com.google.android.gms.internal.common.zzh.zza(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L80
            com.google.android.gms.internal.common.zzh r2 = com.google.android.gms.internal.common.zzh.zza(r4)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L80
            r4 = 3
            com.google.android.gms.internal.common.zzi[] r4 = new com.google.android.gms.internal.common.zzi[r4]     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L80
            r5 = 0
            r4[r5] = r11     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L80
            r4[r0] = r1     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L80
            r0 = 2
            r4[r0] = r2     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L80
            com.google.android.gms.internal.common.zzj.zzb(r8, r9, r10, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L80
            goto L8e
        L80:
            r0 = move-exception
            java.lang.String r1 = "ProviderInstaller"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = r6.concat(r0)     // Catch: java.lang.Throwable -> L29
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L29
        L8e:
            r5 = r7
        L8f:
            if (r5 == 0) goto L98
            java.lang.String r0 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            b(r5, r12, r0)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            return
        L98:
            java.lang.String r12 = "ProviderInstaller"
            java.lang.String r0 = "Failed to get remote context"
            android.util.Log.e(r12, r0)     // Catch: java.lang.Throwable -> L29
            v6.i r12 = new v6.i     // Catch: java.lang.Throwable -> L29
            r0 = 8
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L29
            throw r12     // Catch: java.lang.Throwable -> L29
        La7:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.a.a(android.content.Context):void");
    }

    public static void b(Context context, Context context2, String str) {
        try {
            if (c == null) {
                c = context.getClassLoader().loadClass(str).getMethod("insertProvider", new Class[]{Context.class});
            }
            c.invoke((Object) null, new Object[]{context});
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new i(8);
        }
    }
}
