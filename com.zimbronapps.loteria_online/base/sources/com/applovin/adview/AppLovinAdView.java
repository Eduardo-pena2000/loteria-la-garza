package com.applovin.adview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinAdView extends RelativeLayout {
    public static final String NAMESPACE = "http://schemas.applovin.com/android/1.0";
    private com.applovin.impl.adview.a a;

    public AppLovinAdView(AppLovinAdSize appLovinAdSize) {
        this(appLovinAdSize, (String) null);
    }

    private void a(AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            a(attributeSet, context);
            return;
        }
        com.applovin.impl.adview.a aVar = new com.applovin.impl.adview.a();
        this.a = aVar;
        aVar.a(this, context, appLovinAdSize, str, appLovinSdk, attributeSet);
    }

    public void destroy() {
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public com.applovin.impl.adview.a getController() {
        return this.a;
    }

    public AppLovinAdSize getSize() {
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            return aVar.k();
        }
        return null;
    }

    public String getZoneId() {
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            return aVar.l();
        }
        return null;
    }

    public void loadNextAd() {
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            aVar.u();
        } else {
            o.i("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            aVar.B();
        }
    }

    public void onDetachedFromWindow() {
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            aVar.C();
        }
        super/*android.view.View*/.onDetachedFromWindow();
    }

    public void onWindowFocusChanged(boolean z) {
        super/*android.view.View*/.onWindowFocusChanged(z);
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super/*android.view.View*/.onWindowVisibilityChanged(i);
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            aVar.c(i);
        }
    }

    public void pause() {
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            aVar.D();
        }
    }

    public void renderAd(AppLovinAd appLovinAd) {
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            aVar.c(appLovinAd);
        }
    }

    public void resume() {
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            aVar.F();
        }
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            aVar.a(appLovinAdClickListener);
        }
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            aVar.a(appLovinAdDisplayListener);
        }
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            aVar.a(appLovinAdLoadListener);
        }
    }

    public void setAdViewEventListener(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            aVar.a(appLovinAdViewEventListener);
        }
    }

    public void setExtraInfo(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        com.applovin.impl.adview.a aVar = this.a;
        if (aVar != null) {
            aVar.a(str, obj);
        }
    }

    public String toString() {
        return "AppLovinAdView{zoneId='" + getZoneId() + "\", size=" + getSize() + '}';
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str) {
        super(k.o());
        a(appLovinAdSize, str, AppLovinSdk.getInstance(k.o()), k.o(), null);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(null, null, null, context, attributeSet);
    }

    private void a(AttributeSet attributeSet, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int applyDimension = (int) TypedValue.applyDimension(1, 50.0f, displayMetrics);
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin Ad");
        textView.setGravity(17);
        addView(textView, i, applyDimension);
    }

    @Deprecated
    public AppLovinAdView(AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinAdSize, (String) null, context);
    }

    @Deprecated
    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context);
        a(appLovinAdSize, str, null, context, null);
    }

    @Deprecated
    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinSdk, appLovinAdSize, null, context);
    }

    @Deprecated
    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context.getApplicationContext());
        a(appLovinAdSize, str, appLovinSdk, context, null);
    }
}
