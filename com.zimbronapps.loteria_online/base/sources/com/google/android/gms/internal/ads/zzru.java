package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzru {
    private final AudioTrack zza;
    private final Handler zzb;
    private AudioRouting.OnRoutingChangedListener zzc;
    private final zzsh zzd;

    public /* synthetic */ zzru(AudioTrack audioTrack, zzsh zzshVar, byte[] bArr) {
        this.zza = audioTrack;
        this.zzd = zzshVar;
        Handler zzc = zzfj.zzc(null);
        this.zzb = zzc;
        zzrt zzrtVar = new zzrt(this);
        this.zzc = zzrtVar;
        audioTrack.addOnRoutingChangedListener(zzrtVar, zzc);
    }

    public final /* synthetic */ void zza(AudioRouting audioRouting) {
        if (this.zzc == null) {
            return;
        }
        zzdh.zza().execute(new zzrr(this, audioRouting));
    }

    public final /* synthetic */ void zzb(AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.zzb.post(new zzrs(this, routedDevice));
        }
    }

    public final /* synthetic */ void zzc(AudioDeviceInfo audioDeviceInfo) {
        if (this.zzc == null) {
            return;
        }
        zzsi zzsiVar = this.zzd.zza;
        if (zzsiVar.zzi() != null) {
            zzsiVar.zzi().zzc(audioDeviceInfo);
        }
    }

    public final /* synthetic */ void zzd() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.zzc = null;
    }
}
