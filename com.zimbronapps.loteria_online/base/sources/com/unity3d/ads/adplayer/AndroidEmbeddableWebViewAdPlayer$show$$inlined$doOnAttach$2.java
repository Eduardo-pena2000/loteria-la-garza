package com.unity3d.ads.adplayer;

import T1.Z;
import android.view.View;
import cb.i;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$2 implements View.OnAttachStateChangeListener {
    final /* synthetic */ ShowOptions $showOptions$inlined;
    final /* synthetic */ View $this_doOnAttach;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    public AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$2(View view, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions) {
        this.$this_doOnAttach = view;
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$showOptions$inlined = showOptions;
    }

    public void onViewAttachedToWindow(View view) {
        t.g(view, "view");
        this.$this_doOnAttach.removeOnAttachStateChangeListener(this);
        i.d(AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(this.this$0).getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this.this$0, this.$showOptions$inlined, null), 3, null);
        if (Z.G(view)) {
            view.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(view, this.this$0));
        } else {
            i.d(AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(this.this$0).getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this.this$0, null), 3, null);
        }
    }

    public void onViewDetachedFromWindow(View view) {
        t.g(view, "view");
    }
}
