package S0;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e {

    public static class a {
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    public static class b {
        public static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    public static class c {
        public static void a(View view, int i) {
            view.setImportantForContentCapture(i);
        }
    }

    public static S0.b a(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return S0.b.b(a.a(view));
        }
        return null;
    }

    public static d b(View view) {
        ContentCaptureSession a2;
        if (Build.VERSION.SDK_INT < 29 || (a2 = b.a(view)) == null) {
            return null;
        }
        return d.g(a2, view);
    }

    public static void c(View view, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(view, i);
        }
    }
}
