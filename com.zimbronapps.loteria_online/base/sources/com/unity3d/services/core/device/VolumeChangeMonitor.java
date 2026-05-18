package com.unity3d.services.core.device;

import android.util.SparseArray;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VolumeChangeMonitor {
    private final IEventSender eventSender;
    private final VolumeChange volumeChange;
    private final SparseArray volumeChangeListeners;

    public VolumeChangeMonitor(IEventSender eventSender, VolumeChange volumeChange) {
        t.g(eventSender, "eventSender");
        t.g(volumeChange, "volumeChange");
        this.eventSender = eventSender;
        this.volumeChange = volumeChange;
        this.volumeChangeListeners = new SparseArray();
    }

    public static final /* synthetic */ IEventSender access$getEventSender$p(VolumeChangeMonitor volumeChangeMonitor) {
        return volumeChangeMonitor.eventSender;
    }

    public final void registerVolumeChangeListener(int i) {
        if (this.volumeChangeListeners.get(i) == null) {
            VolumeChangeMonitor$registerVolumeChangeListener$listener$1 volumeChangeMonitor$registerVolumeChangeListener$listener$1 = new VolumeChangeMonitor$registerVolumeChangeListener$listener$1(this, i);
            this.volumeChangeListeners.append(i, volumeChangeMonitor$registerVolumeChangeListener$listener$1);
            this.volumeChange.registerListener(volumeChangeMonitor$registerVolumeChangeListener$listener$1);
        }
    }

    public final void unregisterVolumeChangeListener(int i) {
        if (this.volumeChangeListeners.get(i) != null) {
            VolumeChangeListener listener = (VolumeChangeListener) this.volumeChangeListeners.get(i);
            VolumeChange volumeChange = this.volumeChange;
            t.f(listener, "listener");
            volumeChange.unregisterListener(listener);
            this.volumeChangeListeners.remove(i);
        }
    }
}
