package A4;

import Da.v;
import P0.U;
import P0.V;
import T1.A0;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n implements m {
    public static final n b = new n();
    public static final String c;
    public static final ArrayList d;

    static {
        String simpleName = n.class.getSimpleName();
        t.f(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        c = simpleName;
        d = v.h(new Integer[]{Integer.valueOf(A0.l.h()), Integer.valueOf(A0.l.g()), Integer.valueOf(A0.l.b()), Integer.valueOf(A0.l.d()), Integer.valueOf(A0.l.j()), Integer.valueOf(A0.l.f()), Integer.valueOf(A0.l.k()), Integer.valueOf(A0.l.c())});
    }

    public l b(Context context) {
        t.g(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return E4.g.a.c(context);
        }
        Context a = E4.b.a.a(context);
        if (a instanceof Activity) {
            return c((Activity) a);
        }
        if (!(a instanceof InputMethodService)) {
            throw new IllegalArgumentException(context + " is not a UiContext");
        }
        Object systemService = context.getSystemService("window");
        t.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        t.f(defaultDisplay, "wm.defaultDisplay");
        Point l = l(defaultDisplay);
        return new l(new Rect(0, 0, l.x, l.y), null, 2, null);
    }

    public l c(Activity activity) {
        A0 a;
        t.g(activity, "activity");
        int i = Build.VERSION.SDK_INT;
        Rect a2 = i >= 30 ? E4.g.a.a(activity) : i >= 29 ? h(activity) : i >= 28 ? g(activity) : f(activity);
        if (i >= 30) {
            a = i(activity);
        } else {
            a = new A0.a().a();
            t.f(a, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new l(new w4.b(a2), a);
    }

    public l d(Activity activity) {
        t.g(activity, "activity");
        return e(activity);
    }

    public l e(Context context) {
        Rect rect;
        A0 a;
        t.g(context, "context");
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            rect = E4.g.a.d(context);
        } else {
            Object systemService = context.getSystemService("window");
            t.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            t.f(defaultDisplay, "display");
            Point l = l(defaultDisplay);
            rect = new Rect(0, 0, l.x, l.y);
        }
        if (i >= 30) {
            a = i(context);
        } else {
            a = new A0.a().a();
            t.f(a, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new l(new w4.b(rect), a);
    }

    public final Rect f(Activity activity) {
        t.g(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!E4.a.a.a(activity)) {
            t.f(defaultDisplay, "defaultDisplay");
            Point l = l(defaultDisplay);
            int k = k(activity);
            int i = rect.bottom;
            if (i + k == l.y) {
                rect.bottom = i + k;
            } else {
                int i2 = rect.right;
                if (i2 + k == l.x) {
                    rect.right = i2 + k;
                }
            }
        }
        return rect;
    }

    public final Rect g(Activity activity) {
        t.g(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (E4.a.a.a(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", (Class[]) null).invoke(obj, (Object[]) null);
                t.e(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", (Class[]) null).invoke(obj, (Object[]) null);
                t.e(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (NoSuchFieldException e) {
            Log.w(c, e);
            m(activity, rect);
        } catch (NoSuchMethodException e2) {
            Log.w(c, e2);
            m(activity, rect);
        } catch (InvocationTargetException e3) {
            Log.w(c, e3);
            m(activity, rect);
        } catch (IllegalAccessException e4) {
            Log.w(c, e4);
            m(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        E4.a aVar = E4.a.a;
        if (!aVar.a(activity)) {
            int k = k(activity);
            int i = rect.bottom;
            if (i + k == point.y) {
                rect.bottom = i + k;
            } else {
                int i2 = rect.right;
                if (i2 + k == point.x) {
                    rect.right = i2 + k;
                } else if (rect.left == k) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !aVar.a(activity)) {
            t.f(defaultDisplay, "currentDisplay");
            DisplayCutout j = j(defaultDisplay);
            if (j != null) {
                int i3 = rect.left;
                E4.l lVar = E4.l.a;
                if (i3 == lVar.b(j)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == lVar.c(j)) {
                    rect.right += lVar.c(j);
                }
                if (rect.top == lVar.d(j)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == lVar.a(j)) {
                    rect.bottom += lVar.a(j);
                }
            }
        }
        return rect;
    }

    public final Rect h(Activity activity) {
        t.g(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", (Class[]) null).invoke(obj, (Object[]) null);
            t.e(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) invoke);
        } catch (NoSuchMethodException e) {
            Log.w(c, e);
            return g(activity);
        } catch (IllegalAccessException e2) {
            Log.w(c, e2);
            return g(activity);
        } catch (NoSuchFieldException e3) {
            Log.w(c, e3);
            return g(activity);
        } catch (InvocationTargetException e4) {
            Log.w(c, e4);
            return g(activity);
        }
    }

    public final A0 i(Context context) {
        t.g(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return E4.g.a.b(context);
        }
        throw new Exception("Incompatible SDK version");
    }

    public final DisplayCutout j(Display display) {
        try {
            Constructor constructor = Class.forName("android.view.DisplayInfo").getConstructor((Class[]) null);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance((Object[]) null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", new Class[]{newInstance.getClass()});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, new Object[]{newInstance});
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (U.a(obj)) {
                return V.a(obj);
            }
            return null;
        } catch (InvocationTargetException e) {
            Log.w(c, e);
            return null;
        } catch (InstantiationException e2) {
            Log.w(c, e2);
            return null;
        } catch (IllegalAccessException e3) {
            Log.w(c, e3);
            return null;
        } catch (ClassNotFoundException e4) {
            Log.w(c, e4);
            return null;
        } catch (NoSuchFieldException e5) {
            Log.w(c, e5);
            return null;
        } catch (NoSuchMethodException e6) {
            Log.w(c, e6);
            return null;
        }
    }

    public final int k(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final Point l(Display display) {
        t.g(display, "display");
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    public final void m(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
