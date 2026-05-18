package S0;

import android.os.Bundle;
import android.view.ViewStructure;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class f {
    public final Object a;

    public static class a {
        public static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        public static void b(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        public static void c(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        public static void d(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }

        public static void e(ViewStructure viewStructure, int i, String str, String str2, String str3) {
            viewStructure.setId(i, str, str2, str3);
        }

        public static void f(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        public static void g(ViewStructure viewStructure, float f, int i, int i2, int i3) {
            viewStructure.setTextStyle(f, i, i2, i3);
        }
    }

    public f(ViewStructure viewStructure) {
        this.a = viewStructure;
    }

    public static f i(ViewStructure viewStructure) {
        return new f(viewStructure);
    }

    public Bundle a() {
        return a.a((ViewStructure) this.a);
    }

    public void b(String str) {
        a.b((ViewStructure) this.a, str);
    }

    public void c(CharSequence charSequence) {
        a.c((ViewStructure) this.a, charSequence);
    }

    public void d(int i, int i2, int i3, int i4, int i5, int i6) {
        a.d((ViewStructure) this.a, i, i2, i3, i4, i5, i6);
    }

    public void e(int i, String str, String str2, String str3) {
        a.e((ViewStructure) this.a, i, str, str2, str3);
    }

    public void f(CharSequence charSequence) {
        a.f((ViewStructure) this.a, charSequence);
    }

    public void g(float f, int i, int i2, int i3) {
        a.g((ViewStructure) this.a, f, i, i2, i3);
    }

    public ViewStructure h() {
        return (ViewStructure) this.a;
    }
}
