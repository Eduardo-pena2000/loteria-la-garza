package com.applovin.impl.adview;

import android.view.MotionEvent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ a a;
    public final /* synthetic */ MotionEvent b;

    public /* synthetic */ s(a aVar, MotionEvent motionEvent) {
        this.a = aVar;
        this.b = motionEvent;
    }

    public final void run() {
        a.a(this.a, this.b);
    }
}
