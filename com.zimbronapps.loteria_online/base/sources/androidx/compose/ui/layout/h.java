package androidx.compose.ui.layout;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h {
    public static final Object a(M0.A a) {
        Object j = a.j();
        M0.s sVar = j instanceof M0.s ? (M0.s) j : null;
        if (sVar != null) {
            return sVar.M0();
        }
        return null;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, Object obj) {
        return eVar.then(new LayoutIdElement(obj));
    }
}
