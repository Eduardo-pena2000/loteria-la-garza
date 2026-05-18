package w8;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class q extends B7.m {
    public final a a;

    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        public final int a;

        a(int i) {
            this.a = i;
        }
    }

    public q(String str) {
        super(str);
        this.a = a.UNKNOWN;
    }

    public q(String str, Throwable th) {
        super(str, th);
        this.a = a.UNKNOWN;
    }

    public q(String str, a aVar) {
        super(str);
        this.a = aVar;
    }

    public q(String str, Throwable th, a aVar) {
        super(str, th);
        this.a = aVar;
    }
}
