package androidx.preference;

import J1.k;
import X3.c;
import android.content.Context;
import android.util.AttributeSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean L;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k.a(context, c.f, 16842891));
        this.L = true;
    }

    public void u() {
        if (f() == null && e() == null && H() != 0) {
            l();
            throw null;
        }
    }
}
