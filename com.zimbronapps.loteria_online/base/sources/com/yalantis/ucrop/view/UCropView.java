package com.yalantis.ucrop.view;

import G9.e;
import G9.f;
import G9.i;
import H9.c;
import H9.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class UCropView extends FrameLayout {
    public GestureCropImageView a;
    public final OverlayView b;

    public class a implements c {
        public a() {
        }

        public void a(float f) {
            UCropView.a(UCropView.this).setTargetAspectRatio(f);
        }
    }

    public class b implements d {
        public b() {
        }

        public void a(RectF rectF) {
            UCropView.b(UCropView.this).setCropRect(rectF);
        }
    }

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ OverlayView a(UCropView uCropView) {
        return uCropView.b;
    }

    public static /* synthetic */ GestureCropImageView b(UCropView uCropView) {
        return uCropView.a;
    }

    public final void c() {
        this.a.setCropBoundsChangeListener(new a());
        this.b.setOverlayViewChangeListener(new b());
    }

    public GestureCropImageView getCropImageView() {
        return this.a;
    }

    public OverlayView getOverlayView() {
        return this.b;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public UCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(f.d, this, true);
        this.a = findViewById(e.b);
        OverlayView overlayView = (OverlayView) findViewById(e.y);
        this.b = overlayView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.b0);
        overlayView.g(obtainStyledAttributes);
        this.a.A(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        c();
    }
}
