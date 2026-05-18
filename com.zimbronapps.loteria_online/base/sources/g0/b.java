package G0;

import android.view.KeyEvent;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public final KeyEvent a;

    public /* synthetic */ b(KeyEvent keyEvent) {
        this.a = keyEvent;
    }

    public static final /* synthetic */ b a(KeyEvent keyEvent) {
        return new b(keyEvent);
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof b) && t.c(keyEvent, ((b) obj).f());
    }

    public static int d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ KeyEvent f() {
        return this.a;
    }

    public int hashCode() {
        return d(this.a);
    }

    public String toString() {
        return e(this.a);
    }

    public static KeyEvent b(KeyEvent keyEvent) {
        return keyEvent;
    }
}
