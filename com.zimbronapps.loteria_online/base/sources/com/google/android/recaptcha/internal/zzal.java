package com.google.android.recaptcha.internal;

import Ca.I;
import Ga.e;
import Ia.l;
import Qa.p;
import kotlin.jvm.internal.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzal extends l implements p {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzan zzd;
    final /* synthetic */ zzen zze;
    final /* synthetic */ O zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(zzan zzanVar, zzen zzenVar, O o, e eVar) {
        super(2, eVar);
        this.zzd = zzanVar;
        this.zze = zzenVar;
        this.zzf = o;
    }

    public final e create(Object obj, e eVar) {
        return new zzal(this.zzd, this.zze, this.zzf, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((cb.O) obj, (e) obj2).invokeSuspend(I.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026 A[Catch: Exception -> 0x001c, TRY_ENTER, TryCatch #0 {Exception -> 0x001c, blocks: (B:8:0x0026, B:10:0x0032, B:39:0x0018), top: B:38:0x0018 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0049 -> B:7:0x0024). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007d -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = Ha.c.f()
            int r1 = r7.zzc
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L16
            boolean r1 = r7.zzb
            long r4 = r7.zza
            Ca.t.b(r8)
        L13:
            r8 = r1
            goto L80
        L16:
            long r4 = r7.zza
            Ca.t.b(r8)     // Catch: java.lang.Exception -> L1c
            goto L32
        L1c:
            r8 = move-exception
            goto L4c
        L1e:
            Ca.t.b(r8)
            r4 = 1000(0x3e8, double:4.94E-321)
            r8 = r3
        L24:
            if (r8 == 0) goto L84
            com.google.android.recaptcha.internal.zzan r8 = r7.zzd     // Catch: java.lang.Exception -> L1c
            r7.zza = r4     // Catch: java.lang.Exception -> L1c
            r7.zzc = r3     // Catch: java.lang.Exception -> L1c
            java.lang.Object r8 = com.google.android.recaptcha.internal.zzan.zza(r8, r7)     // Catch: java.lang.Exception -> L1c
            if (r8 == r0) goto L4b
        L32:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r8     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzan r1 = r7.zzd     // Catch: java.lang.Exception -> L1c
            cb.x r1 = r1.zzf()     // Catch: java.lang.Exception -> L1c
            r1.o(r8)     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzan r8 = r7.zzd     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzao r1 = com.google.android.recaptcha.internal.zzao.zzc     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzan.zzh(r8, r1)     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzen r8 = r7.zze     // Catch: java.lang.Exception -> L1c
            r8.zza()     // Catch: java.lang.Exception -> L1c
            r8 = r2
            goto L24
        L4b:
            return r0
        L4c:
            kotlin.jvm.internal.O r1 = r7.zzf
            r1.a = r8
            boolean r1 = r8 instanceof com.google.android.play.core.integrity.StandardIntegrityException
            if (r1 == 0) goto L6d
            r1 = r8
            com.google.android.play.core.integrity.StandardIntegrityException r1 = (com.google.android.play.core.integrity.StandardIntegrityException) r1
            int r1 = r1.getErrorCode()
            r6 = -100
            if (r1 == r6) goto L6f
            r6 = -18
            if (r1 == r6) goto L6f
            r6 = -12
            if (r1 == r6) goto L6f
            r6 = -8
            if (r1 == r6) goto L6f
            r6 = -3
            if (r1 == r6) goto L6f
        L6d:
            r1 = r2
            goto L70
        L6f:
            r1 = r3
        L70:
            if (r1 == 0) goto L83
            r7.zza = r4
            r7.zzb = r3
            r8 = 2
            r7.zzc = r8
            java.lang.Object r8 = cb.Z.a(r4, r7)
            if (r8 == r0) goto L82
            goto L13
        L80:
            long r4 = r4 + r4
            goto L24
        L82:
            return r0
        L83:
            throw r8
        L84:
            Ca.I r8 = Ca.I.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzal.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
