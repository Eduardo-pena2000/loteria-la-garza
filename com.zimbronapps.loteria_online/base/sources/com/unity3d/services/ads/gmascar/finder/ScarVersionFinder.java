package com.unity3d.services.ads.gmascar.finder;

import com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge;
import com.unity3d.services.ads.gmascar.listeners.IInitializationStatusListener;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.log.DeviceLog;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ScarVersionFinder implements IInitializationStatusListener {
    private static IMobileAdsBridge _mobileAdsBridge;
    private GMAEventSender _gmaEventSender;
    private GMAInitializer _gmaInitializer;
    private int _gmaSdkVersionCode = -1;
    private PresenceDetector _presenceDetector;

    public ScarVersionFinder(IMobileAdsBridge iMobileAdsBridge, PresenceDetector presenceDetector, GMAInitializer gMAInitializer, GMAEventSender gMAEventSender) {
        _mobileAdsBridge = iMobileAdsBridge;
        this._presenceDetector = presenceDetector;
        this._gmaInitializer = gMAInitializer;
        this._gmaEventSender = gMAEventSender;
        gMAInitializer.getInitializeListenerBridge().setStatusListener(this);
    }

    public void findAndSendVersion(boolean z) {
        this._gmaEventSender.sendVersion(z ? _mobileAdsBridge.getVersionString() : "0.0.0");
    }

    public void getVersion() {
        try {
            if (!this._presenceDetector.areGMAClassesPresent()) {
                this._gmaEventSender.sendVersion("0.0.0");
            } else if (this._gmaInitializer.shouldInitialize()) {
                this._gmaInitializer.initializeGMA();
            } else {
                findAndSendVersion(true);
            }
        } catch (Exception e) {
            DeviceLog.debug("Got exception finding GMA SDK: %s", e.getLocalizedMessage());
        }
    }

    public int getVersionCode() {
        String versionString;
        if (this._gmaSdkVersionCode == -1 && (versionString = _mobileAdsBridge.getVersionString()) != null) {
            String[] split = versionString.split("\\.");
            if (split.length > _mobileAdsBridge.getVersionCodeIndex()) {
                try {
                    this._gmaSdkVersionCode = Integer.parseInt(split[_mobileAdsBridge.getVersionCodeIndex()]);
                } catch (NumberFormatException e) {
                    DeviceLog.debug("Could not parse %s to an Integer: %s", split[_mobileAdsBridge.getVersionCodeIndex()], e.getLocalizedMessage());
                }
            }
        }
        return this._gmaSdkVersionCode;
    }

    public void onInitializationComplete(Object obj) {
        findAndSendVersion(this._gmaInitializer.initSuccessful(obj));
    }
}
