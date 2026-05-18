package okhttp3;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface Interceptor {

    public interface Chain {
        Response a(Request request);

        Call call();

        Request request();
    }

    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    Response a(Chain chain);
}
