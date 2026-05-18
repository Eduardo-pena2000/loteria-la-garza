package org.apache.tika.config;

import Wb.e;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.tika.detect.CompositeDetector;
import org.apache.tika.detect.CompositeEncodingDetector;
import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.DefaultEncodingDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.detect.EncodingDetector;
import org.apache.tika.language.translate.DefaultTranslator;
import org.apache.tika.language.translate.Translator;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.DefaultParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.ParserDecorator;
import org.apache.tika.parser.multiple.AbstractMultipleParser;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class TikaConfigSerializer {
    private static final Wb.c LOG = e.l(TikaConfigSerializer.class);
    private static Map PRIMITIVES;

    public static class MethodTuple {
        Method method;
        String name;
        Class singleParam;

        public MethodTuple(String str, Method method, Class cls) {
            this.name = str;
            this.method = method;
            this.singleParam = cls;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MethodTuple methodTuple = (MethodTuple) obj;
            return this.name.equals(methodTuple.name) && this.method.equals(methodTuple.method) && this.singleParam.equals(methodTuple.singleParam);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.name, this.method, this.singleParam});
        }
    }

    public static class MethodTuples {
        Map tuples;

        public /* synthetic */ MethodTuples(d dVar) {
            this();
        }

        public void add(MethodTuple methodTuple) {
            HashSet hashSet = (Set) this.tuples.get(methodTuple.name);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.tuples.put(methodTuple.name, hashSet);
            }
            hashSet.add(methodTuple);
        }

        public int getSize() {
            return this.tuples.size();
        }

        private MethodTuples() {
            this.tuples = new TreeMap();
        }
    }

    public enum Mode {
        MINIMAL,
        CURRENT,
        STATIC,
        STATIC_FULL
    }

    static {
        HashMap hashMap = new HashMap();
        PRIMITIVES = hashMap;
        hashMap.put(Integer.class, "int");
        PRIMITIVES.put(Integer.TYPE, "int");
        PRIMITIVES.put(String.class, "string");
        PRIMITIVES.put(Boolean.class, "bool");
        PRIMITIVES.put(Boolean.TYPE, "bool");
        PRIMITIVES.put(Float.class, "float");
        PRIMITIVES.put(Float.TYPE, "float");
        PRIMITIVES.put(Double.class, "double");
        PRIMITIVES.put(Double.TYPE, "double");
        PRIMITIVES.put(Long.class, "long");
        PRIMITIVES.put(Long.TYPE, "long");
        PRIMITIVES.put(Map.class, "map");
        PRIMITIVES.put(List.class, "list");
    }

    private static void addDetectors(Mode mode, Element element, Document document, TikaConfig tikaConfig) throws Exception {
        Detector detector = tikaConfig.getDetector();
        if (mode == Mode.MINIMAL && (detector instanceof DefaultDetector)) {
            element.appendChild(document.createComment("for example: <detectors><detector class=\"org.apache.tika.detector.MimeTypes\"></detectors>"));
            return;
        }
        Element createElement = document.createElement("detectors");
        if (!(mode == Mode.CURRENT && (detector instanceof DefaultDetector)) && (detector instanceof CompositeDetector)) {
            for (Detector detector2 : ((CompositeDetector) detector).getDetectors()) {
                Element createElement2 = document.createElement("detector");
                createElement2.setAttribute("class", detector2.getClass().getCanonicalName());
                serializeParams(document, createElement2, detector2);
                createElement.appendChild(createElement2);
            }
        } else {
            Element createElement3 = document.createElement("detector");
            createElement3.setAttribute("class", detector.getClass().getCanonicalName());
            createElement.appendChild(createElement3);
        }
        element.appendChild(createElement);
    }

    private static void addEncodingDetectors(Mode mode, Element element, Document document, TikaConfig tikaConfig) throws Exception {
        EncodingDetector encodingDetector = tikaConfig.getEncodingDetector();
        if (mode == Mode.MINIMAL && (encodingDetector instanceof DefaultEncodingDetector)) {
            element.appendChild(document.createComment("for example: <encodingDetectors><encodingDetector class=\"org.apache.tika.detect.DefaultEncodingDetector\"></encodingDetectors>"));
            return;
        }
        Element createElement = document.createElement("encodingDetectors");
        if (!(mode == Mode.CURRENT && (encodingDetector instanceof DefaultEncodingDetector)) && (encodingDetector instanceof CompositeEncodingDetector)) {
            for (EncodingDetector encodingDetector2 : ((CompositeEncodingDetector) encodingDetector).getDetectors()) {
                Element createElement2 = document.createElement("encodingDetector");
                createElement2.setAttribute("class", encodingDetector2.getClass().getCanonicalName());
                serializeParams(document, createElement2, encodingDetector2);
                createElement.appendChild(createElement2);
            }
        } else {
            Element createElement3 = document.createElement("encodingDetector");
            createElement3.setAttribute("class", encodingDetector.getClass().getCanonicalName());
            createElement.appendChild(createElement3);
        }
        element.appendChild(createElement);
    }

    private static void addExecutorService(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        tikaConfig.getExecutorService();
    }

    private static void addList(Element element, Document document, MethodTuple methodTuple, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Element createElement = document.createElement("string");
            createElement.setTextContent(str);
            element.appendChild(createElement);
        }
    }

    private static void addMap(Element element, Document document, MethodTuple methodTuple, Map map) {
        for (Map.Entry entry : new TreeMap(map).entrySet()) {
            Element createElement = document.createElement("string");
            createElement.setAttribute("key", (String) entry.getKey());
            createElement.setAttribute("value", (String) entry.getValue());
            element.appendChild(createElement);
        }
    }

    private static void addMimeComment(Mode mode, Element element, Document document) {
        element.appendChild(document.createComment("for example: <mimeTypeRepository resource=\"/org/apache/tika/mime/tika-mimetypes.xml\"/>"));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void addParser(org.apache.tika.config.TikaConfigSerializer.Mode r6, org.w3c.dom.Element r7, org.w3c.dom.Document r8, org.apache.tika.parser.Parser r9) throws java.lang.Exception {
        /*
            boolean r0 = r9 instanceof org.apache.tika.parser.ParserDecorator
            if (r0 == 0) goto L33
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Class<org.apache.tika.parser.ParserDecorator> r1 = org.apache.tika.parser.ParserDecorator.class
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "$"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L33
            org.apache.tika.parser.ParserDecorator r9 = (org.apache.tika.parser.ParserDecorator) r9
            org.apache.tika.parser.Parser r0 = r9.getWrappedParser()
            r5 = r0
            r0 = r9
            r9 = r5
            goto L34
        L33:
            r0 = 0
        L34:
            java.util.List r1 = java.util.Collections.emptyList()
            org.apache.tika.config.TikaConfigSerializer$Mode r2 = org.apache.tika.config.TikaConfigSerializer.Mode.CURRENT
            r3 = 1
            if (r6 != r2) goto L42
            boolean r2 = r9 instanceof org.apache.tika.parser.DefaultParser
            if (r2 == 0) goto L42
            goto L71
        L42:
            boolean r2 = r9 instanceof org.apache.tika.parser.CompositeParser
            if (r2 == 0) goto L66
            r1 = r9
            org.apache.tika.parser.CompositeParser r1 = (org.apache.tika.parser.CompositeParser) r1
            java.util.List r1 = r1.getAllComponentParsers()
            java.lang.Class r2 = r9.getClass()
            java.lang.Class<org.apache.tika.parser.CompositeParser> r4 = org.apache.tika.parser.CompositeParser.class
            boolean r2 = r2.equals(r4)
            r3 = r3 ^ r2
            boolean r2 = r9 instanceof org.apache.tika.parser.DefaultParser
            if (r2 == 0) goto L71
            org.apache.tika.config.TikaConfigSerializer$Mode r2 = org.apache.tika.config.TikaConfigSerializer.Mode.STATIC
            if (r6 == r2) goto L64
            org.apache.tika.config.TikaConfigSerializer$Mode r2 = org.apache.tika.config.TikaConfigSerializer.Mode.STATIC_FULL
            if (r6 != r2) goto L71
        L64:
            r3 = 0
            goto L71
        L66:
            boolean r2 = r9 instanceof org.apache.tika.parser.multiple.AbstractMultipleParser
            if (r2 == 0) goto L71
            r1 = r9
            org.apache.tika.parser.multiple.AbstractMultipleParser r1 = (org.apache.tika.parser.multiple.AbstractMultipleParser) r1
            java.util.List r1 = r1.getAllParsers()
        L71:
            if (r3 == 0) goto L77
            org.w3c.dom.Element r7 = addParser(r6, r7, r8, r9, r0)
        L77:
            java.util.Iterator r9 = r1.iterator()
        L7b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r9.next()
            org.apache.tika.parser.Parser r0 = (org.apache.tika.parser.Parser) r0
            addParser(r6, r7, r8, r0)
            goto L7b
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.config.TikaConfigSerializer.addParser(org.apache.tika.config.TikaConfigSerializer$Mode, org.w3c.dom.Element, org.w3c.dom.Document, org.apache.tika.parser.Parser):void");
    }

    private static void addParsers(Mode mode, Element element, Document document, TikaConfig tikaConfig) throws Exception {
        Parser parser = tikaConfig.getParser();
        Mode mode2 = Mode.MINIMAL;
        if (mode == mode2 && (parser instanceof DefaultParser)) {
            return;
        }
        if (mode == mode2) {
            mode = Mode.CURRENT;
        }
        Element createElement = document.createElement("parsers");
        element.appendChild(createElement);
        addParser(mode, createElement, document, parser);
    }

    private static void addServiceLoader(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        ServiceLoader serviceLoader = tikaConfig.getServiceLoader();
        if (mode == Mode.MINIMAL && serviceLoader.isDynamic() && serviceLoader.getLoadErrorHandler() == LoadErrorHandler.IGNORE) {
            return;
        }
        Element createElement = document.createElement("service-loader");
        createElement.setAttribute("dynamic", Boolean.toString(serviceLoader.isDynamic()));
        createElement.setAttribute("loadErrorHandler", serviceLoader.getLoadErrorHandler().toString());
        element.appendChild(createElement);
    }

    private static void addTranslator(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        Translator translator = tikaConfig.getTranslator();
        if (mode == Mode.MINIMAL && (translator instanceof DefaultTranslator)) {
            element.appendChild(document.createComment("for example: <translator class=\"org.apache.tika.language.translate.GoogleTranslator\"/>"));
            return;
        }
        if ((translator instanceof DefaultTranslator) && (mode == Mode.STATIC || mode == Mode.STATIC_FULL)) {
            translator = ((DefaultTranslator) translator).getTranslator();
        }
        if (translator == null) {
            element.appendChild(document.createComment("No translators available"));
            return;
        }
        Element createElement = document.createElement("translator");
        createElement.setAttribute("class", translator.getClass().getCanonicalName());
        element.appendChild(createElement);
    }

    private static Method findGetter(MethodTuple methodTuple, Object obj) {
        Matcher matcher = Pattern.compile("\\A(?:get|is)([A-Z].+)\\Z").matcher("");
        for (Method method : obj.getClass().getMethods()) {
            if (obj.getClass().getName().contains("PDF")) {
                System.out.println(method.getName());
            }
            if (matcher.reset(method.getName()).find()) {
                if (obj.getClass().getName().contains("PDF")) {
                    System.out.println("2: " + method.getName());
                }
                if (methodTuple.name.equals(matcher.group(1))) {
                    if (methodTuple.singleParam.equals(method.getReturnType())) {
                        return method;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private static String methodToParamName(String str) {
        if (StringUtils.isBlank(str)) {
            return str;
        }
        return str.substring(0, 1).toLowerCase(Locale.US) + str.substring(1);
    }

    private static MethodTuple pickBestSetter(Set set) {
        Iterator it = set.iterator();
        if (it.hasNext()) {
            return (MethodTuple) it.next();
        }
        return null;
    }

    private static void processNonPrimitive(String str, Set set, Set set2, Document document, Element element, Object obj) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            MethodTuple methodTuple = (MethodTuple) it.next();
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                MethodTuple methodTuple2 = (MethodTuple) it2.next();
                if (methodTuple.singleParam.equals(methodTuple2.singleParam)) {
                    serializeObject(str, document, element, methodTuple, methodTuple2, obj);
                    return;
                }
            }
        }
    }

    public static void serialize(TikaConfig tikaConfig, Mode mode, Writer writer, Charset charset) throws Exception {
        Document newDocument = XMLReaderUtils.getDocumentBuilder().newDocument();
        Element createElement = newDocument.createElement("properties");
        newDocument.appendChild(createElement);
        addMimeComment(mode, createElement, newDocument);
        addServiceLoader(mode, createElement, newDocument, tikaConfig);
        addExecutorService(mode, createElement, newDocument, tikaConfig);
        addEncodingDetectors(mode, createElement, newDocument, tikaConfig);
        addTranslator(mode, createElement, newDocument, tikaConfig);
        addDetectors(mode, createElement, newDocument, tikaConfig);
        addParsers(mode, createElement, newDocument, tikaConfig);
        Transformer transformer = XMLReaderUtils.getTransformer();
        transformer.setOutputProperty("indent", "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformer.setOutputProperty("encoding", charset.name());
        transformer.transform(new DOMSource(newDocument), new StreamResult(writer));
    }

    private static void serializeNonPrimitives(Document document, Element element, Object obj, MethodTuples methodTuples, MethodTuples methodTuples2) {
        for (Map.Entry entry : methodTuples.tuples.entrySet()) {
            processNonPrimitive((String) entry.getKey(), (Set) entry.getValue(), (Set) methodTuples2.tuples.get(entry.getKey()), document, element, obj);
            if (!methodTuples2.tuples.containsKey(entry.getKey())) {
                LOG.g("no getter for setter non-primitive: {} in {}", entry.getKey(), obj.getClass());
            }
        }
    }

    private static void serializeObject(String str, Document document, Element element, MethodTuple methodTuple, MethodTuple methodTuple2, Object obj) {
        try {
            Object invoke = methodTuple2.method.invoke(obj, (Object[]) null);
            if (invoke == null) {
                LOG.g("Getter {} on {} returned null", methodTuple2.name, obj.getClass());
            }
            Element createElement = document.createElement(str);
            createElement.setAttribute("class", invoke.getClass().getCanonicalName());
            element.appendChild(createElement);
            serializeParams(document, element, invoke);
        } catch (IllegalAccessException | InvocationTargetException e) {
            LOG.k("couldn't get " + str + " on " + String.valueOf(obj.getClass()), e);
        }
    }

    public static void serializeParams(Document document, Element element, Object obj) {
        Matcher matcher;
        Method[] methodArr;
        Matcher matcher2 = Pattern.compile("\\Aset([A-Z].*)").matcher("");
        Matcher matcher3 = Pattern.compile("\\A(?:get|is)([A-Z].+)\\Z").matcher("");
        MethodTuples methodTuples = new MethodTuples(null);
        MethodTuples methodTuples2 = new MethodTuples(null);
        MethodTuples methodTuples3 = new MethodTuples(null);
        MethodTuples methodTuples4 = new MethodTuples(null);
        Method[] methods = obj.getClass().getMethods();
        int length = methods.length;
        int i = 0;
        while (i < length) {
            Method method = methods[i];
            Class[] parameterTypes = method.getParameterTypes();
            if (matcher2.reset(method.getName()).find()) {
                if (!Modifier.isPublic(method.getModifiers())) {
                    LOG.d("inaccessible setter: {} in {}", method.getName(), obj.getClass());
                } else if (method.getAnnotation(Field.class) != null) {
                    if (parameterTypes.length != 1) {
                        Wb.c cVar = LOG;
                        String name = method.getName();
                        int length2 = parameterTypes.length;
                        StringBuilder sb = new StringBuilder();
                        methodArr = methods;
                        sb.append("setter with wrong number of params ");
                        sb.append(name);
                        sb.append(" ");
                        sb.append(length2);
                        cVar.w(sb.toString());
                        matcher = matcher2;
                    } else {
                        methodArr = methods;
                        String methodToParamName = methodToParamName(matcher2.group(1));
                        matcher = matcher2;
                        if (PRIMITIVES.containsKey(parameterTypes[0])) {
                            methodTuples2.add(new MethodTuple(methodToParamName, method, parameterTypes[0]));
                        } else {
                            methodTuples.add(new MethodTuple(methodToParamName, method, parameterTypes[0]));
                        }
                    }
                }
                matcher = matcher2;
                methodArr = methods;
            } else {
                matcher = matcher2;
                methodArr = methods;
                if (matcher3.reset(method.getName()).find() && parameterTypes.length == 0) {
                    String methodToParamName2 = methodToParamName(matcher3.group(1));
                    if (PRIMITIVES.containsKey(method.getReturnType())) {
                        methodTuples4.add(new MethodTuple(methodToParamName2, method, method.getReturnType()));
                    } else {
                        methodTuples3.add(new MethodTuple(methodToParamName2, method, method.getReturnType()));
                    }
                }
            }
            i++;
            matcher2 = matcher;
            methods = methodArr;
        }
        serializePrimitives(document, element, obj, methodTuples2, methodTuples4);
        serializeNonPrimitives(document, element, obj, methodTuples, methodTuples3);
    }

    private static void serializePrimitives(Document document, Element element, Object obj, MethodTuples methodTuples, MethodTuples methodTuples2) {
        MethodTuples methodTuples3;
        Element element2;
        MethodTuples methodTuples4 = methodTuples2;
        if (obj instanceof AbstractMultipleParser) {
            element2 = document.createElement("params");
            Element createElement = document.createElement("param");
            createElement.setAttribute("name", "metadataPolicy");
            createElement.setAttribute("value", ((AbstractMultipleParser) obj).getMetadataPolicy().toString());
            element2.appendChild(createElement);
            element.appendChild(element2);
            methodTuples3 = methodTuples;
        } else {
            methodTuples3 = methodTuples;
            element2 = null;
        }
        Element element3 = element2;
        for (Map.Entry entry : methodTuples3.tuples.entrySet()) {
            if (methodTuples4.tuples.containsKey(entry.getKey())) {
                Set<MethodTuple> set = (Set) methodTuples4.tuples.get(entry.getKey());
                Set set2 = (Set) entry.getValue();
                MethodTuple methodTuple = null;
                for (MethodTuple methodTuple2 : set) {
                    Iterator it = set2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (methodTuple2.singleParam.equals(((MethodTuple) it.next()).singleParam)) {
                                methodTuple = methodTuple2;
                                break;
                            }
                        }
                    }
                }
                if (methodTuple == null) {
                    LOG.t("Could not find getter to match setter for: {}", entry.getKey());
                } else {
                    try {
                        try {
                            Object invoke = methodTuple.method.invoke(obj, (Object[]) null);
                            if (invoke == null) {
                                LOG.b("null value: {} in {}", methodTuple.name, obj.getClass());
                            }
                            String obj2 = invoke == null ? "" : invoke.toString();
                            Element createElement2 = document.createElement("param");
                            createElement2.setAttribute("name", methodTuple.name);
                            createElement2.setAttribute("type", (String) PRIMITIVES.get(methodTuple.singleParam));
                            if (List.class.isAssignableFrom(methodTuple.singleParam)) {
                                addList(createElement2, document, methodTuple, (List) invoke);
                            } else if (Map.class.isAssignableFrom(methodTuple.singleParam)) {
                                addMap(createElement2, document, methodTuple, (Map) invoke);
                            } else {
                                createElement2.setTextContent(obj2);
                            }
                            if (element3 == null) {
                                Element createElement3 = document.createElement("params");
                                element.appendChild(createElement3);
                                element3 = createElement3;
                            }
                            element3.appendChild(createElement2);
                        } catch (IllegalAccessException e) {
                            e = e;
                            LOG.error("couldn't invoke " + String.valueOf(methodTuple), e);
                            methodTuples4 = methodTuples2;
                        } catch (InvocationTargetException e2) {
                            e = e2;
                            LOG.error("couldn't invoke " + String.valueOf(methodTuple), e);
                            methodTuples4 = methodTuples2;
                        }
                    } catch (InvocationTargetException e3) {
                        e = e3;
                    } catch (IllegalAccessException e4) {
                        e = e4;
                    }
                    methodTuples4 = methodTuples2;
                }
            } else {
                LOG.n("no getter for setter: {} in {}", entry.getKey(), obj.getClass());
            }
            methodTuples4 = methodTuples2;
        }
    }

    private static Element addParser(Mode mode, Element element, Document document, Parser parser, ParserDecorator parserDecorator) throws Exception {
        ParseContext parseContext = new ParseContext();
        TreeSet<MediaType> treeSet = new TreeSet();
        TreeSet<MediaType> treeSet2 = new TreeSet();
        if (parserDecorator != null) {
            TreeSet treeSet3 = new TreeSet(parserDecorator.getSupportedTypes(parseContext));
            treeSet.addAll(treeSet3);
            for (MediaType mediaType : parser.getSupportedTypes(parseContext)) {
                if (!treeSet3.contains(mediaType)) {
                    treeSet2.add(mediaType);
                }
                treeSet.remove(mediaType);
            }
        } else if (mode == Mode.STATIC_FULL) {
            treeSet.addAll(parser.getSupportedTypes(parseContext));
        }
        String canonicalName = parser.getClass().getCanonicalName();
        Element createElement = document.createElement("parser");
        createElement.setAttribute("class", canonicalName);
        element.appendChild(createElement);
        serializeParams(document, createElement, parser);
        for (MediaType mediaType2 : treeSet) {
            Element createElement2 = document.createElement("mime");
            createElement2.appendChild(document.createTextNode(mediaType2.toString()));
            createElement.appendChild(createElement2);
        }
        for (MediaType mediaType3 : treeSet2) {
            Element createElement3 = document.createElement("mime-exclude");
            createElement3.appendChild(document.createTextNode(mediaType3.toString()));
            createElement.appendChild(createElement3);
        }
        return createElement;
    }
}
