package com.unity3d.services.core.properties;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class MadeWithUnityDetector {
    public static final String UNITY_PLAYER_CLASS_NAME = "com.unity3d.player.UnityPlayer";

    public static boolean isMadeWithUnity() {
        try {
            Class.forName("com.unity3d.player.UnityPlayer");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
