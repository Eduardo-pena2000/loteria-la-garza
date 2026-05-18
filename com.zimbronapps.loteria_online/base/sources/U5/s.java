package U5;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class s extends RelativeLayout {
    public final V5.u a;
    public boolean b;

    public s(Context context, String str, String str2, String str3) {
        super(context);
        V5.u uVar = new V5.u(context, str);
        this.a = uVar;
        uVar.d(str2);
        uVar.c(str3);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            return false;
        }
        this.a.a(motionEvent);
        return false;
    }
}
