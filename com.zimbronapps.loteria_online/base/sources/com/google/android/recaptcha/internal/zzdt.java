package com.google.android.recaptcha.internal;

import Ca.l;
import Ca.m;
import Ca.q;
import Ca.x;
import Da.D;
import Da.Q;
import Da.w;
import Ga.e;
import Wa.n;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import cb.i;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final l zzd;
    private final l zze;
    private final l zzf;
    private final l zzg;
    private final l zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i = zzav.zza;
        this.zzd = m.b(zzdm.zza);
        this.zze = m.b(zzdn.zza);
        this.zzf = m.b(zzdo.zza);
        this.zzg = m.b(zzdp.zza);
        this.zzh = m.b(zzdq.zza);
    }

    public static final /* synthetic */ Application zza(zzdt zzdtVar) {
        return zzdtVar.zzr();
    }

    public static final /* synthetic */ zzbd zzb(zzdt zzdtVar, Exception exc, zzbd zzbdVar) {
        return zzdtVar.zzs(exc, zzbdVar);
    }

    public static final /* synthetic */ zzbf zzc(zzdt zzdtVar) {
        return zzdtVar.zzt();
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzek zze(zzdt zzdtVar) {
        return zzdtVar.zzb;
    }

    public static final /* synthetic */ zzek zzf(zzdt zzdtVar, String str) {
        return zzdtVar.zzu(str);
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    public static final /* synthetic */ Object zzj(zzdt zzdtVar, e eVar) {
        return i.g(zzdtVar.zzi.zza().getCoroutineContext(), new zzdh(zzdtVar, null), eVar);
    }

    public static final /* synthetic */ Object zzk(zzdt zzdtVar, zzsc zzscVar, long j, e eVar) {
        return zzdtVar.zzv(zzscVar, j, eVar);
    }

    public static final /* synthetic */ String zzp(zzdt zzdtVar) {
        return zzdtVar.zza;
    }

    private final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    private final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    private final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    private final zzek zzu(String str) {
        zzek zza = this.zzb.zza();
        zza.zzc(str);
        return zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object zzv(com.google.android.recaptcha.internal.zzsc r11, long r12, Ga.e r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzdj
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzdj r0 = (com.google.android.recaptcha.internal.zzdj) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdj r0 = new com.google.android.recaptcha.internal.zzdj
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zzb
            java.lang.Object r7 = Ha.c.f()
            int r1 = r0.zzd
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L47
            if (r1 == r9) goto L39
            if (r1 == r8) goto L30
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            java.lang.Object r11 = r0.zza
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            Ca.t.b(r14)
            goto Lbb
        L39:
            java.lang.Object r11 = r0.zza
            com.google.android.recaptcha.internal.zzdt r11 = (com.google.android.recaptcha.internal.zzdt) r11
            Ca.t.b(r14)
            Ca.s r14 = (Ca.s) r14
            java.lang.Object r12 = r14.j()
            goto L82
        L47:
            Ca.t.b(r14)
            java.lang.String r14 = r11.zzO()
            zzy(r14)
            java.util.List r14 = r10.zzw()
            java.util.Iterator r14 = r14.iterator()
        L59:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r14.next()
            com.google.android.recaptcha.internal.zze r1 = (com.google.android.recaptcha.internal.zze) r1
            com.google.android.recaptcha.internal.zzl r2 = r10.zzc
            com.google.android.recaptcha.internal.zze[] r1 = new com.google.android.recaptcha.internal.zze[]{r1}
            r2.zzf(r1)
            goto L59
        L6f:
            com.google.android.recaptcha.internal.zzl r1 = r10.zzc
            com.google.android.recaptcha.internal.zzek r5 = r10.zzb
            r0.zza = r10
            r0.zzd = r9
            r2 = r12
            r4 = r11
            r6 = r0
            java.lang.Object r12 = r1.zzc(r2, r4, r5, r6)
            if (r12 != r7) goto L81
            goto Lb9
        L81:
            r11 = r10
        L82:
            java.lang.Throwable r12 = Ca.s.e(r12)
            if (r12 != 0) goto L8b
            Ca.I r11 = Ca.I.a
            return r11
        L8b:
            com.google.android.recaptcha.internal.zzbi r13 = r11.zzi
            cb.O r13 = r13.zzd()
            Ga.i r13 = r13.getCoroutineContext()
            r14 = 0
            cb.E0.i(r13, r14, r9, r14)
            com.google.android.recaptcha.internal.zzbi r11 = r11.zzi
            cb.O r11 = r11.zzd()
            Ga.i r11 = r11.getCoroutineContext()
            cb.B0 r11 = cb.E0.m(r11)
            Ya.h r11 = r11.getChildren()
            java.util.List r11 = Ya.r.G(r11)
            r0.zza = r12
            r0.zzd = r8
            java.lang.Object r11 = cb.f.b(r11, r0)
            if (r11 != r7) goto Lba
        Lb9:
            return r7
        Lba:
            r11 = r12
        Lbb:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzv(com.google.android.recaptcha.internal.zzsc, long, Ga.e):java.lang.Object");
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return D.L0(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            t.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) {
        try {
            zzrv zzj = zzrv.zzj(zzbt.zza(str));
            int i = zzav.zza;
            ((zzfu) m.b(zzde.zza).getValue()).zza(zzj);
        } catch (Exception e) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzf = zzsp.zzf();
        zzf.zzs(this.zza);
        zzf.zze(recaptchaAction.getAction());
        zzf.zzf(zzscVar.zzN());
        zzf.zzq(zzscVar.zzM());
        zzf.zzr(zzsiVar);
        return (zzsp) zzf.zzi();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzl(java.lang.String r6, long r7, Ga.e r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdd
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzdd r0 = (com.google.android.recaptcha.internal.zzdd) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdd r0 = new com.google.android.recaptcha.internal.zzdd
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            com.google.android.recaptcha.internal.zzen r6 = r0.zzd
            Ca.t.b(r9)     // Catch: java.lang.Exception -> L2b cb.a1 -> L2d com.google.android.recaptcha.internal.zzbd -> L2f
            goto L55
        L2b:
            r7 = move-exception
            goto L66
        L2d:
            r7 = move-exception
            goto L78
        L2f:
            r7 = move-exception
            goto L8a
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            Ca.t.b(r9)
            com.google.android.recaptcha.internal.zzek r9 = r5.zzu(r6)
            r2 = 27
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r2)
            com.google.android.recaptcha.internal.zzl r2 = r5.zzc     // Catch: java.lang.Exception -> L5c cb.a1 -> L5f com.google.android.recaptcha.internal.zzbd -> L62
            r0.zzd = r9     // Catch: java.lang.Exception -> L5c cb.a1 -> L5f com.google.android.recaptcha.internal.zzbd -> L62
            r0.zzc = r3     // Catch: java.lang.Exception -> L5c cb.a1 -> L5f com.google.android.recaptcha.internal.zzbd -> L62
            java.lang.Object r6 = r2.zzb(r6, r7, r0)     // Catch: java.lang.Exception -> L5c cb.a1 -> L5f com.google.android.recaptcha.internal.zzbd -> L62
            if (r6 == r1) goto L5b
            r4 = r9
            r9 = r6
            r6 = r4
        L55:
            com.google.android.recaptcha.internal.zzsi r9 = (com.google.android.recaptcha.internal.zzsi) r9     // Catch: java.lang.Exception -> L2b cb.a1 -> L2d com.google.android.recaptcha.internal.zzbd -> L2f
            r6.zza()     // Catch: java.lang.Exception -> L2b cb.a1 -> L2d com.google.android.recaptcha.internal.zzbd -> L2f
            return r9
        L5b:
            return r1
        L5c:
            r6 = move-exception
            r7 = r6
            goto L65
        L5f:
            r6 = move-exception
            r7 = r6
            goto L77
        L62:
            r6 = move-exception
            r7 = r6
            goto L89
        L65:
            r6 = r9
        L66:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzaa
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            throw r8
        L77:
            r6 = r9
        L78:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            throw r8
        L89:
            r6 = r9
        L8a:
            r6.zzb(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzl(java.lang.String, long, Ga.e):java.lang.Object");
    }

    public final Object zzm(zzsp zzspVar, String str, long j, e eVar) {
        return i.g(this.zzi.zza().getCoroutineContext(), new zzdg(this, str, j, zzspVar, null), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzn(com.google.android.recaptcha.internal.zzsc r11, long r12, Ga.e r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzdk
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzdk r0 = (com.google.android.recaptcha.internal.zzdk) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdk r0 = new com.google.android.recaptcha.internal.zzdk
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zza
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Ca.t.b(r14)     // Catch: java.lang.Exception -> L29 cb.a1 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            goto L4d
        L29:
            r11 = move-exception
            goto L50
        L2b:
            r11 = move-exception
            goto L5e
        L2d:
            r11 = move-exception
            goto L6c
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            Ca.t.b(r14)
            com.google.android.recaptcha.internal.zzdl r14 = new com.google.android.recaptcha.internal.zzdl     // Catch: java.lang.Exception -> L29 cb.a1 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Exception -> L29 cb.a1 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            r0.zzc = r3     // Catch: java.lang.Exception -> L29 cb.a1 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            java.lang.Object r11 = cb.c1.c(r12, r14, r0)     // Catch: java.lang.Exception -> L29 cb.a1 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            if (r11 != r1) goto L4d
            return r1
        L4d:
            Ca.I r11 = Ca.I.a
            return r11
        L50:
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r13 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r14 = com.google.android.recaptcha.internal.zzba.zzap
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r13, r14, r11)
            throw r12
        L5e:
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r13 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r14 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r13, r14, r11)
            throw r12
        L6c:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzn(com.google.android.recaptcha.internal.zzsc, long, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzo(long r7, Ga.e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdr
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzdr r0 = (com.google.android.recaptcha.internal.zzdr) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdr r0 = new com.google.android.recaptcha.internal.zzdr
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            com.google.android.recaptcha.internal.zzen r7 = r0.zze
            com.google.android.recaptcha.internal.zzdt r8 = r0.zzd
            Ca.t.b(r9)     // Catch: java.lang.Exception -> L2d cb.a1 -> L2f com.google.android.recaptcha.internal.zzbd -> L31
            goto L5d
        L2d:
            r9 = move-exception
            goto L6b
        L2f:
            r9 = move-exception
            goto L84
        L31:
            r9 = move-exception
            goto L9d
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            Ca.t.b(r9)
            com.google.android.recaptcha.internal.zzek r9 = r6.zzb
            r2 = 22
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r2)
            com.google.android.recaptcha.internal.zzds r2 = new com.google.android.recaptcha.internal.zzds     // Catch: java.lang.Exception -> L61 cb.a1 -> L63 com.google.android.recaptcha.internal.zzbd -> L65
            r4 = 0
            r2.<init>(r6, r9, r4)     // Catch: java.lang.Exception -> L61 cb.a1 -> L63 com.google.android.recaptcha.internal.zzbd -> L65
            r0.zzd = r6     // Catch: java.lang.Exception -> L61 cb.a1 -> L63 com.google.android.recaptcha.internal.zzbd -> L65
            r0.zze = r9     // Catch: java.lang.Exception -> L61 cb.a1 -> L63 com.google.android.recaptcha.internal.zzbd -> L65
            r0.zzc = r3     // Catch: java.lang.Exception -> L61 cb.a1 -> L63 com.google.android.recaptcha.internal.zzbd -> L65
            java.lang.Object r7 = cb.c1.c(r7, r2, r0)     // Catch: java.lang.Exception -> L61 cb.a1 -> L63 com.google.android.recaptcha.internal.zzbd -> L65
            if (r7 == r1) goto L60
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L5d:
            com.google.android.recaptcha.internal.zzsc r9 = (com.google.android.recaptcha.internal.zzsc) r9     // Catch: java.lang.Exception -> L2d cb.a1 -> L2f com.google.android.recaptcha.internal.zzbd -> L31
            return r9
        L60:
            return r1
        L61:
            r7 = move-exception
            goto L67
        L63:
            r7 = move-exception
            goto L80
        L65:
            r7 = move-exception
            goto L99
        L67:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L6b:
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzaw
            java.lang.String r3 = r9.getMessage()
            r0.<init>(r1, r2, r3)
            com.google.android.recaptcha.internal.zzbd r8 = r8.zzs(r9, r0)
            r7.zzb(r8)
            throw r8
        L80:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L84:
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r3 = r9.getMessage()
            r0.<init>(r1, r2, r3)
            com.google.android.recaptcha.internal.zzbd r8 = r8.zzs(r9, r0)
            r7.zzb(r8)
            throw r8
        L99:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L9d:
            com.google.android.recaptcha.internal.zzbb r0 = r9.zzb()
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            boolean r0 = kotlin.jvm.internal.t.c(r0, r1)
            if (r0 == 0) goto Lad
            com.google.android.recaptcha.internal.zzbd r9 = r8.zzs(r9, r9)
        Lad:
            r7.zzb(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzo(long, Ga.e):java.lang.Object");
    }

    public final void zzq(String str, zzsr zzsrVar) {
        zzen zzf = zzu(str).zzf(29);
        try {
            List<zzst> zzk = zzsrVar.zzk();
            LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(Q.e(w.y(zzk, 10)), 16));
            for (zzst zzstVar : zzk) {
                q a = x.a(zzstVar.zzg(), zzstVar.zzi());
                linkedHashMap.put(a.c(), a.d());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzf.zza();
        } catch (zzbd e) {
            zzf.zzb(e);
        } catch (Exception e2) {
            zzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e2.getMessage()));
        }
    }
}
