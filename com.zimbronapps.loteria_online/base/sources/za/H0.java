package za;

import android.content.Context;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class h0 extends io.flutter.plugin.platform.j {
    public final d a;

    public h0(d dVar) {
        super(da.o.a);
        this.a = dVar;
    }

    public io.flutter.plugin.platform.i create(Context context, int i, Object obj) {
        if (((Integer) obj) == null) {
            throw new IllegalStateException("An identifier is required to retrieve a View instance.");
        }
        Object h = this.a.h(r3.intValue());
        if (h instanceof io.flutter.plugin.platform.i) {
            return (io.flutter.plugin.platform.i) h;
        }
        if (h instanceof View) {
            return new a(h);
        }
        throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + h);
    }

    public class a implements io.flutter.plugin.platform.i {
        public final /* synthetic */ Object a;

        public a(Object obj) {
            this.a = obj;
        }

        public View getView() {
            return (View) this.a;
        }

        public void dispose() {
        }
    }
}
