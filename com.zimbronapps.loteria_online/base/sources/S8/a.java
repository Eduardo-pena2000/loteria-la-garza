package s8;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class a implements f8.a {
    public static final f8.a a = new a();

    public static final class a implements e8.e {
        public static final a a = new a();
        public static final e8.d b = e8.d.a("projectNumber").b(h8.a.b().c(1).a()).a();
        public static final e8.d c = e8.d.a("messageId").b(h8.a.b().c(2).a()).a();
        public static final e8.d d = e8.d.a("instanceId").b(h8.a.b().c(3).a()).a();
        public static final e8.d e = e8.d.a("messageType").b(h8.a.b().c(4).a()).a();
        public static final e8.d f = e8.d.a("sdkPlatform").b(h8.a.b().c(5).a()).a();
        public static final e8.d g = e8.d.a("packageName").b(h8.a.b().c(6).a()).a();
        public static final e8.d h = e8.d.a("collapseKey").b(h8.a.b().c(7).a()).a();
        public static final e8.d i = e8.d.a("priority").b(h8.a.b().c(8).a()).a();
        public static final e8.d j = e8.d.a("ttl").b(h8.a.b().c(9).a()).a();
        public static final e8.d k = e8.d.a("topic").b(h8.a.b().c(10).a()).a();
        public static final e8.d l = e8.d.a("bulkId").b(h8.a.b().c(11).a()).a();
        public static final e8.d m = e8.d.a("event").b(h8.a.b().c(12).a()).a();
        public static final e8.d n = e8.d.a("analyticsLabel").b(h8.a.b().c(13).a()).a();
        public static final e8.d o = e8.d.a("campaignId").b(h8.a.b().c(14).a()).a();
        public static final e8.d p = e8.d.a("composerLabel").b(h8.a.b().c(15).a()).a();

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(t8.a aVar, e8.f fVar) {
            fVar.e(b, aVar.l());
            fVar.b(c, aVar.h());
            fVar.b(d, aVar.g());
            fVar.b(e, aVar.i());
            fVar.b(f, aVar.m());
            fVar.b(g, aVar.j());
            fVar.b(h, aVar.d());
            fVar.d(i, aVar.k());
            fVar.d(j, aVar.o());
            fVar.b(k, aVar.n());
            fVar.e(l, aVar.b());
            fVar.b(m, aVar.f());
            fVar.b(n, aVar.a());
            fVar.e(o, aVar.c());
            fVar.b(p, aVar.e());
        }
    }

    public static final class b implements e8.e {
        public static final b a = new b();
        public static final e8.d b = e8.d.a("messagingClientEvent").b(h8.a.b().c(1).a()).a();

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(t8.b bVar, e8.f fVar) {
            fVar.b(b, bVar.a());
        }
    }

    public static final class c implements e8.e {
        public static final c a = new c();
        public static final e8.d b = e8.d.d("messagingClientEventExtension");

        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.b.a(obj);
            b(null, (e8.f) obj2);
        }

        public void b(K k, e8.f fVar) {
            throw null;
        }
    }

    public void a(f8.b bVar) {
        bVar.a(K.class, c.a);
        bVar.a(t8.b.class, b.a);
        bVar.a(t8.a.class, a.a);
    }
}
