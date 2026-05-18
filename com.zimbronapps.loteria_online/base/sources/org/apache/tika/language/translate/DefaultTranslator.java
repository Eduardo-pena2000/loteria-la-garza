package org.apache.tika.language.translate;

import Hb.a;
import java.io.IOException;
import java.util.List;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.exception.TikaException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DefaultTranslator implements Translator {
    private final transient ServiceLoader loader;

    public DefaultTranslator(ServiceLoader serviceLoader) {
        this.loader = serviceLoader;
    }

    private static List getDefaultTranslators(ServiceLoader serviceLoader) {
        List loadStaticServiceProviders = serviceLoader.loadStaticServiceProviders(Translator.class);
        loadStaticServiceProviders.sort(new a());
        return loadStaticServiceProviders;
    }

    private static Translator getFirstAvailable(ServiceLoader serviceLoader) {
        for (Translator translator : getDefaultTranslators(serviceLoader)) {
            if (translator.isAvailable()) {
                return translator;
            }
        }
        return null;
    }

    public Translator getTranslator() {
        return getFirstAvailable(this.loader);
    }

    public List getTranslators() {
        return getDefaultTranslators(this.loader);
    }

    public boolean isAvailable() {
        return getFirstAvailable(this.loader) != null;
    }

    public String translate(String str, String str2, String str3) throws TikaException, IOException {
        Translator firstAvailable = getFirstAvailable(this.loader);
        if (firstAvailable != null) {
            return firstAvailable.translate(str, str2, str3);
        }
        throw new TikaException("No translators currently available");
    }

    public DefaultTranslator() {
        this(new ServiceLoader());
    }

    public String translate(String str, String str2) throws TikaException, IOException {
        Translator firstAvailable = getFirstAvailable(this.loader);
        if (firstAvailable != null) {
            return firstAvailable.translate(str, str2);
        }
        throw new TikaException("No translators currently available");
    }
}
