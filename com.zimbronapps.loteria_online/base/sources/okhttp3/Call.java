package okhttp3;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface Call extends Cloneable {

    public interface Factory {
        Call a(Request request);
    }

    void N0(Callback callback);

    void cancel();

    Response execute();

    boolean isCanceled();
}
