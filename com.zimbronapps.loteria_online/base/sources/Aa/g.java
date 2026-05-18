package Aa;

import A4.l;
import A4.m;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class g {

    public interface a {
        void a(float f, float f2, float f3);
    }

    public interface b {
        boolean a(View view);
    }

    public static /* synthetic */ boolean a(View view) {
        return g(view);
    }

    public static /* synthetic */ boolean b(Class[] clsArr, View view) {
        return h(clsArr, view);
    }

    public static void c(Context context, a aVar) {
        Activity e = e(context);
        if (e != null) {
            l d = m.a().d(e);
            aVar.a(d.a().width(), d.a().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static boolean d(View view) {
        return i(view, new f());
    }

    public static Activity e(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean f(View view, Class[] clsArr) {
        return i(view, new e(clsArr));
    }

    public static /* synthetic */ boolean g(View view) {
        return view.hasFocus();
    }

    public static /* synthetic */ boolean h(Class[] clsArr, View view) {
        for (Class cls : clsArr) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(View view, b bVar) {
        if (view == null) {
            return false;
        }
        if (bVar.a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (i(viewGroup.getChildAt(i), bVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
