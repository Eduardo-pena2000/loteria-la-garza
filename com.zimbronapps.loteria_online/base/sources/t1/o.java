package T1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class o {
    public final Context a;
    public final p b;
    public final b c;
    public final a d;
    public VelocityTracker e;
    public float f;
    public int g;
    public int h;
    public int i;
    public final int[] j;

    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    public o(Context context, p pVar) {
        this(context, pVar, new m(), new n());
    }

    public static /* synthetic */ void a(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        c(context, iArr, motionEvent, i);
    }

    public static /* synthetic */ float b(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        return f(velocityTracker, motionEvent, i);
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = c0.i(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = c0.h(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        W.a(velocityTracker, motionEvent);
        W.b(velocityTracker, 1000);
        return W.d(velocityTracker, i);
    }

    public final boolean d(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.h == source && this.i == deviceId && this.g == i) {
            return false;
        }
        this.c.a(this.a, this.j, motionEvent, i);
        this.h = source;
        this.i = deviceId;
        this.g = i;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i) {
        if (this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        return this.d.a(this.e, motionEvent, i);
    }

    public void g(MotionEvent motionEvent, int i) {
        boolean d = d(motionEvent, i);
        if (this.j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.e = null;
                return;
            }
            return;
        }
        float e = e(motionEvent, i) * this.b.b();
        float signum = Math.signum(e);
        if (d || (signum != Math.signum(this.f) && signum != 0.0f)) {
            this.b.c();
        }
        float abs = Math.abs(e);
        int[] iArr = this.j;
        if (abs < iArr[0]) {
            return;
        }
        float max = Math.max(-r6, Math.min(e, iArr[1]));
        this.f = this.b.a(max) ? max : 0.0f;
    }

    public o(Context context, p pVar, b bVar, a aVar) {
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new int[]{Integer.MAX_VALUE, 0};
        this.a = context;
        this.b = pVar;
        this.c = bVar;
        this.d = aVar;
    }
}
