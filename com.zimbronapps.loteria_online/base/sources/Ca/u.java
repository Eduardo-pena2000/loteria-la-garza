package ca;

import android.os.Build;
import android.util.DisplayMetrics;
import da.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class u {
    public final a a = new a();
    public final da.a b;

    public static class a {
        public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
        public b b;
        public b c;

        public class a implements a.e {
            public final /* synthetic */ b a;

            public a(b bVar) {
                this.a = bVar;
            }

            public void a(Object obj) {
                a.this.a.remove(this.a);
                if (a.this.a.isEmpty()) {
                    return;
                }
                Q9.b.b("SettingsChannel", "The queue becomes empty after removing config generation " + this.a.a);
            }
        }

        public static class b {
            public static int c = Integer.MIN_VALUE;
            public final int a;
            public final DisplayMetrics b;

            public b(DisplayMetrics displayMetrics) {
                int i = c;
                c = i + 1;
                this.a = i;
                this.b = displayMetrics;
            }

            public static /* synthetic */ DisplayMetrics a(b bVar) {
                return bVar.b;
            }
        }

        public a.e a(b bVar) {
            this.a.add(bVar);
            b bVar2 = this.c;
            this.c = bVar;
            if (bVar2 == null) {
                return null;
            }
            return new a(bVar2);
        }

        public b b(int i) {
            b bVar;
            if (this.b == null) {
                this.b = (b) this.a.poll();
            }
            while (true) {
                bVar = this.b;
                if (bVar == null || bVar.a >= i) {
                    break;
                }
                this.b = (b) this.a.poll();
            }
            if (bVar == null) {
                Q9.b.b("SettingsChannel", "Cannot find config with generation: " + i + ", after exhausting the queue.");
                return null;
            }
            if (bVar.a == i) {
                return bVar;
            }
            Q9.b.b("SettingsChannel", "Cannot find config with generation: " + i + ", the oldest config is now: " + this.b.a);
            return null;
        }
    }

    public class b {
        public Map a = new HashMap();
        public DisplayMetrics b;

        public b() {
        }

        public void a() {
            Q9.b.f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.a.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.a.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.a.get("platformBrightness"));
            DisplayMetrics displayMetrics = this.b;
            if (!u.b() || displayMetrics == null) {
                u.this.b.c(this.a);
                return;
            }
            a.b bVar = new a.b(displayMetrics);
            a.e a = u.this.a.a(bVar);
            this.a.put("configurationId", Integer.valueOf(bVar.a));
            u.this.b.d(this.a, a);
        }

        public b b(boolean z) {
            this.a.put("brieflyShowPassword", Boolean.valueOf(z));
            return this;
        }

        public b c(DisplayMetrics displayMetrics) {
            this.b = displayMetrics;
            return this;
        }

        public b d(boolean z) {
            this.a.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z));
            return this;
        }

        public b e(c cVar) {
            this.a.put("platformBrightness", cVar.a);
            return this;
        }

        public b f(float f) {
            this.a.put("textScaleFactor", Float.valueOf(f));
            return this;
        }

        public b g(boolean z) {
            this.a.put("alwaysUse24HourFormat", Boolean.valueOf(z));
            return this;
        }
    }

    public enum c {
        light("light"),
        dark("dark");

        public String a;

        c(String str) {
            this.a = str;
        }
    }

    public u(T9.a aVar) {
        this.b = new da.a(aVar, "flutter/settings", da.e.a);
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public DisplayMetrics a(int i) {
        a.b b2 = this.a.b(i);
        if (b2 == null) {
            return null;
        }
        return a.b.a(b2);
    }

    public b c() {
        return new b();
    }
}
