package androidx.preference;

import J1.k;
import X3.c;
import X3.d;
import X3.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final a I;
    public CharSequence J;
    public CharSequence K;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreferenceCompat.this.a(Boolean.valueOf(z))) {
                SwitchPreferenceCompat.this.H(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.I = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.U0, i, i2);
        K(k.m(obtainStyledAttributes, g.c1, g.V0));
        J(k.m(obtainStyledAttributes, g.b1, g.W0));
        N(k.m(obtainStyledAttributes, g.e1, g.Y0));
        M(k.m(obtainStyledAttributes, g.d1, g.Z0));
        I(k.b(obtainStyledAttributes, g.a1, g.X0, false));
        obtainStyledAttributes.recycle();
    }

    private void O(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.D);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.J);
            switchCompat.setTextOff(this.K);
            switchCompat.setOnCheckedChangeListener(this.I);
        }
    }

    private void P(View view) {
        if (((AccessibilityManager) c().getSystemService("accessibility")).isEnabled()) {
            O(view.findViewById(d.a));
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

    public void z(View view) {
        super.z(view);
        P(view);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.i);
    }
}
