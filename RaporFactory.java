interface Rapor {
    public void olustur();
}

class PdfRapor implements Rapor {
    public void olustur() {
        System.out.println("pdf oluşturuluyor");
    }
}

class ExcelRapor implements Rapor {
    public void olustur() {
        System.out.println("excel oluşturuluyor");
    }
}

abstract class RaporFactory {
    public abstract Rapor RaporYap();

    public void raporuHazirla() {
        Rapor rapor = RaporYap();
        rapor.olustur();
    }
}

class PdfFactory extends RaporFactory {
    public Rapor RaporYap() {
        return new PdfRapor();
    }
}

class ExcelFactory extends RaporFactory {
    public Rapor RaporYap() {
        return new ExcelRapor();
    }
}

public class Main {
    public static void main(String[] args) {
        RaporFactory fabrika;

        fabrika = new PdfFactory();
        fabrika.raporuHazirla();

        fabrika = new ExcelFactory();
        fabrika.raporuHazirla();
    }
}