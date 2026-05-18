package org.apache.tika.parser.external;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.exception.TikaException;
import org.apache.tika.parser.CompositeParser;
import org.apache.tika.parser.Parser;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ExternalParsersFactory {
    public static void attachExternalParsers(TikaConfig tikaConfig) throws IOException, TikaException {
        attachExternalParsers(create(), tikaConfig);
    }

    public static List create() throws IOException, TikaException {
        return create(new ServiceLoader());
    }

    public static void attachExternalParsers(List list, TikaConfig tikaConfig) {
        Parser parser = tikaConfig.getParser();
        if (parser instanceof CompositeParser) {
            ((CompositeParser) parser).getParsers();
        }
    }

    public static List create(ServiceLoader serviceLoader) throws IOException, TikaException {
        return create("tika-external-parsers.xml", serviceLoader);
    }

    public static List create(String str, ServiceLoader serviceLoader) throws IOException, TikaException {
        return create((URL[]) Collections.list(serviceLoader.findServiceResources(ExternalParsersFactory.class.getPackage().getName().replace('.', '/') + "/" + str)).toArray(new URL[0]));
    }

    public static List create(URL... urlArr) throws IOException, TikaException {
        ArrayList arrayList = new ArrayList();
        for (URL url : urlArr) {
            InputStream openStream = url.openStream();
            try {
                arrayList.addAll(ExternalParsersConfigReader.read(openStream));
                if (openStream != null) {
                    openStream.close();
                }
            } catch (Throwable th) {
                if (openStream != null) {
                    try {
                        openStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return arrayList;
    }
}
