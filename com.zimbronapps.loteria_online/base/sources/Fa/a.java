package fa;

import android.view.PointerIcon;
import ca.i;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a {
    public static HashMap c;
    public final c a;
    public final i b;

    public class a implements i.b {
        public a() {
        }

        public void a(String str) {
            a.b(a.this).setPointerIcon(a.a(a.this, str));
        }
    }

    public class b extends HashMap {
        public b() {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    public interface c {
        PointerIcon a(int i);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public a(c cVar, i iVar) {
        this.a = cVar;
        this.b = iVar;
        iVar.b(new a());
    }

    public static /* synthetic */ PointerIcon a(a aVar, String str) {
        return aVar.d(str);
    }

    public static /* synthetic */ c b(a aVar) {
        return aVar.a;
    }

    public void c() {
        this.b.b(null);
    }

    public final PointerIcon d(String str) {
        if (c == null) {
            c = new b();
        }
        return this.a.a(((Integer) c.getOrDefault(str, 1000)).intValue());
    }
}
