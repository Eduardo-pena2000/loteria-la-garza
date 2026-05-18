package P0;

import Z0.e;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {
    public static final Z0.e a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new Z0.e(charSequence.toString(), null, 2, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int a0 = Da.r.a0(annotationArr);
        if (a0 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i];
                if (kotlin.jvm.internal.t.c(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new e.d(new q0(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i == a0) {
                    break;
                }
                i++;
            }
        }
        return new Z0.e(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence b(Z0.e eVar) {
        if (eVar.g().isEmpty()) {
            return eVar.j();
        }
        SpannableString spannableString = new SpannableString(eVar.j());
        x0 x0Var = new x0();
        List g = eVar.g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            e.d dVar = (e.d) g.get(i);
            Z0.I0 i0 = (Z0.I0) dVar.a();
            int b = dVar.b();
            int c = dVar.c();
            x0Var.q();
            x0Var.d(i0);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", x0Var.p()), b, c, 33);
        }
        return spannableString;
    }
}
