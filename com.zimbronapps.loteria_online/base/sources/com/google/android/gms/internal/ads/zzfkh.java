package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfkh {
    public static void zza(int i, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
        sb.append("Ad failed to load : ");
        sb.append(i);
        String sb2 = sb.toString();
        int i2 = o0.b;
        W5.p.e(sb2);
        o0.l(str, th);
        if (i == 3) {
            return;
        }
        R5.t.l().zzh(th, str);
    }

    public static void zzb(Context context, boolean z) {
        if (z) {
            int i = o0.b;
            W5.p.e("This request is sent from a test device.");
            return;
        }
        S5.B.a();
        String d = W5.g.d(context);
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 102);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(d);
        sb.append("\")) to get test ads on this device.");
        String sb2 = sb.toString();
        int i2 = o0.b;
        W5.p.e(sb2);
    }
}
