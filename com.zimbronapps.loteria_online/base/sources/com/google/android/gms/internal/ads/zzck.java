package com.google.android.gms.internal.ads;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzck {
    private final zzguf zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzck(zzguf zzgufVar) {
        this.zza = zzgufVar;
        zzcl zzclVar = zzcl.zza;
        this.zzd = false;
    }

    private final void zzi(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i <= zzj()) {
                if (!this.zzc[i].hasRemaining()) {
                    List list = this.zzb;
                    zzco zzcoVar = (zzco) list.get(i);
                    if (!zzcoVar.zzg()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzco.zza;
                        long remaining = byteBuffer2.remaining();
                        zzcoVar.zzd(byteBuffer2);
                        this.zzc[i] = zzcoVar.zzf();
                        boolean z2 = true;
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.zzc[i].hasRemaining() && i < zzj()) {
                        ((zzco) list.get(i + 1)).zze();
                    }
                }
                i++;
            }
        } while (z);
    }

    private final int zzj() {
        return this.zzc.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzguf zzgufVar = this.zza;
        int size = zzgufVar.size();
        zzguf zzgufVar2 = ((zzck) obj).zza;
        if (size != zzgufVar2.size()) {
            return false;
        }
        for (int i = 0; i < zzgufVar.size(); i++) {
            if (zzgufVar.get(i) != zzgufVar2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcl zza(zzcl zzclVar) throws zzcn {
        if (zzclVar.equals(zzcl.zza)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i >= zzgufVar.size()) {
                return zzclVar;
            }
            zzco zzcoVar = (zzco) zzgufVar.get(i);
            zzcl zzb = zzcoVar.zzb(zzclVar);
            if (zzcoVar.zzc()) {
                zzgrc.zzi(!zzb.equals(r0));
                zzclVar = zzb;
            }
            i++;
        }
    }

    public final void zzb(zzcm zzcmVar) {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        long j = zzcmVar.zzb;
        int i = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i >= zzgufVar.size()) {
                break;
            }
            zzco zzcoVar = (zzco) zzgufVar.get(i);
            zzcoVar.zzi(new zzcm(j));
            if (zzcoVar.zzc()) {
                j = zzcoVar.zza(j);
                zzgrc.zzi(j >= 0);
                list.add(zzcoVar);
            }
            i++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i2 = 0; i2 <= zzj(); i2++) {
            this.zzc[i2] = ((zzco) list.get(i2)).zzf();
        }
    }

    public final boolean zzc() {
        return !this.zzb.isEmpty();
    }

    public final void zzd(ByteBuffer byteBuffer) {
        if (!zzc() || this.zzd) {
            return;
        }
        zzi(byteBuffer);
    }

    public final ByteBuffer zze() {
        if (!zzc()) {
            return zzco.zza;
        }
        Buffer buffer = this.zzc[zzj()];
        if (buffer.hasRemaining()) {
            return buffer;
        }
        zzi(zzco.zza);
        return this.zzc[zzj()];
    }

    public final void zzf() {
        if (!zzc() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzco) this.zzb.get(0)).zze();
    }

    public final boolean zzg() {
        return this.zzd && ((zzco) this.zzb.get(zzj())).zzg() && !this.zzc[zzj()].hasRemaining();
    }

    public final void zzh() {
        int i = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i >= zzgufVar.size()) {
                this.zzc = new ByteBuffer[0];
                zzcl zzclVar = zzcl.zza;
                this.zzd = false;
                return;
            } else {
                zzco zzcoVar = (zzco) zzgufVar.get(i);
                zzcoVar.zzi(zzcm.zza);
                zzcoVar.zzj();
                i++;
            }
        }
    }
}
