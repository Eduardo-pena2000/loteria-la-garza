package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbnz implements zzgqt {
    private final /* synthetic */ String zza;

    public /* synthetic */ zzbnz(String str) {
        this.zza = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object apply(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.gms.internal.ads.zzboh r0 = com.google.android.gms.internal.ads.zzbog.zza
            java.lang.String r0 = r5.zza
            if (r6 != 0) goto L9
            goto L74
        L9:
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbjd.zzf
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L18
            goto L39
        L18:
            java.lang.String r1 = ".googleadservices.com"
            java.lang.String r2 = ".googlesyndication.com"
            java.lang.String r3 = ".doubleclick.net"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            android.net.Uri r2 = android.net.Uri.parse(r0)
            java.lang.String r2 = r2.getHost()
            r3 = 0
        L2b:
            r4 = 3
            if (r3 >= r4) goto L74
            r4 = r1[r3]
            boolean r4 = r2.endsWith(r4)
            if (r4 != 0) goto L39
            int r3 = r3 + 1
            goto L2b
        L39:
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbjd.zza
            java.lang.Object r1 = r1.zze()
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.gms.internal.ads.zzbio r2 = com.google.android.gms.internal.ads.zzbjd.zzb
            java.lang.Object r2 = r2.zze()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L53
            java.lang.String r0 = r0.replace(r1, r6)
        L53:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L74
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r3 = r1.getQueryParameter(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L74
            android.net.Uri$Builder r0 = r1.buildUpon()
            android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
            java.lang.String r6 = r6.toString()
            return r6
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbnz.apply(java.lang.Object):java.lang.Object");
    }
}
