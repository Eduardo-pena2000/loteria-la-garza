package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class o0 {
    private static final Map a = Collections.synchronizedMap(new HashMap(4));
    private static final Map b = Collections.synchronizedMap(new HashMap(4));
    private static final Map c = Collections.synchronizedMap(new HashMap(4));
    private static final Map d = new HashMap(2);

    public static class a {
        private int a;
        private int b;
        private int c;
        private int d;

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.a;
        }

        public int c() {
            return this.c;
        }

        public int d() {
            return this.b;
        }

        public Map e() {
            HashMap hashMap = new HashMap();
            hashMap.put("left", Integer.valueOf(this.a));
            hashMap.put("top", Integer.valueOf(this.b));
            hashMap.put("right", Integer.valueOf(this.c));
            hashMap.put("bottom", Integer.valueOf(this.d));
            return hashMap;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a(this) && b() == aVar.b() && d() == aVar.d() && c() == aVar.c() && a() == aVar.a();
        }

        public int hashCode() {
            return ((((((b() + 59) * 59) + d()) * 59) + c()) * 59) + a();
        }

        public String toString() {
            return "CompatibilityUtils.Insets(left=" + b() + ", top=" + d() + ", right=" + c() + ", bottom=" + a() + ")";
        }

        public int a() {
            return this.d;
        }

        public static a a(Insets insets) {
            return new a(q.I.a(insets), q.J.a(insets), q.K.a(insets), q.L.a(insets));
        }
    }

    public static class b {
        private int a;
        private int b;
        private int c;
        private int d;

        public static class a {
            private int a;
            private int b;
            private int c;
            private int d;

            public a a(int i) {
                this.c = i;
                return this;
            }

            public a b(int i) {
                this.d = i;
                return this;
            }

            public a c(int i) {
                this.a = i;
                return this;
            }

            public a d(int i) {
                this.b = i;
                return this;
            }

            public String toString() {
                return "CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=" + this.a + ", topRight=" + this.b + ", bottomLeft=" + this.c + ", bottomRight=" + this.d + ")";
            }

            public b a() {
                return new b(this.a, this.b, this.c, this.d);
            }
        }

        public b(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public boolean a(Object obj) {
            return obj instanceof b;
        }

        public int b() {
            return this.d;
        }

        public int c() {
            return this.a;
        }

        public int d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a(this) && c() == bVar.c() && d() == bVar.d() && a() == bVar.a() && b() == bVar.b();
        }

        public int hashCode() {
            return ((((((c() + 59) * 59) + d()) * 59) + a()) * 59) + b();
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + ", bottomRight=" + b() + ")";
        }

        public int a() {
            return this.c;
        }
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static Point b(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        boolean z = kVar == null || ((Boolean) kVar.a(x4.E6)).booleanValue();
        if (!c(context) || z) {
            Map map = d;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = 480;
        point.y = 320;
        WindowManager f = n7.f(context);
        if (f != null) {
            Display defaultDisplay = f.getDefaultDisplay();
            if (b()) {
                Rect a2 = E4.d.a(E4.f.a(f));
                point = new Point(a2.width(), a2.height());
            } else {
                defaultDisplay.getRealSize(point);
            }
        }
        d.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return true;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static a c(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(x4.E4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(T1.Q0.a(windowInsets, T1.U0.a()));
    }

    public static Point a(Context context) {
        Display defaultDisplay = n7.f(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static Map c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) b.get(str);
    }

    public static a a(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(x4.E4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        Insets a2 = T1.Q0.a(windowInsets, T1.a1.a());
        return new a(q.I.a(a2), q.J.a(a2), q.K.a(a2), q.L.a(a2));
    }

    public static void c(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        b.put(str, aVar.e());
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static Map a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) a.get(str);
    }

    public static void a(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        a.put(str, aVar.e());
    }

    public static a b(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(x4.E4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(T1.Q0.a(windowInsets, T1.V0.a()));
    }

    public static b a(Context context, com.applovin.impl.sdk.k kVar) {
        WindowManager f;
        if (!((Boolean) kVar.a(x4.Y3)).booleanValue() || !k() || (f = n7.f(context)) == null) {
            return null;
        }
        try {
            Display defaultDisplay = f.getDefaultDisplay();
            return new b.a().c(a(0, defaultDisplay)).d(a(1, defaultDisplay)).a(a(3, defaultDisplay)).b(a(2, defaultDisplay)).a();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Map b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) c.get(str);
    }

    public static void b(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        c.put(str, aVar.e());
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static int a(int i, Display display) {
        RoundedCorner a2 = K3.a(display, i);
        if (a2 != null) {
            return L3.a(a2);
        }
        return -1;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
