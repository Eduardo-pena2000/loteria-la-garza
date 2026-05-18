package org.apache.tika.pipes.fetcher;

import com.applovin.shadow.okio.q;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.tika.config.ConfigBase;
import org.apache.tika.config.b;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class FetcherManager extends ConfigBase {
    private final Map fetcherMap = new ConcurrentHashMap();

    public FetcherManager(List list) throws TikaConfigException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fetcher fetcher = (Fetcher) it.next();
            String name = fetcher.getName();
            if (name == null || b.a(name)) {
                throw new TikaConfigException("fetcher name must not be blank");
            }
            if (this.fetcherMap.containsKey(fetcher.getName())) {
                throw new TikaConfigException("Multiple fetchers cannot support the same prefix: " + fetcher.getName());
            }
            this.fetcherMap.put(fetcher.getName(), fetcher);
        }
    }

    public static FetcherManager load(Path path) throws IOException, TikaConfigException {
        InputStream a = q.a(path, new OpenOption[0]);
        try {
            FetcherManager fetcherManager = (FetcherManager) ConfigBase.buildComposite("fetchers", FetcherManager.class, "fetcher", Fetcher.class, a);
            if (a != null) {
                a.close();
            }
            return fetcherManager;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Fetcher getFetcher(String str) throws IOException, TikaException {
        Fetcher fetcher = (Fetcher) this.fetcherMap.get(str);
        if (fetcher != null) {
            return fetcher;
        }
        throw new IllegalArgumentException("Can't find fetcher for fetcherName: " + str + ". I've loaded: " + String.valueOf(this.fetcherMap.keySet()));
    }

    public Set getSupported() {
        return this.fetcherMap.keySet();
    }

    public Fetcher getFetcher() {
        if (this.fetcherMap.size() != 0) {
            if (this.fetcherMap.size() <= 1) {
                Iterator it = this.fetcherMap.values().iterator();
                if (it.hasNext()) {
                    return (Fetcher) it.next();
                }
                throw new IllegalArgumentException("fetchers size must == 0");
            }
            throw new IllegalArgumentException("need to specify 'fetcherName' if > 1 fetchers are available");
        }
        throw new IllegalArgumentException("fetchers size must == 1 for the no arg call");
    }
}
