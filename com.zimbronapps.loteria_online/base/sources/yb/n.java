package Yb;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class n implements Wb.a {
    public volatile boolean a = false;
    public final Map b = new ConcurrentHashMap();
    public final LinkedBlockingQueue c = new LinkedBlockingQueue();

    public synchronized Wb.c a(String str) {
        m mVar;
        mVar = (m) this.b.get(str);
        if (mVar == null) {
            mVar = new m(str, this.c, this.a);
            this.b.put(str, mVar);
        }
        return mVar;
    }

    public void b() {
        this.b.clear();
        this.c.clear();
    }

    public LinkedBlockingQueue c() {
        return this.c;
    }

    public List d() {
        return new ArrayList(this.b.values());
    }

    public void e() {
        this.a = true;
    }
}
