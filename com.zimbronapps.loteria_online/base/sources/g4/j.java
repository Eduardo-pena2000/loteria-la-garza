package G4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j {

    public class a extends j {
        public i a(String str) {
            return null;
        }
    }

    public static j c() {
        return new a();
    }

    public abstract i a(String str);

    public final i b(String str) {
        i a2 = a(str);
        return a2 == null ? i.a(str) : a2;
    }
}
