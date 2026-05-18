package org.apache.tika.config;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class ConfigBase {
    private static Class[] SUPPORTED_PRIMITIVES = {String.class, Boolean.TYPE, Long.TYPE, Integer.TYPE, Double.TYPE, Float.TYPE};

    public static class SetterClassPair {
        private final Class itemClass;
        private final Method setterMethod;

        public SetterClassPair(Method method, Class cls) {
            this.setterMethod = method;
            this.itemClass = cls;
        }

        public static /* bridge */ /* synthetic */ Class a(SetterClassPair setterClassPair) {
            return setterClassPair.itemClass;
        }

        public static /* bridge */ /* synthetic */ Method b(SetterClassPair setterClassPair) {
            return setterClassPair.setterMethod;
        }

        public String toString() {
            return "SetterClassPair{setterMethod=" + String.valueOf(this.setterMethod) + ", itemClass=" + String.valueOf(this.itemClass) + "}";
        }
    }

    private static Object buildClass(Node node, String str, Class cls) throws TikaConfigException {
        String name = cls.getName();
        Node namedItem = node.getAttributes().getNamedItem("class");
        if (namedItem != null) {
            name = namedItem.getTextContent();
        }
        try {
            Class cls2 = Class.forName(name);
            if (cls.isAssignableFrom(cls2)) {
                return cls2.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            }
            throw new TikaConfigException(str + " with class name " + name + " must be of type '" + cls.getName() + "'");
        } catch (IllegalAccessException e) {
            e = e;
            throw new TikaConfigException("problem loading " + str + " with class " + cls.getName(), e);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new TikaConfigException("problem loading " + str + " with class " + cls.getName(), e);
        } catch (ClassNotFoundException e3) {
            e = e3;
            throw new TikaConfigException("problem loading " + str + " with class " + cls.getName(), e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new TikaConfigException("problem loading " + str + " with class " + cls.getName(), e);
        } catch (InstantiationException e5) {
            e = e5;
            throw new TikaConfigException("problem loading " + str + " with class " + cls.getName(), e);
        }
    }

    public static Object buildComposite(String str, Class cls, String str2, Class cls2, InputStream inputStream) throws TikaConfigException, IOException {
        try {
            return buildComposite(str, cls, str2, cls2, XMLReaderUtils.buildDOM(inputStream).getDocumentElement());
        } catch (TikaException e) {
            throw new TikaConfigException("problem loading xml to dom", e);
        } catch (SAXException e2) {
            throw new IOException(e2);
        }
    }

    public static Object buildSingle(String str, Class cls, InputStream inputStream) throws TikaConfigException, IOException {
        try {
            Element documentElement = XMLReaderUtils.buildDOM(inputStream).getDocumentElement();
            if (documentElement.getLocalName().equals("properties")) {
                return buildSingle(str, cls, documentElement, null);
            }
            throw new TikaConfigException("expect properties as root node");
        } catch (TikaException e) {
            throw new TikaConfigException("problem loading xml to dom", e);
        } catch (SAXException e2) {
            throw new IOException(e2);
        }
    }

    private static SetterClassPair findSetterClassPair(Object obj, String str) throws TikaConfigException {
        String str2 = "set" + str.substring(0, 1).toUpperCase(Locale.US) + str.substring(1);
        Method method = null;
        Class cls = null;
        for (Method method2 : obj.getClass().getMethods()) {
            if (str2.equals(method2.getName())) {
                Class[] parameterTypes = method2.getParameterTypes();
                if (parameterTypes.length == 1 && (cls == null || parameterTypes[0].equals(String.class))) {
                    cls = parameterTypes[0];
                    method = method2;
                }
            }
        }
        if (method != null && cls != null) {
            return new SetterClassPair(method, cls);
        }
        String str3 = "add" + str.substring(0, 1).toUpperCase(Locale.US) + str.substring(1);
        for (Method method3 : obj.getClass().getMethods()) {
            if (str3.equals(method3.getName())) {
                Class[] parameterTypes2 = method3.getParameterTypes();
                if (parameterTypes2.length == 1 && (cls == null || parameterTypes2[0].equals(String.class))) {
                    cls = parameterTypes2[0];
                    method = method3;
                }
            }
        }
        if (method != null || cls != null) {
            return new SetterClassPair(method, cls);
        }
        throw new TikaConfigException("Couldn't find setter '" + str2 + "' or adder '" + str3 + "' for " + str + " of class: " + String.valueOf(obj.getClass()));
    }

    private static boolean hasChildNodes(Node node) {
        if (!node.hasChildNodes()) {
            return false;
        }
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            if (childNodes.item(i).getNodeType() == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasClass(Node node) {
        return node.hasAttributes() && node.getAttributes().getNamedItem("class") != null;
    }

    private static boolean isMap(Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && item.hasAttributes()) {
                if (item.getAttributes().getNamedItem("from") != null && item.getAttributes().getNamedItem("to") != null) {
                    return true;
                }
                if (item.getAttributes().getNamedItem("k") != null && item.getAttributes().getNamedItem("v") != null) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isPrimitive(Class cls) {
        int i = 0;
        while (true) {
            Class[] clsArr = SUPPORTED_PRIMITIVES;
            if (i >= clsArr.length) {
                return false;
            }
            if (clsArr[i].equals(cls)) {
                return true;
            }
            i++;
        }
    }

    private static List loadComposite(Node node, String str, Class cls) throws TikaConfigException {
        NodeList childNodes = node.getChildNodes();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && str.equals(item.getLocalName())) {
                Object buildClass = buildClass(item, str, cls);
                setParams(buildClass, item, new HashSet());
                arrayList.add(buildClass);
            }
        }
        return arrayList;
    }

    private static void setParams(Object obj, Node node, Set set) throws TikaConfigException {
        setParams(obj, node, set, null);
    }

    private static void tryToSetClassList(Object obj, Node node) throws TikaConfigException {
        String localName = node.getLocalName();
        try {
            Class cls = Class.forName(node.getAttributes().getNamedItem("class").getTextContent());
            ArrayList arrayList = new ArrayList();
            NodeList childNodes = node.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item.getNodeType() == 1) {
                    Object buildClass = buildClass(item, item.getLocalName(), cls);
                    setParams(buildClass, item, new HashSet());
                    arrayList.add(buildClass);
                }
            }
            obj.getClass().getMethod("set" + localName.substring(0, 1).toUpperCase(Locale.US) + localName.substring(1), new Class[]{List.class}).invoke(obj, new Object[]{arrayList});
        } catch (NoSuchMethodException e) {
            e = e;
            throw new TikaConfigException("couldn't build class for " + localName, e);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new TikaConfigException("couldn't build class for " + localName, e);
        } catch (ClassNotFoundException e3) {
            e = e3;
            throw new TikaConfigException("couldn't build class for " + localName, e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new TikaConfigException("couldn't build class for " + localName, e);
        }
    }

    private static void tryToSetList(Object obj, Node node) throws TikaConfigException {
        if (hasClass(node)) {
            tryToSetClassList(obj, node);
        } else {
            tryToSetStringList(obj, node);
        }
    }

    private static void tryToSetMap(Object obj, Node node) throws TikaConfigException {
        String localName = node.getLocalName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                NamedNodeMap attributes = item.getAttributes();
                String str = null;
                String textContent = attributes.getNamedItem("from") != null ? attributes.getNamedItem("from").getTextContent() : attributes.getNamedItem("key") != null ? attributes.getNamedItem("key").getTextContent() : attributes.getNamedItem("k") != null ? attributes.getNamedItem("k").getTextContent() : null;
                if (attributes.getNamedItem("to") != null) {
                    str = attributes.getNamedItem("to").getTextContent();
                } else if (attributes.getNamedItem("value") != null) {
                    str = attributes.getNamedItem("value").getTextContent();
                } else if (attributes.getNamedItem("v") != null) {
                    str = attributes.getNamedItem("v").getTextContent();
                }
                if (textContent == null) {
                    throw new TikaConfigException("must specify a 'key' or 'from' value in a map object : " + String.valueOf(node));
                }
                if (str == null) {
                    throw new TikaConfigException("must specify a 'value' or 'to' value in a map object : " + String.valueOf(node));
                }
                linkedHashMap.put(textContent, str);
            }
        }
        try {
            obj.getClass().getMethod("set" + localName.substring(0, 1).toUpperCase(Locale.US) + localName.substring(1), new Class[]{Map.class}).invoke(obj, new Object[]{linkedHashMap});
        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new TikaConfigException("can't set " + localName, e);
        }
    }

    private static void tryToSetPrimitive(Object obj, SetterClassPair setterClassPair, String str) throws TikaConfigException {
        try {
            if (SetterClassPair.a(setterClassPair) == Integer.TYPE) {
                SetterClassPair.b(setterClassPair).invoke(obj, new Object[]{Integer.valueOf(Integer.parseInt(str))});
                return;
            }
            if (SetterClassPair.a(setterClassPair) == Long.TYPE) {
                SetterClassPair.b(setterClassPair).invoke(obj, new Object[]{Long.valueOf(Long.parseLong(str))});
                return;
            }
            if (SetterClassPair.a(setterClassPair) == Float.TYPE) {
                SetterClassPair.b(setterClassPair).invoke(obj, new Object[]{Float.valueOf(Float.parseFloat(str))});
                return;
            }
            if (SetterClassPair.a(setterClassPair) == Double.TYPE) {
                SetterClassPair.b(setterClassPair).invoke(obj, new Object[]{Double.valueOf(Double.parseDouble(str))});
            } else if (SetterClassPair.a(setterClassPair) == Boolean.TYPE) {
                SetterClassPair.b(setterClassPair).invoke(obj, new Object[]{Boolean.valueOf(Boolean.parseBoolean(str))});
            } else {
                SetterClassPair.b(setterClassPair).invoke(obj, new Object[]{str});
            }
        } catch (IllegalAccessException e) {
            e = e;
            throw new TikaConfigException("bad parameter " + String.valueOf(setterClassPair) + " " + str, e);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new TikaConfigException("bad parameter " + String.valueOf(setterClassPair) + " " + str, e);
        }
    }

    private static void tryToSetStringList(Object obj, Node node) throws TikaConfigException {
        String textContent;
        String localName = node.getLocalName();
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && (textContent = item.getTextContent()) != null) {
                arrayList.add(textContent);
            }
        }
        try {
            obj.getClass().getMethod("set" + localName.substring(0, 1).toUpperCase(Locale.US) + localName.substring(1), new Class[]{List.class}).invoke(obj, new Object[]{arrayList});
        } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
            throw new TikaConfigException("can't set " + localName, e);
        }
    }

    public Set configure(String str, InputStream inputStream) throws TikaConfigException, IOException {
        HashSet hashSet = new HashSet();
        try {
            Element documentElement = XMLReaderUtils.buildDOM(inputStream).getDocumentElement();
            if (!documentElement.getLocalName().equals("properties")) {
                throw new TikaConfigException("expect properties as root node");
            }
            NodeList childNodes = documentElement.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (str.equals(item.getLocalName())) {
                    setParams(this, item, hashSet);
                }
            }
            return hashSet;
        } catch (SAXException e) {
            throw new IOException(e);
        } catch (TikaException e2) {
            throw new TikaConfigException("problem loading xml to dom", e2);
        }
    }

    public void handleSettings(Set set) {
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void setParams(java.lang.Object r9, org.w3c.dom.Node r10, java.util.Set r11, java.lang.String r12) throws org.apache.tika.exception.TikaConfigException {
        /*
            org.w3c.dom.NodeList r10 = r10.getChildNodes()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        Lb:
            int r3 = r10.getLength()
            if (r2 >= r3) goto L3c
            org.w3c.dom.Node r3 = r10.item(r2)
            java.lang.String r4 = r3.getLocalName()
            java.lang.String r5 = "params"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L36
            org.w3c.dom.NodeList r3 = r3.getChildNodes()
            r4 = r1
        L26:
            int r5 = r3.getLength()
            if (r4 >= r5) goto L39
            org.w3c.dom.Node r5 = r3.item(r4)
            r0.add(r5)
            int r4 = r4 + 1
            goto L26
        L36:
            r0.add(r3)
        L39:
            int r2 = r2 + 1
            goto Lb
        L3c:
            int r10 = r0.size()
            if (r1 >= r10) goto Lf0
            java.lang.Object r10 = r0.get(r1)
            org.w3c.dom.Node r10 = (org.w3c.dom.Node) r10
            short r2 = r10.getNodeType()
            r3 = 1
            if (r2 == r3) goto L51
            goto Lec
        L51:
            java.lang.String r2 = r10.getLocalName()
            if (r2 == 0) goto Lec
            boolean r3 = r2.equals(r12)
            if (r3 == 0) goto L5f
            goto Lec
        L5f:
            java.lang.String r3 = r10.getTextContent()
            java.lang.String r4 = r10.getLocalName()
            org.apache.tika.config.ConfigBase$SetterClassPair r5 = findSetterClassPair(r9, r4)
            boolean r6 = hasClass(r10)
            if (r6 != 0) goto L97
            java.lang.Class r6 = org.apache.tika.config.ConfigBase.SetterClassPair.a(r5)
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            boolean r6 = r6.isAssignableFrom(r7)
            if (r6 == 0) goto L87
            boolean r6 = isMap(r10)
            if (r6 == 0) goto L87
            tryToSetMap(r9, r10)
            goto Lcc
        L87:
            java.lang.Class r6 = org.apache.tika.config.ConfigBase.SetterClassPair.a(r5)
            java.lang.Class<java.util.List> r7 = java.util.List.class
            boolean r6 = r6.isAssignableFrom(r7)
            if (r6 == 0) goto L97
            tryToSetList(r9, r10)
            goto Lcc
        L97:
            java.lang.Class r6 = org.apache.tika.config.ConfigBase.SetterClassPair.a(r5)
            boolean r6 = isPrimitive(r6)
            if (r6 == 0) goto La9
            java.lang.String r10 = r10.getTextContent()
            tryToSetPrimitive(r9, r5, r10)
            goto Lcc
        La9:
            java.lang.Class r6 = org.apache.tika.config.ConfigBase.SetterClassPair.a(r5)
            java.lang.Object r6 = buildClass(r10, r4, r6)
            java.lang.Class r7 = org.apache.tika.config.ConfigBase.SetterClassPair.a(r5)
            java.lang.Object r7 = r7.cast(r6)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            setParams(r7, r10, r8)
            java.lang.reflect.Method r10 = org.apache.tika.config.ConfigBase.SetterClassPair.b(r5)     // Catch: java.lang.reflect.InvocationTargetException -> Ld2 java.lang.IllegalAccessException -> Ld4
            java.lang.Object[] r5 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> Ld2 java.lang.IllegalAccessException -> Ld4
            r10.invoke(r9, r5)     // Catch: java.lang.reflect.InvocationTargetException -> Ld2 java.lang.IllegalAccessException -> Ld4
        Lcc:
            if (r3 == 0) goto Lec
            r11.add(r2)
            goto Lec
        Ld2:
            r9 = move-exception
            goto Ld5
        Ld4:
            r9 = move-exception
        Ld5:
            org.apache.tika.exception.TikaConfigException r10 = new org.apache.tika.exception.TikaConfigException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "problem creating "
            r11.append(r12)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11, r9)
            throw r10
        Lec:
            int r1 = r1 + 1
            goto L3c
        Lf0:
            boolean r10 = r9 instanceof org.apache.tika.config.Initializable
            if (r10 == 0) goto L100
            org.apache.tika.config.Initializable r9 = (org.apache.tika.config.Initializable) r9
            java.util.Map r10 = java.util.Collections.EMPTY_MAP
            r9.initialize(r10)
            org.apache.tika.config.InitializableProblemHandler r10 = org.apache.tika.config.InitializableProblemHandler.THROW
            r9.checkInitialization(r10)
        L100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.config.ConfigBase.setParams(java.lang.Object, org.w3c.dom.Node, java.util.Set, java.lang.String):void");
    }

    public static Object buildComposite(String str, Class cls, String str2, Class cls2, Element element) throws TikaConfigException, IOException {
        if (element.getLocalName().equals("properties")) {
            NodeList childNodes = element.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item.getNodeType() == 1 && str.equals(item.getLocalName())) {
                    try {
                        Object newInstance = cls.getConstructor(new Class[]{List.class}).newInstance(new Object[]{loadComposite(item, str2, cls2)});
                        setParams(newInstance, item, new HashSet(), str2);
                        return newInstance;
                    } catch (InstantiationException | InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
                        throw new TikaConfigException("can't build composite class", e);
                    }
                }
            }
            throw new TikaConfigException("could not find " + str);
        }
        throw new TikaConfigException("expect properties as root node");
    }

    public static Object buildSingle(String str, Class cls, Element element, Object obj) throws TikaConfigException, IOException {
        NodeList childNodes = element.getChildNodes();
        Object obj2 = null;
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && str.equals(item.getLocalName())) {
                if (obj2 == null) {
                    obj2 = buildClass(item, str, cls);
                    setParams(obj2, item, new HashSet());
                } else {
                    throw new TikaConfigException("There can only be one " + str + " in a config");
                }
            }
        }
        if (obj2 != null) {
            return obj2;
        }
        if (obj != null) {
            return obj;
        }
        throw new TikaConfigException("could not find " + str);
    }
}
