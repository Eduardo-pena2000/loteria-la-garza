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
import android.widget.Switch;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public final a I;
    public CharSequence J;
    public CharSequence K;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreference.this.a(Boolean.valueOf(z))) {
                SwitchPreference.this.H(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.I = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.J0, i, i2);
        K(k.m(obtainStyledAttributes, g.R0, g.K0));
        J(k.m(obtainStyledAttributes, g.Q0, g.L0));
        N(k.m(obtainStyledAttributes, g.T0, g.N0));
        M(k.m(obtainStyledAttributes, g.S0, g.O0));
        I(k.b(obtainStyledAttributes, g.P0, g.M0, false));
        obtainStyledAttributes.recycle();
    }

    private void P(View view) {
        if (((AccessibilityManager) c().getSystemService("accessibility")).isEnabled()) {
            O(view.findViewById(16908352));
            L(view.findViewById(16908304));
        }
    }

    public void M(CharSequence charSequence) {
        this.K = charSequence;
        s();
    }

    public void N(CharSequence charSequence) {
        this.J = charSequence;
        s();
    }

    public final void O(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.D);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.J);
            r4.setTextOff(this.K);
            r4.setOnCheckedChangeListener(this.I);
        }
    }

    public void z(View view) {
        super.z(view);
        P(view);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.j, 16843629));
    }
}
