package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzep {
    private static zzep zza;
    private final Executor zzb;
    private final CopyOnWriteArrayList zzc;
    private final Object zzd;
    private int zze;
    private boolean zzf;

    private zzep(Context context) {
        Executor zza2 = zzdh.zza();
        this.zzb = zza2;
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new Object();
        this.zze = 0;
        zza2.execute(new zzem(this, context));
    }

    public static synchronized zzep zza(Context context) {
        zzep zzepVar;
        synchronized (zzep.class) {
            try {
                if (zza == null) {
                    zza = new zzep(context);
                }
                zzepVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzepVar;
    }

    private final void zzg() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzel zzelVar = (zzel) it.next();
            if (zzelVar.zza()) {
                copyOnWriteArrayList.remove(zzelVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze(int i) {
        zzg();
        synchronized (this.zzd) {
            try {
                if (this.zzf && this.zze == i) {
                    return;
                }
                this.zzf = true;
                this.zze = i;
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((zzel) it.next()).zzb();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzej zzejVar, Executor executor) {
        boolean z;
        zzg();
        zzel zzelVar = new zzel(this, zzejVar, executor);
        synchronized (this.zzd) {
            this.zzc.add(zzelVar);
            z = this.zzf;
        }
        if (z) {
            zzelVar.zzb();
        }
    }

    public final int zzc() {
        int i;
        synchronized (this.zzd) {
            i = this.zze;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzd(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r10.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r1 = 0
            r2 = 5
            if (r0 != 0) goto Ld
            goto L4e
        Ld:
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L4e
            r3 = 1
            if (r0 == 0) goto L1a
            boolean r4 = r0.isConnected()
            if (r4 != 0) goto L1c
        L1a:
            r1 = r3
            goto L4e
        L1c:
            int r4 = r0.getType()
            r5 = 2
            r6 = 9
            r7 = 6
            r8 = 4
            if (r4 == 0) goto L3a
            if (r4 == r3) goto L38
            if (r4 == r8) goto L3a
            if (r4 == r2) goto L3a
            if (r4 == r7) goto L36
            if (r4 == r6) goto L34
            r1 = 8
            goto L4e
        L34:
            r1 = 7
            goto L4e
        L36:
            r1 = r2
            goto L4e
        L38:
            r1 = r5
            goto L4e
        L3a:
            int r0 = r0.getSubtype()
            switch(r0) {
                case 1: goto L4d;
                case 2: goto L4d;
                case 3: goto L4b;
                case 4: goto L4b;
                case 5: goto L4b;
                case 6: goto L4b;
                case 7: goto L4b;
                case 8: goto L4b;
                case 9: goto L4b;
                case 10: goto L4b;
                case 11: goto L4b;
                case 12: goto L4b;
                case 13: goto L36;
                case 14: goto L4b;
                case 15: goto L4b;
                case 16: goto L41;
                case 17: goto L4b;
                case 18: goto L38;
                case 19: goto L41;
                case 20: goto L43;
                default: goto L41;
            }
        L41:
            r1 = r7
            goto L4e
        L43:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 < r3) goto L4e
            r1 = r6
            goto L4e
        L4b:
            r1 = r8
            goto L4e
        L4d:
            r1 = 3
        L4e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r0 < r3) goto L74
            if (r1 != r2) goto L74
            java.lang.String r0 = "phone"
            java.lang.Object r10 = r10.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L70
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch: java.lang.RuntimeException -> L70
            if (r10 == 0) goto L6e
            com.google.android.gms.internal.ads.zzei r0 = new com.google.android.gms.internal.ads.zzei     // Catch: java.lang.RuntimeException -> L70
            r0.<init>(r9)     // Catch: java.lang.RuntimeException -> L70
            java.util.concurrent.Executor r1 = r9.zzb     // Catch: java.lang.RuntimeException -> L70
            P2.v.a(r10, r1, r0)     // Catch: java.lang.RuntimeException -> L70
            P2.w.a(r10, r0)     // Catch: java.lang.RuntimeException -> L70
            return
        L6e:
            r10 = 0
            throw r10     // Catch: java.lang.RuntimeException -> L70
        L70:
            r9.zze(r2)
            return
        L74:
            r9.zze(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzep.zzd(android.content.Context):void");
    }

    public final /* synthetic */ Executor zzf() {
        return this.zzb;
    }
}
