package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzmb extends zzkr {
    protected zzmf zza;
    private final zzmf zzb;

    public zzmb(zzmf zzmfVar) {
        this.zzb = zzmfVar;
        if (zzmfVar.zzcf()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zzmfVar.zzch();
    }

    private static void zza(Object obj, Object obj2) {
        zznu.zza().zzb(obj.getClass()).zzd(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ zzkr zzaS(byte[] bArr, int i, int i2) throws zzmr {
        int i3 = zzlr.zzb;
        int i4 = zznu.zza;
        zzbe(bArr, 0, i2, zzlr.zza);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzkr zzaT(byte[] bArr, int i, int i2, zzlr zzlrVar) throws zzmr {
        zzbe(bArr, 0, i2, zzlrVar);
        return this;
    }

    public final void zzaX() {
        if (this.zza.zzcf()) {
            return;
        }
        zzaY();
    }

    public void zzaY() {
        zzmf zzch = this.zzb.zzch();
        zza(zzch, this.zza);
        this.zza = zzch;
    }

    /* renamed from: zzba, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzmb zzaR() {
        zzmb zzmbVar = (zzmb) this.zzb.zzl(5, null, null);
        zzmbVar.zza = zzbf();
        return zzmbVar;
    }

    /* renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public zzmf zzbf() {
        if (!this.zza.zzcf()) {
            return this.zza;
        }
        this.zza.zzcj();
        return this.zza;
    }

    public final zzmf zzbc() {
        zzmf zzbf = zzbf();
        if (zzbf.zzcD()) {
            return zzbf;
        }
        throw new zzoh(zzbf);
    }

    public final zzmb zzbd(zzmf zzmfVar) {
        if (!this.zzb.equals(zzmfVar)) {
            if (!this.zza.zzcf()) {
                zzaY();
            }
            zza(this.zza, zzmfVar);
        }
        return this;
    }

    public final zzmb zzbe(byte[] bArr, int i, int i2, zzlr zzlrVar) throws zzmr {
        if (!this.zza.zzcf()) {
            zzaY();
        }
        try {
            zznu.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i2, new zzkw(zzlrVar));
            return this;
        } catch (IndexOutOfBoundsException unused) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (zzmr e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    public final boolean zzcD() {
        return zzmf.zzcx(this.zza, false);
    }

    public final /* bridge */ /* synthetic */ zznm zzcE() {
        throw null;
    }
}
