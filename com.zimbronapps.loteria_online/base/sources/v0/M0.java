package v0;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m0 {
    public static final m0 a = new m0();
    public static Method b;
    public static Method c;
    public static boolean d;

    public final void a(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            p0.a.a(canvas, z);
            return;
        }
        if (!d) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});
                    b = (Method) declaredMethod.invoke(Canvas.class, new Object[]{"insertReorderBarrier", new Class[0]});
                    c = (Method) declaredMethod.invoke(Canvas.class, new Object[]{"insertInorderBarrier", new Class[0]});
                } else {
                    b = Canvas.class.getDeclaredMethod("insertReorderBarrier", (Class[]) null);
                    c = Canvas.class.getDeclaredMethod("insertInorderBarrier", (Class[]) null);
                }
                Method method2 = b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException unused) {
            }
            d = true;
        }
        if (z) {
            try {
                Method method4 = b;
                if (method4 != null) {
                    kotlin.jvm.internal.t.d(method4);
                    method4.invoke(canvas, (Object[]) null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = c) == null) {
            return;
        }
        kotlin.jvm.internal.t.d(method);
        method.invoke(canvas, (Object[]) null);
    }
}
