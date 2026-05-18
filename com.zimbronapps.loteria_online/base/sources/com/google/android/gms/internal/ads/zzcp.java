package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzcp implements zzco {
    protected zzcl zzb;
    protected zzcl zzc;
    private zzcl zzd;
    private zzcl zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzcp() {
        ByteBuffer byteBuffer = zzco.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzcl zzclVar = zzcl.zza;
        this.zzd = zzclVar;
        this.zze = zzclVar;
        this.zzb = zzclVar;
        this.zzc = zzclVar;
    }

    public final zzcl zzb(zzcl zzclVar) throws zzcn {
        this.zzd = zzclVar;
        this.zze = zzm(zzclVar);
        return zzc() ? this.zze : zzcl.zza;
    }

    public boolean zzc() {
        return this.zze != zzcl.zza;
    }

    public final void zze() {
        this.zzh = true;
        zzn();
    }

    public ByteBuffer zzf() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzco.zza;
        return byteBuffer;
    }

    public boolean zzg() {
        return this.zzh && this.zzg == zzco.zza;
    }

    @Deprecated
    public final void zzh() {
        zzcm zzcmVar = zzcm.zza;
        throw null;
    }

    public final void zzi(zzcm zzcmVar) {
        this.zzg = zzco.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzo();
    }

    public final void zzj() {
        ByteBuffer byteBuffer = zzco.zza;
        this.zzg = byteBuffer;
        this.zzh = false;
        this.zzf = byteBuffer;
        zzcl zzclVar = zzcl.zza;
        this.zzd = zzclVar;
        this.zze = zzclVar;
        this.zzb = zzclVar;
        this.zzc = zzclVar;
        zzp();
    }

    public final ByteBuffer zzk(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    public final boolean zzl() {
        return this.zzg.hasRemaining();
    }

    public zzcl zzm(zzcl zzclVar) throws zzcn {
        throw null;
    }

    public void zzn() {
    }

    @Deprecated
    public void zzo() {
    }

    public void zzp() {
    }
}
