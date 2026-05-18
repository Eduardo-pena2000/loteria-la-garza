package Q;

import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t0 {
    public static final t0 a = new t0();

    public final void a(EditorInfo editorInfo, h1.e eVar) {
        if (kotlin.jvm.internal.t.c(eVar, h1.e.c.b())) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(Da.w.y(eVar, 10));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((h1.d) it.next()).b());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
