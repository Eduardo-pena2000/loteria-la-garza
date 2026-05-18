package com.google.protobuf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class t implements O {
    public static final y b = new a();
    public final y a;

    public class a implements y {
        public x a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public boolean b(Class cls) {
            return false;
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ProtoSyntax.values().length];
            a = iArr;
            try {
                iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class c implements y {
        public y[] a;

        public c(y... yVarArr) {
            this.a = yVarArr;
        }

        public x a(Class cls) {
            for (y yVar : this.a) {
                if (yVar.b(cls)) {
                    return yVar.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class cls) {
            for (y yVar : this.a) {
                if (yVar.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public t() {
        this(c());
    }

    public static boolean b(x xVar) {
        return b.a[xVar.getSyntax().ordinal()] != 1;
    }

    public static y c() {
        return new c(n.c(), d());
    }

    public static y d() {
        try {
            return (y) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return b;
        }
    }

    public static N e(Class cls, x xVar) {
        return GeneratedMessageLite.class.isAssignableFrom(cls) ? b(xVar) ? A.Q(cls, xVar, E.b(), r.b(), P.L(), l.b(), w.b()) : A.Q(cls, xVar, E.b(), r.b(), P.L(), null, w.b()) : b(xVar) ? A.Q(cls, xVar, E.a(), r.a(), P.K(), l.a(), w.a()) : A.Q(cls, xVar, E.a(), r.a(), P.K(), null, w.a());
    }

    public N a(Class cls) {
        P.H(cls);
        x a2 = this.a.a(cls);
        return a2.a() ? GeneratedMessageLite.class.isAssignableFrom(cls) ? B.j(P.L(), l.b(), a2.b()) : B.j(P.K(), l.a(), a2.b()) : e(cls, a2);
    }

    public t(y yVar) {
        this.a = (y) Internal.checkNotNull(yVar, "messageInfoFactory");
    }
}
