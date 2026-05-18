package com.google.android.gms.ads.nativead;

import L5.o;
import S5.B;
import S5.D;
import S5.I1;
import W5.p;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbkw;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class NativeAdView extends FrameLayout {
    public final FrameLayout a;
    public final zzbkw b;

    public NativeAdView(Context context) {
        super(context);
        this.a = f(context);
        this.b = g();
    }

    public void a() {
        zzbkw zzbkwVar = this.b;
        if (zzbkwVar == null) {
            return;
        }
        try {
            zzbkwVar.zze();
        } catch (RemoteException e) {
            p.d("Unable to destroy native ad view", e);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
        super/*android.view.ViewGroup*/.bringChildToFront(this.a);
    }

    public final View b(String str) {
        zzbkw zzbkwVar = this.b;
        if (zzbkwVar != null) {
            try {
                N6.a zzc = zzbkwVar.zzc(str);
                if (zzc != null) {
                    return (View) N6.b.r1(zzc);
                }
            } catch (RemoteException e) {
                p.d("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    public final void bringChildToFront(View view) {
        super/*android.view.ViewGroup*/.bringChildToFront(view);
        FrameLayout frameLayout = this.a;
        if (frameLayout != view) {
            super/*android.view.ViewGroup*/.bringChildToFront(frameLayout);
        }
    }

    public final /* synthetic */ void c(o oVar) {
        zzbkw zzbkwVar = this.b;
        if (zzbkwVar == null) {
            return;
        }
        try {
            if (oVar instanceof I1) {
                zzbkwVar.zzdD(((I1) oVar).b());
            } else if (oVar == null) {
                zzbkwVar.zzdD(null);
            } else {
                p.a("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            p.d("Unable to call setMediaContent on delegate", e);
        }
    }

    public final /* synthetic */ void d(ImageView.ScaleType scaleType) {
        zzbkw zzbkwVar = this.b;
        if (zzbkwVar == null || scaleType == null) {
            return;
        }
        try {
            zzbkwVar.zzdB(N6.b.s1(scaleType));
        } catch (RemoteException e) {
            p.d("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzbkw zzbkwVar = this.b;
        if (zzbkwVar != null) {
            if (((Boolean) D.c().zzd(zzbhe.zzmX)).booleanValue()) {
                try {
                    zzbkwVar.zzdC(N6.b.s1(motionEvent));
                } catch (RemoteException e) {
                    p.d("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
    }

    public final void e(String str, View view) {
        zzbkw zzbkwVar = this.b;
        if (zzbkwVar == null) {
            return;
        }
        try {
            zzbkwVar.zzb(str, N6.b.s1(view));
        } catch (RemoteException e) {
            p.d("Unable to call setAssetView on delegate", e);
        }
    }

    public final FrameLayout f(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    public final zzbkw g() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.a;
        return B.b().e(frameLayout.getContext(), this, frameLayout);
    }

    public a getAdChoicesView() {
        b("3011");
        return null;
    }

    public final View getAdvertiserView() {
        return b("3005");
    }

    public final View getBodyView() {
        return b("3004");
    }

    public final View getCallToActionView() {
        return b("3002");
    }

    public final View getHeadlineView() {
        return b("3001");
    }

    public final View getIconView() {
        return b("3003");
    }

    public final View getImageView() {
        return b("3008");
    }

    public final MediaView getMediaView() {
        MediaView b = b("3010");
        if (b instanceof MediaView) {
            return b;
        }
        if (b == null) {
            return null;
        }
        p.a("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return b("3007");
    }

    public final View getStarRatingView() {
        return b("3009");
    }

    public final View getStoreView() {
        return b("3006");
    }

    public final void onVisibilityChanged(View view, int i) {
        super/*android.view.View*/.onVisibilityChanged(view, i);
        zzbkw zzbkwVar = this.b;
        if (zzbkwVar == null) {
            return;
        }
        try {
            zzbkwVar.zzf(N6.b.s1(view), i);
        } catch (RemoteException e) {
            p.d("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    public final void removeAllViews() {
        super/*android.view.ViewGroup*/.removeAllViews();
        super/*android.view.ViewGroup*/.addView(this.a);
    }

    public final void removeView(View view) {
        if (this.a == view) {
            return;
        }
        super/*android.view.ViewGroup*/.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        e("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        e("3005", view);
    }

    public final void setBodyView(View view) {
        e("3004", view);
    }

    public final void setCallToActionView(View view) {
        e("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        zzbkw zzbkwVar = this.b;
        if (zzbkwVar == null) {
            return;
        }
        try {
            zzbkwVar.zzg(N6.b.s1(view));
        } catch (RemoteException e) {
            p.d("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        e("3001", view);
    }

    public final void setIconView(View view) {
        e("3003", view);
    }

    public final void setImageView(View view) {
        e("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        e("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.a(new e(this));
        mediaView.b(new d(this));
    }

    public void setNativeAd(NativeAd nativeAd) {
        zzbkw zzbkwVar = this.b;
        if (zzbkwVar == null) {
            return;
        }
        try {
            zzbkwVar.zzd((N6.a) nativeAd.zza());
        } catch (RemoteException e) {
            p.d("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        e("3007", view);
    }

    public final void setStarRatingView(View view) {
        e("3009", view);
    }

    public final void setStoreView(View view) {
        e("3006", view);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = f(context);
        this.b = g();
    }
}
