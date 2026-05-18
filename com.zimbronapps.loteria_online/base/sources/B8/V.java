package B8;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class v {
    public static final a c = new a(null);
    public final String a;
    public final String b;

    public static final class a {

        public static final class a extends Ia.d {
            public Object a;
            public /* synthetic */ Object b;
            public int d;

            public a(Ga.e eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(m8.h r9, Ga.e r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof B8.v.a.a
                if (r0 == 0) goto L13
                r0 = r10
                B8.v$a$a r0 = (B8.v.a.a) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                B8.v$a$a r0 = new B8.v$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.b
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.d
                java.lang.String r3 = "FirebaseSessions"
                r4 = 2
                r5 = 1
                java.lang.String r6 = ""
                if (r2 == 0) goto L48
                if (r2 == r5) goto L3e
                if (r2 != r4) goto L36
                java.lang.Object r9 = r0.a
                java.lang.String r9 = (java.lang.String) r9
                Ca.t.b(r10)     // Catch: java.lang.Exception -> L34
                goto L85
            L34:
                r10 = move-exception
                goto L8c
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.a
                m8.h r9 = (m8.h) r9
                Ca.t.b(r10)     // Catch: java.lang.Exception -> L46
                goto L60
            L46:
                r10 = move-exception
                goto L6a
            L48:
                Ca.t.b(r10)
                r10 = 0
                com.google.android.gms.tasks.Task r10 = r9.a(r10)     // Catch: java.lang.Exception -> L46
                java.lang.String r2 = "getToken(...)"
                kotlin.jvm.internal.t.f(r10, r2)     // Catch: java.lang.Exception -> L46
                r0.a = r9     // Catch: java.lang.Exception -> L46
                r0.d = r5     // Catch: java.lang.Exception -> L46
                java.lang.Object r10 = mb.b.a(r10, r0)     // Catch: java.lang.Exception -> L46
                if (r10 != r1) goto L60
                return r1
            L60:
                m8.m r10 = (m8.m) r10     // Catch: java.lang.Exception -> L46
                java.lang.String r10 = r10.b()     // Catch: java.lang.Exception -> L46
                r7 = r10
                r10 = r9
                r9 = r7
                goto L71
            L6a:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r3, r2, r10)
                r10 = r9
                r9 = r6
            L71:
                com.google.android.gms.tasks.Task r10 = r10.getId()     // Catch: java.lang.Exception -> L34
                java.lang.String r2 = "getId(...)"
                kotlin.jvm.internal.t.f(r10, r2)     // Catch: java.lang.Exception -> L34
                r0.a = r9     // Catch: java.lang.Exception -> L34
                r0.d = r4     // Catch: java.lang.Exception -> L34
                java.lang.Object r10 = mb.b.a(r10, r0)     // Catch: java.lang.Exception -> L34
                if (r10 != r1) goto L85
                return r1
            L85:
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34
                if (r10 != 0) goto L8a
                goto L91
            L8a:
                r6 = r10
                goto L91
            L8c:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r3, r0, r10)
            L91:
                B8.v r10 = new B8.v
                r0 = 0
                r10.<init>(r6, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: B8.v.a.a(m8.h, Ga.e):java.lang.Object");
        }

        public a() {
        }
    }

    public /* synthetic */ v(String str, String str2, kotlin.jvm.internal.k kVar) {
        this(str, str2);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public v(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
