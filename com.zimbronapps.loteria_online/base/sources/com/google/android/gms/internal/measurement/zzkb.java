package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzkb {
    public static final /* synthetic */ int zza = 0;
    private static final w.a zzb = new w.a();

    public static synchronized Uri zza(String str) {
        synchronized (zzkb.class) {
            w.a aVar = zzb;
            Uri uri = (Uri) aVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            aVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
