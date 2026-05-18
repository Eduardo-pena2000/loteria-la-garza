package T1;

import android.view.ViewConfiguration;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class b0 implements S1.i {
    public final /* synthetic */ ViewConfiguration a;

    public /* synthetic */ b0(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    public final Object get() {
        return Integer.valueOf(this.a.getScaledMinimumFlingVelocity());
    }
}
