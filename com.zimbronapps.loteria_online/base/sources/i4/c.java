package i4;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {
    public static void a(m4.b bVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor f1 = bVar.f1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (f1.moveToNext()) {
            try {
                arrayList.add(f1.getString(0));
            } catch (Throwable th) {
                f1.close();
                throw th;
            }
        }
        f1.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.p("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(g4.e eVar, m4.e eVar2, boolean z, CancellationSignal cancellationSignal) {
        AbstractWindowedCursor q = eVar.q(eVar2, cancellationSignal);
        if (!z || !(q instanceof AbstractWindowedCursor)) {
            return q;
        }
        AbstractWindowedCursor abstractWindowedCursor = q;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? b.a(abstractWindowedCursor) : q;
    }

    public static int c(File file) {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i = allocate.getInt();
            channel.close();
            return i;
        } catch (Throwable th) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th;
        }
    }
}
