package com.google.android.recaptcha.internal;

import Ca.I;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zziy extends l implements p {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzja zzf;
    final /* synthetic */ zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziy(zzja zzjaVar, zzen zzenVar, e eVar) {
        super(2, eVar);
        this.zzf = zzjaVar;
        this.zzg = zzenVar;
    }

    public final e create(Object obj, e eVar) {
        return new zziy(this.zzf, this.zzg, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x00c9, code lost:
    
        if (r9.zzc(r1, r8) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = Ha.c.f()
            int r1 = r8.zze
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L17
            Ca.t.b(r9)
            if (r1 == r3) goto L9f
            if (r1 == r2) goto Lba
            goto Lcc
        L17:
            java.lang.Object r1 = r8.zzd
            com.google.android.recaptcha.internal.zzcg r1 = (com.google.android.recaptcha.internal.zzcg) r1
            java.lang.Object r4 = r8.zzc
            com.google.android.recaptcha.internal.zzsc r4 = (com.google.android.recaptcha.internal.zzsc) r4
            java.lang.Object r6 = r8.zzb
            com.google.android.recaptcha.internal.zzja r6 = (com.google.android.recaptcha.internal.zzja) r6
            java.lang.Object r7 = r8.zza
            com.google.android.recaptcha.internal.zzja r7 = (com.google.android.recaptcha.internal.zzja) r7
            Ca.t.b(r9)
            goto L5f
        L2b:
            Ca.t.b(r9)
            com.google.android.recaptcha.internal.zzja r6 = r8.zzf
            com.google.android.recaptcha.internal.zzsc r9 = com.google.android.recaptcha.internal.zzja.zzs(r6)
            if (r9 != 0) goto L37
            r9 = r5
        L37:
            com.google.android.recaptcha.internal.zzja r1 = r8.zzf
            com.google.android.recaptcha.internal.zzcg r7 = new com.google.android.recaptcha.internal.zzcg
            com.google.android.recaptcha.internal.zzsc r1 = com.google.android.recaptcha.internal.zzja.zzs(r1)
            if (r1 != 0) goto L42
            r1 = r5
        L42:
            com.google.android.recaptcha.internal.zzle r1 = r1.zzf()
            r7.<init>(r1)
            com.google.android.recaptcha.internal.zzja r1 = r8.zzf
            r8.zza = r6
            r8.zzb = r6
            r8.zzc = r9
            r8.zzd = r7
            r8.zze = r4
            java.lang.Object r1 = r1.zzw(r8)
            if (r1 == r0) goto Ld4
            r4 = r9
            r9 = r1
            r1 = r7
            r7 = r6
        L5f:
            android.webkit.WebView r9 = (android.webkit.WebView) r9
            com.google.android.recaptcha.internal.zzft r9 = r6.zzC(r4, r1, r9)
            r7.zzb = r9
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            cb.x r9 = r9.zzA()
            int r9 = r9.hashCode()
            Ia.b.d(r9)
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzjh r9 = com.google.android.recaptcha.internal.zzja.zzr(r9)
            r9.zzd()
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzjh r9 = com.google.android.recaptcha.internal.zzja.zzr(r9)
            r9.zze()
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzsc r1 = com.google.android.recaptcha.internal.zzja.zzs(r9)
            if (r1 != 0) goto L8f
            r1 = r5
        L8f:
            r8.zza = r5
            r8.zzb = r5
            r8.zzc = r5
            r8.zzd = r5
            r8.zze = r3
            java.lang.Object r9 = com.google.android.recaptcha.internal.zzja.zzt(r9, r1, r8)
            if (r9 == r0) goto Ld4
        L9f:
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            cb.x r9 = r9.zzA()
            int r9 = r9.hashCode()
            Ia.b.d(r9)
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            cb.x r9 = r9.zzA()
            r8.zze = r2
            java.lang.Object r9 = r9.await(r8)
            if (r9 == r0) goto Ld4
        Lba:
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzcb r9 = r9.zzm()
            com.google.android.recaptcha.internal.zzje r1 = com.google.android.recaptcha.internal.zzje.zzc
            r2 = 4
            r8.zze = r2
            java.lang.Object r9 = r9.zzc(r1, r8)
            if (r9 != r0) goto Lcc
            goto Ld4
        Lcc:
            com.google.android.recaptcha.internal.zzen r9 = r8.zzg
            r9.zza()
            Ca.I r9 = Ca.I.a
            return r9
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zziy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
