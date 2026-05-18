package com.unity3d.services.core.webview.bridge;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class WebViewBridgeSharedObjectStore implements IWebViewBridgeSharedObjectStore {
    private ConcurrentHashMap _sharedObjects = new ConcurrentHashMap();

    public IWebViewSharedObject get(String str) {
        if (str == null) {
            return null;
        }
        return (IWebViewSharedObject) this._sharedObjects.get(str);
    }

    public void remove(IWebViewSharedObject iWebViewSharedObject) {
        if (iWebViewSharedObject == null) {
            return;
        }
        remove(iWebViewSharedObject.getId());
    }

    public void set(IWebViewSharedObject iWebViewSharedObject) {
        if (iWebViewSharedObject == null) {
            return;
        }
        this._sharedObjects.put(iWebViewSharedObject.getId(), iWebViewSharedObject);
    }

    public void remove(String str) {
        this._sharedObjects.remove(str);
    }
}
