package org.apache.tika.pipes;

import Wb.e;
import com.applovin.shadow.okio.q;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import org.apache.tika.exception.TikaConfigException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class PipesConfig extends PipesConfigBase {
    private static final Wb.c LOG = e.l(PipesClient.class);
    private long maxWaitForClientMillis = 60000;

    private PipesConfig() {
    }

    public static PipesConfig load(Path path) throws IOException, TikaConfigException {
        PipesConfig pipesConfig = new PipesConfig();
        InputStream a = q.a(path, new OpenOption[0]);
        try {
            pipesConfig.configure("pipes", a);
            if (a != null) {
                a.close();
            }
            if (pipesConfig.getTikaConfig() == null) {
                LOG.t("A separate tikaConfig was not specified in the <pipes/> element in the  config file; will use {} for pipes", path);
                pipesConfig.setTikaConfig(path);
            }
            return pipesConfig;
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

    public long getMaxWaitForClientMillis() {
        return this.maxWaitForClientMillis;
    }

    public void setMaxWaitForClientMillis(long j) {
        this.maxWaitForClientMillis = j;
    }

    public static PipesConfig load(InputStream inputStream) throws IOException, TikaConfigException {
        PipesConfig pipesConfig = new PipesConfig();
        pipesConfig.configure("pipes", inputStream);
        return pipesConfig;
    }
}
