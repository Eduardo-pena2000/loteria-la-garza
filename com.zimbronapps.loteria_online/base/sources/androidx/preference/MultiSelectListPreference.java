package androidx.preference;

import J1.k;
import X3.c;
import X3.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public CharSequence[] J;
    public CharSequence[] K;
    public Set L;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.L = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.D, i, i2);
        this.J = k.o(obtainStyledAttributes, g.G, g.E);
        this.K = k.o(obtainStyledAttributes, g.H, g.F);
        obtainStyledAttributes.recycle();
    }

    public Object w(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.b, 16842897));
    }
}
