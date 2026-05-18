package com.unity3d.services.ads.webplayer;

import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class WebPlayerViewCache {
    private static WebPlayerViewCache instance;
    private HashMap _webPlayerMap = new HashMap();

    public static WebPlayerViewCache getInstance() {
        if (instance == null) {
            instance = new WebPlayerViewCache();
        }
        return instance;
    }

    public synchronized void addWebPlayer(String str, WebPlayerView webPlayerView) {
        this._webPlayerMap.put(str, webPlayerView);
    }

    public synchronized WebPlayerView getWebPlayer(String str) {
        if (!this._webPlayerMap.containsKey(str)) {
            return null;
        }
        return (WebPlayerView) this._webPlayerMap.get(str);
    }

    public synchronized void removeWebPlayer(String str) {
        if (this._webPlayerMap.containsKey(str)) {
            this._webPlayerMap.remove(str);
        }
    }
}
