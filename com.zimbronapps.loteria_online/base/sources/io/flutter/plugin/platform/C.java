package io.flutter.plugin.platform;

import R9.q;
import android.content.Context;
import android.view.MotionEvent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class c extends R9.q {
    public a h;

    public c(Context context, int i, int i2, a aVar) {
        super(context, i, i2, q.a.b);
        this.h = aVar;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.h;
        if (aVar == null || !aVar.a(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}
