package K1;

import J1.e;
import Q1.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class h extends m {
    public static Class b = null;
    public static Constructor c = null;
    public static Method d = null;
    public static Method e = null;
    public static boolean f = false;

    public static boolean i(Object obj, String str, int i, boolean z) {
        l();
        try {
            return ((Boolean) d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (InvocationTargetException | IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface j(Object obj) {
        l();
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) e.invoke((Object) null, new Object[]{newInstance});
        } catch (InvocationTargetException | IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void l() {
        Method method;
        Class cls;
        Method method2;
        if (f) {
            return;
        }
        f = true;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor((Class[]) null);
            method2 = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (NoSuchMethodException | ClassNotFoundException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        d = method2;
        e = method;
    }

    private static Object m() {
        l();
        try {
            return c.newInstance((Object[]) null);
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i) {
        Object m = m();
        for (e.d dVar : cVar.a()) {
            File e2 = n.e(context);
            if (e2 == null) {
                return null;
            }
            try {
                if (!n.c(e2, resources, dVar.b())) {
                    return null;
                }
                if (!i(m, e2.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                e2.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e2.delete();
            }
        }
        return j(m);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, l.b[] bVarArr, int i) {
        if (bVarArr.length < 1) {
            return null;
        }
        l.b h = h(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File k = k(openFileDescriptor);
                if (k != null && k.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(k);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface d2 = super.d(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return d2;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final File k(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
