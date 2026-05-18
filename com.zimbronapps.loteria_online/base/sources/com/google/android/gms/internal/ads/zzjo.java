package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzjo implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzadm, zzrc, zzyq, zzvi, zzby, zzeu {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzks zza;

    public /* synthetic */ zzjo(zzks zzksVar, byte[] bArr) {
        Objects.requireNonNull(zzksVar);
        this.zza = zzksVar;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzks zzksVar = this.zza;
        zzksVar.zzQ(surfaceTexture);
        zzksVar.zzS(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzks zzksVar = this.zza;
        zzksVar.zzR(null);
        zzksVar.zzS(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzS(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzS(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzS(0, 0);
    }

    public final void zza(zzfb zzfbVar) {
        this.zza.zzP(zziw.zzc(zzfbVar, 1003));
    }

    public final void zzb(zzin zzinVar) {
        this.zza.zzW().zzN(zzinVar);
    }

    public final void zzc(String str, long j, long j2) {
        this.zza.zzW().zzO(str, j, j2);
    }

    public final void zzd(zzv zzvVar, zzio zzioVar) {
        this.zza.zzW().zzP(zzvVar, zzioVar);
    }

    public final void zze(int i, long j) {
        this.zza.zzW().zzQ(i, j);
    }

    public final void zzf(zzbv zzbvVar) {
        zzjm zzjmVar = new zzjm(zzbvVar);
        zzed zzV = this.zza.zzV();
        zzV.zzd(25, zzjmVar);
        zzV.zze();
    }

    public final void zzg(Object obj, long j) {
        zzks zzksVar = this.zza;
        zzksVar.zzW().zzT(obj, j);
        if (zzksVar.zzab() == obj) {
            zzed zzV = zzksVar.zzV();
            zzV.zzd(26, zzjn.zza);
            zzV.zze();
        }
    }

    public final void zzh(String str) {
        this.zza.zzW().zzR(str);
    }

    public final void zzi(zzin zzinVar) {
        this.zza.zzW().zzS(zzinVar);
    }

    public final void zzj(long j, int i) {
        this.zza.zzW().zzU(j, i);
    }

    public final void zzk(Exception exc) {
        this.zza.zzW().zzV(exc);
    }

    public final void zzl(zzin zzinVar) {
        this.zza.zzW().zzC(zzinVar);
    }

    public final void zzm(String str, long j, long j2) {
        this.zza.zzW().zzD(str, j, j2);
    }

    public final void zzn(zzv zzvVar, zzio zzioVar) {
        this.zza.zzW().zzE(zzvVar, zzioVar);
    }

    public final void zzo(long j) {
        this.zza.zzW().zzF(j);
    }

    public final void zzp(int i, long j, long j2) {
        this.zza.zzW().zzG(i, j, j2);
    }

    public final void zzq(String str) {
        this.zza.zzW().zzH(str);
    }

    public final void zzr(zzin zzinVar) {
        this.zza.zzW().zzI(zzinVar);
    }

    public final void zzs(boolean z) {
        zzks zzksVar = this.zza;
        if (zzksVar.zzac() == z) {
            return;
        }
        zzksVar.zzad(z);
        zzed zzV = zzksVar.zzV();
        zzV.zzd(23, new zzjj(z));
        zzV.zze();
    }

    public final void zzt(Exception exc) {
        this.zza.zzW().zzJ(exc);
    }

    public final void zzu(Exception exc) {
        this.zza.zzW().zzK(exc);
    }

    public final void zzv(zzrd zzrdVar) {
        this.zza.zzW().zzL(zzrdVar);
    }

    public final void zzw(zzrd zzrdVar) {
        this.zza.zzW().zzM(zzrdVar);
    }

    public final void zzx(int i) {
        this.zza.zzZ().zza(new zzjk(i), new zzjl(i));
    }

    public final void zzy(zzil zzilVar) {
        zzks zzksVar = this.zza;
        for (Map.Entry entry : new HashMap(zzksVar.zzaa()).entrySet()) {
            zzim zzimVar = (zzim) entry.getKey();
            List list = (List) entry.getValue();
            if (!zzks.zzU(zzilVar, list).equals(zzks.zzU(zzksVar.zzaf(), list))) {
                zzimVar.zza();
            }
        }
        zzksVar.zzag(zzilVar);
    }
}
