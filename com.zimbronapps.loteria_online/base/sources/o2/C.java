package O2;

import P2.K;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {
    public static final String a = K.w0(0);
    public static final String b = K.w0(1);
    public static final String c = K.w0(2);
    public static final String d = K.w0(3);
    public static final String e = K.w0(4);

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
            arrayList.add(b(spanned, eVar, 1, eVar.b()));
        }
        for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
            arrayList.add(b(spanned, gVar, 2, gVar.b()));
        }
        for (d dVar : (d[]) spanned.getSpans(0, spanned.length(), d.class)) {
            arrayList.add(b(spanned, dVar, 3, null));
        }
        return arrayList;
    }

    public static Bundle b(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(a, spanned.getSpanStart(obj));
        bundle2.putInt(b, spanned.getSpanEnd(obj));
        bundle2.putInt(c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i = bundle.getInt(a);
        int i2 = bundle.getInt(b);
        int i3 = bundle.getInt(c);
        int i4 = bundle.getInt(d, -1);
        Bundle bundle2 = bundle.getBundle(e);
        if (i4 == 1) {
            spannable.setSpan(e.a((Bundle) P2.a.e(bundle2)), i, i2, i3);
        } else if (i4 == 2) {
            spannable.setSpan(g.a((Bundle) P2.a.e(bundle2)), i, i2, i3);
        } else {
            if (i4 != 3) {
                return;
            }
            spannable.setSpan(new d(), i, i2, i3);
        }
    }
}
