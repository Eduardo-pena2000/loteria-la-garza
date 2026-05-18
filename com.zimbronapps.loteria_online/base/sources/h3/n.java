package h3;

import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface n {
    public static final n a = new a();

    public class a implements n {
        public long a() {
            throw new NoSuchElementException();
        }

        public long b() {
            throw new NoSuchElementException();
        }

        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
