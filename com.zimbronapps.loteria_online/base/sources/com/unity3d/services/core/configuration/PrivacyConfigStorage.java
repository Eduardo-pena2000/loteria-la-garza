package com.unity3d.services.core.configuration;

import com.unity3d.services.core.misc.IObserver;
import com.unity3d.services.core.misc.Observable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class PrivacyConfigStorage extends Observable {
    private static PrivacyConfigStorage _instance;
    private PrivacyConfig _privacyConfig = new PrivacyConfig();

    private PrivacyConfigStorage() {
    }

    public static PrivacyConfigStorage getInstance() {
        if (_instance == null) {
            _instance = new PrivacyConfigStorage();
        }
        return _instance;
    }

    public synchronized PrivacyConfig getPrivacyConfig() {
        return this._privacyConfig;
    }

    public synchronized void registerObserver(IObserver iObserver) {
        super.registerObserver(iObserver);
        if (this._privacyConfig.getPrivacyStatus() != PrivacyConfigStatus.UNKNOWN) {
            iObserver.updated(this._privacyConfig);
        }
    }

    public synchronized void setPrivacyConfig(PrivacyConfig privacyConfig) {
        this._privacyConfig = privacyConfig;
        notifyObservers(privacyConfig);
    }
}
