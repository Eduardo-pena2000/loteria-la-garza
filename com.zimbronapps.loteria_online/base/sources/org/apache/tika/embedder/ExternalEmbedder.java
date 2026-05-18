package org.apache.tika.embedder;

import B8.m;
import Eb.e;
import Gb.a;
import Gb.b;
import Gb.c;
import Gb.d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.parser.ParseContext;
import zb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ExternalEmbedder implements Embedder {
    public static final String METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN = "${METADATA_SERIALIZED}";
    public static final String METADATA_COMMAND_ARGUMENTS_TOKEN = "${METADATA}";
    private static final long serialVersionUID = -2828829275642475697L;
    private final TemporaryResources tmp = new TemporaryResources();
    private Set supportedEmbedTypes = Collections.emptySet();
    private Map metadataCommandArguments = null;
    private String[] command = {"sed", "-e", "$a\\\n${METADATA_SERIALIZED}", "${INPUT}"};
    private String commandAssignmentOperator = "=";
    private String commandAssignmentDelimeter = ", ";
    private String commandAppendOperator = "=";
    private boolean quoteAssignmentValues = false;

    public static /* synthetic */ void a(InputStream inputStream, OutputStream outputStream) {
        lambda$multiThreadedStreamCopy$2(inputStream, outputStream);
    }

    public static /* synthetic */ String[] b(int i) {
        return lambda$embed$1(i);
    }

    public static /* synthetic */ String[] c(int i) {
        return lambda$embed$0(i);
    }

    public static boolean check(String str, int... iArr) {
        return check(new String[]{str}, iArr);
    }

    private static /* synthetic */ String[] lambda$embed$0(int i) {
        return new String[i];
    }

    private static /* synthetic */ String[] lambda$embed$1(int i) {
        return new String[i];
    }

    private static /* synthetic */ void lambda$multiThreadedStreamCopy$2(InputStream inputStream, OutputStream outputStream) {
        try {
            g.n(inputStream, outputStream);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void multiThreadedStreamCopy(InputStream inputStream, OutputStream outputStream) {
        new Thread(new b(inputStream, outputStream)).start();
    }

    private void sendInputStreamToStdIn(InputStream inputStream, Process process) {
        multiThreadedStreamCopy(inputStream, process.getOutputStream());
    }

    private void sendStdErrToOutputStream(Process process, OutputStream outputStream) {
        multiThreadedStreamCopy(process.getErrorStream(), outputStream);
    }

    private void sendStdOutToOutputStream(Process process, OutputStream outputStream) {
        try {
            g.n(process.getInputStream(), outputStream);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static String serializeMetadata(List list) {
        return list != null ? Arrays.toString(list.toArray()) : "";
    }

    public void embed(Metadata metadata, InputStream inputStream, OutputStream outputStream, ParseContext parseContext) throws IOException, TikaException {
        int i;
        Map map = this.metadataCommandArguments;
        boolean z = (map == null || map.isEmpty()) ? false : true;
        TikaInputStream tikaInputStream = TikaInputStream.get(inputStream);
        File file = null;
        List commandMetadataSegments = z ? getCommandMetadataSegments(metadata) : null;
        String[] strArr = this.command;
        ArrayList<String> arrayList = new ArrayList();
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        boolean z5 = true;
        for (int length = strArr.length; i2 < length; length = i) {
            String str = strArr[i2];
            String[] strArr2 = strArr;
            if (str.contains("${INPUT}")) {
                i = length;
                str = str.replace("${INPUT}", tikaInputStream.getFile().toString());
                z4 = false;
            } else {
                i = length;
            }
            if (str.contains("${OUTPUT}")) {
                file = this.tmp.createTemporaryFile();
                str = str.replace("${OUTPUT}", file.toString());
                z5 = false;
            }
            if (str.contains("${METADATA_SERIALIZED}")) {
                z2 = true;
            }
            if (str.contains("${METADATA}")) {
                if (z) {
                    arrayList.addAll(commandMetadataSegments);
                }
                z3 = true;
            } else {
                arrayList.add(str);
            }
            i2++;
            strArr = strArr2;
        }
        if (z) {
            if (z2) {
                int i3 = 0;
                for (String str2 : arrayList) {
                    if (str2.contains("${METADATA_SERIALIZED}")) {
                        arrayList.set(i3, str2.replace("${METADATA_SERIALIZED}", serializeMetadata(commandMetadataSegments)));
                    }
                    i3++;
                }
            } else if (!z3 && !z2) {
                arrayList.addAll(commandMetadataSegments);
            }
        }
        Process exec = arrayList.toArray().length == 1 ? Runtime.getRuntime().exec(((String[]) a.a(arrayList, new c()))[0]) : Runtime.getRuntime().exec((String[]) a.a(arrayList, new d()));
        e l = e.k().l();
        try {
            sendStdErrToOutputStream(exec, l);
            if (z4) {
                sendInputStreamToStdIn(inputStream, exec);
            } else {
                exec.getOutputStream().close();
            }
            if (z5) {
                sendStdOutToOutputStream(exec, outputStream);
            } else {
                this.tmp.dispose();
                try {
                    exec.waitFor();
                } catch (InterruptedException unused) {
                }
                g.n(TikaInputStream.get(m.a(file)), outputStream);
            }
            if (z5) {
                try {
                    exec.waitFor();
                } catch (InterruptedException | Exception unused2) {
                }
            } else {
                file.delete();
            }
            if (!z4) {
                g.k(tikaInputStream);
            }
            g.l(outputStream);
            g.l(l);
            if (exec.exitValue() == 0) {
                return;
            }
            throw new TikaException("There was an error executing the command line\nExecutable Command:\n\n" + String.valueOf(arrayList) + "\nExecutable Error:\n\n" + l.d(StandardCharsets.UTF_8.name()));
        } catch (Throwable th) {
            if (z5) {
                try {
                    exec.waitFor();
                } catch (InterruptedException | Exception unused3) {
                }
            } else {
                file.delete();
            }
            if (!z4) {
                g.k(tikaInputStream);
            }
            g.l(outputStream);
            g.l(l);
            if (exec.exitValue() == 0) {
                throw th;
            }
            throw new TikaException("There was an error executing the command line\nExecutable Command:\n\n" + String.valueOf(arrayList) + "\nExecutable Error:\n\n" + l.d(StandardCharsets.UTF_8.name()));
        }
    }

    public String[] getCommand() {
        return this.command;
    }

    public String getCommandAppendOperator() {
        return this.commandAppendOperator;
    }

    public String getCommandAssignmentDelimeter() {
        return this.commandAssignmentDelimeter;
    }

    public String getCommandAssignmentOperator() {
        return this.commandAssignmentOperator;
    }

    public List getCommandMetadataSegments(Metadata metadata) {
        String[] strArr;
        String[] strArr2;
        int i;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        if (metadata != null && metadata.names() != null) {
            String[] names = metadata.names();
            int length = names.length;
            for (int i2 = 0; i2 < length; i2++) {
                String str = names[i2];
                Iterator it2 = getMetadataCommandArguments().keySet().iterator();
                while (it2.hasNext()) {
                    Property property = (Property) it2.next();
                    if (str.equals(property.getName()) && (strArr = (String[]) getMetadataCommandArguments().get(property)) != null) {
                        int length2 = strArr.length;
                        int i3 = 0;
                        while (i3 < length2) {
                            String str2 = strArr[i3];
                            if (metadata.isMultiValued(str)) {
                                String[] values = metadata.getValues(str);
                                int length3 = values.length;
                                int i4 = 0;
                                while (true) {
                                    strArr2 = names;
                                    if (i4 >= length3) {
                                        break;
                                    }
                                    String str3 = values[i4];
                                    int i5 = length;
                                    if (this.quoteAssignmentValues) {
                                        str3 = "'" + str3 + "'";
                                    }
                                    arrayList.add(str2 + this.commandAppendOperator + str3);
                                    i4++;
                                    names = strArr2;
                                    length = i5;
                                    it2 = it2;
                                }
                                i = length;
                                it = it2;
                            } else {
                                strArr2 = names;
                                i = length;
                                it = it2;
                                String str4 = metadata.get(str);
                                if (this.quoteAssignmentValues) {
                                    str4 = "'" + str4 + "'";
                                }
                                arrayList.add(str2 + this.commandAssignmentOperator + str4);
                            }
                            i3++;
                            names = strArr2;
                            length = i;
                            it2 = it;
                        }
                    }
                    names = names;
                    length = length;
                    it2 = it2;
                }
            }
        }
        return arrayList;
    }

    public Map getMetadataCommandArguments() {
        return this.metadataCommandArguments;
    }

    public Set getSupportedEmbedTypes(ParseContext parseContext) {
        return getSupportedEmbedTypes();
    }

    public boolean isQuoteAssignmentValues() {
        return this.quoteAssignmentValues;
    }

    public void setCommand(String... strArr) {
        this.command = strArr;
    }

    public void setCommandAppendOperator(String str) {
        this.commandAppendOperator = str;
    }

    public void setCommandAssignmentDelimeter(String str) {
        this.commandAssignmentDelimeter = str;
    }

    public void setCommandAssignmentOperator(String str) {
        this.commandAssignmentOperator = str;
    }

    public void setMetadataCommandArguments(Map map) {
        this.metadataCommandArguments = map;
    }

    public void setQuoteAssignmentValues(boolean z) {
        this.quoteAssignmentValues = z;
    }

    public void setSupportedEmbedTypes(Set set) {
        this.supportedEmbedTypes = Collections.unmodifiableSet(new HashSet(set));
    }

    public static boolean check(String[] strArr, int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{127};
        }
        try {
            int waitFor = (strArr.length == 1 ? Runtime.getRuntime().exec(strArr[0]) : Runtime.getRuntime().exec(strArr)).waitFor();
            for (int i : iArr) {
                if (waitFor == i) {
                    return false;
                }
            }
            return true;
        } catch (IOException | InterruptedException unused) {
            return false;
        }
    }

    public Set getSupportedEmbedTypes() {
        return this.supportedEmbedTypes;
    }
}
