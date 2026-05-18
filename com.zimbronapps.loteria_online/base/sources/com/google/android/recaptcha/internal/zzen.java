package com.google.android.recaptcha.internal;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzen {
    private static zzqk zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzeo zzf;
    private final Context zzg;
    private final Integer zzh;
    private final String zzi = zzqb.zzc(zzqb.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();
    private final int zzk;
    private final int zzl;

    public zzen(int i, String str, int i2, String str2, String str3, String str4, String str5, zzeo zzeoVar, zzcc zzccVar, Context context, Integer num) {
        this.zzk = i;
        this.zzb = str;
        this.zzl = i2;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzeoVar;
        this.zzg = context;
        this.zzh = num;
    }

    /*  JADX ERROR: IIiLliI1l1li1 in pass: RegionMakerVisitor
        LI11I1ll1Ii11.IIiLliI1l1li1: Can't find top splitter block for handler:B:35:0x00e1
        	at LL11ILIl1lL1ii.LLll11I1I1lL.llLliLLIll1lI(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:37)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:68)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:10)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:41)
        */
    /* JADX WARN: Path cross not found for [B:30:0x00c7, B:49:0x00e8], limit reached: 71 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119 A[Catch: NameNotFoundException -> 0x015f, TryCatch #2 {NameNotFoundException -> 0x015f, blocks: (B:37:0x0115, B:39:0x0119, B:45:0x0138, B:46:0x014d), top: B:36:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzc(int r13, com.google.android.recaptcha.internal.zzqq r14) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzen.zzc(int, com.google.android.recaptcha.internal.zzqq):void");
    }

    public final void zza() {
        zzc(3, null);
    }

    public final void zzb(zzbd zzbdVar) {
        zzqo zzg = zzqq.zzg();
        zzg.zzr(String.valueOf(zzbdVar.zzb().zza()));
        zzg.zze(zzbdVar.zza().zza());
        zzg.zzq(zzbdVar.zzc().getErrorCode().getErrorCode());
        String zzd = zzbdVar.zzd();
        if (zzd != null) {
            zzg.zzf(zzd);
        }
        zzc(4, (zzqq) zzg.zzi());
    }
}
