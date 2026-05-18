package androidx.preference;

import J1.k;
import X3.c;
import X3.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final a I;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (CheckBoxPreference.this.a(Boolean.valueOf(z))) {
                CheckBoxPreference.this.H(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public final void M(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.D);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.I);
        }
    }

    public final void N(View view) {
        if (((AccessibilityManager) c().getSystemService("accessibility")).isEnabled()) {
            M(view.findViewById(16908289));
            L(view.findViewById(16908304));
        }
    }

    public void z(View view) {
        super.z(view);
        N(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.I = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.b, i, i2);
        K(k.m(obtainStyledAttributes, g.h, g.c));
        J(k.m(obtainStyledAttributes, g.g, g.d));
        I(k.b(obtainStyledAttributes, g.f, g.e, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.a, 16842895));
    }
}
