package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdzc {
    private final Map zza = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:3:0x0001, B:11:0x0019, B:13:0x0032, B:15:0x0038, B:17:0x0041, B:19:0x0049, B:25:0x0068, B:27:0x009c, B:29:0x00a6, B:30:0x00ae, B:31:0x00b5, B:33:0x00bb, B:35:0x00bf, B:37:0x00d4, B:38:0x00dd, B:40:0x00e3, B:43:0x00f1, B:46:0x00f7, B:47:0x0109, B:49:0x010f, B:52:0x0121, B:55:0x0129, B:67:0x013a, B:70:0x0142, B:73:0x0148, B:76:0x0151, B:85:0x015a, B:88:0x0079, B:89:0x008a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zza(long r8, int r10, long r11) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzc.zza(long, int, long):void");
    }

    public final synchronized Map zzb() {
        HashMap hashMap;
        hashMap = new HashMap();
        if (((Boolean) S5.D.c().zzd(zzbhe.zziP)).booleanValue()) {
            zzc();
            for (Map.Entry entry : this.zza.entrySet()) {
                hashMap.put((zzdzf) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc() {
        /*
            r9 = this;
            E6.f r0 = R5.t.o()
            long r0 = r0.a()
            java.util.Map r2 = r9.zza
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.ads.zzdzf r4 = (com.google.android.gms.internal.ads.zzdzf) r4
            java.lang.Object r3 = r3.getValue()
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            int r4 = r4.zzb()
            r5 = 0
            if (r4 == 0) goto L3b
            r7 = 1
            if (r4 == r7) goto L5f
            r7 = 2
            if (r4 == r7) goto L4e
            r7 = 3
            if (r4 == r7) goto L3d
        L3b:
            r7 = r5
            goto L6f
        L3d:
            com.google.android.gms.internal.ads.zzbgv r4 = com.google.android.gms.internal.ads.zzbhe.zziU
            com.google.android.gms.internal.ads.zzbhc r7 = S5.D.c()
            java.lang.Object r4 = r7.zzd(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            goto L6f
        L4e:
            com.google.android.gms.internal.ads.zzbgv r4 = com.google.android.gms.internal.ads.zzbhe.zziT
            com.google.android.gms.internal.ads.zzbhc r7 = S5.D.c()
            java.lang.Object r4 = r7.zzd(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            goto L6f
        L5f:
            com.google.android.gms.internal.ads.zzbgv r4 = com.google.android.gms.internal.ads.zzbhe.zziS
            com.google.android.gms.internal.ads.zzbhc r7 = S5.D.c()
            java.lang.Object r4 = r7.zzd(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
        L6f:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L77
            r2.remove()
            r7 = r5
        L77:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L12
            java.util.Iterator r4 = r3.iterator()
        L7f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L99
            java.lang.Object r5 = r4.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = r0 - r5
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L99
            r4.remove()
            goto L7f
        L99:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L12
            r2.remove()
            goto L12
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzc.zzc():void");
    }
}
