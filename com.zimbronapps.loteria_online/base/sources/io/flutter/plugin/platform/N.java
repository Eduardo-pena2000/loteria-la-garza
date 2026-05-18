package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class n extends FrameLayout {
    public int a;
    public int b;
    public int c;
    public int d;
    public R9.c e;
    public m f;
    public ViewTreeObserver.OnGlobalFocusChangeListener g;

    public class a implements ViewTreeObserver.OnGlobalFocusChangeListener {
        public final /* synthetic */ View.OnFocusChangeListener a;

        public a(View.OnFocusChangeListener onFocusChangeListener) {
            this.a = onFocusChangeListener;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.a;
            n nVar = n.this;
            onFocusChangeListener.onFocusChange(nVar, Aa.g.d(nVar));
        }
    }

    public n(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public void a() {
        m mVar = this.f;
        if (mVar != null) {
            mVar.release();
            this.f = null;
        }
    }

    public void b(int i, int i2) {
        m mVar = this.f;
        if (mVar != null) {
            mVar.a(i, i2);
        }
    }

    public void c() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.g) == null) {
            return;
        }
        this.g = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    public void draw(Canvas canvas) {
        m mVar = this.f;
        if (mVar == null) {
            super/*android.view.View*/.draw(canvas);
            Q9.b.b("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = mVar.getSurface();
        if (!surface.isValid()) {
            Q9.b.b("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        if (lockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super/*android.view.View*/.draw(lockHardwareCanvas);
        } finally {
            this.f.scheduleFrame();
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.g;
    }

    public int getRenderTargetHeight() {
        m mVar = this.f;
        if (mVar != null) {
            return mVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        m mVar = this.f;
        if (mVar != null) {
            return mVar.getWidth();
        }
        return 0;
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super/*android.view.ViewGroup*/.invalidateChildInParent(iArr, rect);
    }

    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e == null) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i = this.c;
            this.a = i;
            int i2 = this.d;
            this.b = i2;
            matrix.postTranslate(i, i2);
        } else if (action != 2) {
            matrix.postTranslate(this.c, this.d);
        } else {
            matrix.postTranslate(this.a, this.b);
            this.a = this.c;
            this.b = this.d;
        }
        return this.e.l(motionEvent, matrix);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super/*android.view.ViewGroup*/.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        super/*android.view.View*/.setLayoutParams(layoutParams);
        this.c = layoutParams.leftMargin;
        this.d = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        c();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.g == null) {
            a aVar = new a(onFocusChangeListener);
            this.g = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }

    public void setTouchProcessor(R9.c cVar) {
        this.e = cVar;
    }

    public n(Context context, m mVar) {
        this(context);
        this.f = mVar;
        Surface surface = mVar.getSurface();
        if (surface == null || FlutterRenderer.j) {
            return;
        }
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        } finally {
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }
}
