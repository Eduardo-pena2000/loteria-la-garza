package org.apache.tika.pipes.emitter;

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
import org.apache.tika.exception.TikaConfigException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class EmitterManager extends ConfigBase {
    private final Map emitterMap = new ConcurrentHashMap();

    private EmitterManager() {
    }

    public static EmitterManager load(Path path) throws IOException, TikaConfigException {
        InputStream a = q.a(path, new OpenOption[0]);
        try {
            EmitterManager emitterManager = (EmitterManager) ConfigBase.buildComposite("emitters", EmitterManager.class, "emitter", Emitter.class, a);
            if (a != null) {
                a.close();
            }
            return emitterManager;
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

    public Emitter getEmitter(String str) {
        Emitter emitter = (Emitter) this.emitterMap.get(str);
        if (emitter != null) {
            return emitter;
        }
        throw new IllegalArgumentException("Can't find emitter for prefix: " + str);
    }

    public Set getSupported() {
        return this.emitterMap.keySet();
    }

    public EmitterManager(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Emitter emitter = (Emitter) it.next();
            if (!this.emitterMap.containsKey(emitter.getName())) {
                this.emitterMap.put(emitter.getName(), emitter);
            } else {
                throw new IllegalArgumentException("Multiple emitters cannot support the same name: " + emitter.getName());
            }
        }
    }

    public Emitter getEmitter() {
        if (this.emitterMap.size() != 0) {
            if (this.emitterMap.size() <= 1) {
                Iterator it = this.emitterMap.values().iterator();
                if (it.hasNext()) {
                    return (Emitter) it.next();
                }
                throw new IllegalArgumentException("emitters size must == 0");
            }
            throw new IllegalArgumentException("need to specify 'emitterName' if > 1 emitters are available");
        }
        throw new IllegalArgumentException("emitters size must == 1 for the no arg call");
    }
}
