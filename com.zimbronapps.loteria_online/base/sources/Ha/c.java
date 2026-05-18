package ha;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import ca.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class c implements t.b {
    public Activity a;
    public final int b;
    public final t c;

    public c(int i, Activity activity, t tVar) {
        this.a = activity;
        this.b = i;
        this.c = tVar;
        tVar.f(this);
    }

    public int a() {
        if (!isSupported()) {
            return 2;
        }
        View findViewById = this.a.findViewById(this.b);
        if (findViewById != null) {
            return a.a(findViewById);
        }
        throw new IllegalArgumentException(d());
    }

    public void b(int i) {
        if (!isSupported()) {
            throw new IllegalStateException(e());
        }
        View findViewById = this.a.findViewById(this.b);
        if (findViewById == null) {
            throw new IllegalArgumentException(d());
        }
        if (a.a(findViewById) == i) {
            return;
        }
        b.a(findViewById, i);
        findViewById.invalidate();
    }

    public void c() {
        this.c.f(null);
        this.a = null;
    }

    public final String d() {
        return "FlutterView with ID " + this.b + "not found";
    }

    public final String e() {
        return "isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.";
    }

    public boolean isSupported() {
        return Build.VERSION.SDK_INT >= 35;
    }
}
