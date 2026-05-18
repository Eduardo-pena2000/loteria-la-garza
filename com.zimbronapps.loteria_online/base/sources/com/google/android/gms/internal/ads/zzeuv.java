package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeuv implements zzfax {
    private final zzgzy zza;
    private final Context zzb;

    public zzeuv(zzgzy zzgzyVar, Context context) {
        this.zza = zzgzyVar;
        this.zzb = context;
    }

    public final x7.e zza() {
        return this.zza.submit(new zzeuu(this));
    }

    public final int zzb() {
        return 13;
    }

    public final /* synthetic */ zzeuw zzc() {
        int i;
        int i2;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        float b = R5.t.m().b();
        boolean d = R5.t.m().d();
        if (audioManager == null) {
            return new zzeuw(-1, false, false, -1, -1, -1, -1, -1, b, d, true);
        }
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzmv)).booleanValue()) {
            int j = R5.t.j().j(audioManager);
            i2 = audioManager.getStreamMaxVolume(3);
            i = j;
        } else {
            i = -1;
            i2 = -1;
        }
        return new zzeuw(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i, i2, audioManager.getRingerMode(), audioManager.getStreamVolume(2), b, d, false);
    }
}
