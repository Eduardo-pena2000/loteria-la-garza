package com.unity3d.services.core.device;

import com.unity3d.services.core.webview.WebViewEventCategory;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VolumeChangeMonitor$registerVolumeChangeListener$listener$1 implements VolumeChangeListener {
    final /* synthetic */ int $streamType;
    final /* synthetic */ VolumeChangeMonitor this$0;

    public VolumeChangeMonitor$registerVolumeChangeListener$listener$1(VolumeChangeMonitor volumeChangeMonitor, int i) {
        this.this$0 = volumeChangeMonitor;
        this.$streamType = i;
    }

    public int getStreamType() {
        return this.$streamType;
    }

    public void onVolumeChanged(int i) {
        VolumeChangeMonitor.access$getEventSender$p(this.this$0).sendEvent(WebViewEventCategory.DEVICEINFO, DeviceInfoEvent.VOLUME_CHANGED, Integer.valueOf(getStreamType()), Integer.valueOf(i), Integer.valueOf(Device.getStreamMaxVolume(this.$streamType)));
    }
}
