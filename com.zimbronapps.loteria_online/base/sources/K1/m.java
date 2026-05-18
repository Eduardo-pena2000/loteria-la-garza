package K1;

import J1.e;
import Q1.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m {
    public ConcurrentHashMap a = new ConcurrentHashMap();

    public class a implements b {
        public a() {
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(l.b bVar) {
            return bVar.e();
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(l.b bVar) {
            return bVar.f();
        }
    }

    public interface b {
        boolean a(Object obj);

        int b(Object obj);
    }

    public static Object f(Object[] objArr, int i, b bVar) {
        return g(objArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, bVar);
    }

    public static Object g(Object[] objArr, int i, boolean z, b bVar) {
        Object obj = null;
        int i2 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(bVar.b(obj2) - i) * 2) + (bVar.a(obj2) == z ? 0 : 1);
            if (obj == null || i2 > abs) {
                obj = obj2;
                i2 = abs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, e.c cVar, Resources resources, int i);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, l.b[] bVarArr, int i);

    public Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File e = n.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (n.d(e, inputStream)) {
                return Typeface.createFromFile(e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        File e = n.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (n.c(e, resources, i)) {
                return Typeface.createFromFile(e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public l.b h(l.b[] bVarArr, int i) {
        return (l.b) f(bVarArr, i, new a());
    }
}
