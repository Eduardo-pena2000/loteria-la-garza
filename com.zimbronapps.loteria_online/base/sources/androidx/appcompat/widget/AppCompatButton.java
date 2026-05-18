package androidx.appcompat.widget;

import X1.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import q.A;
import q.Y;
import q.Z;
import q.l;
import q.m0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class AppCompatButton extends Button {
    public final q.d a;
    public final A b;
    public l c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.n);
    }

    private l getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new l(this);
        }
        return this.c;
    }

    public void drawableStateChanged() {
        super/*android.view.View*/.drawableStateChanged();
        q.d dVar = this.a;
        if (dVar != null) {
            dVar.b();
        }
        A a = this.b;
        if (a != null) {
            a.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (m0.b) {
            return super.getAutoSizeMaxTextSize();
        }
        A a = this.b;
        if (a != null) {
            return a.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (m0.b) {
            return super.getAutoSizeMinTextSize();
        }
        A a = this.b;
        if (a != null) {
            return a.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (m0.b) {
            return super.getAutoSizeStepGranularity();
        }
        A a = this.b;
        if (a != null) {
            return a.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (m0.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        A a = this.b;
        return a != null ? a.h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (m0.b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        A a = this.b;
        if (a != null) {
            return a.i();
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return h.m(super/*android.widget.TextView*/.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        q.d dVar = this.a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q.d dVar = this.a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super/*android.view.View*/.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
        A a = this.b;
        if (a != null) {
            a.o(z, i, i2, i3, i4);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super/*android.widget.TextView*/.onTextChanged(charSequence, i, i2, i3);
        A a = this.b;
        if (a == null || m0.b || !a.l()) {
            return;
        }
        this.b.c();
    }

    public void setAllCaps(boolean z) {
        super/*android.widget.TextView*/.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (m0.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        A a = this.b;
        if (a != null) {
            a.t(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (m0.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        A a = this.b;
        if (a != null) {
            a.u(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (m0.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        A a = this.b;
        if (a != null) {
            a.v(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super/*android.view.View*/.setBackgroundDrawable(drawable);
        q.d dVar = this.a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super/*android.view.View*/.setBackgroundResource(i);
        q.d dVar = this.a;
        if (dVar != null) {
            dVar.g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super/*android.widget.TextView*/.setCustomSelectionActionModeCallback(h.n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super/*android.widget.TextView*/.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        A a = this.b;
        if (a != null) {
            a.s(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q.d dVar = this.a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q.d dVar = this.a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.b.w(colorStateList);
        this.b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.b.x(mode);
        this.b.b();
    }

    public void setTextAppearance(Context context, int i) {
        super/*android.widget.TextView*/.setTextAppearance(context, i);
        A a = this.b;
        if (a != null) {
            a.q(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (m0.b) {
            super/*android.widget.TextView*/.setTextSize(i, f);
            return;
        }
        A a = this.b;
        if (a != null) {
            a.A(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(Z.b(context), attributeSet, i);
        Y.a(this, getContext());
        q.d dVar = new q.d(this);
        this.a = dVar;
        dVar.e(attributeSet, i);
        A a = new A(this);
        this.b = a;
        a.m(attributeSet, i);
        a.b();
        getEmojiTextViewHelper().c(attributeSet, i);
    }
}
