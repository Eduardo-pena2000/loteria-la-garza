package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.content.Context;
import android.net.Uri;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcja extends zzcfk {
    private final zzcgf zzc;
    private zzcjb zzd;
    private Uri zze;
    private zzcfj zzf;
    private boolean zzg;
    private int zzh;

    public zzcja(Context context, zzcgf zzcgfVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzcgfVar;
        zzcgfVar.zza(this);
    }

    private final boolean zzu() {
        int i = this.zzh;
        return (i == 1 || i == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i) {
        if (i == 4) {
            this.zzc.zze();
            this.zzb.zzd();
        } else if (this.zzh == 4) {
            this.zzc.zzf();
            this.zzb.zze();
        }
        this.zzh = i;
    }

    public final String toString() {
        String name = zzcja.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    public final String zza() {
        return "ImmersivePlayer";
    }

    public final void zzb(zzcfj zzcfjVar) {
        this.zzf = zzcfjVar;
    }

    public final void zzc(String str) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.zze = parse;
            this.zzd = new zzcjb(parse.toString());
            zzv(3);
            F0.l.post(new zzciz(this));
        }
    }

    public final void zzd() {
        o0.k("AdImmersivePlayerView stop");
        zzcjb zzcjbVar = this.zzd;
        if (zzcjbVar != null) {
            zzcjbVar.zzd();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzc();
    }

    public final void zze() {
        o0.k("AdImmersivePlayerView play");
        if (zzu()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zza();
            F0.l.post(new zzcix(this));
        }
    }

    public final void zzf() {
        o0.k("AdImmersivePlayerView pause");
        if (zzu() && this.zzd.zza()) {
            this.zzd.zzc();
            zzv(5);
            F0.l.post(new zzciy(this));
        }
    }

    public final int zzg() {
        return zzu() ? 0 : -1;
    }

    public final int zzh() {
        return 0;
    }

    public final void zzi(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i);
        o0.k(sb.toString());
    }

    public final void zzj(float f, float f2) {
    }

    public final int zzk() {
        return 0;
    }

    public final int zzl() {
        return 0;
    }

    public final long zzm() {
        return 0L;
    }

    public final long zzn() {
        return 0L;
    }

    public final long zzo() {
        return 0L;
    }

    public final int zzp() {
        return zzu() ? 0 : -1;
    }

    public final void zzq() {
        if (this.zzd != null) {
            this.zzb.zzc();
        }
    }

    public final /* synthetic */ void zzr() {
        zzcfj zzcfjVar = this.zzf;
        if (zzcfjVar != null) {
            zzcfjVar.zzb();
        }
    }

    public final /* synthetic */ void zzs() {
        zzcfj zzcfjVar = this.zzf;
        if (zzcfjVar != null) {
            if (!this.zzg) {
                zzcfjVar.zzk();
                this.zzg = true;
            }
            this.zzf.zzc();
        }
    }

    public final /* synthetic */ void zzt() {
        zzcfj zzcfjVar = this.zzf;
        if (zzcfjVar != null) {
            zzcfjVar.zzd();
        }
    }
}
