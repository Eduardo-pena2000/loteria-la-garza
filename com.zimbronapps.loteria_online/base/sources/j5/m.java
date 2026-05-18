package j5;

import android.os.SystemClock;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m {
    public static final m a = new m();
    public static final File b = new File("/proc/self/fd");
    public static int c = 30;
    public static long d = SystemClock.uptimeMillis();
    public static boolean e = true;

    public final boolean a() {
        int i = c;
        c = i + 1;
        return i >= 30 || SystemClock.uptimeMillis() > d + ((long) 30000);
    }

    public final synchronized boolean b(r rVar) {
        try {
            if (a()) {
                c = 0;
                d = SystemClock.uptimeMillis();
                String[] list = b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z = length < 800;
                e = z;
                if (!z && rVar != null && rVar.b() <= 5) {
                    rVar.a("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }
}
