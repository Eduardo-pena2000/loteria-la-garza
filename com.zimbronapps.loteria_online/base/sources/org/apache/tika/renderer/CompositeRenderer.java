package org.apache.tika.renderer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.utils.ServiceLoaderUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class CompositeRenderer implements Renderer, Initializable {
    private Map rendererMap;

    public CompositeRenderer(ServiceLoader serviceLoader) {
        this(getDefaultRenderers(serviceLoader));
    }

    private static List getDefaultRenderers(ServiceLoader serviceLoader) {
        List loadStaticServiceProviders = serviceLoader.loadStaticServiceProviders(Renderer.class);
        ServiceLoaderUtils.sortLoadedClasses(loadStaticServiceProviders);
        return loadStaticServiceProviders;
    }

    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) throws TikaConfigException {
    }

    public Renderer getLeafRenderer(MediaType mediaType) {
        return (Renderer) this.rendererMap.get(mediaType);
    }

    public Set getSupportedTypes(ParseContext parseContext) {
        return this.rendererMap.keySet();
    }

    public void initialize(Map map) throws TikaConfigException {
    }

    public RenderResults render(InputStream inputStream, Metadata metadata, ParseContext parseContext, RenderRequest... renderRequestArr) throws IOException, TikaException {
        String str = metadata.get(TikaCoreProperties.TYPE);
        if (str == null) {
            throw new TikaException("need to specify file type in metadata");
        }
        MediaType parse = MediaType.parse(str);
        if (parse == null) {
            throw new TikaException("can't parse mediaType: " + str);
        }
        Renderer renderer = (Renderer) this.rendererMap.get(parse);
        if (renderer != null) {
            return renderer.render(inputStream, metadata, parseContext, renderRequestArr);
        }
        throw new TikaException("I regret I can't find a renderer for " + String.valueOf(parse));
    }

    public CompositeRenderer(List list) {
        this.rendererMap = new HashMap();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ParseContext parseContext = new ParseContext();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Renderer renderer = (Renderer) it.next();
            Iterator it2 = renderer.getSupportedTypes(parseContext).iterator();
            while (it2.hasNext()) {
                concurrentHashMap.put((MediaType) it2.next(), renderer);
            }
        }
        this.rendererMap = Collections.unmodifiableMap(concurrentHashMap);
    }
}
