package androidx.lifecycle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k {
    private androidx.lifecycle.b internalScopeRef = new androidx.lifecycle.b(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Ja.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Companion;
        public static final a ON_CREATE = new a("ON_CREATE", 0);
        public static final a ON_START = new a("ON_START", 1);
        public static final a ON_RESUME = new a("ON_RESUME", 2);
        public static final a ON_PAUSE = new a("ON_PAUSE", 3);
        public static final a ON_STOP = new a("ON_STOP", 4);
        public static final a ON_DESTROY = new a("ON_DESTROY", 5);
        public static final a ON_ANY = new a("ON_ANY", 6);

        public static final class a {

            public static final /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.c.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.d.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.e.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.a.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.b.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    a = iArr;
                }
            }

            public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final a a(b bVar) {
                kotlin.jvm.internal.t.g(bVar, "state");
                int i = a.a[bVar.ordinal()];
                if (i == 1) {
                    return a.ON_DESTROY;
                }
                if (i == 2) {
                    return a.ON_STOP;
                }
                if (i != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b bVar) {
                kotlin.jvm.internal.t.g(bVar, "state");
                int i = a.a[bVar.ordinal()];
                if (i == 1) {
                    return a.ON_START;
                }
                if (i == 2) {
                    return a.ON_RESUME;
                }
                if (i != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public final a c(b bVar) {
                kotlin.jvm.internal.t.g(bVar, "state");
                int i = a.a[bVar.ordinal()];
                if (i == 1) {
                    return a.ON_CREATE;
                }
                if (i == 2) {
                    return a.ON_START;
                }
                if (i != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            public a() {
            }
        }

        public static final /* synthetic */ class b {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                a = iArr;
            }
        }

        static {
            a[] a2 = a();
            $VALUES = a2;
            $ENTRIES = Ja.b.a(a2);
            Companion = new a(null);
        }

        public a(String str, int i) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
        }

        public static final a b(b bVar) {
            return Companion.a(bVar);
        }

        public static final a d(b bVar) {
            return Companion.c(bVar);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final b c() {
            switch (b.a[ordinal()]) {
                case 1:
                case 2:
                    return b.c;
                case 3:
                case 4:
                    return b.d;
                case 5:
                    return b.e;
                case 6:
                    return b.a;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new Ca.o();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a = new b("DESTROYED", 0);
        public static final b b = new b("INITIALIZED", 1);
        public static final b c = new b("CREATED", 2);
        public static final b d = new b("STARTED", 3);
        public static final b e = new b("RESUMED", 4);
        public static final /* synthetic */ b[] f;
        public static final /* synthetic */ Ja.a g;

        static {
            b[] a2 = a();
            f = a2;
            g = Ja.b.a(a2);
        }

        public b(String str, int i) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{a, b, c, d, e};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f.clone();
        }

        public final boolean b(b bVar) {
            kotlin.jvm.internal.t.g(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    public static /* synthetic */ void a(fb.z zVar, r rVar, a aVar) {
        b(zVar, rVar, aVar);
    }

    public static final void b(fb.z zVar, r rVar, a aVar) {
        kotlin.jvm.internal.t.g(rVar, "<unused var>");
        kotlin.jvm.internal.t.g(aVar, "event");
        zVar.setValue(aVar.c());
    }

    public abstract void addObserver(q qVar);

    public abstract b getCurrentState();

    public fb.N getCurrentStateFlow() {
        fb.z a2 = fb.P.a(getCurrentState());
        addObserver(new j(a2));
        return fb.g.b(a2);
    }

    public final androidx.lifecycle.b getInternalScopeRef() {
        return this.internalScopeRef;
    }

    public abstract void removeObserver(q qVar);

    public final void setInternalScopeRef(androidx.lifecycle.b bVar) {
        kotlin.jvm.internal.t.g(bVar, "<set-?>");
        this.internalScopeRef = bVar;
    }
}
