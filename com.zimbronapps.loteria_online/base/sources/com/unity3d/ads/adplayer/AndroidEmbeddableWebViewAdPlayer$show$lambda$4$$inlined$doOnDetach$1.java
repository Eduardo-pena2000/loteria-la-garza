package com.unity3d.ads.adplayer;

import android.view.View;
import cb.i;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ View $this_doOnDetach;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    public AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(View view, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer) {
        this.$this_doOnDetach = view;
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    public void onViewAttachedToWindow(View view) {
        t.g(view, "view");
    }

    public void onViewDetachedFromWindow(View view) {
        t.g(view, "view");
        this.$this_doOnDetach.removeOnAttachStateChangeListener(this);
        i.d(AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(this.this$0).getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this.this$0, null), 3, null);
    }
}
