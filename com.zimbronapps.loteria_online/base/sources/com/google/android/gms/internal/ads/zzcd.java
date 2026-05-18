package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcd {
    private final zzgru zza;
    private final Handler zzb;
    private zzcc zzc;
    private zzd zzd;
    private int zzf;
    private zzch zzh;
    private float zzg = 1.0f;
    private int zze = 0;

    public zzcd(Context context, Looper looper, zzcc zzccVar) {
        this.zza = zzgry.zza(new zzcb(context));
        this.zzc = zzccVar;
        this.zzb = new Handler(looper);
    }

    private final void zzf() {
        int i = this.zze;
        if (i == 1 || i == 0 || this.zzh == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.zza.zza();
        zzch zzchVar = this.zzh;
        if (Build.VERSION.SDK_INT >= 26) {
            T2.k.a(audioManager, zzchVar.zzc());
        } else {
            audioManager.abandonAudioFocus(zzchVar.zzb());
        }
    }

    private final void zzg(int i) {
        if (this.zze == i) {
            return;
        }
        this.zze = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.zzg != f) {
            this.zzg = f;
            zzcc zzccVar = this.zzc;
            if (zzccVar != null) {
                zzccVar.zza(f);
            }
        }
    }

    private final void zzh(int i) {
        zzcc zzccVar = this.zzc;
        if (zzccVar != null) {
            zzccVar.zzb(i);
        }
    }

    public final float zza() {
        return this.zzg;
    }

    public final void zzb(zzd zzdVar) {
        if (Objects.equals(this.zzd, zzdVar)) {
            return;
        }
        this.zzd = zzdVar;
        this.zzf = zzdVar == null ? 0 : 1;
    }

    public final int zzc(boolean z, int i) {
        int requestAudioFocus;
        if (i == 1 || this.zzf != 1) {
            zzf();
            zzg(0);
            return 1;
        }
        if (!z) {
            int i2 = this.zze;
            if (i2 != 1) {
                return i2 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.zze == 2) {
            return 1;
        }
        if (this.zzh == null) {
            zzce zzceVar = new zzce(1);
            zzd zzdVar = this.zzd;
            zzdVar.getClass();
            zzceVar.zzb(zzdVar);
            zzceVar.zza(new zzca(this), this.zzb);
            this.zzh = zzceVar.zzc();
        }
        AudioManager audioManager = (AudioManager) this.zza.zza();
        zzch zzchVar = this.zzh;
        if (Build.VERSION.SDK_INT >= 26) {
            requestAudioFocus = T2.j.a(audioManager, zzchVar.zzc());
        } else {
            AudioManager.OnAudioFocusChangeListener zzb = zzchVar.zzb();
            zzchVar.zza();
            requestAudioFocus = audioManager.requestAudioFocus(zzb, 3, 1);
        }
        if (requestAudioFocus == 1) {
            zzg(2);
            return 1;
        }
        zzg(1);
        return -1;
    }

    public final void zzd() {
        this.zzc = null;
        zzf();
        zzg(0);
    }

    public final /* synthetic */ void zze(int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzg(4);
                return;
            } else {
                zzh(0);
                zzg(3);
                return;
            }
        }
        if (i == -1) {
            zzh(-1);
            zzf();
            zzg(1);
        } else if (i == 1) {
            zzg(2);
            zzh(1);
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
            sb.append("Unknown focus change type: ");
            sb.append(i);
            zzee.zzc("AudioFocusManager", sb.toString());
        }
    }
}
