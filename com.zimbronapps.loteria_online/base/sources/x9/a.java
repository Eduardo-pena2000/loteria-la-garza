package X9;

import Aa.g;
import R9.c;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a extends FrameLayout {
    public FlutterMutatorsStack a;
    public float b;
    public int c;
    public int d;
    public final c e;
    public Paint f;
    public ViewTreeObserver.OnGlobalFocusChangeListener g;

    public class a implements ViewTreeObserver.OnGlobalFocusChangeListener {
        public final /* synthetic */ View.OnFocusChangeListener a;
        public final /* synthetic */ View b;

        public a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.a = onFocusChangeListener;
            this.b = view;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.a;
            View view3 = this.b;
            onFocusChangeListener.onFocusChange(view3, g.d(view3));
        }
    }

    public a(Context context, float f, c cVar) {
        super(context, (AttributeSet) null);
        this.b = f;
        this.e = cVar;
        this.f = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.a.getFinalMatrix());
        float f = this.b;
        matrix.preScale(1.0f / f, 1.0f / f);
        matrix.postTranslate(-this.c, -this.d);
        return matrix;
    }

    public void a(FlutterMutatorsStack flutterMutatorsStack, int i, int i2, int i3, int i4) {
        this.a = flutterMutatorsStack;
        this.c = i;
        this.d = i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.g) == null) {
            return;
        }
        this.g = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super/*android.view.View*/.dispatchDraw(canvas);
        canvas.restore();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        Iterator it = this.a.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path((Path) it.next());
            path.offset(-this.c, -this.d);
            canvas.clipPath(path);
        }
        if (this.f.getAlpha() != ((int) (this.a.getFinalOpacity() * 255.0f))) {
            this.f.setAlpha((int) (this.a.getFinalOpacity() * 255.0f));
            setLayerType(2, this.f);
        }
        super/*android.view.View*/.draw(canvas);
        canvas.restore();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e == null) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate(getLeft(), getTop());
        return this.e.l(motionEvent, matrix);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super/*android.view.ViewGroup*/.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.g == null) {
            a aVar = new a(onFocusChangeListener, this);
            this.g = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }
}
