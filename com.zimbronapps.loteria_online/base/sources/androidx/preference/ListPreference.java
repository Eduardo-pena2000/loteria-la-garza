package androidx.preference;

import J1.k;
import X3.c;
import X3.f;
import X3.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] J;
    public CharSequence[] K;
    public String L;
    public String M;
    public boolean N;

    public static final class a implements Preference.b {
        public static a a;

        public static a b() {
            if (a == null) {
                a = new a();
            }
            return a;
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.I()) ? listPreference.c().getString(f.a) : listPreference.I();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.x, i, i2);
        this.J = k.o(obtainStyledAttributes, g.A, g.y);
        this.K = k.o(obtainStyledAttributes, g.B, g.z);
        int i3 = g.C;
        if (k.b(obtainStyledAttributes, i3, i3, false)) {
            D(a.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.I, i, i2);
        this.M = k.m(obtainStyledAttributes2, g.q0, g.Q);
        obtainStyledAttributes2.recycle();
    }

    public int G(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.K) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.K[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] H() {
        return this.J;
    }

    public CharSequence I() {
        CharSequence[] charSequenceArr;
        int L = L();
        if (L < 0 || (charSequenceArr = this.J) == null) {
            return null;
        }
        return charSequenceArr[L];
    }

    public CharSequence[] J() {
        return this.K;
    }

    public String K() {
        return this.L;
    }

    public final int L() {
        return G(this.L);
    }

    public void M(String str) {
        boolean equals = TextUtils.equals(this.L, str);
        if (equals && this.N) {
            return;
        }
        this.L = str;
        this.N = true;
        C(str);
        if (equals) {
            return;
        }
        s();
    }

    public CharSequence m() {
        if (n() != null) {
            return n().a(this);
        }
        String I = I();
        CharSequence m = super.m();
        String str = this.M;
        if (str == null) {
            return m;
        }
        if (I == null) {
            I = "";
        }
        String format = String.format(str, new Object[]{I});
        if (TextUtils.equals(format, m)) {
            return m;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public Object w(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.b, 16842897));
    }
}
