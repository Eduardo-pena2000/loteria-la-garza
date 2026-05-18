package o2;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h {
    public static final a a = new a(null);

    public static final class a {

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ List c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list, Ga.e eVar) {
                super(2, eVar);
                this.c = list;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(s sVar, Ga.e eVar) {
                return create(sVar, eVar).invokeSuspend(Ca.I.a);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                a aVar = new a(this.c, eVar);
                aVar.b = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    s sVar = (s) this.b;
                    a aVar = h.a;
                    List list = this.c;
                    this.a = 1;
                    if (a.a(aVar, list, sVar, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ca.t.b(obj);
                }
                return Ca.I.a;
            }
        }

        public static final class b extends Ia.d {
            public Object a;
            public Object b;
            public /* synthetic */ Object c;
            public int e;

            public b(Ga.e eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return a.a(a.this, null, null, this);
            }
        }

        public static final class c extends Ia.l implements Qa.p {
            public Object a;
            public Object b;
            public Object c;
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ List f;
            public final /* synthetic */ List g;

            public static final class a extends Ia.l implements Qa.l {
                public int a;
                public final /* synthetic */ g b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(g gVar, Ga.e eVar) {
                    super(1, eVar);
                    this.b = gVar;
                }

                public final Ga.e create(Ga.e eVar) {
                    return new a(this.b, eVar);
                }

                public final Object invoke(Ga.e eVar) {
                    return create(eVar).invokeSuspend(Ca.I.a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f = Ha.c.f();
                    int i = this.a;
                    if (i == 0) {
                        Ca.t.b(obj);
                        g gVar = this.b;
                        this.a = 1;
                        if (gVar.cleanUp(this) == f) {
                            return f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Ca.t.b(obj);
                    }
                    return Ca.I.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list, List list2, Ga.e eVar) {
                super(2, eVar);
                this.f = list;
                this.g = list2;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, Ga.e eVar) {
                return create(obj, eVar).invokeSuspend(Ca.I.a);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                c cVar = new c(this.f, this.g, eVar);
                cVar.e = obj;
                return cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = Ha.c.f()
                    int r1 = r9.d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.e
                    java.util.List r4 = (java.util.List) r4
                    Ca.t.b(r10)
                    goto L44
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.c
                    java.lang.Object r4 = r9.b
                    o2.g r4 = (o2.g) r4
                    java.lang.Object r5 = r9.a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.e
                    java.util.List r6 = (java.util.List) r6
                    Ca.t.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L66
                L37:
                    Ca.t.b(r10)
                    java.lang.Object r10 = r9.e
                    java.util.List r1 = r9.f
                    java.util.List r4 = r9.g
                    java.util.Iterator r1 = r1.iterator()
                L44:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8c
                    java.lang.Object r5 = r1.next()
                    o2.g r5 = (o2.g) r5
                    r9.e = r4
                    r9.a = r1
                    r9.b = r5
                    r9.c = r10
                    r9.d = r3
                    java.lang.Object r6 = r5.shouldMigrate(r10, r9)
                    if (r6 != r0) goto L61
                    return r0
                L61:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L66:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8a
                    o2.h$a$c$a r10 = new o2.h$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.e = r4
                    r9.a = r5
                    r9.b = r7
                    r9.c = r7
                    r9.d = r2
                    java.lang.Object r10 = r6.migrate(r1, r9)
                    if (r10 != r0) goto L88
                    return r0
                L88:
                    r1 = r5
                    goto L44
                L8a:
                    r10 = r1
                    goto L88
                L8c:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: o2.h.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static final /* synthetic */ Object a(a aVar, List list, s sVar, Ga.e eVar) {
            return aVar.c(list, sVar, eVar);
        }

        public final Qa.p b(List list) {
            kotlin.jvm.internal.t.g(list, "migrations");
            return new a(list, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0086 -> B:13:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0089 -> B:13:0x0069). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(java.util.List r7, o2.s r8, Ga.e r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof o2.h.a.b
                if (r0 == 0) goto L13
                r0 = r9
                o2.h$a$b r0 = (o2.h.a.b) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                o2.h$a$b r0 = new o2.h$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.c
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.a
                kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
                Ca.t.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L69
            L34:
                r9 = move-exception
                goto L82
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.a
                java.util.List r7 = (java.util.List) r7
                Ca.t.b(r9)
                goto L60
            L46:
                Ca.t.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                o2.h$a$c r2 = new o2.h$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.a = r9
                r0.e = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r7 = r9
            L60:
                kotlin.jvm.internal.O r8 = new kotlin.jvm.internal.O
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L69:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L92
                java.lang.Object r9 = r7.next()
                Qa.l r9 = (Qa.l) r9
                r0.a = r8     // Catch: java.lang.Throwable -> L34
                r0.b = r7     // Catch: java.lang.Throwable -> L34
                r0.e = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L69
                return r1
            L82:
                java.lang.Object r2 = r8.a
                if (r2 != 0) goto L89
                r8.a = r9
                goto L69
            L89:
                kotlin.jvm.internal.t.d(r2)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                Ca.g.a(r2, r9)
                goto L69
            L92:
                java.lang.Object r7 = r8.a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9b
                Ca.I r7 = Ca.I.a
                return r7
            L9b:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o2.h.a.c(java.util.List, o2.s, Ga.e):java.lang.Object");
        }

        public a() {
        }
    }
}
