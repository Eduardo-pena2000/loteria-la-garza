package com.unity3d.ads.adplayer;

import Ga.i;
import cb.L;
import com.unity3d.services.core.device.Storage;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 extends Ga.a implements L {
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1(L.b bVar, WebViewAdPlayer webViewAdPlayer) {
        super(bVar);
        this.this$0 = webViewAdPlayer;
    }

    public void handleException(i iVar, Throwable th) {
        Storage.Companion.removeStorageEventCallback(WebViewAdPlayer.access$getStorageEventCallback$p(this.this$0));
    }
}
