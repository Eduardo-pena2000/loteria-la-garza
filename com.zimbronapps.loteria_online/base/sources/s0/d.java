package S0;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d {
    public final Object a;
    public final View b;

    public static class a {
        public static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        public static ViewStructure b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        public static void c(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void d(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    public d(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public static d g(ContentCaptureSession contentCaptureSession, View view) {
        return new d(contentCaptureSession, view);
    }

    public void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession a2 = c.a(this.a);
            b a3 = e.a(this.b);
            Objects.requireNonNull(a3);
            a.f(a2, a3.a(), new long[]{Long.MIN_VALUE});
        }
    }

    public AutofillId b(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession a2 = c.a(this.a);
        b a3 = e.a(this.b);
        Objects.requireNonNull(a3);
        return a.a(a2, a3.a(), j);
    }

    public f c(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return f.i(a.b(c.a(this.a), autofillId, j));
        }
        return null;
    }

    public void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.c(c.a(this.a), viewStructure);
        }
    }

    public void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.d(c.a(this.a), autofillId);
        }
    }

    public void f(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.e(c.a(this.a), autofillId, charSequence);
        }
    }
}
