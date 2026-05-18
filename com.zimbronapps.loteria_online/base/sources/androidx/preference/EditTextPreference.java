package androidx.preference;

import J1.k;
import X3.c;
import X3.f;
import X3.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class EditTextPreference extends DialogPreference {
    public String J;

    public static final class a implements Preference.b {
        public static a a;

        public static a b() {
            if (a == null) {
                a = new a();
            }
            return a;
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.G()) ? editTextPreference.c().getString(f.a) : editTextPreference.G();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.v, i, i2);
        int i3 = g.w;
        if (k.b(obtainStyledAttributes, i3, i3, false)) {
            D(a.b());
        }
        obtainStyledAttributes.recycle();
    }

    public boolean E() {
        return TextUtils.isEmpty(this.J) || super.E();
    }

    public String G() {
        return this.J;
    }

    public Object w(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.d, 16842898));
    }
}
