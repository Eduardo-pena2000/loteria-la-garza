package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzibl extends zzhzv {
    protected zzibr zza;
    private final zzibr zzb;

    public zzibl(zzibr zzibrVar) {
        this.zzb = zzibrVar;
        if (zzibrVar.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zza();
    }

    private zzibr zza() {
        return this.zzb.zzbg();
    }

    private static void zzb(Object obj, Object obj2) {
        zzidm.zza().zzb(obj.getClass()).zzd(obj, obj2);
    }

    public /* bridge */ /* synthetic */ zzhzv zzaE(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
        zzbr(zziaqVar, zzibbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhzv zzaI(byte[] bArr, int i, int i2) throws zzicg {
        zzbq(bArr, i, i2);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhzv zzaK(byte[] bArr, int i, int i2, zzibb zzibbVar) throws zzicg {
        zzbp(bArr, i, i2, zzibbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhzv zzaQ(zzhzw zzhzwVar) {
        zzbn((zzibr) zzhzwVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzaX(byte[] bArr, int i, int i2, zzibb zzibbVar) throws zzicg {
        zzbp(bArr, i, i2, zzibbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzaZ(byte[] bArr, int i, int i2) throws zzicg {
        zzbq(bArr, i, i2);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzbd(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
        zzbr(zziaqVar, zzibbVar);
        return this;
    }

    public final void zzbg() {
        if (this.zza.zzaX()) {
            return;
        }
        zzbh();
    }

    public void zzbh() {
        zzibr zza = zza();
        zzb(zza, this.zza);
        this.zza = zza;
    }

    public final boolean zzbi() {
        return zzibr.zzcd(this.zza, false);
    }

    public final zzibl zzbj() {
        if (this.zzb.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zza();
        return this;
    }

    /* renamed from: zzbk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public zzibl zzbf() {
        zzibl zzbf = zzbw().zzbf();
        zzbf.zza = zzbt();
        return zzbf;
    }

    /* renamed from: zzbl, reason: merged with bridge method [inline-methods] */
    public zzibr zzbt() {
        if (!this.zza.zzaX()) {
            return this.zza;
        }
        this.zza.zzbm();
        return this.zza;
    }

    /* renamed from: zzbm, reason: merged with bridge method [inline-methods] */
    public final zzibr zzbu() {
        zzibr zzbt = zzbt();
        if (zzbt.zzbi()) {
            return zzbt;
        }
        throw zzhzv.zzaR(zzbt);
    }

    public zzibl zzbn(zzibr zzibrVar) {
        zzbo(zzibrVar);
        return this;
    }

    public zzibl zzbo(zzibr zzibrVar) {
        if (zzbw().equals(zzibrVar)) {
            return this;
        }
        zzbg();
        zzb(this.zza, zzibrVar);
        return this;
    }

    public zzibl zzbp(byte[] bArr, int i, int i2, zzibb zzibbVar) throws zzicg {
        zzbg();
        try {
            zzidm.zza().zzb(this.zza.getClass()).zzj(this.zza, bArr, i, i + i2, new zziab(zzibbVar));
            return this;
        } catch (IOException e) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (zzicg e2) {
            throw e2;
        }
    }

    public zzibl zzbq(byte[] bArr, int i, int i2) throws zzicg {
        int i3 = zzibb.zzb;
        int i4 = zziaa.zza;
        zzbp(bArr, i, i2, zzibb.zza);
        return this;
    }

    public zzibl zzbr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
        zzbg();
        try {
            zzidm.zza().zzb(this.zza.getClass()).zzg(this.zza, zziar.zza(zziaqVar), zzibbVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw e.getCause();
            }
            throw e;
        }
    }

    /* renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public zzibr zzbw() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzidb zzbv() {
        zzbj();
        return this;
    }
}
