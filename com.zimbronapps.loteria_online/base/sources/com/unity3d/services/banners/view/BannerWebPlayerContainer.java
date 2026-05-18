package com.unity3d.services.banners.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.webplayer.WebPlayerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BannerWebPlayerContainer extends RelativeLayout {
    private String _bannerAdId;
    private int _lastVisibility;
    private UnityBannerSize _size;
    private Runnable _unsubscribeLayoutChange;
    private JSONObject _webPlayerEventSettings;
    private JSONObject _webPlayerSettings;
    private WebPlayerView _webPlayerView;
    private JSONObject _webSettings;

    public class 1 implements View.OnLayoutChangeListener {
        public 1() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BannerWebPlayerContainer.this.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
        }
    }

    public class 2 implements Runnable {
        final /* synthetic */ View.OnLayoutChangeListener val$onLayoutChangeListener;

        public 2(View.OnLayoutChangeListener onLayoutChangeListener) {
            this.val$onLayoutChangeListener = onLayoutChangeListener;
        }

        public void run() {
            BannerWebPlayerContainer.this.removeOnLayoutChangeListener(this.val$onLayoutChangeListener);
        }
    }

    public class 3 implements Runnable {
        final /* synthetic */ BannerWebPlayerContainer val$self;

        public 3(BannerWebPlayerContainer bannerWebPlayerContainer) {
            this.val$self = bannerWebPlayerContainer;
        }

        public void run() {
            this.val$self.removeAllViews();
            ViewGroup parent = this.val$self.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                parent.removeView(this.val$self);
            }
            if (BannerWebPlayerContainer.access$000(this.val$self) != null) {
                BannerWebPlayerContainer.access$000(this.val$self).destroy();
            }
            BannerWebPlayerContainer.access$002(this.val$self, null);
        }
    }

    public BannerWebPlayerContainer(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, UnityBannerSize unityBannerSize) {
        super(context);
        this._lastVisibility = -1;
        this._unsubscribeLayoutChange = null;
        this._size = unityBannerSize;
        this._bannerAdId = str;
        this._webSettings = jSONObject;
        this._webPlayerSettings = jSONObject2;
        this._webPlayerEventSettings = jSONObject3;
        WebPlayerView webPlayerView = new WebPlayerView(context, str, this._webSettings, this._webPlayerSettings);
        this._webPlayerView = webPlayerView;
        webPlayerView.setEventSettings(this._webPlayerEventSettings);
        subscribeOnLayoutChange();
        addView(this._webPlayerView);
        setupLayoutParams();
    }

    public static /* synthetic */ WebPlayerView access$000(BannerWebPlayerContainer bannerWebPlayerContainer) {
        return bannerWebPlayerContainer._webPlayerView;
    }

    public static /* synthetic */ WebPlayerView access$002(BannerWebPlayerContainer bannerWebPlayerContainer, WebPlayerView webPlayerView) {
        bannerWebPlayerContainer._webPlayerView = webPlayerView;
        return webPlayerView;
    }

    private void setupLayoutParams() {
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(ViewUtilities.pxFromDp(getContext(), this._size.getWidth())), Math.round(ViewUtilities.pxFromDp(getContext(), this._size.getHeight()))));
        ViewGroup.LayoutParams layoutParams = this._webPlayerView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        this._webPlayerView.setLayoutParams(layoutParams);
    }

    private void subscribeOnLayoutChange() {
        Runnable runnable = this._unsubscribeLayoutChange;
        if (runnable != null) {
            runnable.run();
        }
        1 r0 = new 1();
        addOnLayoutChangeListener(r0);
        this._unsubscribeLayoutChange = new 2(r0);
    }

    public void destroy() {
        Runnable runnable = this._unsubscribeLayoutChange;
        if (runnable != null) {
            runnable.run();
        }
        Utilities.runOnUiThread(new 3(this));
    }

    public WebPlayerView getWebPlayer() {
        return this._webPlayerView;
    }

    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        BannerBridge.didAttach(this._bannerAdId);
    }

    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        BannerBridge.didDetach(this._bannerAdId);
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        BannerBridge.resize(this._bannerAdId, i, i2, i3, i4, getAlpha());
        if (getParent() != null) {
            Rect rect = new Rect();
            getHitRect(rect);
            if (!(getParent() instanceof View) || getParent().getLocalVisibleRect(rect)) {
                return;
            }
            onVisibilityChanged(this, 8);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        if (i3 == 0 && i4 == 0) {
            return;
        }
        BannerBridge.resize(this._bannerAdId, getLeft(), getRight(), i, i2, getAlpha());
        Rect rect = new Rect();
        getHitRect(rect);
        if (getParent().getLocalVisibleRect(rect)) {
            onVisibilityChanged(this, 8);
        }
    }

    public void onVisibilityChanged(View view, int i) {
        if (view == this) {
            int i2 = this._lastVisibility;
            if (i2 == -1) {
                this._lastVisibility = i;
                return;
            }
            if (i != 0 && i2 == 0) {
                BannerBridge.visibilityChanged(this._bannerAdId, i);
            }
            this._lastVisibility = i;
        }
    }

    public void setAlpha(float f) {
        super/*android.view.View*/.setAlpha(f);
        onLayoutChange(this, getLeft(), getTop(), getRight(), getBottom(), getLeft(), getTop(), getRight(), getBottom());
    }

    public void setWebPlayerEventSettings(JSONObject jSONObject) {
        this._webPlayerEventSettings = jSONObject;
    }

    public void setWebPlayerSettings(JSONObject jSONObject, JSONObject jSONObject2) {
        this._webSettings = jSONObject;
        this._webPlayerSettings = jSONObject2;
    }
}
