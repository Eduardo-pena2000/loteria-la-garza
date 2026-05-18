package H2;

import androidx.lifecycle.V;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e {
    public static final e a = new e();

    public final V a(Class cls) {
        t.g(cls, "modelClass");
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor((Class[]) null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance((Object[]) null);
                t.d(newInstance);
                return (V) newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }
}
