package com.revenuecat.purchases.common;

import Ca.I;
import Na.c;
import Na.q;
import Qa.l;
import Ya.h;
import Ya.r;
import android.content.Context;
import com.revenuecat.purchases.utils.FileExtensionsKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FileHelper {
    private final Context applicationContext;

    public static final class 1 extends u implements l {
        final /* synthetic */ l $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar) {
            super(1);
            this.$block = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BufferedReader) obj);
            return I.a;
        }

        public final void invoke(BufferedReader bufferedReader) {
            t.g(bufferedReader, "bufferedReader");
            this.$block.invoke(q.d(bufferedReader));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ int $numberOfLinesToRemove;
        final /* synthetic */ StringBuilder $textToAppend;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i, StringBuilder sb) {
            super(1);
            this.$numberOfLinesToRemove = i;
            this.$textToAppend = sb;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((h) obj);
            return I.a;
        }

        public final void invoke(h hVar) {
            t.g(hVar, "sequence");
            h q = r.q(hVar, this.$numberOfLinesToRemove);
            StringBuilder sb = this.$textToAppend;
            Iterator it = q.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append("\n");
            }
        }
    }

    public FileHelper(Context context) {
        t.g(context, "applicationContext");
        this.applicationContext = context;
    }

    private final File getFileInFilesDir(String str) {
        return new File(getFilesDir(), str);
    }

    private final File getFilesDir() {
        File filesDir = this.applicationContext.getFilesDir();
        t.f(filesDir, "applicationContext.filesDir");
        return filesDir;
    }

    private final void openBufferedReader(String str, l lVar) {
        FileInputStream fileInputStream = new FileInputStream(getFileInFilesDir(str));
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    lVar.invoke(bufferedReader);
                    I i = I.a;
                    c.a(bufferedReader, (Throwable) null);
                    c.a(inputStreamReader, (Throwable) null);
                    c.a(fileInputStream, (Throwable) null);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ void removeFirstLinesFromFile$default(FileHelper fileHelper, String str, int i, l lVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        fileHelper.removeFirstLinesFromFile(str, i, lVar);
    }

    public final void appendToFile(String str, String str2) {
        t.g(str, "filePath");
        t.g(str2, "contentToAppend");
        File fileInFilesDir = getFileInFilesDir(str);
        File parentFile = fileInFilesDir.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileInFilesDir, true);
        try {
            byte[] bytes = str2.getBytes(Za.c.b);
            t.f(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            I i = I.a;
            c.a(fileOutputStream, (Throwable) null);
        } finally {
        }
    }

    public final boolean deleteFile(String str) {
        t.g(str, "filePath");
        return getFileInFilesDir(str).delete();
    }

    public final boolean fileIsEmpty(String str) {
        t.g(str, "filePath");
        File fileInFilesDir = getFileInFilesDir(str);
        return !fileInFilesDir.exists() || fileInFilesDir.length() == 0;
    }

    public final double fileSizeInKB(String str) {
        t.g(str, "filePath");
        return FileExtensionsKt.getSizeInKB(getFileInFilesDir(str));
    }

    public final void readFilePerLines(String str, l lVar) {
        t.g(str, "filePath");
        t.g(lVar, "block");
        openBufferedReader(str, new 1(lVar));
    }

    public final void removeFirstLinesFromFile(String str, int i, l lVar) {
        t.g(str, "filePath");
        try {
            StringBuilder sb = new StringBuilder();
            readFilePerLines(str, new 1(i, sb));
            deleteFile(str);
            String sb2 = sb.toString();
            t.f(sb2, "textToAppend.toString()");
            appendToFile(str, sb2);
        } catch (FileNotFoundException e) {
            if (lVar != null) {
                lVar.invoke(e);
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "FileHelper: file not found when trying to remove first lines from file: " + str + ". Ignoring.", e);
        } catch (Throwable th) {
            if (lVar != null) {
                lVar.invoke(th);
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "FileHelper: error removing first lines from file: " + str + ". Ignoring.", th);
            throw th;
        }
    }
}
