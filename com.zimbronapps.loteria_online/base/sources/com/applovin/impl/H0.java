package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class h0 {
    private final com.applovin.impl.sdk.k a;
    private final com.applovin.impl.sdk.o b;
    private final long c;
    private final long d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private int k;
    private int l;
    private Integer m;
    private volatile boolean n;
    private volatile boolean o;
    private Handler p;
    private HandlerThread q;
    private c s;
    private WeakReference j = new WeakReference((Object) null);
    private final Runnable r = new K1(this);

    public class b implements PixelCopy.OnPixelCopyFinishedListener {
        final /* synthetic */ d a;
        final /* synthetic */ Bitmap b;

        public b(d dVar, Bitmap bitmap) {
            this.a = dVar;
            this.b = bitmap;
        }

        public void onPixelCopyFinished(int i) {
            if (i == 0) {
                this.a.a(this.b);
                return;
            }
            h0.i(h0.this);
            if (com.applovin.impl.sdk.o.a()) {
                h0.i(h0.this).b("BlackViewDetector", "Failed to capture screenshot with error code: " + i);
            }
            this.a.a(true);
        }
    }

    public interface c {
        void a(int i, int i2);

        void a(int i, int i2, int i3);
    }

    public interface d {
        void a(Bitmap bitmap);

        void a(boolean z);
    }

    public h0(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.O();
        this.c = ((Long) kVar.a(x4.j6)).longValue();
        this.d = ((Long) kVar.a(x4.i6)).longValue();
        this.g = ((Integer) kVar.a(x4.k6)).intValue();
        this.h = ((Integer) kVar.a(x4.l6)).intValue();
        this.i = ((Integer) kVar.a(x4.m6)).intValue();
        this.e = ((Integer) kVar.a(x4.s6)).intValue();
        this.f = ((Integer) kVar.a(x4.t6)).intValue();
    }

    public static /* synthetic */ int a(h0 h0Var) {
        int i = h0Var.l;
        h0Var.l = i + 1;
        return i;
    }

    public static /* synthetic */ int b(h0 h0Var) {
        return h0Var.g;
    }

    public static /* synthetic */ void c(h0 h0Var) {
        h0Var.j();
    }

    public static /* synthetic */ void d(h0 h0Var) {
        h0Var.g();
    }

    public static /* synthetic */ Integer e(h0 h0Var) {
        return h0Var.m;
    }

    public static /* synthetic */ int f(h0 h0Var) {
        int i = h0Var.k;
        h0Var.k = i + 1;
        return i;
    }

    public static /* synthetic */ com.applovin.impl.sdk.k g(h0 h0Var) {
        return h0Var.a;
    }

    public static /* synthetic */ void h(h0 h0Var) {
        h0Var.k();
    }

    public static /* synthetic */ com.applovin.impl.sdk.o i(h0 h0Var) {
        return h0Var.b;
    }

    public static /* synthetic */ void j(h0 h0Var) {
        h0Var.d();
    }

    public static /* synthetic */ void k(h0 h0Var) {
        h0Var.f();
    }

    public static /* synthetic */ void l(h0 h0Var) {
        h0Var.a();
    }

    public static /* synthetic */ void m(h0 h0Var) {
        h0Var.e();
    }

    public static /* synthetic */ boolean a(h0 h0Var, int i) {
        return h0Var.a(i);
    }

    private void c() {
        if (this.k >= this.f && !this.o) {
            this.o = true;
            h();
        }
        if (this.k < this.e || this.n) {
            return;
        }
        this.n = true;
        i();
    }

    private /* synthetic */ void d() {
        c cVar = this.s;
        if (cVar != null) {
            cVar.a(this.e, this.k, this.l);
        }
    }

    private /* synthetic */ void e() {
        c cVar = this.s;
        if (cVar != null) {
            cVar.a(this.k, this.l);
        }
    }

    private /* synthetic */ void f() {
        this.s = null;
    }

    private void g() {
        if (this.c <= 0) {
            if (this.k == 1) {
                if (!this.o) {
                    this.o = true;
                    h();
                }
                if (!this.n) {
                    this.n = true;
                    i();
                }
            }
            k();
            return;
        }
        c();
        if (this.p == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            k();
        } else if (this.n && this.o) {
            k();
        } else {
            this.p.postDelayed(this.r, this.c);
        }
    }

    private void h() {
        View view = (View) this.j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.b.k("BlackViewDetector", "Notifying black view confirmed: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new L1(this));
    }

    private void i() {
        View view = (View) this.j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.b.k("BlackViewDetector", "Notifying black view detected: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new I1(this));
    }

    private void j() {
        this.k = 0;
        this.m = null;
    }

    private void k() {
        if (this.j.get() != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.b.a("BlackViewDetector", "Stopped monitoring view: " + this.j.get());
            }
            this.j.clear();
        }
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacks(this.r);
            this.p = null;
        }
        if (this.s != null) {
            AppLovinSdkUtils.runOnUiThread(new J1(this));
        }
    }

    public void b() {
        k();
        HandlerThread handlerThread = this.q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.q = null;
        }
    }

    public static /* synthetic */ Integer a(h0 h0Var, Integer num) {
        h0Var.m = num;
        return num;
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.a.a(x4.h6)).booleanValue()) {
            View view2 = (View) this.j.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.q == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.q = handlerThread;
                    handlerThread.start();
                } else {
                    this.a.D().a(d2.L0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    k();
                }
                this.s = cVar;
                this.j = new WeakReference(view);
                j();
                this.n = false;
                this.o = false;
                Handler handler = new Handler(this.q.getLooper());
                this.p = handler;
                handler.postDelayed(this.r, this.d);
            } catch (Throwable th) {
                k();
                this.a.D().c("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    public class a implements d {
        public a() {
        }

        public void a(Bitmap bitmap) {
            try {
                h0.a(h0.this);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int b = width / h0.b(h0.this);
                int b2 = height / h0.b(h0.this);
                int i = b / 2;
                for (int i2 = b2 / 2; i2 < height; i2 += b2) {
                    for (int i3 = i; i3 < width; i3 += b) {
                        int pixel = bitmap.getPixel(i3, i2);
                        if (h0.a(h0.this, pixel)) {
                            bitmap.recycle();
                            h0.c(h0.this);
                            h0.d(h0.this);
                            return;
                        }
                        if (h0.e(h0.this) == null) {
                            h0.a(h0.this, Integer.valueOf(pixel));
                        }
                    }
                }
                h0.f(h0.this);
                bitmap.recycle();
                h0.d(h0.this);
            } catch (Exception e) {
                h0.g(h0.this).D().c("BlackViewDetector", "onScreenshotCaptured", e);
                h0.h(h0.this);
            }
        }

        public void a(boolean z) {
            if (z) {
                h0.h(h0.this);
            } else {
                h0.d(h0.this);
            }
        }
    }

    private void a() {
        ActivityManager.MemoryInfo a2;
        View view = (View) this.j.get();
        if (view == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            k();
            return;
        }
        Long l = (Long) this.a.a(x4.q6);
        if (l.longValue() > 0 && (a2 = n7.a((ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity"))) != null && a2.availMem < l.longValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (this.a.m0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.b.a("BlackViewDetector", "App is backgrounded - skipping black view detection");
            }
            j();
            g();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.b.k("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
        }
        j();
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(int r9) {
        /*
            r8 = this;
            int r0 = android.graphics.Color.red(r9)
            int r1 = android.graphics.Color.green(r9)
            int r9 = android.graphics.Color.blue(r9)
            java.lang.Integer r2 = r8.m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4d
            int r2 = r2.intValue()
            int r2 = android.graphics.Color.red(r2)
            java.lang.Integer r5 = r8.m
            int r5 = r5.intValue()
            int r5 = android.graphics.Color.green(r5)
            java.lang.Integer r6 = r8.m
            int r6 = r6.intValue()
            int r6 = android.graphics.Color.blue(r6)
            int r2 = r0 - r2
            int r2 = java.lang.Math.abs(r2)
            int r7 = r8.i
            if (r2 > r7) goto L4f
            int r2 = r1 - r5
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.i
            if (r2 > r5) goto L4f
            int r2 = r9 - r6
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.i
            if (r2 <= r5) goto L4d
            goto L4f
        L4d:
            r2 = r4
            goto L50
        L4f:
            r2 = r3
        L50:
            int r5 = r8.h
            if (r0 > r5) goto L5c
            if (r1 > r5) goto L5c
            if (r9 > r5) goto L5c
            if (r2 == 0) goto L5b
            goto L5c
        L5b:
            r3 = r4
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.h0.a(int):boolean");
    }

    private void a(View view, d dVar) {
        if (o0.g()) {
            Activity a2 = this.a.e().a();
            if (a2 == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            Rect rect = new Rect(i, i2, i + measuredWidth, i2 + measuredHeight);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                H1.a(a2.getWindow(), rect, createBitmap, new b(dVar, createBitmap), new Handler());
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                dVar.a(true);
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
