package com.google.android.ads.nativetemplates;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import pa.L;
import pa.M;
import pa.N;
import v5.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class TemplateView extends FrameLayout {
    public int a;
    public a b;
    public NativeAd c;
    public NativeAdView d;
    public TextView e;
    public TextView f;
    public RatingBar g;
    public TextView h;
    public ImageView i;
    public MediaView j;
    public Button k;
    public ConstraintLayout l;

    public TemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet);
    }

    public final boolean a(NativeAd nativeAd) {
        return !TextUtils.isEmpty(nativeAd.getStore()) && TextUtils.isEmpty(nativeAd.getAdvertiser());
    }

    public final void b() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Button button;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        Button button2;
        Button button3;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        Button button4;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        ColorDrawable v = this.b.v();
        if (v != null) {
            this.l.setBackground(v);
            TextView textView13 = this.e;
            if (textView13 != null) {
                textView13.setBackground(v);
            }
            TextView textView14 = this.f;
            if (textView14 != null) {
                textView14.setBackground(v);
            }
            TextView textView15 = this.h;
            if (textView15 != null) {
                textView15.setBackground(v);
            }
        }
        Typeface y = this.b.y();
        if (y != null && (textView12 = this.e) != null) {
            textView12.setTypeface(y);
        }
        Typeface C = this.b.C();
        if (C != null && (textView11 = this.f) != null) {
            textView11.setTypeface(C);
        }
        Typeface G = this.b.G();
        if (G != null && (textView10 = this.h) != null) {
            textView10.setTypeface(G);
        }
        Typeface t = this.b.t();
        if (t != null && (button4 = this.k) != null) {
            button4.setTypeface(t);
        }
        if (this.b.z() != null && (textView9 = this.e) != null) {
            textView9.setTextColor(this.b.z().intValue());
        }
        if (this.b.D() != null && (textView8 = this.f) != null) {
            textView8.setTextColor(this.b.D().intValue());
        }
        if (this.b.H() != null && (textView7 = this.h) != null) {
            textView7.setTextColor(this.b.H().intValue());
        }
        if (this.b.u() != null && (button3 = this.k) != null) {
            button3.setTextColor(this.b.u().intValue());
        }
        float s = this.b.s();
        if (s > 0.0f && (button2 = this.k) != null) {
            button2.setTextSize(s);
        }
        float x = this.b.x();
        if (x > 0.0f && (textView6 = this.e) != null) {
            textView6.setTextSize(x);
        }
        float B = this.b.B();
        if (B > 0.0f && (textView5 = this.f) != null) {
            textView5.setTextSize(B);
        }
        float F = this.b.F();
        if (F > 0.0f && (textView4 = this.h) != null) {
            textView4.setTextSize(F);
        }
        ColorDrawable r = this.b.r();
        if (r != null && (button = this.k) != null) {
            button.setBackground(r);
        }
        ColorDrawable w = this.b.w();
        if (w != null && (textView3 = this.e) != null) {
            textView3.setBackground(w);
        }
        ColorDrawable A = this.b.A();
        if (A != null && (textView2 = this.f) != null) {
            textView2.setBackground(A);
        }
        ColorDrawable E = this.b.E();
        if (E != null && (textView = this.h) != null) {
            textView.setBackground(E);
        }
        invalidate();
        requestLayout();
    }

    public void c() {
        this.c.destroy();
    }

    public final void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, N.a, 0, 0);
        try {
            this.a = obtainStyledAttributes.getResourceId(N.b, M.a);
            obtainStyledAttributes.recycle();
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.a, this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public NativeAdView getNativeAdView() {
        return this.d;
    }

    public String getTemplateTypeName() {
        int i = this.a;
        return i == M.a ? "medium_template" : i == M.b ? "small_template" : "";
    }

    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.d = findViewById(L.f);
        this.e = findViewById(L.g);
        this.f = findViewById(L.i);
        this.h = findViewById(L.b);
        RatingBar findViewById = findViewById(L.h);
        this.g = findViewById;
        findViewById.setEnabled(false);
        this.k = findViewById(L.c);
        this.i = findViewById(L.d);
        this.j = findViewById(L.e);
        this.l = findViewById(L.a);
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.c = nativeAd;
        CharSequence store = nativeAd.getStore();
        CharSequence advertiser = nativeAd.getAdvertiser();
        String headline = nativeAd.getHeadline();
        String body = nativeAd.getBody();
        String callToAction = nativeAd.getCallToAction();
        Double starRating = nativeAd.getStarRating();
        NativeAd.b icon = nativeAd.getIcon();
        this.d.setCallToActionView(this.k);
        this.d.setHeadlineView(this.e);
        this.d.setMediaView(this.j);
        this.f.setVisibility(0);
        if (a(nativeAd)) {
            this.d.setStoreView(this.f);
        } else if (TextUtils.isEmpty(advertiser)) {
            store = "";
        } else {
            this.d.setAdvertiserView(this.f);
            store = advertiser;
        }
        this.e.setText(headline);
        this.k.setText(callToAction);
        if (starRating == null || starRating.doubleValue() <= 0.0d) {
            this.f.setText(store);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
        } else {
            this.f.setVisibility(8);
            this.g.setVisibility(0);
            this.g.setRating(starRating.floatValue());
            this.d.setStarRatingView(this.g);
        }
        if (icon != null) {
            this.i.setVisibility(0);
            this.i.setImageDrawable(icon.getDrawable());
        } else {
            this.i.setVisibility(8);
        }
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(body);
            this.d.setBodyView(this.h);
        }
        this.d.setNativeAd(nativeAd);
    }

    public void setStyles(a aVar) {
        this.b = aVar;
        b();
    }
}
