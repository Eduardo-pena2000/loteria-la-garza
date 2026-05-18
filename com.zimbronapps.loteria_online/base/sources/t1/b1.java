package T1;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b1 {
    public final g a;

    public static class a extends g {
        public final Window a;
        public final N b;

        public a(Window window, N n) {
            this.a = window;
            this.b = n;
        }

        public void c(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void d(int i) {
            this.a.addFlags(i);
        }

        public void e(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public void f(int i) {
            this.a.clearFlags(i);
        }
    }

    public static class b extends a {
        public b(Window window, N n) {
            super(window, n);
        }

        public void b(boolean z) {
            if (!z) {
                e(8192);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(8192);
        }
    }

    public static class c extends b {
        public c(Window window, N n) {
            super(window, n);
        }

        public void a(boolean z) {
            if (!z) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    public static class e extends d {
        public e(Window window, b1 b1Var, N n) {
            super(window, b1Var, n);
        }
    }

    public static class f extends e {
        public f(Window window, b1 b1Var, N n) {
            super(window, b1Var, n);
        }
    }

    public b1(Window window, View view) {
        N n = new N(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new f(window, this, n);
            return;
        }
        if (i >= 30) {
            this.a = new d(window, this, n);
        } else if (i >= 26) {
            this.a = new c(window, n);
        } else {
            this.a = new b(window, n);
        }
    }

    public void a(boolean z) {
        this.a.a(z);
    }

    public void b(boolean z) {
        this.a.b(z);
    }

    public static class d extends g {
        public final b1 a;
        public final WindowInsetsController b;
        public final N c;
        public final w.i0 d;
        public Window e;

        public d(Window window, b1 b1Var, N n) {
            this(c1.a(window), b1Var, n);
            this.e = window;
        }

        public void a(boolean z) {
            if (z) {
                if (this.e != null) {
                    c(16);
                }
                d1.a(this.b, 16, 16);
            } else {
                if (this.e != null) {
                    d(16);
                }
                d1.a(this.b, 0, 16);
            }
        }

        public void b(boolean z) {
            if (z) {
                if (this.e != null) {
                    c(8192);
                }
                d1.a(this.b, 8, 8);
            } else {
                if (this.e != null) {
                    d(8192);
                }
                d1.a(this.b, 0, 8);
            }
        }

        public void c(int i) {
            View decorView = this.e.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void d(int i) {
            View decorView = this.e.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, b1 b1Var, N n) {
            this.d = new w.i0();
            this.b = windowInsetsController;
            this.a = b1Var;
            this.c = n;
        }
    }

    public static class g {
        public abstract void b(boolean z);

        public void a(boolean z) {
        }
    }
}
