package ca;

import da.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class t {
    public final da.j a;
    public b b;
    public final j.c c;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(da.i iVar, j.d dVar) {
            String str;
            if (t.a(t.this) == null) {
            }
            str = iVar.a;
            Q9.b.f("SensitiveContentChannel", "Received '" + str + "' message.");
            str.hashCode();
            switch (str) {
                case "SensitiveContent.getContentSensitivity":
                    try {
                        dVar.a(Integer.valueOf(t.c(t.this, t.a(t.this).a())));
                        break;
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        dVar.b("error", e.getMessage(), null);
                        return;
                    }
                case "SensitiveContent.setContentSensitivity":
                    try {
                        t.a(t.this).b(t.b(t.this, ((Integer) iVar.b()).intValue()));
                        break;
                    } catch (IllegalStateException | IllegalArgumentException e2) {
                        dVar.b("error", e2.getMessage(), null);
                        return;
                    }
                case "SensitiveContent.isSupported":
                    dVar.a(Boolean.valueOf(t.a(t.this).isSupported()));
                    break;
                default:
                    Q9.b.f("SensitiveContentChannel", "Method " + str + " is not implemented for the SensitiveContentChannel.");
                    dVar.c();
                    break;
            }
        }
    }

    public interface b {
        int a();

        void b(int i);

        boolean isSupported();
    }

    public t(T9.a aVar) {
        a aVar2 = new a();
        this.c = aVar2;
        da.j jVar = new da.j(aVar, "flutter/sensitivecontent", da.p.b);
        this.a = jVar;
        jVar.e(aVar2);
    }

    public static /* synthetic */ b a(t tVar) {
        return tVar.b;
    }

    public static /* synthetic */ int b(t tVar, int i) {
        return tVar.d(i);
    }

    public static /* synthetic */ int c(t tVar, int i) {
        return tVar.e(i);
    }

    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalArgumentException("contentSensitivityIndex " + i + " not known to the SensitiveContentChannel.");
    }

    public final int e(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 3;
            }
        }
        return i2;
    }

    public void f(b bVar) {
        this.b = bVar;
    }
}
