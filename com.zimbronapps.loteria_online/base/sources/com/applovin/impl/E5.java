package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class e5 {
    private final WeakHashMap a = new WeakHashMap();
    private final Object b = new Object();
    private final Handler c = new Handler();
    private boolean d = false;
    private final WeakReference e;
    private final ViewTreeObserver.OnPreDrawListener f;
    private a g;

    public interface a {
        void a(int i, int i2);
    }

    public e5(View view) {
        this.e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f = null;
            return;
        }
        M0 m0 = new M0(this);
        this.f = m0;
        viewTreeObserver.addOnPreDrawListener(m0);
    }

    public static /* synthetic */ boolean a(e5 e5Var) {
        return e5Var.b();
    }

    public static /* synthetic */ void b(e5 e5Var) {
        e5Var.c();
    }

    private /* synthetic */ void c() {
        synchronized (this.b) {
            try {
                this.d = false;
                int i = -1;
                int i2 = -1;
                for (Map.Entry entry : this.a.entrySet()) {
                    if (a((View) entry.getKey())) {
                        Integer num = (Integer) entry.getValue();
                        if (i == -1 && i2 == -1) {
                            i = num.intValue();
                            i2 = num.intValue();
                        } else {
                            i = Math.min(i, ((Integer) entry.getValue()).intValue());
                            i2 = Math.max(i2, ((Integer) entry.getValue()).intValue());
                        }
                    }
                }
                a aVar = this.g;
                if (aVar != null) {
                    aVar.a(i, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.postDelayed(new N0(this), 100L);
    }

    private /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.g = null;
        View view = (View) this.e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.b) {
            this.a.remove(view);
        }
    }

    public void a(a aVar) {
        this.g = aVar;
    }

    public void a(View view, int i) {
        synchronized (this.b) {
            this.a.put(view, Integer.valueOf(i));
            d();
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}
