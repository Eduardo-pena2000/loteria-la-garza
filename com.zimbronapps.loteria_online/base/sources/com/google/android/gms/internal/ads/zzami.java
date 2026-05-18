package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzami implements zzagh {
    private final zzagh zza;
    private final zzamd zzb;
    private zzamf zzg;
    private zzv zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzfj.zzb;
    private final zzer zzc = new zzer();

    public zzami(zzagh zzaghVar, zzamd zzamdVar) {
        this.zza = zzaghVar;
        this.zzb = zzamdVar;
    }

    private final void zzi(int i) {
        int length = this.zzf.length;
        int i2 = this.zze;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.zzd;
        int max = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.zzf;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i3);
        this.zzd = 0;
        this.zze = i3;
        this.zzf = bArr2;
    }

    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzb(zzjVar, i, z, 0);
        }
        zzi(i);
        int zza = zzjVar.zza(this.zzf, this.zze, i);
        if (zza != -1) {
            this.zze += zza;
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzd(zzer zzerVar, int i, int i2) {
        if (this.zzg == null) {
            this.zza.zzd(zzerVar, i, i2);
            return;
        }
        zzi(i);
        zzerVar.zzm(this.zzf, this.zze, i);
        this.zze += i;
    }

    public final void zze(long j, int i, int i2, int i3, zzagg zzaggVar) {
        if (this.zzg == null) {
            this.zza.zze(j, i, i2, i3, zzaggVar);
            return;
        }
        zzgrc.zzb(zzaggVar == null, "DRM on subtitles is not supported");
        int i4 = (this.zze - i3) - i2;
        try {
            this.zzg.zza(this.zzf, i4, i2, zzame.zza(), new zzamh(this, j, i));
        } catch (RuntimeException e) {
            if (!this.zzi) {
                throw e;
            }
            zzee.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.zzd = i5;
        if (i5 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }

    public final void zzf(boolean z) {
        this.zzi = true;
    }

    public final /* synthetic */ void zzh(long j, int i, zzalx zzalxVar) {
        this.zzh.getClass();
        zzguf zzgufVar = zzalxVar.zza;
        long j2 = zzalxVar.zzc;
        ArrayList arrayList = new ArrayList(zzgufVar.size());
        Iterator it = zzgufVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcx) it.next()).zzb());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j2);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzer zzerVar = this.zzc;
        int length = marshall.length;
        zzerVar.zzb(marshall, length);
        zzagh zzaghVar = this.zza;
        zzaghVar.zzc(zzerVar, length);
        long j3 = zzalxVar.zzb;
        if (j3 == -9223372036854775807L) {
            zzgrc.zzi(this.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j4 = this.zzh.zzt;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        zzaghVar.zze(j, i | 1, length, 0, null);
    }

    public final void zzz(zzv zzvVar) {
        String str = zzvVar.zzo;
        str.getClass();
        zzgrc.zza(zzas.zzf(str) == 3);
        if (!zzvVar.equals(this.zzh)) {
            this.zzh = zzvVar;
            zzamd zzamdVar = this.zzb;
            this.zzg = zzamdVar.zza(zzvVar) ? zzamdVar.zzc(zzvVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzz(zzvVar);
            return;
        }
        zzagh zzaghVar = this.zza;
        zzt zza = zzvVar.zza();
        zza.zzm("application/x-media3-cues");
        zza.zzj(str);
        zza.zzr(Long.MAX_VALUE);
        zza.zzK(this.zzb.zzb(zzvVar));
        zzaghVar.zzz(zza.zzM());
    }
}
