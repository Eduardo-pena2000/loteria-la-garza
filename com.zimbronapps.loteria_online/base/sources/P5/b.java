package p5;

import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.internal.Util;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class b implements EventListener.Factory {
    public final /* synthetic */ EventListener a;

    public /* synthetic */ b(EventListener eventListener) {
        this.a = eventListener;
    }

    public final EventListener create(Call call) {
        return Util.a(this.a, call);
    }
}
