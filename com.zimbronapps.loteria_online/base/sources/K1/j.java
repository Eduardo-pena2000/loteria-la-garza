package K1;

import J1.e;
import Q1.l;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class j extends h {
    public final Class g;
    public final Constructor h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public j() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = w();
            constructor = x(cls);
            method = t(cls);
            method2 = u(cls);
            method3 = y(cls);
            method4 = s(cls);
            method5 = v(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = method;
        this.j = method2;
        this.k = method3;
        this.l = method4;
        this.m = method5;
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i) {
        if (!r()) {
            return super.a(context, cVar, resources, i);
        }
        Object m = m();
        if (m == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!o(context, m, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                n(m);
                return null;
            }
        }
        if (q(m)) {
            return j(m);
        }
        return null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, l.b[] bVarArr, int i) {
        Typeface j;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!r()) {
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
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h.e()).setItalic(h.f()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map h2 = n.h(context, bVarArr, cancellationSignal);
        Object m = m();
        if (m == null) {
            return null;
        }
        boolean z = false;
        for (l.b bVar : bVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) h2.get(bVar.d());
            if (byteBuffer != null) {
                if (!p(m, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    n(m);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            n(m);
            return null;
        }
        if (q(m) && (j = j(m)) != null) {
            return Typeface.create(j, i);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i) {
        return super.c(context, cancellationSignal, list, i);
    }

    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        if (!r()) {
            return super.e(context, resources, i, str, i2);
        }
        Object m = m();
        if (m == null) {
            return null;
        }
        if (!o(context, m, str, 0, -1, -1, null)) {
            n(m);
            return null;
        }
        if (q(m)) {
            return j(m);
        }
        return null;
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Object m() {
        try {
            return this.h.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void n(Object obj) {
        try {
            this.l.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean o(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean p(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean q(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, (Object[]) null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean r() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }

    public Method s(Class cls) {
        return cls.getMethod("abortCreation", (Class[]) null);
    }

    public Method t(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public Method u(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    public Method v(Class cls) {
        Class cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{cls2, cls3, cls3});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class w() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor x(Class cls) {
        return cls.getConstructor((Class[]) null);
    }

    public Method y(Class cls) {
        return cls.getMethod("freeze", (Class[]) null);
    }
}
