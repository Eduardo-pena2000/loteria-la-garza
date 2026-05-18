package com.unity3d.services.core.domain.task;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.properties.SdkProperties;
import java.io.File;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;

@f(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2", f = "ConfigFileFromLocalStorage.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ConfigFileFromLocalStorage$doWork$2 extends l implements p {
    final /* synthetic */ ConfigFileFromLocalStorage.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigFileFromLocalStorage$doWork$2(ConfigFileFromLocalStorage.Params params, e eVar) {
        super(2, eVar);
        this.$params = params;
    }

    public final e create(Object obj, e eVar) {
        return new ConfigFileFromLocalStorage$doWork$2(this.$params, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((ConfigFileFromLocalStorage$doWork$2) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object b;
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        ConfigFileFromLocalStorage.Params params = this.$params;
        try {
            s.a aVar = s.b;
            File file = new File(SdkProperties.getLocalConfigurationFilepath());
            b = s.b(!file.exists() ? params.getDefaultConfiguration() : new Configuration(new JSONObject(Na.l.l(file, null, 1, null))));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(t.a(th));
        }
        if (s.h(b)) {
            b = s.b(b);
        } else {
            Throwable e2 = s.e(b);
            if (e2 != null) {
                b = s.b(t.a(e2));
            }
        }
        return s.a(b);
    }
}
