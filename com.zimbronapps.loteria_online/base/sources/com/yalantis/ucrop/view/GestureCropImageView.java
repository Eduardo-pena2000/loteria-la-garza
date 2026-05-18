package com.yalantis.ucrop.view;

import K9.h;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class GestureCropImageView extends L9.a {
    public ScaleGestureDetector G;
    public h H;
    public GestureDetector I;
    public float J;
    public float K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.D(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200L);
            return super.onDoubleTap(motionEvent);
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GestureCropImageView.this.o(-f, -f2);
            return true;
        }

        public /* synthetic */ b(GestureCropImageView gestureCropImageView, a aVar) {
            this();
        }
    }

    public class c extends h.b {
        public c() {
        }

        public boolean a(h hVar) {
            GestureCropImageView.this.m(hVar.c(), GestureCropImageView.I(GestureCropImageView.this), GestureCropImageView.J(GestureCropImageView.this));
            return true;
        }

        public /* synthetic */ c(GestureCropImageView gestureCropImageView, a aVar) {
            this();
        }
    }

    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public d() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.n(scaleGestureDetector.getScaleFactor(), GestureCropImageView.I(GestureCropImageView.this), GestureCropImageView.J(GestureCropImageView.this));
            return true;
        }

        public /* synthetic */ d(GestureCropImageView gestureCropImageView, a aVar) {
            this();
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ float I(GestureCropImageView gestureCropImageView) {
        return gestureCropImageView.J;
    }

    public static /* synthetic */ float J(GestureCropImageView gestureCropImageView) {
        return gestureCropImageView.K;
    }

    public final void K() {
        this.I = new GestureDetector(getContext(), new b(this, null), (Handler) null, true);
        this.G = new ScaleGestureDetector(getContext(), new d(this, null));
        this.H = new h(new c(this, null));
    }

    public int getDoubleTapScaleSteps() {
        return this.O;
    }

    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.O));
    }

    public void k() {
        super.k();
        K();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            v();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.J = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.K = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        if (this.N) {
            this.I.onTouchEvent(motionEvent);
        }
        if (this.M) {
            this.G.onTouchEvent(motionEvent);
        }
        if (this.L) {
            this.H.d(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            B();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i) {
        this.O = i;
    }

    public void setGestureEnabled(boolean z) {
        this.N = z;
    }

    public void setRotateEnabled(boolean z) {
        this.L = z;
    }

    public void setScaleEnabled(boolean z) {
        this.M = z;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = 5;
    }
}
