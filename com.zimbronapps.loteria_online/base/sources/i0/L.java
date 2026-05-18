package I0;

import android.view.MotionEvent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l {
    public static final l a = new l();

    public final long a(MotionEvent motionEvent, int i) {
        float a2 = j.a(motionEvent, i);
        float a3 = k.a(motionEvent, i);
        return u0.f.e((Float.floatToRawIntBits(a3) & 4294967295L) | (Float.floatToRawIntBits(a2) << 32));
    }
}
