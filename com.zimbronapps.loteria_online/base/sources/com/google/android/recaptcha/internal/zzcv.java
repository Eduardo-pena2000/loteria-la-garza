package com.google.android.recaptcha.internal;

import Ca.m;
import Ga.e;
import Qa.p;
import android.app.Application;
import cb.a1;
import com.google.android.recaptcha.RecaptchaException;
import java.util.UUID;
import kotlin.jvm.internal.t;
import lb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final lb.a zzb = g.b(false, 1, (Object) null);
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();
    private final zzl zze = new zzl(null, 1, null);

    public zzcv(Application application) {
        this.zza = application;
        int i = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(zzaz.class.getName().hashCode(), new zzaz(null, 1, null)), new zzaw(zzfu.class.getName().hashCode(), new zzfu()), new zzaw(zzbe.class.getName().hashCode(), new zzbe()), new zzaw(zzjd.class.getName().hashCode(), new zzjd()), new zzaw(zzbr.class.getName().hashCode(), new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(zzex.class.getName().hashCode(), new zzex(null, 1, null)), new zzaw(zzfk.class.getName().hashCode(), new zzfk(true)), new zzaw(Application.class.getName().hashCode(), application), new zzaw(zzbf.class.getName().hashCode(), new zzbf(application)), new zzaw(zzfj.class.getName().hashCode(), new zzfj()), new zzaw(zzaq.class.getName().hashCode(), new zzbm(application)), new zzaw(zzey.class.getName().hashCode(), new zzfa()), new zzaw(zzff.class.getName().hashCode(), new zzff())};
        for (int i2 = 0; i2 < 13; i2++) {
            zzaw zzawVar = zzawVarArr[i2];
            if (!zzav.zzc().containsKey(Integer.valueOf(zzawVar.zza()))) {
                zzav.zzc().put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (t.c(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzb(zzcv zzcvVar, zzdc zzdcVar) {
        zzcvVar.zzc = zzdcVar;
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j) {
        if (j < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, null);
        }
        if (H1.a.checkSelfPermission(zzcvVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        return t.c(zzchVar, zzch.zza) ? new zzef(zzdtVar) : new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzf(zzcv zzcvVar, String str, zzcn zzcnVar, zzbi zzbiVar, e eVar, int i, Object obj) throws com.google.android.gms.common.api.b, RecaptchaException {
        return zzh(zzcvVar, str, 0L, null, zzcvVar.zzf, zzch.zzb, eVar, 2, null);
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, e eVar, int i, Object obj) throws a1, com.google.android.gms.common.api.b, RecaptchaException {
        return zzcvVar.zzg(str, (i & 2) != 0 ? 10000L : j, null, (i & 8) != 0 ? zzcvVar.zzf : zzbiVar, (i & 16) != 0 ? zzch.zza : zzchVar, eVar);
    }

    public static final /* synthetic */ Object zzi(zzcv zzcvVar, String str, int i, p pVar, e eVar) {
        return zzcvVar.zzj(null, 0, null, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object zzj(java.lang.String r6, int r7, Qa.p r8, Ga.e r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzcu
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzcu r0 = (com.google.android.recaptcha.internal.zzcu) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcu r0 = new com.google.android.recaptcha.internal.zzcu
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.google.android.recaptcha.internal.zzen r6 = r0.zzd
            Ca.t.b(r9)     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            goto L50
        L2b:
            r7 = move-exception
            goto L5c
        L2d:
            r7 = move-exception
            goto L74
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            Ca.t.b(r9)
            com.google.android.recaptcha.internal.zzbi r9 = r5.zzf
            com.google.android.recaptcha.internal.zzek r6 = r5.zzk(r6, r9, r7)
            r7 = 6
            com.google.android.recaptcha.internal.zzen r7 = r6.zzf(r7)
            r0.zzd = r7     // Catch: java.lang.Exception -> L55 com.google.android.recaptcha.internal.zzbd -> L57
            r0.zzc = r3     // Catch: java.lang.Exception -> L55 com.google.android.recaptcha.internal.zzbd -> L57
            java.lang.Object r9 = r8.invoke(r6, r0)     // Catch: java.lang.Exception -> L55 com.google.android.recaptcha.internal.zzbd -> L57
            if (r9 == r1) goto L54
            r6 = r7
        L50:
            r6.zza()     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            return r9
        L54:
            return r1
        L55:
            r6 = move-exception
            goto L59
        L57:
            r6 = move-exception
            goto L71
        L59:
            r4 = r7
            r7 = r6
            r6 = r4
        L5c:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zza
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            com.google.android.recaptcha.RecaptchaException r6 = r8.zzc()
            throw r6
        L71:
            r4 = r7
            r7 = r6
            r6 = r4
        L74:
            r6.zzb(r7)
            com.google.android.recaptcha.RecaptchaException r6 = r7.zzc()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzj(java.lang.String, int, Qa.p, Ga.e):java.lang.Object");
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i) {
        String uuid = UUID.randomUUID().toString();
        int i2 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) m.b(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, uuid, i, this.zza, zzesVar, null);
        zzekVar.zzc(uuid);
        return zzekVar;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzg(java.lang.String r23, long r24, com.google.android.recaptcha.internal.zzcn r26, com.google.android.recaptcha.internal.zzbi r27, com.google.android.recaptcha.internal.zzch r28, Ga.e r29) throws cb.a1, com.google.android.gms.common.api.b, com.google.android.recaptcha.RecaptchaException {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzg(java.lang.String, long, com.google.android.recaptcha.internal.zzcn, com.google.android.recaptcha.internal.zzbi, com.google.android.recaptcha.internal.zzch, Ga.e):java.lang.Object");
    }
}
