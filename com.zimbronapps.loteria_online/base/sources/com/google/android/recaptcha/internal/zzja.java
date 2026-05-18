package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.l;
import Ca.m;
import Da.D;
import Ga.e;
import android.app.Application;
import android.webkit.WebView;
import cb.a1;
import cb.i;
import cb.x;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzja extends zze {
    public x zza;
    public zzfo zzb;
    private final zzek zzc;
    private zzsc zzf;
    private final zzek zzj;
    private final l zzk;
    private final l zzl;
    private final l zzm;
    private final l zzn;
    private final l zzo;
    private zzen zzp;
    private final zzbi zzq;
    private final Map zzd = zzjb.zza();
    private final Map zze = new LinkedHashMap();
    private final zzcb zzg = new zzcb(zzje.zza);
    private final zzjh zzh = zzjh.zzc();
    private final zzij zzi = new zzij(this);

    public zzja(zzek zzekVar, zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zza = zzekVar.zza();
        zza.zzc(zzekVar.zzd());
        this.zzj = zza;
        int i = zzav.zza;
        this.zzk = m.b(zzis.zza);
        this.zzl = m.b(zzit.zza);
        this.zzm = m.b(zziu.zza);
        this.zzn = m.b(zziv.zza);
        this.zzo = m.b(zziw.zza);
    }

    public static final /* synthetic */ void zzB(zzja zzjaVar, zzen zzenVar) {
        zzjaVar.zzp = null;
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object zzE(com.google.android.recaptcha.internal.zzsc r8, Ga.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzim
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzim r0 = (com.google.android.recaptcha.internal.zzim) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzim r0 = new com.google.android.recaptcha.internal.zzim
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.google.android.recaptcha.internal.zzja r8 = r0.zzd
            Ca.t.b(r9)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            goto L4e
        L2b:
            r9 = move-exception
            goto L67
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            Ca.t.b(r9)
            Ca.l r9 = r7.zzn     // Catch: com.google.android.recaptcha.internal.zzbd -> L64
            java.lang.Object r9 = r9.getValue()     // Catch: com.google.android.recaptcha.internal.zzbd -> L64
            com.google.android.recaptcha.internal.zzff r9 = (com.google.android.recaptcha.internal.zzff) r9     // Catch: com.google.android.recaptcha.internal.zzbd -> L64
            com.google.android.recaptcha.internal.zzek r2 = r7.zzj     // Catch: com.google.android.recaptcha.internal.zzbd -> L64
            r0.zzd = r7     // Catch: com.google.android.recaptcha.internal.zzbd -> L64
            r0.zzc = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L64
            java.lang.Object r9 = r9.zzd(r8, r2, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L64
            if (r9 != r1) goto L4d
            return r1
        L4d:
            r8 = r7
        L4e:
            java.lang.String r9 = (java.lang.String) r9     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            com.google.android.recaptcha.internal.zzbi r0 = r8.zzq     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            cb.O r1 = r0.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            com.google.android.recaptcha.internal.zzin r4 = new com.google.android.recaptcha.internal.zzin     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            r0 = 0
            r4.<init>(r8, r9, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            cb.i.d(r1, r2, r3, r4, r5, r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            goto L6e
        L64:
            r8 = move-exception
            r9 = r8
            r8 = r7
        L67:
            cb.x r8 = r8.zzA()
            r8.b(r9)
        L6e:
            Ca.I r8 = Ca.I.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzE(com.google.android.recaptcha.internal.zzsc, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object zzF(java.lang.String r9, Ga.e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzio
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzio r0 = (com.google.android.recaptcha.internal.zzio) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzio r0 = new com.google.android.recaptcha.internal.zzio
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.zza
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.String r9 = r0.zzf
            java.lang.String r1 = r0.zze
            com.google.android.recaptcha.internal.zzja r0 = r0.zzd
            Ca.t.b(r10)     // Catch: java.lang.Exception -> L31
            r3 = r9
            r4 = r1
            goto L66
        L31:
            r9 = move-exception
            goto L75
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            Ca.t.b(r10)
            com.google.android.recaptcha.internal.zzek r10 = r8.zzj
            r2 = 26
            com.google.android.recaptcha.internal.zzen r10 = r10.zzf(r2)
            r8.zzp = r10
            Ca.l r10 = r8.zzl     // Catch: java.lang.Exception -> L73
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Exception -> L73
            com.google.android.recaptcha.internal.zzbr r10 = (com.google.android.recaptcha.internal.zzbr) r10     // Catch: java.lang.Exception -> L73
            java.lang.String r10 = r10.zza()     // Catch: java.lang.Exception -> L73
            r0.zzd = r8     // Catch: java.lang.Exception -> L73
            r0.zze = r9     // Catch: java.lang.Exception -> L73
            r0.zzf = r10     // Catch: java.lang.Exception -> L73
            r0.zzc = r3     // Catch: java.lang.Exception -> L73
            java.lang.Object r0 = r8.zzw(r0)     // Catch: java.lang.Exception -> L73
            if (r0 == r1) goto L72
            r4 = r9
            r3 = r10
            r10 = r0
            r0 = r8
        L66:
            r2 = r10
            android.webkit.WebView r2 = (android.webkit.WebView) r2     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "utf-8"
            r7 = 0
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L31
            goto L93
        L72:
            return r1
        L73:
            r9 = move-exception
            r0 = r8
        L75:
            com.google.android.recaptcha.internal.zzbd r10 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzU
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r1, r2, r9)
            com.google.android.recaptcha.internal.zzen r9 = r0.zzp
            if (r9 == 0) goto L89
            r9.zzb(r10)
        L89:
            r9 = 0
            r0.zzp = r9
            cb.x r9 = r0.zzA()
            r9.b(r10)
        L93:
            Ca.I r9 = Ca.I.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzF(java.lang.String, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object zzG(java.lang.String r9, Ga.e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzix
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzix r0 = (com.google.android.recaptcha.internal.zzix) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzix r0 = new com.google.android.recaptcha.internal.zzix
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.zza
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.String r9 = r0.zze
            com.google.android.recaptcha.internal.zzja r0 = r0.zzd
            Ca.t.b(r10)
            goto L79
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.String r9 = r0.zze
            com.google.android.recaptcha.internal.zzja r2 = r0.zzd
            Ca.t.b(r10)
            goto L5c
        L40:
            Ca.t.b(r10)
            com.google.android.recaptcha.internal.zzcb r10 = r8.zzg
            com.google.android.recaptcha.internal.zzje r2 = com.google.android.recaptcha.internal.zzje.zzd
            com.google.android.recaptcha.internal.zzje r5 = com.google.android.recaptcha.internal.zzje.zzc
            com.google.android.recaptcha.internal.zzje r6 = com.google.android.recaptcha.internal.zzje.zzb
            com.google.android.recaptcha.internal.zzje[] r2 = new com.google.android.recaptcha.internal.zzje[]{r2, r5, r6}
            r0.zzd = r8
            r0.zze = r9
            r0.zzc = r4
            java.lang.Object r10 = r10.zzb(r2, r0)
            if (r10 == r1) goto La0
            r2 = r8
        L5c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L67
            Ca.I r9 = Ca.I.a
            return r9
        L67:
            com.google.android.recaptcha.internal.zzcb r10 = r2.zzg
            com.google.android.recaptcha.internal.zzje r5 = com.google.android.recaptcha.internal.zzje.zzb
            r0.zzd = r2
            r0.zze = r9
            r0.zzc = r3
            java.lang.Object r10 = r10.zzc(r5, r0)
            if (r10 != r1) goto L78
            goto La0
        L78:
            r0 = r2
        L79:
            r10 = 0
            cb.x r1 = cb.z.b(r10, r4, r10)
            r0.zza = r1
            com.google.android.recaptcha.internal.zzek r1 = r0.zzj
            r1.zzc(r9)
            r9 = 42
            com.google.android.recaptcha.internal.zzen r9 = r1.zzf(r9)
            com.google.android.recaptcha.internal.zzbi r1 = r0.zzq
            cb.O r2 = r1.zza()
            com.google.android.recaptcha.internal.zziz r5 = new com.google.android.recaptcha.internal.zziz
            r5.<init>(r0, r9, r10)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            cb.i.d(r2, r3, r4, r5, r6, r7)
            Ca.I r9 = Ca.I.a
            return r9
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzG(java.lang.String, Ga.e):java.lang.Object");
    }

    public static final /* synthetic */ zzek zzn(zzja zzjaVar) {
        return zzjaVar.zzj;
    }

    public static final /* synthetic */ zzen zzo(zzja zzjaVar) {
        return zzjaVar.zzp;
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    public static final /* synthetic */ zzjh zzr(zzja zzjaVar) {
        return zzjaVar.zzh;
    }

    public static final /* synthetic */ zzsc zzs(zzja zzjaVar) {
        return zzjaVar.zzf;
    }

    public static final /* synthetic */ Object zzt(zzja zzjaVar, zzsc zzscVar, e eVar) {
        return zzjaVar.zzE(zzscVar, eVar);
    }

    public static final /* synthetic */ Object zzu(zzja zzjaVar, String str, e eVar) {
        return zzjaVar.zzF(str, eVar);
    }

    public static final /* synthetic */ Object zzv(zzja zzjaVar, String str, e eVar) {
        return zzjaVar.zzG(null, eVar);
    }

    public static final /* synthetic */ Map zzy(zzja zzjaVar) {
        return zzjaVar.zzd;
    }

    public static final /* synthetic */ Map zzz(zzja zzjaVar) {
        return zzjaVar.zze;
    }

    public final x zzA() {
        x xVar = this.zza;
        if (xVar != null) {
            return xVar;
        }
        return null;
    }

    public final zzft zzC(zzsc zzscVar, zzcg zzcgVar, WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(D.M0(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    public final zzen zza(String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    public final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    public final Object zzd(String str, e eVar) {
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        return zzf.zzi();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzf(java.lang.String r18, Ga.e r19) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzf(java.lang.String, Ga.e):java.lang.Object");
    }

    public final Object zzg(zzbd zzbdVar, e eVar) {
        if (t.c(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return I.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzh(com.google.android.recaptcha.internal.zzsc r6, Ga.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzir
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzir r0 = (com.google.android.recaptcha.internal.zzir) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzir r0 = new com.google.android.recaptcha.internal.zzir
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Ca.t.b(r7)
            goto L5e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            Ca.t.b(r7)
            goto L74
        L38:
            Ca.t.b(r7)
            boolean r7 = r6.zzT()
            if (r7 == 0) goto L67
            boolean r7 = r6.zzR()
            if (r7 == 0) goto L67
            boolean r7 = r6.zzQ()
            if (r7 != 0) goto L4e
            goto L67
        L4e:
            r5.zzf = r6
            com.google.android.recaptcha.internal.zzek r6 = r5.zzc
            java.lang.String r6 = r6.zzd()
            r0.zzc = r3
            java.lang.Object r6 = r5.zzG(r6, r0)
            if (r6 == r1) goto L73
        L5e:
            Ca.s$a r6 = Ca.s.b
            Ca.I r6 = Ca.I.a
            java.lang.Object r6 = Ca.s.b(r6)
            return r6
        L67:
            com.google.android.recaptcha.internal.zzcb r6 = r5.zzg
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzd
            r0.zzc = r4
            java.lang.Object r6 = r6.zzc(r7, r0)
            if (r6 != r1) goto L74
        L73:
            return r1
        L74:
            Ca.s$a r6 = Ca.s.b
            com.google.android.recaptcha.internal.zzbd r6 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r7 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzav
            r1 = 0
            r6.<init>(r7, r0, r1)
            java.lang.Object r6 = Ca.t.a(r6)
            java.lang.Object r6 = Ca.s.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzh(com.google.android.recaptcha.internal.zzsc, Ga.e):java.lang.Object");
    }

    public final Object zzi(String str, long j, Exception exc, e eVar) {
        exc.getMessage();
        x xVar = (x) this.zze.remove(str);
        if (xVar != null) {
            Ia.b.a(xVar.b(exc));
        }
        return I.a;
    }

    public final Object zzj(Exception exc, e eVar) {
        return ((exc instanceof a1) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    public final zzcb zzm() {
        return this.zzg;
    }

    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(e eVar) {
        return i.g(this.zzq.zzb().getCoroutineContext(), new zzjc((zzjd) this.zzk.getValue(), zzD(), null), eVar);
    }

    public final Object zzx(e eVar) {
        Object g = i.g(this.zzq.zzb().getCoroutineContext(), new zzil(this, null), eVar);
        return g == Ha.c.f() ? g : I.a;
    }
}
