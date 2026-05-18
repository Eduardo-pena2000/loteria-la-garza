package com.unity3d.ads.core.data.datasource;

import android.database.ContentObserver;
import android.os.Handler;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import eb.n;
import eb.v;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 extends ContentObserver {
    final /* synthetic */ v $$this$callbackFlow;
    final /* synthetic */ M $currentRingerMode;
    final /* synthetic */ K $currentVolume;
    final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, K k, v vVar, M m) {
        super((Handler) null);
        this.this$0 = androidDynamicDeviceInfoDataSource;
        this.$currentVolume = k;
        this.$$this$callbackFlow = vVar;
        this.$currentRingerMode = m;
    }

    public void onChange(boolean z) {
        super.onChange(z);
        double access$getStreamVolume = AndroidDynamicDeviceInfoDataSource.access$getStreamVolume(this.this$0, 3);
        K k = this.$currentVolume;
        if (access$getStreamVolume != k.a) {
            k.a = access$getStreamVolume;
            n.b(this.$$this$callbackFlow, new VolumeSettingsChange.VolumeChange(access$getStreamVolume));
        }
        int ringerMode = this.this$0.getRingerMode();
        M m = this.$currentRingerMode;
        if (ringerMode != m.a) {
            m.a = ringerMode;
            n.b(this.$$this$callbackFlow, new VolumeSettingsChange.MuteChange(ringerMode == 0));
        }
    }
}
