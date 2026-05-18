package androidx.appcompat.widget;

import T1.Z;
import X1.h;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.c;
import i.j;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import q.A;
import q.M;
import q.Y;
import q.c0;
import q.l;
import q.m0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final Property S = new a(Float.class, "thumbPos");
    public static final int[] T = {16842912};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final TextPaint I;
    public ColorStateList J;
    public Layout K;
    public Layout L;
    public TransformationMethod M;
    public ObjectAnimator N;
    public final A O;
    public l P;
    public c Q;
    public final Rect R;
    public Drawable a;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public boolean d;
    public boolean e;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public CharSequence o;
    public CharSequence p;
    public CharSequence q;
    public CharSequence r;
    public boolean s;
    public int t;
    public int u;
    public float v;
    public float w;
    public VelocityTracker x;
    public int y;
    public float z;

    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.z);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public static class b {
        public static void a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    public static class c extends c.f {
        public final Reference a;

        public c(SwitchCompat switchCompat) {
            this.a = new WeakReference(switchCompat);
        }

        public void a(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        public void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.H);
    }

    public static float f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private l getEmojiTextViewHelper() {
        if (this.P == null) {
            this.P = new l(this);
        }
        return this.P;
    }

    private boolean getTargetCheckedState() {
        return this.z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((m0.b(this) ? 1.0f - this.z : this.z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.a;
        Rect d = drawable2 != null ? M.d(drawable2) : M.c;
        return ((((this.A - this.C) - rect.left) - rect.right) - d.left) - d.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.q = charSequence;
        this.r = g(charSequence);
        this.L = null;
        if (this.s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.o = charSequence;
        this.p = g(charSequence);
        this.K = null;
        if (this.s) {
            p();
        }
    }

    public final void a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, S, new float[]{z ? 1.0f : 0.0f});
        this.N = ofFloat;
        ofFloat.setDuration(250L);
        b.a(this.N, true);
        this.N.start();
    }

    public final void b() {
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.d || this.e) {
                Drawable mutate = L1.a.j(drawable).mutate();
                this.a = mutate;
                if (this.d) {
                    L1.a.g(mutate, this.b);
                }
                if (this.e) {
                    L1.a.h(this.a, this.c);
                }
                if (this.a.isStateful()) {
                    this.a.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable mutate = L1.a.j(drawable).mutate();
                this.f = mutate;
                if (this.i) {
                    L1.a.g(mutate, this.g);
                }
                if (this.j) {
                    L1.a.h(this.f, this.h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.R;
        int i3 = this.D;
        int i4 = this.E;
        int i5 = this.F;
        int i6 = this.G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.a;
        Rect d = drawable != null ? M.d(drawable) : M.c;
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (d != null) {
                int i8 = d.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = d.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = d.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = d.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.C + rect.right;
            this.a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                L1.a.d(background, i15, i4, i16, i6);
            }
        }
        super/*android.view.View*/.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.a;
        if (drawable != null) {
            L1.a.c(drawable, f, f2);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            L1.a.c(drawable2, f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super/*android.view.View*/.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final CharSequence g(CharSequence charSequence) {
        TransformationMethod f = getEmojiTextViewHelper().f(this.M);
        return f != null ? f.getTransformation(charSequence, this) : charSequence;
    }

    public int getCompoundPaddingLeft() {
        if (!m0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.m : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (m0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.m : compoundPaddingRight;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return h.m(super/*android.widget.TextView*/.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.s;
    }

    public boolean getSplitTrack() {
        return this.n;
    }

    public int getSwitchMinWidth() {
        return this.l;
    }

    public int getSwitchPadding() {
        return this.m;
    }

    public CharSequence getTextOff() {
        return this.q;
    }

    public CharSequence getTextOn() {
        return this.o;
    }

    public Drawable getThumbDrawable() {
        return this.a;
    }

    public final float getThumbPosition() {
        return this.z;
    }

    public int getThumbTextPadding() {
        return this.k;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    public ColorStateList getTrackTintList() {
        return this.g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.h;
    }

    public final boolean h(float f, float f2) {
        if (this.a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.a.getPadding(this.R);
        int i = this.E;
        int i2 = this.u;
        int i3 = i - i2;
        int i4 = (this.D + thumbOffset) - i2;
        int i5 = this.C + i4;
        Rect rect = this.R;
        return f > ((float) i4) && f < ((float) (((i5 + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.G + i2));
    }

    public final Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.I, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void j() {
        setTextOnInternal(this.o);
        setTextOffInternal(this.q);
        requestLayout();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.N.end();
        this.N = null;
    }

    public final void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            String str = this.q;
            if (str == null) {
                str = getResources().getString(i.h.b);
            }
            Z.j0(this, str);
        }
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            String str = this.o;
            if (str == null) {
                str = getResources().getString(i.h.c);
            }
            Z.j0(this, str);
        }
    }

    public void m(Context context, int i) {
        c0 s = c0.s(context, i, j.S2);
        ColorStateList c2 = s.c(j.W2);
        if (c2 != null) {
            this.J = c2;
        } else {
            this.J = getTextColors();
        }
        int e = s.e(j.T2, 0);
        if (e != 0) {
            float f = e;
            if (f != this.I.getTextSize()) {
                this.I.setTextSize(f);
                requestLayout();
            }
        }
        o(s.j(j.U2, -1), s.j(j.V2, -1));
        if (s.a(j.b3, false)) {
            this.M = new n.a(getContext());
        } else {
            this.M = null;
        }
        setTextOnInternal(this.o);
        setTextOffInternal(this.q);
        s.v();
    }

    public void n(Typeface typeface, int i) {
        if (i <= 0) {
            this.I.setFakeBoldText(false);
            this.I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int i2 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i;
            this.I.setFakeBoldText((i2 & 1) != 0);
            this.I.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public final void o(int i, int i2) {
        n(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, T);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.R;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.E;
        int i2 = this.G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = M.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.K : this.L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.J;
            if (colorStateList != null) {
                this.I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super/*android.view.View*/.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.o : this.q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        int i9;
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.a != null) {
            Rect rect = this.R;
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = M.d(this.a);
            i5 = Math.max(0, d.left - rect.left);
            i10 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (m0.b(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.A + i6) - i5) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i6 = (width - this.A) + i5 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i7 = this.B;
            i8 = paddingTop - (i7 / 2);
        } else {
            if (gravity == 80) {
                i9 = getHeight() - getPaddingBottom();
                i8 = i9 - this.B;
                this.D = i6;
                this.E = i8;
                this.G = i9;
                this.F = width;
            }
            i8 = getPaddingTop();
            i7 = this.B;
        }
        i9 = i7 + i8;
        this.D = i6;
        this.E = i8;
        this.G = i9;
        this.F = width;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.s) {
            if (this.K == null) {
                this.K = i(this.p);
            }
            if (this.L == null) {
                this.L = i(this.r);
            }
        }
        Rect rect = this.R;
        Drawable drawable = this.a;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.a.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.C = Math.max(this.s ? Math.max(this.K.getWidth(), this.L.getWidth()) + (this.k * 2) : 0, i3);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect d = M.d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = this.H ? Math.max(this.l, (this.C * 2) + i6 + i7) : this.l;
        int max2 = Math.max(i5, i4);
        this.A = max;
        this.B = max2;
        super/*android.view.View*/.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super/*android.view.View*/.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.o : this.q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.t
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = q.m0.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.z
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.v = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.v = r0
            r6.w = r3
            return r1
        L89:
            int r0 = r6.t
            if (r0 != r2) goto L94
            r6.q(r7)
            super/*android.view.View*/.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.t = r0
            android.view.VelocityTracker r0 = r6.x
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb7
            r6.t = r1
            r6.v = r0
            r6.w = r2
        Lb7:
            boolean r7 = super/*android.view.View*/.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (this.Q == null && this.P.b() && androidx.emoji2.text.c.k()) {
            androidx.emoji2.text.c c2 = androidx.emoji2.text.c.c();
            int g = c2.g();
            if (g == 3 || g == 0) {
                c cVar = new c(this);
                this.Q = cVar;
                c2.v(cVar);
            }
        }
    }

    public final void q(MotionEvent motionEvent) {
        this.t = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.x.computeCurrentVelocity(1000);
            float xVelocity = this.x.getXVelocity();
            if (Math.abs(xVelocity) <= this.y) {
                z = getTargetCheckedState();
            } else if (!m0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        e(motionEvent);
    }

    public void setAllCaps(boolean z) {
        super/*android.widget.TextView*/.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && Z.H(this)) {
            a(isChecked);
        } else {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super/*android.widget.TextView*/.setCustomSelectionActionModeCallback(h.n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
        setTextOnInternal(this.o);
        setTextOffInternal(this.q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.H = z;
        invalidate();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super/*android.widget.TextView*/.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.s != z) {
            this.s = z;
            requestLayout();
            if (z) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.m = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.I.getTypeface() == null || this.I.getTypeface().equals(typeface)) && (this.I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(k.a.b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.k = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(k.a.b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        this.i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        this.j = true;
        c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.x = VelocityTracker.obtain();
        this.H = true;
        this.R = new Rect();
        Y.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        c0 u = c0.u(context, attributeSet, j.D2, i, 0);
        Z.S(this, context, j.D2, attributeSet, u.q(), i, 0);
        Drawable f = u.f(j.G2);
        this.a = f;
        if (f != null) {
            f.setCallback(this);
        }
        Drawable f2 = u.f(j.P2);
        this.f = f2;
        if (f2 != null) {
            f2.setCallback(this);
        }
        setTextOnInternal(u.o(j.E2));
        setTextOffInternal(u.o(j.F2));
        this.s = u.a(j.H2, true);
        this.k = u.e(j.M2, 0);
        this.l = u.e(j.J2, 0);
        this.m = u.e(j.K2, 0);
        this.n = u.a(j.I2, false);
        ColorStateList c2 = u.c(j.N2);
        if (c2 != null) {
            this.b = c2;
            this.d = true;
        }
        PorterDuff.Mode e = M.e(u.j(j.O2, -1), null);
        if (this.c != e) {
            this.c = e;
            this.e = true;
        }
        if (this.d || this.e) {
            b();
        }
        ColorStateList c3 = u.c(j.Q2);
        if (c3 != null) {
            this.g = c3;
            this.i = true;
        }
        PorterDuff.Mode e2 = M.e(u.j(j.R2, -1), null);
        if (this.h != e2) {
            this.h = e2;
            this.j = true;
        }
        if (this.i || this.j) {
            c();
        }
        int m = u.m(j.L2, 0);
        if (m != 0) {
            m(context, m);
        }
        A a2 = new A(this);
        this.O = a2;
        a2.m(attributeSet, i);
        u.v();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
