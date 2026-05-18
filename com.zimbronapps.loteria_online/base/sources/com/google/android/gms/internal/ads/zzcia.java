package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.net.Uri;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcia extends zzchr implements zzcfu {
    public static final /* synthetic */ int zzd = 0;
    private zzcfv zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzchj zzi;
    private long zzj;
    private long zzk;

    public zzcia(zzcge zzcgeVar, zzcgd zzcgdVar) {
        super(zzcgeVar);
        zzcit zzcitVar = new zzcit(zzcgeVar.getContext(), zzcgdVar, (zzcge) this.zzc.get(), null);
        int i = o0.b;
        W5.p.e("ExoPlayerAdapter initialized.");
        this.zze = zzcitVar;
        zzcitVar.zzs(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(W5.g.o(str)));
    }

    private final void zzd(long j) {
        F0.l.postDelayed(new zzchy(this), j);
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    public final void release() {
        zzcfv zzcfvVar = this.zze;
        if (zzcfvVar != null) {
            zzcfvVar.zzs(null);
            this.zze.zzt();
        }
    }

    public final void zzD() {
        int i = o0.b;
        W5.p.f("Precache onRenderedFirstFrame");
    }

    public final zzcfv zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        zzcfv zzcfvVar = this.zze;
        this.zze = null;
        return zzcfvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzb() {
        String str;
        zzcia zzciaVar;
        zzcia zzciaVar2;
        long longValue;
        long intValue;
        boolean booleanValue;
        zzcia zzciaVar3;
        long j;
        long j2;
        String str2;
        zzcia zzciaVar4;
        long j3;
        String zzc = zzc(this.zzf);
        try {
            longValue = ((Long) S5.D.c().zzd(zzbhe.zzah)).longValue() * 1000;
            intValue = ((Integer) S5.D.c().zzd(zzbhe.zzw)).intValue();
            zzbgv zzbgvVar = zzbhe.zzcw;
            str = S5.D.c();
            booleanValue = ((Boolean) str.zzd(zzbgvVar)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
                zzciaVar = booleanValue;
            }
        } catch (Exception e) {
            e = e;
            str = zzc;
            zzciaVar = this;
        }
        synchronized (this) {
            try {
                if (R5.t.o().a() - this.zzj > longValue) {
                    StringBuilder sb = new StringBuilder(String.valueOf(longValue).length() + 27);
                    sb.append("Timeout reached. Limit: ");
                    sb.append(longValue);
                    sb.append(" ms");
                    throw new IOException(sb.toString());
                }
                if (this.zzg) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!this.zzh) {
                    if (!this.zze.zzB()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long zzH = this.zze.zzH();
                    if (zzH > 0) {
                        long zzN = this.zze.zzN();
                        if (zzN != this.zzk) {
                            try {
                                j2 = intValue;
                                str2 = zzc;
                            } catch (Throwable th2) {
                                th = th2;
                                str2 = zzc;
                                zzciaVar4 = this;
                            }
                            try {
                                zzm(this.zzf, zzc, zzN, zzH, zzN > 0, booleanValue != 0 ? this.zze.zzI() : -1L, booleanValue != 0 ? this.zze.zzJ() : -1L, booleanValue != 0 ? this.zze.zzK() : -1L, zzcfv.zzP(), zzcfv.zzQ());
                                zzciaVar4 = this;
                                j = zzN;
                                try {
                                    zzciaVar4.zzk = j;
                                    j3 = zzH;
                                    zzciaVar4 = zzciaVar4;
                                } catch (Throwable th3) {
                                    th = th3;
                                    str = str2;
                                    zzciaVar = zzciaVar4;
                                    try {
                                        throw th;
                                    } catch (Exception e2) {
                                        e = e2;
                                        String str3 = zzciaVar.zzf;
                                        String message = e.getMessage();
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 34 + String.valueOf(message).length());
                                        sb2.append("Failed to preload url ");
                                        sb2.append(str3);
                                        sb2.append(" Exception: ");
                                        sb2.append(message);
                                        String sb3 = sb2.toString();
                                        int i = o0.b;
                                        W5.p.f(sb3);
                                        R5.t.l().zzh(e, "VideoStreamExoPlayerCache.preload");
                                        release();
                                        zzciaVar.zzq(zzciaVar.zzf, str, "error", zzx("error", e));
                                        zzciaVar2 = zzciaVar;
                                        R5.t.b().zzd(zzciaVar2.zzi);
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                zzciaVar4 = this;
                                str = str2;
                                zzciaVar = zzciaVar4;
                                throw th;
                            }
                        } else {
                            j = zzN;
                            j2 = intValue;
                            str2 = zzc;
                            zzciaVar4 = this;
                            j3 = zzH;
                        }
                        if (j >= j3) {
                            zzciaVar4.zzp(zzciaVar4.zzf, str2, j3);
                            zzciaVar2 = zzciaVar4;
                        } else {
                            long zzO = zzciaVar4.zze.zzO();
                            zzciaVar3 = zzciaVar4;
                            if (zzO >= j2) {
                                zzciaVar3 = zzciaVar4;
                                if (j > 0) {
                                    zzciaVar2 = zzciaVar4;
                                }
                            }
                        }
                    } else {
                        zzciaVar3 = this;
                    }
                    zzciaVar3.zzd(((Long) S5.D.c().zzd(zzbhe.zzai)).longValue());
                    return;
                }
                zzciaVar2 = this;
                R5.t.b().zzd(zzciaVar2.zzi);
            } catch (Throwable th5) {
                th = th5;
                str = zzc;
                zzciaVar = this;
            }
        }
    }

    public final boolean zze(String str) {
        return zzf(str, new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0175, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzf(java.lang.String r48, java.lang.String[] r49) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcia.zzf(java.lang.String, java.lang.String[]):boolean");
    }

    public final boolean zzg(String str, String[] strArr, zzchj zzchjVar) {
        this.zzf = str;
        this.zzi = zzchjVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcge zzcgeVar = (zzcge) this.zzc.get();
            if (zzcgeVar != null) {
                zzcgeVar.zzt(zzc, this);
            }
            this.zzj = R5.t.o().a();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            String sb2 = sb.toString();
            int i2 = o0.b;
            W5.p.f(sb2);
            R5.t.l().zzh(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, zzc, "error", zzx("error", e));
            return false;
        }
    }

    public final void zzh(int i) {
        this.zze.zzG(i);
    }

    public final void zzi(int i) {
        this.zze.zzF(i);
    }

    public final void zzj(int i) {
        this.zze.zzy(i);
    }

    public final void zzk(int i) {
        this.zze.zzz(i);
    }

    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    public final void zzr(boolean z, long j) {
        zzcge zzcgeVar = (zzcge) this.zzc.get();
        if (zzcgeVar != null) {
            zzcei.zzf.execute(new zzchz(zzcgeVar, z, j));
        }
    }

    public final void zzs(int i) {
    }

    public final void zzt(int i, int i2) {
    }

    public final void zzu(String str, Exception exc) {
        int i = o0.b;
        W5.p.g("Precache error", exc);
        R5.t.l().zzh(exc, "VideoStreamExoPlayerCache.onError");
    }

    public final void zzv(String str, Exception exc) {
        int i = o0.b;
        W5.p.g("Precache exception", exc);
        R5.t.l().zzh(exc, "VideoStreamExoPlayerCache.onException");
    }
}
