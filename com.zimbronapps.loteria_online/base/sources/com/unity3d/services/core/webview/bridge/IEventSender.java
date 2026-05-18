package com.unity3d.services.core.webview.bridge;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface IEventSender {
    boolean canSend();

    boolean sendEvent(Enum r1, Enum r2, Object... objArr);
}
