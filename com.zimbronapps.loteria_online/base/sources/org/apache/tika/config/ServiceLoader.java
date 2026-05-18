package org.apache.tika.config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.utils.ServiceLoaderUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ServiceLoader {
    private final boolean dynamic;
    private final LoadErrorHandler handler;
    private final InitializableProblemHandler initializableProblemHandler;
    private final ClassLoader loader;
    private static final Map SERVICES = new HashMap();
    private static final Pattern COMMENT = Pattern.compile("#.*");
    private static final Pattern WHITESPACE = Pattern.compile("\\s+");
    private static volatile ClassLoader CONTEXT_CLASS_LOADER = null;

    public static class RankedService implements Comparable {
        private final int rank;
        private final Object service;

        public RankedService(Object obj, int i) {
            this.service = obj;
            this.rank = i;
        }

        public static /* bridge */ /* synthetic */ Object a(RankedService rankedService) {
            return rankedService.service;
        }

        public boolean isInstanceOf(Class cls) {
            return cls.isAssignableFrom(this.service.getClass());
        }

        public int compareTo(RankedService rankedService) {
            return rankedService.rank - this.rank;
        }
    }

    public ServiceLoader(ClassLoader classLoader, LoadErrorHandler loadErrorHandler, InitializableProblemHandler initializableProblemHandler, boolean z) {
        this.loader = classLoader;
        this.handler = loadErrorHandler;
        this.initializableProblemHandler = initializableProblemHandler;
        this.dynamic = z;
    }

    public static void addService(Object obj, Object obj2, int i) {
        Map map = SERVICES;
        synchronized (map) {
            map.put(obj, new RankedService(obj2, i));
        }
    }

    private void collectServiceClassNames(URL url, Collection collection) throws IOException {
        InputStream openStream = url.openStream();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openStream, StandardCharsets.UTF_8));
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    String replaceAll = WHITESPACE.matcher(COMMENT.matcher(readLine).replaceFirst("")).replaceAll("");
                    if (replaceAll.length() > 0) {
                        collection.add(replaceAll);
                    }
                }
                bufferedReader.close();
                if (openStream != null) {
                    openStream.close();
                }
            } finally {
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

    public static ClassLoader getContextClassLoader() {
        ClassLoader classLoader = CONTEXT_CLASS_LOADER;
        if (classLoader == null) {
            classLoader = ServiceLoader.class.getClassLoader();
        }
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    public static Object removeService(Object obj) {
        Object remove;
        Map map = SERVICES;
        synchronized (map) {
            remove = map.remove(obj);
        }
        return remove;
    }

    public static void setContextClassLoader(ClassLoader classLoader) {
        CONTEXT_CLASS_LOADER = classLoader;
    }

    public Enumeration findServiceResources(String str) {
        try {
            return this.loader.getResources(str);
        } catch (IOException unused) {
            return Collections.enumeration(Collections.emptyList());
        }
    }

    public InitializableProblemHandler getInitializableProblemHandler() {
        return this.initializableProblemHandler;
    }

    public LoadErrorHandler getLoadErrorHandler() {
        return this.handler;
    }

    public ClassLoader getLoader() {
        return this.loader;
    }

    public InputStream getResourceAsStream(String str) {
        ClassLoader classLoader = this.loader;
        if (classLoader != null) {
            return classLoader.getResourceAsStream(str);
        }
        return null;
    }

    public Class getServiceClass(Class cls, String str) throws ClassNotFoundException {
        ClassLoader classLoader = this.loader;
        if (classLoader == null) {
            throw new ClassNotFoundException("Service class " + str + " is not available");
        }
        Class cls2 = Class.forName(str, true, classLoader);
        if (cls2.isInterface()) {
            throw new ClassNotFoundException("Service class " + str + " is an interface");
        }
        if (cls.isAssignableFrom(cls2)) {
            return cls2;
        }
        throw new ClassNotFoundException("Service class " + str + " does not implement " + cls.getName());
    }

    public List identifyStaticServiceProviders(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (this.loader != null) {
            String name = cls.getName();
            Iterator it = Collections.list(findServiceResources("META-INF/services/" + name)).iterator();
            while (it.hasNext()) {
                try {
                    collectServiceClassNames((URL) it.next(), arrayList);
                } catch (IOException e) {
                    this.handler.handleLoadError(name, e);
                }
            }
        }
        return arrayList;
    }

    public boolean isDynamic() {
        return this.dynamic;
    }

    public List loadDynamicServiceProviders(Class cls) {
        ArrayList arrayList;
        if (!this.dynamic) {
            return Collections.EMPTY_LIST;
        }
        Map map = SERVICES;
        synchronized (map) {
            try {
                ArrayList<RankedService> arrayList2 = new ArrayList(map.values());
                Collections.sort(arrayList2);
                arrayList = new ArrayList(arrayList2.size());
                for (RankedService rankedService : arrayList2) {
                    if (rankedService.isInstanceOf(cls)) {
                        arrayList.add(RankedService.a(rankedService));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public List loadServiceProviders(Class cls) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(loadDynamicServiceProviders(cls));
        arrayList.addAll(loadStaticServiceProviders(cls));
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Object obj : arrayList) {
            if (!hashSet.contains(obj.getClass().getCanonicalName())) {
                arrayList2.add(obj);
                hashSet.add(obj.getClass().getCanonicalName());
            }
        }
        return arrayList2;
    }

    public List loadStaticServiceProviders(Class cls) {
        return loadStaticServiceProviders(cls, Collections.EMPTY_SET);
    }

    public List loadStaticServiceProviders(Class cls, Collection collection) {
        Class loadClass;
        ArrayList arrayList = new ArrayList();
        if (this.loader != null) {
            for (String str : identifyStaticServiceProviders(cls)) {
                try {
                    loadClass = this.loader.loadClass(str);
                } catch (Throwable th) {
                    this.handler.handleLoadError(str, th);
                }
                if (!cls.isAssignableFrom(loadClass)) {
                    throw new TikaConfigException("Class " + str + " is not of type: " + String.valueOf(cls));
                }
                Iterator it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Class) it.next()).isAssignableFrom(loadClass)) {
                            break;
                        }
                    } else {
                        Object newInstance = ServiceLoaderUtils.newInstance(loadClass, this);
                        if (newInstance instanceof Initializable) {
                            ((Initializable) newInstance).initialize(Collections.EMPTY_MAP);
                            ((Initializable) newInstance).checkInitialization(this.initializableProblemHandler);
                        }
                        arrayList.add(newInstance);
                    }
                }
            }
        }
        return arrayList;
    }

    public ServiceLoader(ClassLoader classLoader, LoadErrorHandler loadErrorHandler, boolean z) {
        this(classLoader, loadErrorHandler, InitializableProblemHandler.WARN, z);
    }

    public ServiceLoader(ClassLoader classLoader, LoadErrorHandler loadErrorHandler) {
        this(classLoader, loadErrorHandler, false);
    }

    public ServiceLoader(ClassLoader classLoader) {
        this(classLoader, Boolean.getBoolean("org.apache.tika.service.error.warn") ? LoadErrorHandler.WARN : LoadErrorHandler.IGNORE);
    }

    public ServiceLoader() {
        this(getContextClassLoader(), Boolean.getBoolean("org.apache.tika.service.error.warn") ? LoadErrorHandler.WARN : LoadErrorHandler.IGNORE, true);
    }
}
