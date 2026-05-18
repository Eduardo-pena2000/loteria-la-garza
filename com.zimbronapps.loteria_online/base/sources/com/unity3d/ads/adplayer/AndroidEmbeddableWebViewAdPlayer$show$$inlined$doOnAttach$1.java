package com.unity3d.ads.adplayer;

import T1.Z;
import android.view.View;
import cb.i;
import com.unity3d.services.banners.BannerView;
import fb.D;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ BannerView $bannerView$inlined;
    final /* synthetic */ D $scarEvents$inlined;
    final /* synthetic */ ShowOptions $showOptions$inlined;
    final /* synthetic */ View $this_doOnAttach;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    public AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1(View view, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, BannerView bannerView, D d, ShowOptions showOptions) {
        this.$this_doOnAttach = view;
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$bannerView$inlined = bannerView;
        this.$scarEvents$inlined = d;
        this.$showOptions$inlined = showOptions;
    }

    public void onViewAttachedToWindow(View view) {
        t.g(view, "view");
        this.$this_doOnAttach.removeOnAttachStateChangeListener(this);
        i.d(this.this$0.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$1(this.this$0, this.$scarEvents$inlined, this.$showOptions$inlined, null), 3, null);
        BannerView bannerView = this.$bannerView$inlined;
        if (Z.G(bannerView)) {
            bannerView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(bannerView, this.this$0));
        } else {
            i.d(AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(this.this$0).getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this.this$0, null), 3, null);
        }
    }

    public void onViewDetachedFromWindow(View view) {
        t.g(view, "view");
    }
}
