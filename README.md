# Java OOP - Rapor Oluşturucu 📊

Bu proje, Java'da `Interface` (Arayüz) kullanımını ve `Polymorphism` (Çok Biçimlilik) kavramını basit bir rapor oluşturma senaryosu üzerinden göstermektedir. 

**İçerilen OOP ve Tasarım Prensipleri:**
* **Interface (Arayüz) - `Rapor`:** Tüm rapor türlerinin sahip olması gereken zorunlu ve ortak `olustur()` metodunu tanımlar.
* **Polymorphism (Çok Biçimlilik):** Aynı arayüzü (`Rapor`) uygulayan `PdfRapor` ve `ExcelRapor` sınıflarının, aynı metot çağrısına kendi içlerinde farklı tepkiler (biri PDF, diğeri Excel oluşturarak) vermesini sağlar.
* **Open/Closed Prensibi:** Bu yapı sayesinde sisteme yeni bir rapor türü (örneğin `WordRapor`) eklenmek istendiğinde, mevcut kodlarda hiçbir değişiklik yapılmasına gerek kalmaz. Sadece arayüzü implemente eden yeni bir sınıf yazmak yeterlidir. 
* **Tasarım Desenleri Altyapısı:** Nesne yönelimli programlamada, çalışma zamanında farklı algoritmaların (veya rapor formatlarının) seçilebilmesine olanak tanıyan bu iskelet, **Strategy (Strateji)** tasarım deseninin temelini oluşturur.

**Kullanılan Dil:**
* Java
