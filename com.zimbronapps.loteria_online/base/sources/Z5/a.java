package z5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class a implements f8.a {
    public static final f8.a a = new a();

    public static final class a implements e8.e {
        public static final a a = new a();
        public static final e8.d b = e8.d.a("window").b(h8.a.b().c(1).a()).a();
        public static final e8.d c = e8.d.a("logSourceMetrics").b(h8.a.b().c(2).a()).a();
        public static final e8.d d = e8.d.a("globalMetrics").b(h8.a.b().c(3).a()).a();
        public static final e8.d e = e8.d.a("appNamespace").b(h8.a.b().c(4).a()).a();

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5.a aVar, e8.f fVar) {
            fVar.b(b, aVar.d());
            fVar.b(c, aVar.c());
            fVar.b(d, aVar.b());
            fVar.b(e, aVar.a());
        }
    }

    public static final class b implements e8.e {
        public static final b a = new b();
        public static final e8.d b = e8.d.a("storageMetrics").b(h8.a.b().c(1).a()).a();

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5.b bVar, e8.f fVar) {
            fVar.b(b, bVar.a());
        }
    }

    public static final class c implements e8.e {
        public static final c a = new c();
        public static final e8.d b = e8.d.a("eventsDroppedCount").b(h8.a.b().c(1).a()).a();
        public static final e8.d c = e8.d.a("reason").b(h8.a.b().c(3).a()).a();

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5.c cVar, e8.f fVar) {
            fVar.e(b, cVar.a());
            fVar.b(c, cVar.b());
        }
    }

    public static final class d implements e8.e {
        public static final d a = new d();
        public static final e8.d b = e8.d.a("logSource").b(h8.a.b().c(1).a()).a();
        public static final e8.d c = e8.d.a("logEventDropped").b(h8.a.b().c(2).a()).a();

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5.d dVar, e8.f fVar) {
            fVar.b(b, dVar.b());
            fVar.b(c, dVar.a());
        }
    }

    public static final class e implements e8.e {
        public static final e a = new e();
        public static final e8.d b = e8.d.d("clientMetrics");

        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.b.a(obj);
            b(null, (e8.f) obj2);
        }

        public void b(m mVar, e8.f fVar) {
            throw null;
        }
    }

    public static final class f implements e8.e {
        public static final f a = new f();
        public static final e8.d b = e8.d.a("currentCacheSizeBytes").b(h8.a.b().c(1).a()).a();
        public static final e8.d c = e8.d.a("maxCacheSizeBytes").b(h8.a.b().c(2).a()).a();

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5.e eVar, e8.f fVar) {
            fVar.e(b, eVar.a());
            fVar.e(c, eVar.b());
        }
    }

    public static final class g implements e8.e {
        public static final g a = new g();
        public static final e8.d b = e8.d.a("startMs").b(h8.a.b().c(1).a()).a();
        public static final e8.d c = e8.d.a("endMs").b(h8.a.b().c(2).a()).a();

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5.f fVar, e8.f fVar2) {
            fVar2.e(b, fVar.b());
            fVar2.e(c, fVar.a());
        }
    }

    public void a(f8.b bVar) {
        bVar.a(m.class, e.a);
        bVar.a(C5.a.class, a.a);
        bVar.a(C5.f.class, g.a);
        bVar.a(C5.d.class, d.a);
        bVar.a(C5.c.class, c.a);
        bVar.a(C5.b.class, b.a);
        bVar.a(C5.e.class, f.a);
    }
}
