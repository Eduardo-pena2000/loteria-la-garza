package ta;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import da.o;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class c extends o {
    public final Map d = new HashMap();

    public Object g(byte b, ByteBuffer byteBuffer) {
        switch (b) {
            case -127:
                return new b((Boolean) g(byteBuffer.get(), byteBuffer), (a) g(byteBuffer.get(), byteBuffer));
            case -126:
                return new a((Integer) g(byteBuffer.get(), byteBuffer), q(g(byteBuffer.get(), byteBuffer)));
            case -125:
                return this.d.get((Integer) g(byteBuffer.get(), byteBuffer));
            case -124:
                Integer num = (Integer) g(byteBuffer.get(), byteBuffer);
                return new FormError(num.intValue(), (String) g(byteBuffer.get(), byteBuffer));
            default:
                return super.g(b, byteBuffer);
        }
    }

    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof b) {
            byteArrayOutputStream.write(-127);
            b bVar = (b) obj;
            p(byteArrayOutputStream, bVar.c());
            p(byteArrayOutputStream, bVar.b());
            return;
        }
        if (obj instanceof a) {
            byteArrayOutputStream.write(-126);
            a aVar = (a) obj;
            p(byteArrayOutputStream, aVar.b());
            p(byteArrayOutputStream, aVar.c());
            return;
        }
        if (obj instanceof ConsentForm) {
            byteArrayOutputStream.write(-125);
            p(byteArrayOutputStream, Integer.valueOf(obj.hashCode()));
        } else {
            if (!(obj instanceof FormError)) {
                super.p(byteArrayOutputStream, obj);
                return;
            }
            byteArrayOutputStream.write(-124);
            FormError formError = (FormError) obj;
            p(byteArrayOutputStream, Integer.valueOf(formError.getErrorCode()));
            p(byteArrayOutputStream, formError.getMessage());
        }
    }

    public final List q(Object obj) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof String) {
                    arrayList.add((String) obj2);
                }
            }
        }
        return arrayList;
    }

    public void r(ConsentForm consentForm) {
        this.d.remove(Integer.valueOf(consentForm.hashCode()));
    }

    public void s(ConsentForm consentForm) {
        this.d.put(Integer.valueOf(consentForm.hashCode()), consentForm);
    }
}
