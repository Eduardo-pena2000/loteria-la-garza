package org.apache.tika.config;

import B8.m;
import Wb.e;
import com.applovin.shadow.okio.F;
import com.applovin.shadow.okio.q;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.concurrent.ConfigurableThreadPoolExecutor;
import org.apache.tika.concurrent.SimpleThreadPoolExecutor;
import org.apache.tika.detect.CompositeDetector;
import org.apache.tika.detect.CompositeEncodingDetector;
import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.DefaultEncodingDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.detect.EncodingDetector;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.language.translate.DefaultTranslator;
import org.apache.tika.language.translate.Translator;
import org.apache.tika.metadata.filter.MetadataFilter;
import org.apache.tika.metadata.filter.NoOpFilter;
import org.apache.tika.metadata.listfilter.MetadataListFilter;
import org.apache.tika.metadata.listfilter.NoOpListFilter;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.mime.MimeTypeException;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.mime.MimeTypesFactory;
import org.apache.tika.parser.AbstractEncodingDetectorParser;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.AutoDetectParserConfig;
import org.apache.tika.parser.CompositeParser;
import org.apache.tika.parser.DefaultParser;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.ParserDecorator;
import org.apache.tika.parser.RenderingParser;
import org.apache.tika.parser.multiple.AbstractMultipleParser;
import org.apache.tika.renderer.CompositeRenderer;
import org.apache.tika.renderer.Renderer;
import org.apache.tika.utils.AnnotationUtils;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class TikaConfig {
    public static int DEFAULT_MAX_JSON_STRING_FIELD_LENGTH = 20000000;
    private static int MAX_JSON_STRING_FIELD_LENGTH = 0;
    public static String MAX_JSON_STRING_FIELD_LENGTH_ELEMENT_NAME = "maxJsonStringFieldLength";
    private static final Map strategyMap;
    private final AutoDetectParserConfig autoDetectParserConfig;
    private final CompositeDetector detector;
    private final EncodingDetector encodingDetector;
    private final ExecutorService executorService;
    private final MetadataFilter metadataFilter;
    private final MetadataListFilter metadataListFilter;
    private final MimeTypes mimeTypes;
    private final CompositeParser parser;
    private final Renderer renderer;
    private final ServiceLoader serviceLoader;
    private final Translator translator;
    protected static final AtomicInteger TIMES_INSTANTIATED = new AtomicInteger();
    private static final Wb.c LOG = e.l(TikaConfig.class);

    public static class DetectorXmlLoader extends XmlLoader {
        public /* synthetic */ DetectorXmlLoader(c cVar) {
            this();
        }

        public Detector decorate(Detector detector, Element element) {
            return detector;
        }

        public Class getLoaderClass() {
            return Detector.class;
        }

        public String getLoaderTagName() {
            return "detector";
        }

        public String getParentTagName() {
            return "detectors";
        }

        public boolean supportsComposite() {
            return true;
        }

        private DetectorXmlLoader() {
            super(null);
        }

        public CompositeDetector createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.getDefaultDetector(mimeTypes, serviceLoader);
        }

        public boolean isComposite(Detector detector) {
            return detector instanceof CompositeDetector;
        }

        public Detector preLoadOne(Class cls, String str, MimeTypes mimeTypes) {
            if (MimeTypes.class.equals(cls)) {
                return mimeTypes;
            }
            return null;
        }

        public CompositeDetector createComposite(List list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return new CompositeDetector(mimeTypes.getMediaTypeRegistry(), list);
        }

        public boolean isComposite(Class cls) {
            return CompositeDetector.class.isAssignableFrom(cls);
        }

        public Detector createComposite(Class cls, List list, Set set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws InvocationTargetException, IllegalAccessException, InstantiationException {
            Detector detector;
            MediaTypeRegistry mediaTypeRegistry = mimeTypes.getMediaTypeRegistry();
            try {
                detector = (Detector) cls.getConstructor(new Class[]{MimeTypes.class, ServiceLoader.class, Collection.class}).newInstance(new Object[]{mimeTypes, serviceLoader, set});
            } catch (NoSuchMethodException unused) {
                detector = null;
            }
            if (detector == null) {
                try {
                    detector = (Detector) cls.getConstructor(new Class[]{MediaTypeRegistry.class, List.class, Collection.class}).newInstance(new Object[]{mediaTypeRegistry, list, set});
                } catch (NoSuchMethodException unused2) {
                }
            }
            if (detector == null) {
                try {
                    detector = (Detector) cls.getConstructor(new Class[]{MediaTypeRegistry.class, List.class}).newInstance(new Object[]{mediaTypeRegistry, list});
                } catch (NoSuchMethodException unused3) {
                }
            }
            if (detector != null) {
                return detector;
            }
            try {
                return (Detector) cls.getConstructor(new Class[]{List.class}).newInstance(new Object[]{list});
            } catch (NoSuchMethodException unused4) {
                return detector;
            }
        }
    }

    public static class EncodingDetectorXmlLoader extends XmlLoader {
        public /* synthetic */ EncodingDetectorXmlLoader(c cVar) {
            this();
        }

        public EncodingDetector decorate(EncodingDetector encodingDetector, Element element) {
            return encodingDetector;
        }

        public Class getLoaderClass() {
            return EncodingDetector.class;
        }

        public String getLoaderTagName() {
            return "encodingDetector";
        }

        public String getParentTagName() {
            return "encodingDetectors";
        }

        public EncodingDetector preLoadOne(Class cls, String str, MimeTypes mimeTypes) {
            return null;
        }

        public boolean supportsComposite() {
            return true;
        }

        private EncodingDetectorXmlLoader() {
            super(null);
        }

        public EncodingDetector createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.getDefaultEncodingDetector(serviceLoader);
        }

        public boolean isComposite(EncodingDetector encodingDetector) {
            return encodingDetector instanceof CompositeEncodingDetector;
        }

        public CompositeEncodingDetector createComposite(List list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return new CompositeEncodingDetector(list);
        }

        public boolean isComposite(Class cls) {
            return CompositeEncodingDetector.class.isAssignableFrom(cls);
        }

        public EncodingDetector createComposite(Class cls, List list, Set set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws InvocationTargetException, IllegalAccessException, InstantiationException {
            EncodingDetector encodingDetector;
            try {
                encodingDetector = (EncodingDetector) cls.getConstructor(new Class[]{ServiceLoader.class, Collection.class}).newInstance(new Object[]{serviceLoader, set});
            } catch (NoSuchMethodException unused) {
                TikaConfig.a().t("couldn't find constructor for service loader + collection for {}", cls);
                encodingDetector = null;
            }
            if (encodingDetector != null) {
                return encodingDetector;
            }
            try {
                return (EncodingDetector) cls.getConstructor(new Class[]{List.class}).newInstance(new Object[]{list});
            } catch (NoSuchMethodException unused2) {
                TikaConfig.a().t("couldn't find constructor for EncodingDetector(List) for {}", cls);
                return encodingDetector;
            }
        }
    }

    public static class ExecutorServiceXmlLoader extends XmlLoader {
        public /* synthetic */ ExecutorServiceXmlLoader(c cVar) {
            this();
        }

        public Class getLoaderClass() {
            return ConfigurableThreadPoolExecutor.class;
        }

        public String getLoaderTagName() {
            return "executor-service";
        }

        public String getParentTagName() {
            return null;
        }

        public boolean isComposite(Class cls) {
            return false;
        }

        public ConfigurableThreadPoolExecutor preLoadOne(Class cls, String str, MimeTypes mimeTypes) {
            return null;
        }

        public boolean supportsComposite() {
            return false;
        }

        private ExecutorServiceXmlLoader() {
            super(null);
        }

        public ConfigurableThreadPoolExecutor createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.c();
        }

        public ConfigurableThreadPoolExecutor decorate(ConfigurableThreadPoolExecutor configurableThreadPoolExecutor, Element element) {
            Element b = TikaConfig.b(element, "max-threads");
            if (b != null) {
                configurableThreadPoolExecutor.setMaximumPoolSize(Integer.parseInt(TikaConfig.g(b)));
            }
            Element b2 = TikaConfig.b(element, "core-threads");
            if (b2 != null) {
                configurableThreadPoolExecutor.setCorePoolSize(Integer.parseInt(TikaConfig.g(b2)));
            }
            return configurableThreadPoolExecutor;
        }

        public boolean isComposite(ConfigurableThreadPoolExecutor configurableThreadPoolExecutor) {
            return false;
        }

        public ConfigurableThreadPoolExecutor loadOne(Element element, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws TikaException, IOException {
            return (ConfigurableThreadPoolExecutor) super.loadOne(element, mimeTypes, serviceLoader);
        }

        public ConfigurableThreadPoolExecutor createComposite(Class cls, List list, Set set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws InstantiationException {
            throw new InstantiationException("Only one executor service supported");
        }

        public ConfigurableThreadPoolExecutor createComposite(List list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return (ConfigurableThreadPoolExecutor) list.get(0);
        }
    }

    public static class ParserXmlLoader extends XmlLoader {
        private final EncodingDetector encodingDetector;
        private final Renderer renderer;

        public /* synthetic */ ParserXmlLoader(EncodingDetector encodingDetector, Renderer renderer, c cVar) {
            this(encodingDetector, renderer);
        }

        public Class getLoaderClass() {
            return Parser.class;
        }

        public String getLoaderTagName() {
            return "parser";
        }

        public String getParentTagName() {
            return "parsers";
        }

        public boolean supportsComposite() {
            return true;
        }

        private ParserXmlLoader(EncodingDetector encodingDetector, Renderer renderer) {
            super(null);
            this.encodingDetector = encodingDetector;
            this.renderer = renderer;
        }

        public CompositeParser createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.d(mimeTypes, serviceLoader, this.encodingDetector, this.renderer);
        }

        public Parser decorate(Parser parser, Element element) throws TikaException {
            Set i = TikaConfig.i(element, "mime");
            if (!i.isEmpty()) {
                parser = ParserDecorator.withTypes(parser, i);
            }
            Set i2 = TikaConfig.i(element, "mime-exclude");
            return !i2.isEmpty() ? ParserDecorator.withoutTypes(parser, i2) : parser;
        }

        public boolean isComposite(Parser parser) {
            return parser instanceof CompositeParser;
        }

        public Parser newInstance(Class cls) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
            Parser parser = AbstractEncodingDetectorParser.class.isAssignableFrom(cls) ? (Parser) cls.getConstructor(new Class[]{EncodingDetector.class}).newInstance(new Object[]{this.encodingDetector}) : (Parser) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            if (parser instanceof RenderingParser) {
                ((RenderingParser) parser).setRenderer(this.renderer);
            }
            return parser;
        }

        public Parser preLoadOne(Class cls, String str, MimeTypes mimeTypes) throws TikaException {
            if (!AutoDetectParser.class.isAssignableFrom(cls)) {
                return null;
            }
            throw new TikaException("AutoDetectParser not supported in a <parser> configuration element: " + str);
        }

        public CompositeParser createComposite(List list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return new CompositeParser(mimeTypes.getMediaTypeRegistry(), list);
        }

        public boolean isComposite(Class cls) {
            return CompositeParser.class.isAssignableFrom(cls) || AbstractMultipleParser.class.isAssignableFrom(cls) || ParserDecorator.class.isAssignableFrom(cls);
        }

        public Parser createComposite(Class cls, List list, Set set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws InvocationTargetException, IllegalAccessException, InstantiationException {
            Parser parser;
            CompositeParser compositeParser;
            MediaTypeRegistry mediaTypeRegistry = mimeTypes.getMediaTypeRegistry();
            try {
                parser = (Parser) cls.getConstructor(new Class[]{MediaTypeRegistry.class, ServiceLoader.class, Collection.class, EncodingDetector.class, Renderer.class}).newInstance(new Object[]{mediaTypeRegistry, serviceLoader, set, this.encodingDetector, this.renderer});
            } catch (NoSuchMethodException unused) {
                parser = null;
            }
            if (parser == null) {
                try {
                    parser = (Parser) cls.getConstructor(new Class[]{MediaTypeRegistry.class, ServiceLoader.class, Collection.class, EncodingDetector.class}).newInstance(new Object[]{mediaTypeRegistry, serviceLoader, set, this.encodingDetector});
                } catch (NoSuchMethodException unused2) {
                }
            }
            if (parser == null) {
                try {
                    parser = (Parser) cls.getConstructor(new Class[]{MediaTypeRegistry.class, ServiceLoader.class, Collection.class}).newInstance(new Object[]{mediaTypeRegistry, serviceLoader, set});
                } catch (NoSuchMethodException unused3) {
                }
            }
            if (parser == null) {
                try {
                    parser = (Parser) cls.getConstructor(new Class[]{MediaTypeRegistry.class, List.class, Collection.class}).newInstance(new Object[]{mediaTypeRegistry, list, set});
                } catch (NoSuchMethodException unused4) {
                }
            }
            if (parser == null) {
                try {
                    parser = (Parser) cls.getConstructor(new Class[]{MediaTypeRegistry.class, Collection.class, Map.class}).newInstance(new Object[]{mediaTypeRegistry, list, map});
                } catch (NoSuchMethodException unused5) {
                }
            }
            if (parser == null) {
                try {
                    parser = (Parser) cls.getConstructor(new Class[]{MediaTypeRegistry.class, List.class}).newInstance(new Object[]{mediaTypeRegistry, list});
                } catch (NoSuchMethodException unused6) {
                }
            }
            if (parser != null || !ParserDecorator.class.isAssignableFrom(cls)) {
                return parser;
            }
            try {
                if (list.size() == 1 && set.isEmpty() && (list.get(0) instanceof CompositeParser)) {
                    compositeParser = (CompositeParser) list.get(0);
                } else {
                    compositeParser = new CompositeParser(mediaTypeRegistry, list, set);
                }
                return (Parser) cls.getConstructor(new Class[]{Parser.class}).newInstance(new Object[]{compositeParser});
            } catch (NoSuchMethodException unused7) {
                return parser;
            }
        }
    }

    public static class RendererXmlLoader extends XmlLoader {
        public /* synthetic */ RendererXmlLoader(c cVar) {
            this();
        }

        public Renderer decorate(Renderer renderer, Element element) {
            return renderer;
        }

        public Class getLoaderClass() {
            return Renderer.class;
        }

        public String getLoaderTagName() {
            return "renderer";
        }

        public String getParentTagName() {
            return "renderers";
        }

        public Renderer preLoadOne(Class cls, String str, MimeTypes mimeTypes) {
            return null;
        }

        public boolean supportsComposite() {
            return true;
        }

        private RendererXmlLoader() {
            super(null);
        }

        public Renderer createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.getDefaultRenderer(serviceLoader);
        }

        public boolean isComposite(Renderer renderer) {
            return renderer instanceof CompositeRenderer;
        }

        public Renderer createComposite(List list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return new CompositeRenderer(list);
        }

        public boolean isComposite(Class cls) {
            return CompositeRenderer.class.isAssignableFrom(cls);
        }

        public Renderer createComposite(Class cls, List list, Set set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws InvocationTargetException, IllegalAccessException, InstantiationException {
            Renderer renderer;
            try {
                renderer = (Renderer) cls.getConstructor(new Class[]{ServiceLoader.class, Collection.class}).newInstance(new Object[]{serviceLoader, set});
            } catch (NoSuchMethodException unused) {
                TikaConfig.a().t("couldn't find constructor for service loader + collection for {}", null);
                renderer = null;
            }
            if (renderer != null) {
                return renderer;
            }
            try {
                return (Renderer) cls.getConstructor(new Class[]{List.class}).newInstance(new Object[]{list});
            } catch (NoSuchMethodException unused2) {
                TikaConfig.a().t("couldn't find constructor for Renderer(List) for {}", cls);
                return renderer;
            }
        }
    }

    public static class TranslatorXmlLoader extends XmlLoader {
        public /* synthetic */ TranslatorXmlLoader(c cVar) {
            this();
        }

        public Translator decorate(Translator translator, Element element) {
            return translator;
        }

        public Class getLoaderClass() {
            return Translator.class;
        }

        public String getLoaderTagName() {
            return "translator";
        }

        public String getParentTagName() {
            return null;
        }

        public boolean isComposite(Class cls) {
            return false;
        }

        public Translator preLoadOne(Class cls, String str, MimeTypes mimeTypes) {
            return null;
        }

        public boolean supportsComposite() {
            return false;
        }

        private TranslatorXmlLoader() {
            super(null);
        }

        public Translator createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.e(serviceLoader);
        }

        public boolean isComposite(Translator translator) {
            return false;
        }

        public Translator createComposite(List list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return (Translator) list.get(0);
        }

        public Translator createComposite(Class cls, List list, Set set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws InstantiationException {
            throw new InstantiationException("Only one translator supported");
        }
    }

    public static abstract class XmlLoader {
        protected static final String PARAMS_TAG_NAME = "params";

        public /* synthetic */ XmlLoader(c cVar) {
            this();
        }

        public abstract Object createComposite(Class cls, List list, Set set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws InvocationTargetException, IllegalAccessException, InstantiationException;

        public abstract Object createComposite(List list, MimeTypes mimeTypes, ServiceLoader serviceLoader);

        public abstract Object createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader);

        public abstract Object decorate(Object obj, Element element) throws IOException, TikaException;

        public abstract Class getLoaderClass();

        public abstract String getLoaderTagName();

        public Map getParams(Element element) throws TikaException {
            HashMap hashMap = new HashMap();
            Node firstChild = element.getFirstChild();
            while (true) {
                if (firstChild == null) {
                    break;
                }
                if (!"params".equals(firstChild.getNodeName())) {
                    firstChild = firstChild.getNextSibling();
                } else if (firstChild.hasChildNodes()) {
                    NodeList childNodes = firstChild.getChildNodes();
                    for (int i = 0; i < childNodes.getLength(); i++) {
                        Node item = childNodes.item(i);
                        if (item.getNodeType() == 1) {
                            Param load = Param.load(item);
                            hashMap.put(load.getName(), load);
                        }
                    }
                }
            }
            return hashMap;
        }

        public abstract String getParentTagName();

        public abstract boolean isComposite(Class cls);

        public abstract boolean isComposite(Object obj);

        public Object loadOne(Element element, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws TikaException, IOException {
            Object newInstance;
            String attribute = element.getAttribute("class");
            if (b.a(attribute)) {
                throw new TikaConfigException("class attribute must not be empty: " + String.valueOf(element));
            }
            String attribute2 = element.getAttribute("initializableProblemHandler");
            InitializableProblemHandler initializableProblemHandler = b.a(attribute2) ? serviceLoader.getInitializableProblemHandler() : TikaConfig.f(attribute2);
            try {
                try {
                    Class serviceClass = serviceLoader.getServiceClass(getLoaderClass(), attribute);
                    Object preLoadOne = preLoadOne(serviceClass, attribute, mimeTypes);
                    if (preLoadOne != null) {
                        return preLoadOne;
                    }
                    try {
                        Map params = getParams(element);
                        if (isComposite(serviceClass)) {
                            ArrayList arrayList = new ArrayList();
                            NodeList elementsByTagName = element.getElementsByTagName(getLoaderTagName());
                            if (elementsByTagName.getLength() > 0) {
                                for (int i = 0; i < elementsByTagName.getLength(); i++) {
                                    Object loadOne = loadOne((Element) elementsByTagName.item(i), mimeTypes, serviceLoader);
                                    if (loadOne != null) {
                                        arrayList.add(loadOne);
                                    }
                                }
                            }
                            HashSet hashSet = new HashSet();
                            NodeList elementsByTagName2 = element.getElementsByTagName(getLoaderTagName() + "-exclude");
                            if (elementsByTagName2.getLength() > 0) {
                                for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
                                    String attribute3 = elementsByTagName2.item(i2).getAttribute("class");
                                    try {
                                        hashSet.add(serviceLoader.getServiceClass(getLoaderClass(), attribute3));
                                    } catch (ClassNotFoundException unused) {
                                        throw new TikaConfigException("Class not found in -exclude list: " + attribute3);
                                    }
                                }
                            }
                            newInstance = createComposite(serviceClass, arrayList, hashSet, params, mimeTypes, serviceLoader);
                            if (newInstance == null) {
                                newInstance = newInstance(serviceClass);
                            }
                        } else {
                            newInstance = newInstance(serviceClass);
                        }
                        AnnotationUtils.assignFieldParams(newInstance, params);
                        if (newInstance instanceof Initializable) {
                            ((Initializable) newInstance).initialize(params);
                            ((Initializable) newInstance).checkInitialization(initializableProblemHandler);
                        }
                        return decorate(newInstance, element);
                    } catch (Exception e) {
                        throw new TikaConfigException(e.getMessage(), e);
                    }
                } catch (ClassNotFoundException e2) {
                    if (serviceLoader.getLoadErrorHandler() != LoadErrorHandler.THROW) {
                        serviceLoader.getLoadErrorHandler().handleLoadError(attribute, e2);
                        return null;
                    }
                    throw new TikaConfigException("Unable to find a " + getLoaderTagName() + " class: " + attribute, e2);
                }
            } catch (InstantiationException e3) {
                throw new TikaException("Unable to instantiate a " + getLoaderTagName() + " class: " + attribute, e3);
            } catch (NoSuchMethodException e4) {
                throw new TikaException("Unable to find the right constructor for " + getLoaderTagName() + " class: " + attribute, e4);
            } catch (InvocationTargetException e5) {
                throw new TikaException("Unable to create a " + getLoaderTagName() + " class: " + attribute, e5);
            } catch (IllegalAccessException e6) {
                throw new TikaException("Unable to access a " + getLoaderTagName() + " class: " + attribute, e6);
            }
        }

        public Object loadOverall(Element element, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws TikaException, IOException {
            ArrayList arrayList = new ArrayList();
            Iterator it = TikaConfig.h(element, getParentTagName(), getLoaderTagName()).iterator();
            while (it.hasNext()) {
                Object loadOne = loadOne((Element) it.next(), mimeTypes, serviceLoader);
                if (loadOne != null) {
                    arrayList.add(loadOne);
                }
            }
            if (arrayList.isEmpty()) {
                return createDefault(mimeTypes, serviceLoader);
            }
            if (arrayList.size() == 1) {
                Object obj = arrayList.get(0);
                if (isComposite(obj)) {
                    return obj;
                }
            } else if (!supportsComposite()) {
                throw new TikaConfigException("Composite not supported for " + getParentTagName() + ". Must specify only one child!");
            }
            return createComposite(arrayList, mimeTypes, serviceLoader);
        }

        public Object newInstance(Class cls) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
            return cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        }

        public abstract Object preLoadOne(Class cls, String str, MimeTypes mimeTypes) throws TikaException;

        public abstract boolean supportsComposite();

        private XmlLoader() {
        }
    }

    static {
        HashMap hashMap = new HashMap();
        strategyMap = hashMap;
        hashMap.put("", InitializableProblemHandler.DEFAULT);
        InitializableProblemHandler initializableProblemHandler = InitializableProblemHandler.IGNORE;
        hashMap.put(initializableProblemHandler.toString(), initializableProblemHandler);
        InitializableProblemHandler initializableProblemHandler2 = InitializableProblemHandler.INFO;
        hashMap.put(initializableProblemHandler2.toString(), initializableProblemHandler2);
        InitializableProblemHandler initializableProblemHandler3 = InitializableProblemHandler.WARN;
        hashMap.put(initializableProblemHandler3.toString(), initializableProblemHandler3);
        InitializableProblemHandler initializableProblemHandler4 = InitializableProblemHandler.THROW;
        hashMap.put(initializableProblemHandler4.toString(), initializableProblemHandler4);
        MAX_JSON_STRING_FIELD_LENGTH = DEFAULT_MAX_JSON_STRING_FIELD_LENGTH;
    }

    public TikaConfig(String str) throws TikaException, IOException, SAXException {
        this(F.a(str, new String[0]));
    }

    public static /* bridge */ /* synthetic */ Wb.c a() {
        return LOG;
    }

    public static /* bridge */ /* synthetic */ Element b(Element element, String str) {
        return getChild(element, str);
    }

    public static /* bridge */ /* synthetic */ ConfigurableThreadPoolExecutor c() {
        return getDefaultExecutorService();
    }

    public static /* bridge */ /* synthetic */ CompositeParser d(MimeTypes mimeTypes, ServiceLoader serviceLoader, EncodingDetector encodingDetector, Renderer renderer) {
        return getDefaultParser(mimeTypes, serviceLoader, encodingDetector, renderer);
    }

    public static /* bridge */ /* synthetic */ Translator e(ServiceLoader serviceLoader) {
        return getDefaultTranslator(serviceLoader);
    }

    public static /* bridge */ /* synthetic */ InitializableProblemHandler f(String str) {
        return getInitializableProblemHandler(str);
    }

    public static /* bridge */ /* synthetic */ String g(Node node) {
        return getText(node);
    }

    private static Element getChild(Element element, String str) {
        for (Element firstChild = element.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 1 && str.equals(firstChild.getNodeName())) {
                return firstChild;
            }
        }
        return null;
    }

    private static InputStream getConfigInputStream(String str, ServiceLoader serviceLoader) throws TikaException, IOException {
        InputStream inputStream;
        try {
            inputStream = new URI(str).toURL().openStream();
        } catch (IOException | URISyntaxException unused) {
            inputStream = null;
        }
        if (inputStream == null) {
            inputStream = serviceLoader.getResourceAsStream(str);
        }
        if (inputStream == null) {
            Path a = F.a(str, new String[0]);
            if (a.a(a, new LinkOption[0])) {
                inputStream = q.a(a, new OpenOption[0]);
            }
        }
        if (inputStream != null) {
            return inputStream;
        }
        throw new TikaException("Specified Tika configuration not found: " + str);
    }

    public static TikaConfig getDefaultConfig() {
        try {
            return new TikaConfig();
        } catch (IOException e) {
            throw new RuntimeException("Unable to read default configuration", e);
        } catch (TikaException e2) {
            throw new RuntimeException("Unable to access default configuration", e2);
        }
    }

    public static CompositeDetector getDefaultDetector(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
        return new DefaultDetector(mimeTypes, serviceLoader);
    }

    public static CompositeEncodingDetector getDefaultEncodingDetector(ServiceLoader serviceLoader) {
        return new DefaultEncodingDetector(serviceLoader);
    }

    private static ConfigurableThreadPoolExecutor getDefaultExecutorService() {
        return new SimpleThreadPoolExecutor();
    }

    private static MimeTypes getDefaultMimeTypes(ClassLoader classLoader) {
        return MimeTypes.getDefaultMimeTypes(classLoader);
    }

    private static CompositeParser getDefaultParser(MimeTypes mimeTypes, ServiceLoader serviceLoader, EncodingDetector encodingDetector, Renderer renderer) {
        return new DefaultParser(mimeTypes.getMediaTypeRegistry(), serviceLoader, encodingDetector, renderer);
    }

    public static CompositeRenderer getDefaultRenderer(ServiceLoader serviceLoader) {
        return new CompositeRenderer(serviceLoader);
    }

    private static Translator getDefaultTranslator(ServiceLoader serviceLoader) {
        return new DefaultTranslator(serviceLoader);
    }

    private static InitializableProblemHandler getInitializableProblemHandler(String str) throws TikaConfigException {
        Map map = strategyMap;
        Locale locale = Locale.US;
        InitializableProblemHandler initializableProblemHandler = (InitializableProblemHandler) map.get(str.toUpperCase(locale));
        if (initializableProblemHandler != null) {
            return initializableProblemHandler;
        }
        throw new TikaConfigException(String.format(locale, "Couldn't parse non-null '%s'. Must be one of 'ignore', 'info', 'warn' or 'throw'", new Object[]{str}));
    }

    public static int getMaxJsonStringFieldLength() {
        return MAX_JSON_STRING_FIELD_LENGTH;
    }

    private static String getText(Node node) {
        short nodeType = node.getNodeType();
        if (nodeType != 1) {
            return nodeType != 3 ? "" : node.getNodeValue();
        }
        StringBuilder sb = new StringBuilder();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            sb.append(getText(childNodes.item(i)));
        }
        return sb.toString();
    }

    private static List getTopLevelElementChildren(Element element, String str, String str2) throws TikaException {
        if (str != null) {
            NodeList elementsByTagName = element.getElementsByTagName(str);
            if (elementsByTagName.getLength() > 1) {
                throw new TikaException("Properties may not contain multiple " + str + " entries");
            }
            element = elementsByTagName.getLength() == 1 ? elementsByTagName.item(0) : null;
        }
        if (element == null) {
            return Collections.emptyList();
        }
        NodeList childNodes = element.getChildNodes();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Element item = childNodes.item(i);
            if (item instanceof Element) {
                Element element2 = item;
                if (str2.equals(element2.getTagName())) {
                    arrayList.add(element2);
                }
            }
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ List h(Element element, String str, String str2) {
        return getTopLevelElementChildren(element, str, str2);
    }

    public static /* bridge */ /* synthetic */ Set i(Element element, String str) {
        return mediaTypesListFromDomElement(element, str);
    }

    private static Set mediaTypesListFromDomElement(Element element, String str) throws TikaException {
        NodeList childNodes = element.getChildNodes();
        HashSet hashSet = null;
        for (int i = 0; i < childNodes.getLength(); i++) {
            Element item = childNodes.item(i);
            if (item instanceof Element) {
                Element element2 = item;
                if (str.equals(element2.getTagName())) {
                    String text = getText(element2);
                    MediaType parse = MediaType.parse(text);
                    if (parse == null) {
                        throw new TikaException("Invalid media type name: " + text);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(parse);
                } else {
                    continue;
                }
            }
        }
        return hashSet != null ? hashSet : Collections.emptySet();
    }

    public static void mustNotBeEmpty(String str, String str2) throws TikaConfigException {
        if (StringUtils.isBlank(str2)) {
            throw new IllegalArgumentException("parameter '" + str + "' must be set in the config file");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0026 A[PHI: r3
      0x0026: PHI (r3v2 org.apache.tika.config.LoadErrorHandler) = (r3v0 org.apache.tika.config.LoadErrorHandler), (r3v1 org.apache.tika.config.LoadErrorHandler) binds: [B:4:0x0024, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.apache.tika.config.ServiceLoader serviceLoaderFromDomElement(org.w3c.dom.Element r5, java.lang.ClassLoader r6) throws org.apache.tika.exception.TikaConfigException {
        /*
            java.lang.String r0 = "service-loader"
            org.w3c.dom.Element r5 = getChild(r5, r0)
            if (r5 == 0) goto L4b
            java.lang.String r0 = "dynamic"
            java.lang.String r0 = r5.getAttribute(r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            org.apache.tika.config.LoadErrorHandler r1 = org.apache.tika.config.LoadErrorHandler.THROW
            java.lang.String r2 = "loadErrorHandler"
            java.lang.String r2 = r5.getAttribute(r2)
            org.apache.tika.config.LoadErrorHandler r3 = org.apache.tika.config.LoadErrorHandler.WARN
            java.lang.String r4 = r3.toString()
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L28
        L26:
            r1 = r3
            goto L35
        L28:
            org.apache.tika.config.LoadErrorHandler r3 = org.apache.tika.config.LoadErrorHandler.IGNORE
            java.lang.String r4 = r3.toString()
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L35
            goto L26
        L35:
            java.lang.String r2 = "initializableProblemHandler"
            java.lang.String r5 = r5.getAttribute(r2)
            org.apache.tika.config.InitializableProblemHandler r5 = getInitializableProblemHandler(r5)
            if (r6 != 0) goto L45
            java.lang.ClassLoader r6 = org.apache.tika.config.ServiceLoader.getContextClassLoader()
        L45:
            org.apache.tika.config.ServiceLoader r2 = new org.apache.tika.config.ServiceLoader
            r2.<init>(r6, r1, r5, r0)
            goto L58
        L4b:
            if (r6 == 0) goto L53
            org.apache.tika.config.ServiceLoader r2 = new org.apache.tika.config.ServiceLoader
            r2.<init>(r6)
            goto L58
        L53:
            org.apache.tika.config.ServiceLoader r2 = new org.apache.tika.config.ServiceLoader
            r2.<init>()
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.config.TikaConfig.serviceLoaderFromDomElement(org.w3c.dom.Element, java.lang.ClassLoader):org.apache.tika.config.ServiceLoader");
    }

    private void setMaxJsonStringFieldLength(Element element) throws TikaConfigException {
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeName().equals(MAX_JSON_STRING_FIELD_LENGTH_ELEMENT_NAME)) {
                try {
                    MAX_JSON_STRING_FIELD_LENGTH = Integer.parseInt(item.getTextContent());
                    return;
                } catch (NumberFormatException e) {
                    throw new TikaConfigException(MAX_JSON_STRING_FIELD_LENGTH_ELEMENT_NAME + " is not an integer", e);
                }
            }
        }
    }

    private static MimeTypes typesFromDomElement(Element element) throws TikaException, IOException {
        Element child = getChild(element, "mimeTypeRepository");
        return (child == null || !child.hasAttribute("resource")) ? getDefaultMimeTypes(null) : MimeTypesFactory.create(child.getAttribute("resource"));
    }

    private void updateXMLReaderUtils(Element element) throws TikaException {
        Element child = getChild(element, "xml-reader-utils");
        if (child == null) {
            return;
        }
        if (child.hasAttribute("maxEntityExpansions")) {
            XMLReaderUtils.setMaxEntityExpansions(Integer.parseInt(child.getAttribute("maxEntityExpansions")));
        }
        if (child.hasAttribute("maxNumReuses")) {
            XMLReaderUtils.setMaxNumReuses(Integer.parseInt(child.getAttribute("maxNumReuses")));
        }
        if (child.hasAttribute("poolSize")) {
            XMLReaderUtils.setPoolSize(Integer.parseInt(child.getAttribute("poolSize")));
        }
    }

    public AutoDetectParserConfig getAutoDetectParserConfig() {
        return this.autoDetectParserConfig;
    }

    public Detector getDetector() {
        return this.detector;
    }

    public EncodingDetector getEncodingDetector() {
        return this.encodingDetector;
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public MediaTypeRegistry getMediaTypeRegistry() {
        return this.mimeTypes.getMediaTypeRegistry();
    }

    public MetadataFilter getMetadataFilter() {
        return this.metadataFilter;
    }

    public MetadataListFilter getMetadataListFilter() {
        return this.metadataListFilter;
    }

    public MimeTypes getMimeRepository() {
        return this.mimeTypes;
    }

    public Parser getParser() {
        return this.parser;
    }

    public ServiceLoader getServiceLoader() {
        return this.serviceLoader;
    }

    public Translator getTranslator() {
        return this.translator;
    }

    public TikaConfig(Path path) throws TikaException, IOException, SAXException {
        this(XMLReaderUtils.buildDOM(path));
    }

    public TikaConfig(Path path, ServiceLoader serviceLoader) throws TikaException, IOException, SAXException {
        this(XMLReaderUtils.buildDOM(path), serviceLoader);
    }

    public static void mustNotBeEmpty(String str, Path path) throws TikaConfigException {
        if (path != null) {
            return;
        }
        throw new IllegalArgumentException("parameter '" + str + "' must be set in the config file");
    }

    public TikaConfig(File file) throws TikaException, IOException, SAXException {
        this(XMLReaderUtils.buildDOM(m.a(file)));
    }

    public TikaConfig(File file, ServiceLoader serviceLoader) throws TikaException, IOException, SAXException {
        this(XMLReaderUtils.buildDOM(m.a(file)), serviceLoader);
    }

    public TikaConfig(URL url) throws TikaException, IOException, SAXException {
        this(url, ServiceLoader.getContextClassLoader());
    }

    public TikaConfig(URL url, ClassLoader classLoader) throws TikaException, IOException, SAXException {
        this(XMLReaderUtils.buildDOM(url.toString()).getDocumentElement(), classLoader);
    }

    public TikaConfig(URL url, ServiceLoader serviceLoader) throws TikaException, IOException, SAXException {
        this(XMLReaderUtils.buildDOM(url.toString()).getDocumentElement(), serviceLoader);
    }

    public TikaConfig(InputStream inputStream) throws TikaException, IOException, SAXException {
        this(XMLReaderUtils.buildDOM(inputStream));
    }

    public TikaConfig(Document document) throws TikaException, IOException {
        this(document.getDocumentElement());
    }

    public TikaConfig(Document document, ServiceLoader serviceLoader) throws TikaException, IOException {
        this(document.getDocumentElement(), serviceLoader);
    }

    public TikaConfig(Element element) throws TikaException, IOException {
        this(element, serviceLoaderFromDomElement(element, null));
    }

    public TikaConfig(Element element, ClassLoader classLoader) throws TikaException, IOException {
        this(element, serviceLoaderFromDomElement(element, classLoader));
    }

    private TikaConfig(Element element, ServiceLoader serviceLoader) throws TikaException, IOException {
        DetectorXmlLoader detectorXmlLoader = new DetectorXmlLoader(null);
        TranslatorXmlLoader translatorXmlLoader = new TranslatorXmlLoader(null);
        ExecutorServiceXmlLoader executorServiceXmlLoader = new ExecutorServiceXmlLoader(null);
        EncodingDetectorXmlLoader encodingDetectorXmlLoader = new EncodingDetectorXmlLoader(null);
        RendererXmlLoader rendererXmlLoader = new RendererXmlLoader(null);
        updateXMLReaderUtils(element);
        MimeTypes typesFromDomElement = typesFromDomElement(element);
        this.mimeTypes = typesFromDomElement;
        this.detector = (CompositeDetector) detectorXmlLoader.loadOverall(element, typesFromDomElement, serviceLoader);
        EncodingDetector encodingDetector = (EncodingDetector) encodingDetectorXmlLoader.loadOverall(element, typesFromDomElement, serviceLoader);
        this.encodingDetector = encodingDetector;
        Renderer renderer = (Renderer) rendererXmlLoader.loadOverall(element, typesFromDomElement, serviceLoader);
        this.renderer = renderer;
        this.parser = (CompositeParser) new ParserXmlLoader(encodingDetector, renderer, null).loadOverall(element, typesFromDomElement, serviceLoader);
        this.translator = (Translator) translatorXmlLoader.loadOverall(element, typesFromDomElement, serviceLoader);
        this.executorService = (ExecutorService) executorServiceXmlLoader.loadOverall(element, typesFromDomElement, serviceLoader);
        this.metadataFilter = MetadataFilter.load(element, true);
        this.metadataListFilter = MetadataListFilter.load(element, true);
        this.autoDetectParserConfig = AutoDetectParserConfig.load(element);
        this.serviceLoader = serviceLoader;
        setMaxJsonStringFieldLength(element);
        TIMES_INSTANTIATED.incrementAndGet();
    }

    public TikaConfig(ClassLoader classLoader) throws MimeTypeException, IOException {
        ServiceLoader serviceLoader = new ServiceLoader(classLoader);
        this.serviceLoader = serviceLoader;
        MimeTypes defaultMimeTypes = getDefaultMimeTypes(classLoader);
        this.mimeTypes = defaultMimeTypes;
        this.detector = getDefaultDetector(defaultMimeTypes, serviceLoader);
        CompositeEncodingDetector defaultEncodingDetector = getDefaultEncodingDetector(serviceLoader);
        this.encodingDetector = defaultEncodingDetector;
        CompositeRenderer defaultRenderer = getDefaultRenderer(serviceLoader);
        this.renderer = defaultRenderer;
        this.parser = getDefaultParser(defaultMimeTypes, serviceLoader, defaultEncodingDetector, defaultRenderer);
        this.translator = getDefaultTranslator(serviceLoader);
        this.executorService = getDefaultExecutorService();
        this.metadataFilter = new NoOpFilter();
        this.metadataListFilter = new NoOpListFilter();
        this.autoDetectParserConfig = AutoDetectParserConfig.DEFAULT;
        TIMES_INSTANTIATED.incrementAndGet();
    }

    public TikaConfig() throws TikaException, IOException {
        String property = System.getProperty("tika.config");
        if (!StringUtils.isBlank(property)) {
            LOG.debug("loading tika config from system property 'tika.config'");
        }
        if (StringUtils.isBlank(property)) {
            property = System.getenv("TIKA_CONFIG");
            if (!StringUtils.isBlank(property)) {
                LOG.debug("loading tika config from environment variable 'TIKA_CONFIG'");
            }
        }
        if (StringUtils.isBlank(property)) {
            LOG.debug("loading tika config from defaults; no config file specified");
            ServiceLoader serviceLoader = new ServiceLoader();
            this.serviceLoader = serviceLoader;
            MimeTypes defaultMimeTypes = getDefaultMimeTypes(ServiceLoader.getContextClassLoader());
            this.mimeTypes = defaultMimeTypes;
            CompositeEncodingDetector defaultEncodingDetector = getDefaultEncodingDetector(serviceLoader);
            this.encodingDetector = defaultEncodingDetector;
            CompositeRenderer defaultRenderer = getDefaultRenderer(serviceLoader);
            this.renderer = defaultRenderer;
            this.parser = getDefaultParser(defaultMimeTypes, serviceLoader, defaultEncodingDetector, defaultRenderer);
            this.detector = getDefaultDetector(defaultMimeTypes, serviceLoader);
            this.translator = getDefaultTranslator(serviceLoader);
            this.executorService = getDefaultExecutorService();
            this.metadataFilter = new NoOpFilter();
            this.metadataListFilter = new NoOpListFilter();
            this.autoDetectParserConfig = AutoDetectParserConfig.DEFAULT;
        } else {
            ServiceLoader serviceLoader2 = new ServiceLoader();
            LOG.debug("loading tika config from: " + property);
            try {
                InputStream configInputStream = getConfigInputStream(property, serviceLoader2);
                try {
                    Element documentElement = XMLReaderUtils.buildDOM(configInputStream).getDocumentElement();
                    updateXMLReaderUtils(documentElement);
                    ServiceLoader serviceLoaderFromDomElement = serviceLoaderFromDomElement(documentElement, serviceLoader2.getLoader());
                    this.serviceLoader = serviceLoaderFromDomElement;
                    DetectorXmlLoader detectorXmlLoader = new DetectorXmlLoader(null);
                    EncodingDetectorXmlLoader encodingDetectorXmlLoader = new EncodingDetectorXmlLoader(null);
                    RendererXmlLoader rendererXmlLoader = new RendererXmlLoader(null);
                    TranslatorXmlLoader translatorXmlLoader = new TranslatorXmlLoader(null);
                    ExecutorServiceXmlLoader executorServiceXmlLoader = new ExecutorServiceXmlLoader(null);
                    MimeTypes typesFromDomElement = typesFromDomElement(documentElement);
                    this.mimeTypes = typesFromDomElement;
                    EncodingDetector encodingDetector = (EncodingDetector) encodingDetectorXmlLoader.loadOverall(documentElement, typesFromDomElement, serviceLoaderFromDomElement);
                    this.encodingDetector = encodingDetector;
                    Renderer renderer = (Renderer) rendererXmlLoader.loadOverall(documentElement, typesFromDomElement, serviceLoaderFromDomElement);
                    this.renderer = renderer;
                    this.parser = (CompositeParser) new ParserXmlLoader(encodingDetector, renderer, null).loadOverall(documentElement, typesFromDomElement, serviceLoaderFromDomElement);
                    this.detector = (CompositeDetector) detectorXmlLoader.loadOverall(documentElement, typesFromDomElement, serviceLoaderFromDomElement);
                    this.translator = (Translator) translatorXmlLoader.loadOverall(documentElement, typesFromDomElement, serviceLoaderFromDomElement);
                    this.executorService = (ExecutorService) executorServiceXmlLoader.loadOverall(documentElement, typesFromDomElement, serviceLoaderFromDomElement);
                    this.metadataFilter = MetadataFilter.load(documentElement, true);
                    this.metadataListFilter = MetadataListFilter.load(documentElement, true);
                    this.autoDetectParserConfig = AutoDetectParserConfig.load(documentElement);
                    setMaxJsonStringFieldLength(documentElement);
                    if (configInputStream != null) {
                        configInputStream.close();
                    }
                } finally {
                }
            } catch (SAXException e) {
                throw new TikaException("Specified Tika configuration has syntax errors: " + property, e);
            }
        }
        TIMES_INSTANTIATED.incrementAndGet();
    }
}
