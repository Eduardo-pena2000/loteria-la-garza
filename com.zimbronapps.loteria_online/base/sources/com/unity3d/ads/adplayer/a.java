package com.unity3d.ads.adplayer;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a implements View.OnTouchListener {
    public final /* synthetic */ AndroidWebViewContainer a;

    public /* synthetic */ a(AndroidWebViewContainer androidWebViewContainer) {
        this.a = androidWebViewContainer;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return AndroidWebViewContainer.a(this.a, view, motionEvent);
    }
}
