package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import s1.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgck implements zzgce {
    private final ExecutorService zza;
    private final String zzb;
    private final long zzc;

    public zzgck(ExecutorService executorService, String str, long j) {
        this.zza = executorService;
        this.zzb = str;
        this.zzc = j;
    }

    private final x7.e zze(String str, boolean z, byte[] bArr, String str2) {
        return s1.c.a(new zzgch(this, str, z, str2, bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzd(java.lang.String r6, s1.c.a r7, boolean r8, java.lang.String r9, byte[] r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgck.zzd(java.lang.String, s1.c$a, boolean, java.lang.String, byte[]):void");
    }

    public final x7.e zza(String str) {
        return zze(str, false, new byte[0], null);
    }

    public final x7.e zzb(String str, byte[] bArr, String str2) {
        return zze(str, true, bArr, "application/x-protobuf");
    }

    public final /* synthetic */ Object zzc(String str, boolean z, String str2, byte[] bArr, c.a aVar) {
        this.zza.execute(new zzgcg(this, str, aVar, z, str2, bArr));
        return "";
    }
}
