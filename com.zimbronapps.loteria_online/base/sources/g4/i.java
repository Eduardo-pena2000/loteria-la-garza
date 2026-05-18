package G4;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static final String a = m.f("InputMerger");

    public static i a(String str) {
        try {
            return (i) Class.forName(str).newInstance();
        } catch (Exception e) {
            m.c().b(a, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    public abstract androidx.work.b b(List list);
}
