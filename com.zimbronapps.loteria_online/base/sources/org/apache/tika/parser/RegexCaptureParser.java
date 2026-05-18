package org.apache.tika.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class RegexCaptureParser implements Parser, Initializable {
    private static final Set SUPPORTED_TYPES = Collections.singleton(MediaType.TEXT_PLAIN);
    private Map captureMap = new HashMap();
    private Map matchMap = new HashMap();
    private boolean writeContent = false;

    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) throws TikaConfigException {
    }

    public Set getSupportedTypes(ParseContext parseContext) {
        return SUPPORTED_TYPES;
    }

    public void initialize(Map map) throws TikaConfigException {
    }

    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws IOException, SAXException, TikaException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        try {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : this.captureMap.entrySet()) {
                hashMap.put((String) entry.getKey(), ((Pattern) entry.getValue()).matcher(""));
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : this.matchMap.entrySet()) {
                hashMap2.put((String) entry2.getKey(), ((Pattern) entry2.getValue()).matcher(""));
            }
            HashMap hashMap3 = new HashMap();
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                for (Map.Entry entry3 : hashMap.entrySet()) {
                    Matcher matcher = (Matcher) entry3.getValue();
                    if (matcher.reset(readLine).find()) {
                        String group = matcher.group(1);
                        LinkedHashSet linkedHashSet = (Set) hashMap3.get(entry3.getKey());
                        if (linkedHashSet == null) {
                            linkedHashSet = new LinkedHashSet();
                            hashMap3.put((String) entry3.getKey(), linkedHashSet);
                        }
                        linkedHashSet.add(group);
                    }
                }
                for (Map.Entry entry4 : hashMap2.entrySet()) {
                    if (((Matcher) entry4.getValue()).reset(readLine).find()) {
                        metadata.set((String) entry4.getKey(), "true");
                    }
                }
                if (this.writeContent) {
                    char[] charArray = readLine.toCharArray();
                    contentHandler.characters(charArray, 0, charArray.length);
                }
            }
            for (Map.Entry entry5 : hashMap3.entrySet()) {
                Iterator it = ((Set) entry5.getValue()).iterator();
                while (it.hasNext()) {
                    metadata.add((String) entry5.getKey(), (String) it.next());
                }
            }
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Field
    public void setCaptureMap(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.captureMap.put((String) entry.getKey(), Pattern.compile((String) entry.getValue()));
        }
    }

    @Field
    public void setMatchMap(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.matchMap.put((String) entry.getKey(), Pattern.compile((String) entry.getValue()));
        }
    }

    @Field
    public void setWriteContent(boolean z) {
        this.writeContent = z;
    }
}
