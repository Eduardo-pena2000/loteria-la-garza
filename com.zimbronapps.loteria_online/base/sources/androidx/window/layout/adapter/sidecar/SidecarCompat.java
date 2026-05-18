package androidx.window.layout.adapter.sidecar;

import A4.k;
import Ca.I;
import Da.v;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class SidecarCompat implements androidx.window.layout.adapter.sidecar.a {
    public static final a f = new a(null);
    public final SidecarInterface a;
    public final D4.a b;
    public final Map c;
    public final Map d;
    public b e;

    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface h;
            t.g(sidecarDeviceState, "newDeviceState");
            Iterable<Activity> values = SidecarCompat.g(SidecarCompat.this).values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : values) {
                IBinder a = SidecarCompat.f.a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (a != null && (h = sidecarCompat.h()) != null) {
                    sidecarWindowLayoutInfo = h.getWindowLayoutInfo(a);
                }
                b e = SidecarCompat.e(sidecarCompat);
                if (e != null) {
                    e.a(activity, SidecarCompat.f(sidecarCompat).e(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            SidecarDeviceState sidecarDeviceState;
            t.g(iBinder, "windowToken");
            t.g(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) SidecarCompat.g(SidecarCompat.this).get(iBinder);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            D4.a f = SidecarCompat.f(SidecarCompat.this);
            SidecarInterface h = SidecarCompat.this.h();
            if (h == null || (sidecarDeviceState = h.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            k e = f.e(sidecarWindowLayoutInfo, sidecarDeviceState);
            b e2 = SidecarCompat.e(SidecarCompat.this);
            if (e2 != null) {
                e2.a(activity, e);
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface b(Context context) {
            t.g(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final w4.k c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return w4.k.f.b(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    public static final class b implements a.a {
        public final a.a a;
        public final ReentrantLock b;
        public final WeakHashMap c;

        public b(a.a aVar) {
            t.g(aVar, "callbackInterface");
            this.a = aVar;
            this.b = new ReentrantLock();
            this.c = new WeakHashMap();
        }

        public void a(Activity activity, k kVar) {
            t.g(activity, "activity");
            t.g(kVar, "newLayout");
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                if (t.c(kVar, (k) this.c.get(activity))) {
                    return;
                }
                reentrantLock.unlock();
                this.a.a(activity, kVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(Activity activity) {
            t.g(activity, "activity");
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                this.c.put(activity, (Object) null);
                I i = I.a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static final class c implements View.OnAttachStateChangeListener {
        public final SidecarCompat a;
        public final WeakReference b;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            t.g(sidecarCompat, "sidecarCompat");
            t.g(activity, "activity");
            this.a = sidecarCompat;
            this.b = new WeakReference(activity);
        }

        public void onViewAttachedToWindow(View view) {
            t.g(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.b.get();
            IBinder a = SidecarCompat.f.a(activity);
            if (activity == null || a == null) {
                return;
            }
            this.a.j(a, activity);
        }

        public void onViewDetachedFromWindow(View view) {
            t.g(view, "view");
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, D4.a aVar) {
        t.g(aVar, "sidecarAdapter");
        this.a = sidecarInterface;
        this.b = aVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public static /* synthetic */ void d(SidecarCompat sidecarCompat, Activity activity, Configuration configuration) {
        l(sidecarCompat, activity, configuration);
    }

    public static final /* synthetic */ b e(SidecarCompat sidecarCompat) {
        return sidecarCompat.e;
    }

    public static final /* synthetic */ D4.a f(SidecarCompat sidecarCompat) {
        return sidecarCompat.b;
    }

    public static final /* synthetic */ Map g(SidecarCompat sidecarCompat) {
        return sidecarCompat.c;
    }

    public static final void l(SidecarCompat sidecarCompat, Activity activity, Configuration configuration) {
        t.g(sidecarCompat, "this$0");
        t.g(activity, "$activity");
        b bVar = sidecarCompat.e;
        if (bVar != null) {
            bVar.a(activity, sidecarCompat.i(activity));
        }
    }

    public void a(a.a aVar) {
        t.g(aVar, "extensionCallback");
        this.e = new b(aVar);
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.b, new TranslatingCallback()));
        }
    }

    public void b(Activity activity) {
        t.g(activity, "activity");
        IBinder a2 = f.a(activity);
        if (a2 != null) {
            j(a2, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    public void c(Activity activity) {
        SidecarInterface sidecarInterface;
        t.g(activity, "activity");
        IBinder a2 = f.a(activity);
        if (a2 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a2);
        }
        m(activity);
        b bVar = this.e;
        if (bVar != null) {
            bVar.b(activity);
        }
        boolean z = this.c.size() == 1;
        this.c.remove(a2);
        if (!z || (sidecarInterface = this.a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final SidecarInterface h() {
        return this.a;
    }

    public final k i(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        t.g(activity, "activity");
        IBinder a2 = f.a(activity);
        if (a2 == null) {
            return new k(v.n());
        }
        SidecarInterface sidecarInterface = this.a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a2) : null;
        D4.a aVar = this.b;
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return aVar.e(windowLayoutInfo, sidecarDeviceState);
    }

    public final void j(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        t.g(iBinder, "windowToken");
        t.g(activity, "activity");
        this.c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.c.size() == 1 && (sidecarInterface = this.a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(activity, i(activity));
        }
        k(activity);
    }

    public final void k(Activity activity) {
        if (this.d.get(activity) == null && (activity instanceof H1.c)) {
            D4.b bVar = new D4.b(this, activity);
            this.d.put(activity, bVar);
            ((H1.c) activity).addOnConfigurationChangedListener(bVar);
        }
    }

    public final void m(Activity activity) {
        S1.b bVar = (S1.b) this.d.get(activity);
        if (bVar == null) {
            return;
        }
        if (activity instanceof H1.c) {
            ((H1.c) activity).removeOnConfigurationChangedListener(bVar);
        }
        this.d.remove(activity);
    }

    public boolean n() {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        try {
            SidecarInterface sidecarInterface = this.a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", new Class[]{SidecarInterface.SidecarCallback.class});
            Class returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!t.c(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", new Class[]{IBinder.class});
            Class returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!t.c(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", new Class[]{IBinder.class});
            Class returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!t.c(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", new Class[]{IBinder.class});
            Class returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!t.c(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke(sidecarDeviceState, new Object[]{3});
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", (Class[]) null).invoke(sidecarDeviceState, (Object[]) null);
                t.e(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) invoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            t.f(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", new Class[]{List.class}).invoke(sidecarWindowLayoutInfo, new Object[]{arrayList});
                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", (Class[]) null).invoke(sidecarWindowLayoutInfo, (Object[]) null);
                t.e(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (t.c(arrayList, (List) invoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f.b(context), new D4.a(null, 1, null));
        t.g(context, "context");
    }
}
