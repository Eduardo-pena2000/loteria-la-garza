package j5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u {
    public static final u a = new u();
    public static Qa.a b = a.a;

    public /* synthetic */ class a extends kotlin.jvm.internal.q implements Qa.a {
        public static final a a = new a();

        public a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public final long a() {
        return ((Number) b.invoke()).longValue();
    }
}
