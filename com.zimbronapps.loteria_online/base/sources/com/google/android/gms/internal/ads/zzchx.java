package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzchx extends zzchr implements zzhz {
    private static final AtomicInteger zzo = new AtomicInteger(0);
    private String zzd;
    private final zzcgd zze;
    private boolean zzf;
    private final zzchw zzg;
    private final zzcha zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzchx(zzcge zzcgeVar, zzcgd zzcgdVar) {
        super(zzcgeVar);
        this.zze = zzcgdVar;
        this.zzg = new zzchw();
        this.zzh = new zzcha();
        this.zzk = new Object();
        this.zzl = (String) zzgra.zzd(zzcgeVar != null ? zzcgeVar.zzn() : null).zza("");
        this.zzm = zzcgeVar != null ? zzcgeVar.zzp() : 0;
        zzo.incrementAndGet();
    }

    public static int zzr() {
        return zzo.get();
    }

    public static final String zzv(String str) {
        return "cache:".concat(String.valueOf(W5.g.o(str)));
    }

    private final void zzx() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round(zza2 * (position / zza));
        int zzP = zzcfv.zzP();
        int zzQ = zzcfv.zzQ();
        String str = this.zzd;
        zzn(str, zzv(str), position, zza, round, zza2, round > 0, zzP, zzQ);
    }

    public final void release() {
        zzo.decrementAndGet();
    }

    public final void zza(zzhb zzhbVar, zzhf zzhfVar, boolean z) {
    }

    public final void zzb(zzhb zzhbVar, zzhf zzhfVar, boolean z) {
        if (zzhbVar instanceof zzhm) {
            this.zzg.zzb((zzhm) zzhbVar);
        }
    }

    public final void zzc(zzhb zzhbVar, zzhf zzhfVar, boolean z, int i) {
    }

    public final void zzd(zzhb zzhbVar, zzhf zzhfVar, boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c3, code lost:
    
        r30.zzn = true;
        zzp(r31, r4, (int) r30.zzh.zza(r30.zzi));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:? -> B:56:0x00ea). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchx.zze(java.lang.String):boolean");
    }

    public final void zzl() {
        this.zzf = true;
    }

    public final String zzs() {
        return this.zzd;
    }

    public final boolean zzt() {
        return this.zzn;
    }

    public final ByteBuffer zzu() {
        synchronized (this.zzk) {
            try {
                ByteBuffer byteBuffer = this.zzi;
                if (byteBuffer != null && !this.zzj) {
                    byteBuffer.flip();
                    this.zzj = true;
                }
                this.zzf = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.zzi;
    }
}
