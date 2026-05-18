package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfbi implements zzfax {
    private final zzgzy zza;
    private final Context zzb;
    private final zzecp zzc;

    public zzfbi(zzgzy zzgzyVar, Context context, zzecp zzecpVar) {
        this.zza = zzgzyVar;
        this.zzb = context;
        this.zzc = zzecpVar;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    public final x7.e zza() {
        return this.zza.zzc(new zzfbh(this));
    }

    public final int zzb() {
        return 38;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfbg zzc() {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbi.zzc():com.google.android.gms.internal.ads.zzfbg");
    }
}
